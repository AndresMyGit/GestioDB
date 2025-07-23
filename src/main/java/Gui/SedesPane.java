package Gui;

import Datos.SedesDao;
import domain.Persona;
import domain.Sedes;
import domain.Usuario;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SedesPane extends javax.swing.JPanel {

    DefaultTableModel vista = new DefaultTableModel();
    List<Object[]> sedes;
    SedesDao sedDao;
    Persona per = new Usuario();

    public SedesPane(Persona per) {
        initComponents();
        this.per = per;
        sedDao = new SedesDao(per.getTipo_empleado());
        sedes = sedDao.seleccionar();
        actualizarTabla(sedes);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        InsertButton = new javax.swing.JButton();
        actualizarButton = new javax.swing.JButton();
        buscarButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sedesTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(690, 430));
        setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setForeground(new java.awt.Color(153, 153, 153));
        jPanel3.setPreferredSize(new java.awt.Dimension(150, 430));

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

        buscarButton.setBackground(new java.awt.Color(153, 153, 153));
        buscarButton.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        buscarButton.setForeground(new java.awt.Color(255, 255, 255));
        buscarButton.setText("Buscar");
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(actualizarButton, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(buscarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(InsertButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(buscarButton, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addGap(71, 71, 71)
                .addComponent(actualizarButton, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addGap(57, 57, 57)
                .addComponent(InsertButton, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addGap(76, 76, 76))
        );

        add(jPanel3, java.awt.BorderLayout.LINE_END);

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        sedesTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sedesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Ciudad", "Direccion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(sedesTable);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("sedes");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addGap(72, 72, 72))
        );

        add(jPanel4, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void InsertButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InsertButtonMouseEntered
        this.InsertButton.setBackground(Color.decode("#282828"));
    }//GEN-LAST:event_InsertButtonMouseEntered

    private void InsertButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InsertButtonMouseExited
        this.InsertButton.setBackground(Color.decode("#999999"));
    }//GEN-LAST:event_InsertButtonMouseExited

    private void actualizarButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarButtonMouseEntered
        this.actualizarButton.setBackground(Color.decode("#282828"));
    }//GEN-LAST:event_actualizarButtonMouseEntered

    private void actualizarButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarButtonMouseExited
        this.actualizarButton.setBackground(Color.decode("#999999"));
    }//GEN-LAST:event_actualizarButtonMouseExited

    private void buscarButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarButtonMouseEntered
        this.buscarButton.setBackground(Color.decode("#282828"));
    }//GEN-LAST:event_buscarButtonMouseEntered

    private void buscarButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarButtonMouseExited
        this.buscarButton.setBackground(Color.decode("#999999"));
    }//GEN-LAST:event_buscarButtonMouseExited

    private void buscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarButtonActionPerformed
        try {
            String[] opciones = {"por id", "Mostrar todos"};
            int opcion = JOptionPane.showOptionDialog(null, "Selecciona Busqueda", "Busqueda", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, ALLBITS);
            switch (opcion) {
                case 0:
                    int id = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el id", "Busqueda por id", JOptionPane.INFORMATION_MESSAGE));
                    Sedes sede = sedDao.seleccionar(id);
                    Object[] fila = {sede.getId_sede(), sede.getNombre(), sede.getDireccion(), sede.getTelefono()};
                    sedes.clear();
                    sedes.add(fila);
                    actualizarTabla(sedes);
                    break;
                case 1:
                    sedes = sedDao.seleccionar();
                    actualizarTabla(sedes);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No valido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Algo a salido mal", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buscarButtonActionPerformed

    private void actualizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarButtonActionPerformed

        InsertarActualizar act = new InsertarActualizar(true, per);
        act.setLocationRelativeTo(null);
        act.setVisible(true);

       

    }//GEN-LAST:event_actualizarButtonActionPerformed

    private void InsertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertButtonActionPerformed
        InsertarActualizar act = new InsertarActualizar(false,per);
        act.setLocationRelativeTo(null);
        act.setVisible(true);

        

    }//GEN-LAST:event_InsertButtonActionPerformed

    public void actualizarTabla(List<Object[]> o) {
        DefaultTableModel vista = new DefaultTableModel();
        vista.addColumn("Id");
        vista.addColumn("Nombre");
        vista.addColumn("Ciudad");
        vista.addColumn("Direccion");

        for (Object[] sede : o) {
            vista.addRow(sede);
        }
        this.sedesTable.setModel(vista);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InsertButton;
    private javax.swing.JButton actualizarButton;
    private javax.swing.JButton buscarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable sedesTable;
    // End of variables declaration//GEN-END:variables
}
