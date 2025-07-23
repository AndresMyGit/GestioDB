package Datos;

import domain.Servicio;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.List;

public class ServiciosDao {
    EntityManagerFactory emf;
    EntityManager em;
    String tipo;

    public ServiciosDao(String tipo) {
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

public List<Object[]> seleccionar(){
    conectar();
    try{
    return em.createNativeQuery("SELECT * fROM esquema.servicios").getResultList();
    }catch(Exception e){
        e.printStackTrace();
        return null;
    }finally{
        em.close();
        emf.close();
    }
}
}
