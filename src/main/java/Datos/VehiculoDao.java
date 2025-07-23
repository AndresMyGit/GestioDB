package Datos;

import domain.Vehiculo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.List;
import javax.swing.JOptionPane;

public class VehiculoDao {

    private EntityManagerFactory emf;
    private EntityManager em;
    String tipo;

    public VehiculoDao(String tipo) {
        this.tipo= tipo;
    }
    
    public void conectar(){
         if (tipo.equalsIgnoreCase("superadmin")) {
            emf = Persistence.createEntityManagerFactory("admin");
            em = emf.createEntityManager();
        } else if (tipo.equalsIgnoreCase("Administrador")) {
            emf = Persistence.createEntityManagerFactory("subadmin");
            em = emf.createEntityManager();
        }else if(tipo.equalsIgnoreCase("lavador")){
            emf = Persistence.createEntityManagerFactory("operario");
            em = emf.createEntityManager();
        }
    }
    
    public List<Object[]> vistaVehiculos(){
        conectar();
        try {
        return em.createNativeQuery("SELECT * FROM esquema.vista_vehiculos ORDER BY id_vehiculo DESC ").getResultList();    
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Vista no cargada","Error",JOptionPane.ERROR_MESSAGE);
            return null;
        }finally{
            em.close();
            emf.close();
        }
    }
    
    public void insertar(){
        conectar();
        em.getTransaction().begin();
        String placa = JOptionPane.showInputDialog(null, "Digite la placa", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        String marca = JOptionPane.showInputDialog(null, "Digite la Marca", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        if (placa.isEmpty() || marca.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Algo a salido mal","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        Vehiculo veh = new Vehiculo(placa, marca);
        try {
            em.persist(veh);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Vehiculo agregado","Aviso",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Algo a salido mal","Error",JOptionPane.ERROR_MESSAGE);
            em.getTransaction().rollback();
        }finally{
            emf.close();
            em.close();
        }
    }
    
    public int buscarPlaca(String placa){
        conectar();
        try {
            Object resultado=em.createNativeQuery("SELECT id_vehiculo FROM esquema.vehiculos WHERE placa =" + "'"+placa+"'").getSingleResult();
            if(resultado == null){
                JOptionPane.showMessageDialog(null, "Placa no registrada");
                return -1;
            }else{
                return (int)resultado;
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Placa no encontrada","buscarPlaca",JOptionPane.ERROR_MESSAGE);
            return -1;
        }
    }
    
}
