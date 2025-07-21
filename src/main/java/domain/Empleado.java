package domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "empleados",schema = "esquema")
public class Empleado extends Persona {

    public Empleado() {
    }

    public Empleado(String nombre, String documento, String tipo_empleado, int id_sede, boolean activo, String contraseña) {
        super(nombre, documento, tipo_empleado, id_sede, activo, contraseña);
    }

    public Empleado(int id_usuario, String nombre, String documento, String tipo_empleado, int id_sede, boolean activo, String contraseña) {
        super(id_usuario, nombre, documento, tipo_empleado, id_sede, activo, contraseña);
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

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    
    
}
