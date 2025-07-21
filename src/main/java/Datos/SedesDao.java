package Datos;

import domain.Sedes;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class SedesDao {

    EntityManagerFactory emf;
    EntityManager em;
    public static final String SELECCIONAR = "SELECT * FROM esquema.sedes_info;";

    public void conectar() {
        emf = Persistence.createEntityManagerFactory("admin");
        em = emf.createEntityManager();
    }

    public List<Object[]> seleccionar() {
        conectar();
        List<Object[]> o = new ArrayList<>();
        try {
            o = em.createNativeQuery(SELECCIONAR).getResultList();
            return o;
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Algo a salido mal", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        } finally {
            emf.close();
            em.close();
        }
    }

    public Sedes seleccionar(int id) {
        conectar();
        try {
            Sedes sede = em.find(Sedes.class, id);
            if (sede == null) {
                JOptionPane.showMessageDialog(null, " No encontrado", "Error", JOptionPane.ERROR_MESSAGE);
                return null;
            } else {
                return sede;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " No encontrado", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        } finally {
            em.close();
            emf.close();
        }
    }

    public void actualizar(int id, String nombre, String direccion, String ciudad, String telefono) {
        conectar();
        Sedes sede = new Sedes();
        try {
            em.getTransaction().begin();
            sede = em.find(Sedes.class, id);
            if(sede!=null){
            sede.setNombre(nombre);
            sede.setCiudad(ciudad);
            sede.setDireccion(direccion);
            sede.setTelefono(telefono);
            em.merge(sede);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Actualizado", "aviso", JOptionPane.INFORMATION_MESSAGE);
            }else{
                        JOptionPane.showMessageDialog(null, "Sede no encontrada","Error",JOptionPane.ERROR_MESSAGE);
                        return;
            }
        } catch (Exception e) {
            em.getTransaction().rollback();
        }finally{
            em.close();
            emf.close();
        }
    }
    
    public void insertar(Sedes sede) {
    conectar();

    String nombre, documento, correo, contrasena;

    try {
        JOptionPane.showMessageDialog(null, "Usuario necesario para manejar la sede", "Aviso", JOptionPane.INFORMATION_MESSAGE);

        nombre = JOptionPane.showInputDialog(null, "Digite nombre", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        documento = JOptionPane.showInputDialog(null, "Digite documento", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        correo = JOptionPane.showInputDialog(null, "Digite correo", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        contrasena = JOptionPane.showInputDialog(null, "Digite contraseña", "Aviso", JOptionPane.INFORMATION_MESSAGE);

        if (nombre == null || documento == null || correo == null || contrasena == null) {
            JOptionPane.showMessageDialog(null, "Operación cancelada.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        em.getTransaction().begin();

        em.persist(sede);
        em.getTransaction().commit();

        Sedes ultimaSede = obtenerUltimaSede();
        EmpleadoDao empDao = new EmpleadoDao();
        empDao.insertar(nombre, documento, correo, contrasena, ultimaSede.getId_sede(), 2);

        JOptionPane.showMessageDialog(null, "Sede creada correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);

    } catch (Exception e) {
        e.printStackTrace();
        if (em.getTransaction().isActive()) {
            em.getTransaction().rollback();
        }
        JOptionPane.showMessageDialog(null, "Algo ha salido mal", "Error", JOptionPane.ERROR_MESSAGE);

    } finally {
        if (em.isOpen()) em.close();
        if (emf.isOpen()) emf.close();
    }
}

    
    public Sedes obtenerUltimaSede() {
    conectar(); 
    Sedes ultimaSede = null;
    try {
        ultimaSede = em.createQuery("SELECT s FROM Sedes s ORDER BY s.id DESC", Sedes.class)
                       .setMaxResults(1)
                       .getSingleResult();
    } catch (NoResultException e) {
        System.out.println("No hay sedes registradas.");
    }
    return ultimaSede;
}

}
