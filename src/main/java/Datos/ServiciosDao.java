package Datos;

import domain.Servicio;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.List;

public class ServiciosDao {
    EntityManagerFactory emf;
    EntityManager em;

public void conectar(){
    emf = Persistence.createEntityManagerFactory("admin");
    em=emf.createEntityManager();
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
