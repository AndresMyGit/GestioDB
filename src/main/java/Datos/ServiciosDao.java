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

    public ServiciosDao(String tipo,EntityManagerFactory emf, EntityManager em) {
        this.tipo= tipo;
        this.emf=emf;
        this.em=em;
    }


public List<Object[]> seleccionar(){
     
    try{
    return em.createNativeQuery("SELECT * fROM esquema.servicios").getResultList();
    }catch(Exception e){
        e.printStackTrace();
        return null;
    }finally{
        
    }
}
}
