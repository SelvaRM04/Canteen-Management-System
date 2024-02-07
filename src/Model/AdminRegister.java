/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Model;

import canteenmanagementsystem.AdminInfo;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
/**
 *
 * @author Ragul S
 */
public class AdminRegister extends javax.swing.JFrame {

    /**
     * Creates new form AdminRegister
     */
    public static Boolean op=false;
    public AdminRegister() {
        op=true;
        setBounds(770,100,400,5);
        setUndecorated(true);
        initComponents();
        
        this.addWindowListener(new WindowAdapter() {
        
            @Override
            public void windowClosed(WindowEvent e) 
            {
                op=false;
            }

            @Override
            public void windowClosing(WindowEvent e)
            {
                op=false;
            }
        });
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    public void Validate()
    {
        AdminInfo ai;
        try{
            String username = Admin_username.getText();
            String password = Admin_password.getText();
            String cpassword = Admin_conpassword.getText();
            String email = Admin_email.getText();
            
            if(username.equals("") || password.equals("") || cpassword.equals("") || email.equals(""))
                throw new NullPointerException();
            
            if(password.equals(cpassword)==false)
            {
                new Panead("Registration Error","Password doesn't match","").setVisible(true);
            }
            
            else if(email.matches("[a-zA-Z][a-zA-Z0-9_]*@gmail.com")==false)
            {
                new Panead("Registration Error","Email Incorrect","").setVisible(true);
            }
            
            else
            {
                ai = new AdminInfo(username,password);
                AdminInfo.Admin_array.add(ai);
                new Panead("Registration",username+" registered successfully","Register").setVisible(true);
            }
        }
        catch(NullPointerException e)
        {
            new Panead("Registration Error","Please enter all fields","").setVisible(true);
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        Admin_login = new javax.swing.JButton();
        Admin_username = new javax.swing.JTextField();
        Admin_password = new javax.swing.JPasswordField();
        Admin_conpassword = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Admin_register = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Admin_email = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(780, 632));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 490, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 51, 153));
        jPanel3.setForeground(new java.awt.Color(0, 102, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Admin Registration");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 160, 20));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("  X");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 30, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, -20, 480, 50));

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Canteen");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 200, 70));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Management");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 260, 70));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("System.");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 260, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 700));

        jPanel5.setBackground(new java.awt.Color(0, 51, 153));
        jPanel5.setForeground(new java.awt.Color(0, 102, 0));
        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 30, 640));

        jPanel7.setBackground(new java.awt.Color(0, 51, 153));
        jPanel7.setForeground(new java.awt.Color(0, 102, 0));
        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 610, 480, 60));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 51, 153));
        jLabel15.setText("Already have an account?");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 490, 200, 50));

        Admin_login.setBackground(new java.awt.Color(0, 51, 153));
        Admin_login.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Admin_login.setForeground(new java.awt.Color(255, 255, 255));
        Admin_login.setText("Login");
        Admin_login.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Admin_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Admin_loginActionPerformed(evt);
            }
        });
        getContentPane().add(Admin_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 500, 80, 30));

        Admin_username.setBackground(new java.awt.Color(0, 51, 153));
        Admin_username.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Admin_username.setForeground(new java.awt.Color(255, 255, 255));
        Admin_username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Admin_username.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 102, 204), new java.awt.Color(0, 102, 204), null, null));
        Admin_username.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Admin_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Admin_usernameActionPerformed(evt);
            }
        });
        getContentPane().add(Admin_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 220, 30));

        Admin_password.setBackground(new java.awt.Color(0, 51, 153));
        Admin_password.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Admin_password.setForeground(new java.awt.Color(255, 255, 255));
        Admin_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Admin_password.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 204), new java.awt.Color(0, 153, 204), null, null));
        Admin_password.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Admin_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Admin_passwordActionPerformed(evt);
            }
        });
        getContentPane().add(Admin_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 220, 30));

        Admin_conpassword.setBackground(new java.awt.Color(0, 51, 153));
        Admin_conpassword.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Admin_conpassword.setForeground(new java.awt.Color(255, 255, 255));
        Admin_conpassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Admin_conpassword.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 204), new java.awt.Color(0, 153, 204), null, null));
        Admin_conpassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Admin_conpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Admin_conpasswordActionPerformed(evt);
            }
        });
        getContentPane().add(Admin_conpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 220, 30));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 153));
        jLabel8.setText("Username");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 100, 30));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 51, 153));
        jLabel16.setText("Password");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 100, 30));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 153));
        jLabel3.setText("Confirm Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 140, 30));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 51, 153));
        jLabel17.setText("Email ID");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 80, 30));

        Admin_register.setBackground(new java.awt.Color(0, 51, 153));
        Admin_register.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Admin_register.setForeground(new java.awt.Color(255, 255, 255));
        Admin_register.setText("Register");
        Admin_register.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Admin_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Admin_registerActionPerformed(evt);
            }
        });
        getContentPane().add(Admin_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 430, 90, 30));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 153));
        jLabel5.setText("Hello New Admin!");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 540, 43));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 21)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 51, 153));
        jLabel14.setText("Register");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 90, 30));

        Admin_email.setBackground(new java.awt.Color(0, 51, 153));
        Admin_email.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Admin_email.setForeground(new java.awt.Color(255, 255, 255));
        Admin_email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Admin_email.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 102, 204), new java.awt.Color(0, 102, 204), null, null));
        Admin_email.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Admin_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Admin_emailActionPerformed(evt);
            }
        });
        jPanel2.add(Admin_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 220, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 470, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void Admin_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Admin_loginActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        CanteenInterface.al1 = new AdminLogin();
        CanteenInterface.al1.setVisible(true);
    }//GEN-LAST:event_Admin_loginActionPerformed

    private void Admin_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Admin_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Admin_usernameActionPerformed

    private void Admin_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Admin_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Admin_passwordActionPerformed

    private void Admin_conpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Admin_conpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Admin_conpasswordActionPerformed

    private void Admin_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Admin_registerActionPerformed
        // TODO add your handling code here:
        Validate();
    }//GEN-LAST:event_Admin_registerActionPerformed

    private void Admin_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Admin_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Admin_emailActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Admin_conpassword;
    private javax.swing.JTextField Admin_email;
    private javax.swing.JButton Admin_login;
    private javax.swing.JPasswordField Admin_password;
    private javax.swing.JButton Admin_register;
    private javax.swing.JTextField Admin_username;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}