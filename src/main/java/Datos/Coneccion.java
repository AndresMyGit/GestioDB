package Datos;

import domain.*;
import jakarta.persistence.*;

public class Coneccion {

    private final String query = "SELECT u FROM Usuario u WHERE u.nombre = :nombre AND u.contrasena = :contrasena";
    private final String query2 = "SELECT u FROM Empleado u WHERE u.nombre = :nombre AND u.contrasena = :contrasena";
    private EntityManagerFactory emf;
    private EntityManager em;

    public Coneccion(EntityManagerFactory emf, EntityManager em){
        this.emf=emf;
        this.em=em;
    }
            

    public Persona validarUsuario(String usuario, String contrasena) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("admin");
        EntityManager em= emf.createEntityManager();
        try{
            TypedQuery<Usuario> query = em.createQuery(this.query,Usuario.class);
            query.setParameter("nombre", usuario);
            query.setParameter("contrasena", contrasena);
             return query.getSingleResult();
             
        }catch(Exception e){
            TypedQuery<Empleado> query=em.createQuery(this.query2,Empleado.class);
            try{
                query.setParameter("nombre", usuario);
                query.setParameter("contrasena", contrasena);
            return query.getSingleResult();
            }catch(Exception e2){
                return null;
            }
            
        }finally{
              
              
        }
    }


    
    }


