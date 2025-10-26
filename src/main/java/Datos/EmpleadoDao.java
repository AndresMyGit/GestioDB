package Datos;

import domain.*;
import jakarta.persistence.*;
import java.util.List;
import javax.swing.JOptionPane;

public class EmpleadoDao {

    private EntityManagerFactory emf;
    private EntityManager em;
    private static final String SELECCIONAR = "SELECT * from esquema.ver_empleados";
    private static final String VISTA_EMPLEADOS = "select * from esquema.vista_empleados where id_sede = ";
    private String tipo;

    public EmpleadoDao(String tipo,EntityManagerFactory emf, EntityManager em) {
        this.tipo = tipo;
        this.emf=emf;
        this.em=em;
    }

    

    public List<Object[]> seleccionar(int sede) {
         
        try {
            List<Object[]> o = em.createNativeQuery(SELECCIONAR + " WHERE id_sede = " + sede).getResultList();
            return o;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
              
              
        }
    }

    public Persona busquedaID(int id) {
         
        try {
            Persona per = em.find(Usuario.class, id);

            if (per == null) {
                per = em.find(Empleado.class, id);
            }

            return per;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Valor no válido", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        } finally {
              
              
        }
    }

    public List<Object[]> busquedaDespedido(int sede) {
         
        try {
            List<Object[]> o = em.createNativeQuery(SELECCIONAR + " WHERE activo = FALSE AND id_sede = " + sede).getResultList();
            return o;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
              
              
        }
    }

    public List<Object[]> busquedaLavadores(int sede) {
         
        try {
            List<Object[]> o = em.createNativeQuery(SELECCIONAR + " WHERE tipo_empleado = 'lavador' AND id_sede = " + sede).getResultList();
            return o;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
              
              
        }
    }

    public void actualizarEmpleado(int id) {
         
        try {
            Persona per = em.find(Usuario.class, id);
            if (per == null) {
                per = em.find(Empleado.class, id);
                if (per == null) {
                    JOptionPane.showMessageDialog(null, "Empleado no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                } else {
                    String nombre = JOptionPane.showInputDialog(null, "Ingrese nombre", "Nombre", JOptionPane.QUESTION_MESSAGE);
                    if (nombre == null) {
                        return;
                    }
                    String documento = JOptionPane.showInputDialog(null, "Ingrese el documento:", "Documento", JOptionPane.QUESTION_MESSAGE);
                    if (documento == null) {
                        return;
                    }
                    String contrasena = JOptionPane.showInputDialog(null, "Ingrese la contraseña:", "Contraseña", JOptionPane.QUESTION_MESSAGE);
                    if (contrasena == null) {
                        return;
                    }
                    per.setNombre(nombre);
                    per.setDocumento(documento);
                    per.setContraseña(contrasena);

                    em.getTransaction().begin();
                    em.merge(per);
                    em.getTransaction().commit();
                    JOptionPane.showMessageDialog(null, "Se realizaron los camvbios", "Echo", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del usuario:", "Nombre", JOptionPane.QUESTION_MESSAGE);
                if (nombre == null) {
                    return;
                }
                String documento = JOptionPane.showInputDialog(null, "Ingrese el documento:", "Documento", JOptionPane.QUESTION_MESSAGE);
                if (documento == null) {
                    return;
                }
                String contrasena = JOptionPane.showInputDialog(null, "Ingrese la contraseña:", "Contraseña", JOptionPane.QUESTION_MESSAGE);
                if (contrasena == null) {
                    return;
                }
                per.setNombre(nombre);
                per.setDocumento(documento);
                per.setContraseña(contrasena);

                em.getTransaction().begin();
                em.merge(per);
                em.getTransaction().commit();
                JOptionPane.showMessageDialog(null, "Se realizaron los cambios", "Echo", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Algo a salido mal\nCambios no realizados", "Error", JOptionPane.ERROR_MESSAGE);
            em.getTransaction().rollback();
        } finally {
              
              
        }
    }

    public void insertar(String nombre, String documento, String correo, String contrasena, int sede, int tipo) {
         
        Persona per = null;
        em.getTransaction().begin();
        try {

            if (tipo != 0) {
                per = new Usuario();
                ((Usuario) per).setCorreo(correo);

                if (tipo == 1) {
                    per.setTipo_empleado("Administrador");
                } else {
                    per.setTipo_empleado("superadmin");
                }
            } else {
                per = new Empleado();
                per.setTipo_empleado("lavador");
            }

            per.setNombre(nombre);
            per.setDocumento(documento);
            per.setContraseña(contrasena);
            per.setId_sede(sede);

            em.persist(per);
            em.getTransaction().commit();

            JOptionPane.showMessageDialog(null, "Empleado agregado exitosamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            JOptionPane.showMessageDialog(null, "Algo ha salido mal: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            if (em.isOpen()) {
                  
            }
            if (emf.isOpen()) {
                  
            }
        }
    }

    public void despedir(int id) {
         
        try {
            em.getTransaction().begin();
            em.createNativeQuery("call esquema.despedir(" + id + ")").executeUpdate();
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Empleado despedido", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Empleado no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
              
              
        }
    }

    public List<Object[]> vistaEmpleados(int sede) {

         
        try {
            return em.createNativeQuery(VISTA_EMPLEADOS + sede).getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "vista no cargada");
            return null;
        } finally {
              
              
        }

    }
}
