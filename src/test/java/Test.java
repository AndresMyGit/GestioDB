
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Test {

    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("subadmin");
        EntityManager em= emf.createEntityManager();
    }
    
}
