package domain;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "ventas",schema = "esquema")
public class Venta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_venta;
    private int id_empleado;
    private int id_vehiculo;
    private int id_servicio;
    private int id_sede;
    private LocalDate fecha_hora;
    private String observaciones;
    private String estado;

    public Venta() {
    }

    public Venta(int id_empleado, int idvehiculo, int idservicio, int idsede, LocalDate fecha, String observaciones, String stado) {
        this.id_empleado = id_empleado;
        this.id_vehiculo = idvehiculo;
        this.id_servicio = idservicio;
        this.id_sede = idsede;
        this.fecha_hora = fecha;
        this.observaciones = observaciones;
        this.estado = stado;
    }

    public Venta(int id_venta, int id_empleado, int idvehiculo, int idservicio, int idsede, LocalDate fecha, String observaciones, String stado) {
        this.id_venta = id_venta;
        this.id_empleado = id_empleado;
        this.id_vehiculo = idvehiculo;
        this.id_servicio = idservicio;
        this.id_sede = idsede;
        this.fecha_hora = fecha;
        this.observaciones = observaciones;
        this.estado = stado;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public int getIdempleado() {
        return id_empleado;
    }

    public void setIdempleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public int getIdvehiculo() {
        return id_vehiculo;
    }

    public void setIdvehiculo(int idvehiculo) {
        this.id_vehiculo = idvehiculo;
    }

    public int getIdservicio() {
        return id_servicio;
    }

    public void setIdservicio(int idservicio) {
        this.id_servicio = idservicio;
    }

    public int getIdsede() {
        return id_sede;
    }

    public void setIdsede(int idsede) {
        this.id_sede = idsede;
    }

    public LocalDate getFecha() {
        return fecha_hora;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha_hora = fecha;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getStado() {
        return estado;
    }

    public void setStado(String stado) {
        this.estado = stado;
    }
 
}
