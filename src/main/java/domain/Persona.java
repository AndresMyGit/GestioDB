package domain;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id_usuario;
    protected String nombre;
    protected String documento;
    protected String tipo_empleado;
    protected int id_sede;
    protected boolean activo;
    protected String contrasena;

    public Persona() {
    }

    public Persona(String nombre, String documento, String tipo_empleado, int id_sede, boolean activo, String contraseña) {
        this.nombre = nombre;
        this.documento = documento;
        this.tipo_empleado = tipo_empleado;
        this.id_sede = id_sede;
        this.activo = activo;
        this.contrasena = contraseña;
    }

    public Persona(int id_usuario, String nombre, String documento, String tipo_empleado, int id_sede, boolean activo, String contraseña) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.documento = documento;
        this.tipo_empleado = tipo_empleado;
        this.id_sede = id_sede;
        this.activo = activo;
        this.contrasena = contraseña;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTipo_empleado() {
        return tipo_empleado;
    }

    public void setTipo_empleado(String tipo_empleado) {
        this.tipo_empleado = tipo_empleado;
    }

    public int getId_sede() {
        return id_sede;
    }

    public void setId_sede(int id_sede) {
        this.id_sede = id_sede;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getContraseña() {
        return contrasena;
    }

    public void setContraseña(String contraseña) {
        this.contrasena = contraseña;
    }

    @Override
    public String toString() {
        return "Persona{" + "id_usuario=" + id_usuario + ", nombre=" + nombre + ", documento=" + documento + ", tipo_empleado=" + tipo_empleado + ", id_sede=" + id_sede + ", activo=" + activo + ", contrase\u00f1a=" + contrasena + '}';
    }
    
    
}
