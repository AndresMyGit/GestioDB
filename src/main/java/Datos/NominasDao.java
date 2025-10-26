package Datos;

import jakarta.persistence.*;
import javax.swing.JOptionPane;

public class NominasDao {

    EntityManagerFactory emf;
    EntityManager em;
    String tipo;

    public NominasDao(String tipo,EntityManagerFactory emf, EntityManager em) {
        this.tipo=tipo;
        this.emf=emf;
        this.em=em;
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
    
public Object[] cargarNomina(String idEmpleado, int mes, String anio) {
     
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
