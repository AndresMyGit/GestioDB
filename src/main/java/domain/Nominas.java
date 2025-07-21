package domain;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "nominas",schema = "esquema")
public class Nominas {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_nomina;
    private int id_empleado;
    private LocalDate fecha;
    private double total;
  

    public Nominas() {
    }

    public Nominas(int id_empleado, LocalDate fecha, double total) {
        this.id_empleado = id_empleado;
        this.fecha = fecha;
        this.total = total;
    }

    public Nominas(int id_nomina, int id_empleado, LocalDate fecha, double total) {
        this.id_nomina = id_nomina;
        this.id_empleado = id_empleado;
        this.fecha = fecha;
        this.total = total;
    }
    
    
}
