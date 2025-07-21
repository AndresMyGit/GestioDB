package Datos;

import jakarta.persistence.*;
import javax.swing.JOptionPane;

public class NominasDao {

    EntityManagerFactory emf;
    EntityManager em;
    
public void conectar(){
    emf = Persistence.createEntityManagerFactory("admin");
    em=emf.createEntityManager();
}
    
public Object[] cargarNomina(String idEmpleado, int mes, String anio) {
    conectar();
    Object[] resultados=null ;

    try {
        resultados =(Object[]) em.createNativeQuery("SELECT * FROM esquema.obtenernomina(:id, :m, :a)")
                .setParameter("id", Integer.parseInt(idEmpleado))
                .setParameter("m", mes)
                .setParameter("a", Integer.parseInt(anio))
                .getSingleResult();
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "no encontrado");
    }

    return resultados;
}

}
