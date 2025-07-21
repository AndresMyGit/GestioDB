package domain;

import jakarta.persistence.*;



@Entity
@Table(name = "servicios",schema = "esquema")
public class Servicio {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_servicio;
    private String nombre;
    private String descripcion;
    private double precio;

    public Servicio() {
    }

    public Servicio(String nombre, String descripcion, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public Servicio(int id_servicio, String nombre, String descripcion, double precio) {
        this.id_servicio = id_servicio;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public int getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(int id_servicio) {
        this.id_servicio = id_servicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
