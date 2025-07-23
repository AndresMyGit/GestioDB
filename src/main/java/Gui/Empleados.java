package Gui;

import Datos.EmpleadoDao;
import domain.Empleado;
import domain.Persona;
import domain.Usuario;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Empleados extends javax.swing.JPanel {

    List<Object[]> empleados = new ArrayList<>();
    EmpleadoDao empDao ;
    Persona per = new Usuario();

    public Empleados(Persona p) {
        initComponents();
        this.per = p;
        empDao = new EmpleadoDao(per.getTipo_empleado());
        empleados = empDao.seleccionar(per.getId_sede());
        actualizarTabla(empleados);
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        InsertButton = new javax.swing.JButton();
        actualizarButton = new javax.swing.JButton();
        eliminarButton = new javax.swing.JButton();
        buscarButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        empleadosTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(710, 430));
        setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setForeground(new java.awt.Color(153, 153, 153));
        jPanel2.setPreferredSize(new java.awt.Dimension(150, 430));

        InsertButton.setBackground(new java.awt.Color(153, 153, 153));
        InsertButton.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        InsertButton.setForeground(new java.awt.Color(255, 255, 255));
        InsertButton.setText("Insertar");
        InsertButton.setBorder(null);
        InsertButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                InsertButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                InsertButtonMouseExited(evt);
            }
        });
        InsertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertButtonActionPerformed(evt);
            }
        });

        actualizarButton.setBackground(new java.awt.Color(153, 153, 153));
        actualizarButton.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        actualizarButton.setForeground(new java.awt.Color(255, 255, 255));
        actualizarButton.setText("Actualizar");
        actualizarButton.setBorder(null);
        actualizarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                actualizarButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                actualizarButtonMouseExited(evt);
            }
        });
        actualizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarButtonActionPerformed(evt);
            }
        });

        eliminarButton.setBackground(new java.awt.Color(153, 153, 153));
        eliminarButton.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        eliminarButton.setForeground(new java.awt.Color(255, 255, 255));
        eliminarButton.setText("Despedir");
        eliminarButton.setBorder(null);
        eliminarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eliminarButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eliminarButtonMouseExited(evt);
            }
        });
        eliminarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarButtonActionPerformed(evt);
            }
        });

        buscarButton.setBackground(new java.awt.Color(153, 153, 153));
        buscarButton.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        buscarButton.setForeground(new java.awt.Color(255, 255, 255));
        buscarButton.setText("Consultar");
        buscarButton.setBorder(null);
        buscarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buscarButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buscarButtonMouseExited(evt);
            }
        });
        buscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(actualizarButton, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(buscarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(InsertButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eliminarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(buscarButton, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addGap(33, 33, 33)
                .addComponent(actualizarButton, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addGap(33, 33, 33)
                .addComponent(InsertButton, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addGap(33, 33, 33)
                .addComponent(eliminarButton, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addGap(72, 72, 72))
        );

        add(jPanel2, java.awt.BorderLayout.LINE_END);

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        empleadosTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        empleadosTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Tipo Empleado", "Sede", "Activo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(empleadosTable);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Empleados");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                .addGap(71, 71, 71))
        );

        add(jPanel3, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void buscarButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarButtonMouseEntered
        this.buscarButton.setBackground(Color.decode("#282828"));
    }//GEN-LAST:event_buscarButtonMouseEntered

    private void actualizarButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarButtonMouseEntered
        this.actualizarButton.setBackground(Color.decode("#282828"));
    }//GEN-LAST:event_actualizarButtonMouseEntered

    private void InsertButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InsertButtonMouseEntered
        this.InsertButton.setBackground(Color.decode("#282828"));
    }//GEN-LAST:event_InsertButtonMouseEntered

    private void eliminarButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarButtonMouseEntered
        this.eliminarButton.setBackground(Color.decode("#282828"));
    }//GEN-LAST:event_eliminarButtonMouseEntered

    private void buscarButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarButtonMouseExited
        this.buscarButton.setBackground(Color.decode("#999999"));
    }//GEN-LAST:event_buscarButtonMouseExited

    private void actualizarButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarButtonMouseExited
        this.actualizarButton.setBackground(Color.decode("#999999"));
    }//GEN-LAST:event_actualizarButtonMouseExited

    private void InsertButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InsertButtonMouseExited
        this.InsertButton.setBackground(Color.decode("#999999"));
    }//GEN-LAST:event_InsertButtonMouseExited

    private void eliminarButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarButtonMouseExited
        this.eliminarButton.setBackground(Color.decode("#999999"));

    }//GEN-LAST:event_eliminarButtonMouseExited

    private void buscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarButtonActionPerformed
        String[] opciones = {"por id", "Despedidos", "mostrar todos", "solo lavadores"};
        int opcion = JOptionPane.showOptionDialog(null, "Selecciona Busqueda", "Busqueda", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, ALLBITS);
        switch (opcion) {
            case 0:
                int id = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el id", "Busqueda por id", JOptionPane.INFORMATION_MESSAGE));
                empleados.clear();
                Persona per = empDao.busquedaID(id);
                Object[] fila = {per.getId_usuario(), per.getNombre(), per.getTipo_empleado(), per.getId_sede(), per.isActivo()};
                empleados.add(fila);
                actualizarTabla(empleados);
                break;
            case 1:
                empleados.clear();
                empleados = empDao.busquedaDespedido(this.per.getId_sede());
                actualizarTabla(empleados);
                break;
            case 2:
                empleados.clear();
                empleados = empDao.seleccionar(this.per.getId_sede());
                actualizarTabla(empleados);
                break;
            case 3:
                empleados.clear();
                empleados = empDao.busquedaLavadores(this.per.getId_sede());
                actualizarTabla(empleados);
                break;
            default:
                throw new AssertionError();
        }

    }//GEN-LAST:event_buscarButtonActionPerformed

    private void eliminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarButtonActionPerformed
        String input = JOptionPane.showInputDialog(null, "Digite id", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        if (input != null && !input.isBlank()) {
            try {
                int id = Integer.parseInt(input);
                empDao.despedir(id);
                empleados = empDao.seleccionar(per.getId_sede());
                actualizarTabla(empleados);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "ID inválido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_eliminarButtonActionPerformed

    private void actualizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarButtonActionPerformed
        try {
            int id = Integer.parseInt(JOptionPane.showInputDialog(null, "digite el id del empleado a cambiar", "Mensaje", JOptionPane.INFORMATION_MESSAGE));
            if (id > 0) {
                empDao.actualizarEmpleado(id);
                empleados = empDao.seleccionar(this.per.getId_sede());
                actualizarTabla(empleados);
            } else {
                JOptionPane.showMessageDialog(null, "Valor no valido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Valor no valido", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_actualizarButtonActionPerformed

    private void InsertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertButtonActionPerformed
        InsertarEmpleado insEmp = new InsertarEmpleado(per);
        insEmp.setLocationRelativeTo(null);
        insEmp.setVisible(true);
        empleados = empDao.seleccionar(this.per.getId_sede());
        actualizarTabla(empleados);
    }//GEN-LAST:event_InsertButtonActionPerformed

    public void actualizarTabla(List<Object[]> o) {
        DefaultTableModel vista = new DefaultTableModel();
        vista.addColumn("Id");
        vista.addColumn("Nombre");
        vista.addColumn("Tipo de Empleado");
        vista.addColumn("Sede");
        vista.addColumn("Activo");

        for (Object[] empleado : o) {
            vista.addRow(empleado);
        }
        empleadosTable.setModel(vista);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InsertButton;
    private javax.swing.JButton actualizarButton;
    private javax.swing.JButton buscarButton;
    private javax.swing.JButton eliminarButton;
    private javax.swing.JTable empleadosTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
