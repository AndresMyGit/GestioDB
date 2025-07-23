package Gui;

import domain.Persona;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

public class prin extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(prin.class.getName());
    private Persona per = new Persona();

    public prin() {
        initComponents();
    }

    public prin(Persona p) {
        initComponents();
        this.per = p;
        this.userLabel.setText(" " + p.getNombre());
        this.sedeLabel.setText(" " + p.getId_sede());
        this.rolLabel.setText(" " + p.getTipo_empleado());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        serviciosButton2 = new javax.swing.JButton();
        empleadosButton = new javax.swing.JButton();
        nominasButton3 = new javax.swing.JButton();
        sedesButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        sLabel = new javax.swing.JLabel();
        Label = new javax.swing.JLabel();
        rLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        sedeLabel = new javax.swing.JLabel();
        rolLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Contenedor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DB Manager Proyect");

        jPanel2.setBackground(new java.awt.Color(51, 255, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(200, 400));

        serviciosButton2.setBackground(new java.awt.Color(255, 255, 255));
        serviciosButton2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        serviciosButton2.setForeground(new java.awt.Color(51, 255, 51));
        serviciosButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\andre\\Downloads\\carro.png")); // NOI18N
        serviciosButton2.setText("Servicios");
        serviciosButton2.setBorder(null);
        serviciosButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        serviciosButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                serviciosButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                serviciosButton2MouseExited(evt);
            }
        });
        serviciosButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviciosButton2ActionPerformed(evt);
            }
        });

        empleadosButton.setBackground(new java.awt.Color(255, 255, 255));
        empleadosButton.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        empleadosButton.setForeground(new java.awt.Color(51, 255, 51));
        empleadosButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\andre\\Downloads\\empleados (1).png")); // NOI18N
        empleadosButton.setText("Empleados");
        empleadosButton.setBorder(null);
        empleadosButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        empleadosButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                empleadosButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                empleadosButtonMouseExited(evt);
            }
        });
        empleadosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empleadosButtonActionPerformed(evt);
            }
        });

        nominasButton3.setBackground(new java.awt.Color(255, 255, 255));
        nominasButton3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        nominasButton3.setForeground(new java.awt.Color(51, 255, 51));
        nominasButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\andre\\Downloads\\dinero (1).png")); // NOI18N
        nominasButton3.setText("Nominas");
        nominasButton3.setBorder(null);
        nominasButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nominasButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nominasButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nominasButton3MouseExited(evt);
            }
        });
        nominasButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nominasButton3ActionPerformed(evt);
            }
        });

        sedesButton.setBackground(new java.awt.Color(255, 255, 255));
        sedesButton.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        sedesButton.setForeground(new java.awt.Color(51, 255, 51));
        sedesButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\andre\\Downloads\\compra-local (1).png")); // NOI18N
        sedesButton.setText("Sedes");
        sedesButton.setBorder(null);
        sedesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sedesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sedesButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sedesButtonMouseExited(evt);
            }
        });
        sedesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sedesButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SELECCIONA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addComponent(serviciosButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(empleadosButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(nominasButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sedesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(serviciosButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(empleadosButton, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nominasButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sedesButton, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.LINE_START);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(680, 65));

        sLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sLabel.setForeground(new java.awt.Color(51, 255, 51));
        sLabel.setText("Sede :");

        Label.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Label.setForeground(new java.awt.Color(51, 255, 51));
        Label.setText("Usuario :");

        rLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rLabel.setForeground(new java.awt.Color(51, 255, 51));
        rLabel.setText("Rol :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\andre\\Downloads\\diente (2).png")); // NOI18N
        jLabel9.setText("Sistem");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\andre\\Downloads\\cerrar-sesion.png")); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel5.setIconTextGap(2);
        jLabel5.setInheritsPopupMenu(false);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        userLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        userLabel.setForeground(new java.awt.Color(0, 0, 0));
        userLabel.setText("...");

        sedeLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        sedeLabel.setForeground(new java.awt.Color(0, 0, 0));
        sedeLabel.setText("...");

        rolLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        rolLabel.setForeground(new java.awt.Color(0, 0, 0));
        rolLabel.setText("...");

        jLabel8.setBackground(new java.awt.Color(255, 102, 51));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 255, 102));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Wash N Go");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Label, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sedeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rolLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(15, 15, 15))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(Label, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(userLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(sedeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(rolLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_START);

        Contenedor.setBackground(new java.awt.Color(153, 153, 153));
        Contenedor.setForeground(new java.awt.Color(51, 255, 51));
        Contenedor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Contenedor.setPreferredSize(new java.awt.Dimension(710, 430));

        javax.swing.GroupLayout ContenedorLayout = new javax.swing.GroupLayout(Contenedor);
        Contenedor.setLayout(ContenedorLayout);
        ContenedorLayout.setHorizontalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );
        ContenedorLayout.setVerticalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        getContentPane().add(Contenedor, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void serviciosButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviciosButton2ActionPerformed
        Servicios ser = new Servicios(this.per);
        cambiarVentana(ser);
    }//GEN-LAST:event_serviciosButton2ActionPerformed

    private void serviciosButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serviciosButton2MouseEntered
        serviciosButton2.setBackground(Color.decode("#999999"));
    }//GEN-LAST:event_serviciosButton2MouseEntered

    private void empleadosButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empleadosButtonMouseExited
        empleadosButton.setBackground(Color.decode("#FFFFFF"));
    }//GEN-LAST:event_empleadosButtonMouseExited

    private void empleadosButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empleadosButtonMouseEntered
        empleadosButton.setBackground(Color.decode("#999999"));
    }//GEN-LAST:event_empleadosButtonMouseEntered

    private void serviciosButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serviciosButton2MouseExited
        serviciosButton2.setBackground(Color.decode("#FFFFFF"));
    }//GEN-LAST:event_serviciosButton2MouseExited

    private void nominasButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nominasButton3MouseEntered
        nominasButton3.setBackground(Color.decode("#999999"));
    }//GEN-LAST:event_nominasButton3MouseEntered

    private void nominasButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nominasButton3MouseExited
        nominasButton3.setBackground(Color.decode("#FFFFFF"));
    }//GEN-LAST:event_nominasButton3MouseExited

    private void sedesButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sedesButtonMouseEntered
        sedesButton.setBackground(Color.decode("#999999"));
    }//GEN-LAST:event_sedesButtonMouseEntered

    private void sedesButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sedesButtonMouseExited
        sedesButton.setBackground(Color.decode("#FFFFFF"));
    }//GEN-LAST:event_sedesButtonMouseExited

    private void empleadosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empleadosButtonActionPerformed
        Empleados emp = new Empleados(per);
        cambiarVentana(emp);
    }//GEN-LAST:event_empleadosButtonActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        this.dispose();
        Loggin l = new Loggin();
        l.setLocationRelativeTo(null);
        l.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void nominasButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nominasButton3ActionPerformed
        Nominas nom = new Nominas(per);
        cambiarVentana(nom);
    }//GEN-LAST:event_nominasButton3ActionPerformed

    private void sedesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sedesButtonActionPerformed
        SedesPane sed = new SedesPane(this.per);
        cambiarVentana(sed);
    }//GEN-LAST:event_sedesButtonActionPerformed

    public static void main(String[] args) {
        prin p = new prin();
        p.setLocationRelativeTo(null);
        p.setVisible(true);
    }

    public void cambiarVentana(JPanel panel) {
        this.Contenedor.removeAll();
        this.Contenedor.setLayout(new BorderLayout());
        this.Contenedor.add(panel, BorderLayout.CENTER);
        this.Contenedor.revalidate();
        this.Contenedor.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenedor;
    private javax.swing.JLabel Label;
    private javax.swing.JButton empleadosButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton nominasButton3;
    private javax.swing.JLabel rLabel;
    private javax.swing.JLabel rolLabel;
    private javax.swing.JLabel sLabel;
    private javax.swing.JLabel sedeLabel;
    private javax.swing.JButton sedesButton;
    private javax.swing.JButton serviciosButton2;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}
