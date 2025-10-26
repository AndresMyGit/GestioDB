package Datos;

import jakarta.persistence.*;
import domain.Venta;
import java.time.LocalDate;
import java.util.List;
import javax.swing.JOptionPane;

public class ventaDao {

    private EntityManagerFactory emf;
    private EntityManager em;
    String tipo;

    public ventaDao(String tipo,EntityManagerFactory emf, EntityManager em) {
        this.tipo=tipo;
        this.emf=emf;
        this.em=em;
    }
    
    public boolean agregarVenta(String placa, int idServicio, String idempleado, String observaciones, int idsede) {

         
        VehiculoDao vehdao = new VehiculoDao(tipo,emf,em);
        LocalDate fecha = LocalDate.now();
        em.getTransaction().begin();
        Venta venta = new Venta();
        try {
            venta.setIdempleado(Integer.parseInt(idempleado));
            venta.setIdvehiculo(vehdao.buscarPlaca(placa));
            venta.setIdservicio(idServicio);
            venta.setIdsede(idsede);
            venta.setFecha(fecha);
            venta.setObservaciones(observaciones);
            venta.setStado("servicio");

            em.persist(venta);
            em.getTransaction().commit();
            
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Algo a salido mal", "Error", JOptionPane.ERROR_MESSAGE);
            em.getTransaction().rollback();
            return false;
        } finally {
              
          
        }

    }

    public List<Object[]> verRegistros() {
         
        try {
            return em.createNativeQuery("SELECT * FROM esquema.vista_registros").getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
              
          
        }
    }

    public void finalizarRegistro(String placa) {
         
        VehiculoDao vehD = new VehiculoDao(tipo,emf,em);
        int idvehiculo = vehD.buscarPlaca(placa);
        if (idvehiculo == -1) {
            return;
        }
        em.getTransaction().begin();
        try {
            em.createNativeQuery("UPDATE esquema.ventas SET estado = 'finalizado' WHERE id_vehiculo = :id")
                    .setParameter("id", idvehiculo).executeUpdate();
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Servicio finalizado");
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Operacion cancelada");
        } finally {
              
          
        }
    }

    public void canselarRegistro(String placa) {
         
        VehiculoDao vehD = new VehiculoDao(tipo,emf,em);
        int idvehiculo = vehD.buscarPlaca(placa);
        em.getTransaction().begin();
        try {
            em.createNativeQuery("UPDATE esquema.ventas SET estado = 'cancelado' WHERE id_vehiculo = :id")
                    .setParameter("id", idvehiculo).executeUpdate();
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Servicio finalizado");
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Operacion cancelada");
        } finally {
          
        }
    }
}
