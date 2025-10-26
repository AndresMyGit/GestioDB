package Gui;

import Datos.Coneccion;
import domain.Persona;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import javax.swing.JOptionPane;

public class Loggin extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Loggin.class.getName());
    private EntityManagerFactory emf=Persistence.createEntityManagerFactory("admin");
    private EntityManager em = emf.createEntityManager();
    private Coneccion con = new Coneccion(this.emf,this.em);

    public Loggin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        UsuarioTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        EntrarButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Wash N Go ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0, 200));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        UsuarioTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        UsuarioTextField.setBorder(null);
        UsuarioTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        UsuarioTextField.setFocusCycleRoot(true);
        UsuarioTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(UsuarioTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 130, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contrseña");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        PasswordField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PasswordField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        PasswordField.setBorder(null);
        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });
        jPanel1.add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 130, 30));

        EntrarButton.setText("Entrar");
        EntrarButton.setBorder(null);
        EntrarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EntrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarButtonActionPerformed(evt);
            }
        });
        jPanel1.add(EntrarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 100, 35));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 130, 10));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 130, 10));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Iniciar Sesion");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 380));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/im.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(612, 380));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UsuarioTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuarioTextFieldActionPerformed

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFieldActionPerformed

    private void EntrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarButtonActionPerformed
        String user = UsuarioTextField.getText().trim();
        String contraseña = PasswordField.getText().trim();

      
        if (user.isEmpty() || contraseña.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese usuario y contraseña", "Error", JOptionPane.ERROR_MESSAGE);
            return; 
        }

        Persona entrar = con.validarUsuario(user, contraseña); 
        if (entrar!=null) {
            this.dispose(); 
            prin pr= new prin(entrar,this.emf, this.em);
            pr.setLocationRelativeTo(null);
            pr.setVisible(true);
            JOptionPane.showMessageDialog(null, "Sesión iniciada", "Validado", JOptionPane.INFORMATION_MESSAGE);
            
        } else {
            
            JOptionPane.showMessageDialog(null, "Usuario o contraseña inválidos", "Error", JOptionPane.ERROR_MESSAGE);
            UsuarioTextField.setText("");
            PasswordField.setText("");
        }
    }//GEN-LAST:event_EntrarButtonActionPerformed
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new Loggin().setVisible(true));
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EntrarButton;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JTextField UsuarioTextField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
