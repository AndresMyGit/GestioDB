package domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios",schema = "esquema")
public class Usuario extends Persona {

    @Column(name = "correo")
    private String correo;

    public Usuario() {
    }

    public Usuario(String correo, String nombre, String documento, String tipo_empleado, int id_sede, boolean activo, String contraseña) {
        super(nombre, documento, tipo_empleado, id_sede, activo, contraseña);
        this.correo = correo;
    }

    public Usuario(String correo, int id_usuario, String nombre, String documento, String tipo_empleado, int id_sede, boolean activo, String contraseña) {
        super(id_usuario, nombre, documento, tipo_empleado, id_sede, activo, contraseña);
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
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
        return super.toString()+" correo= "+ this.getCorreo();
    }


    
}
