/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Model;

import static Model.Orderpage.Menutable;
import static Model.Orderpage.openvar;
import canteenmanagementsystem.OrderInfo;
import canteenmanagementsystem.OrderplacedInfo;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ragul S
 */
public class ManageItems extends javax.swing.JFrame {
    String username;
    public static SearchItems si;
    public static AddItem ai;
    /**
     * Creates new form ManageItems
     * @param n
     */
    

    public ManageItems(String n)
    {
        CanteenInterface.apov=true;
        username = n;
        setUndecorated(true);
        setBounds(770,100,400,5);
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Userbox.setText(n+"'s Page");
        this.addWindowListener(new WindowAdapter() {
  @Override
  public void windowClosed(WindowEvent e) {
     openvar=false;
     CanteenInterface.apov=false;
  }

  @Override
  public void windowClosing(WindowEvent e) {
     // Do something
     openvar=false;
     CanteenInterface.apov=false;
  }
    });
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        OrderPlacedTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Addbtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        Userbox = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        updatebtn = new javax.swing.JButton();
        rechargebtn = new javax.swing.JButton();
        viewbtn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(760, 632));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setText("Yet to be served...");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 170, 40));

        OrderPlacedTable.setBackground(new java.awt.Color(204, 255, 255));
        OrderPlacedTable.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        OrderPlacedTable.setForeground(new java.awt.Color(0, 51, 153));
        OrderPlacedTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Name", "Total", "Payment Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        OrderPlacedTable.setRowHeight(30);
        OrderPlacedTable.setSelectionBackground(new java.awt.Color(0, 51, 153));
        OrderPlacedTable.setSelectionForeground(new java.awt.Color(204, 255, 255));
        OrderPlacedTable.setShowGrid(true);
        OrderPlacedTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OrderPlacedTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(OrderPlacedTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 460, 200));

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Greetings");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 200, 70));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Chef !");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 170, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 270, 700));

        Addbtn.setBackground(new java.awt.Color(0, 51, 153));
        Addbtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Addbtn.setForeground(new java.awt.Color(255, 255, 255));
        Addbtn.setText("Add");
        Addbtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 86, 40));

        jPanel3.setBackground(new java.awt.Color(0, 51, 153));
        jPanel3.setForeground(new java.awt.Color(0, 102, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("  X");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 30, 30));

        Userbox.setBackground(new java.awt.Color(255, 255, 255));
        Userbox.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        Userbox.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(Userbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 220, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, -20, 520, 50));

        jButton2.setBackground(new java.awt.Color(0, 51, 153));
        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Logout");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, 80, 30));

        jPanel5.setBackground(new java.awt.Color(0, 51, 153));
        jPanel5.setForeground(new java.awt.Color(0, 102, 0));
        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 30, 640));

        jPanel7.setBackground(new java.awt.Color(0, 51, 153));
        jPanel7.setForeground(new java.awt.Color(0, 102, 0));
        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 610, 510, 50));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        updatebtn.setBackground(new java.awt.Color(0, 51, 153));
        updatebtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        updatebtn.setForeground(new java.awt.Color(255, 255, 255));
        updatebtn.setText("Update");
        updatebtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });
        jPanel2.add(updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 103, 40));

        rechargebtn.setBackground(new java.awt.Color(0, 51, 153));
        rechargebtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        rechargebtn.setForeground(new java.awt.Color(255, 255, 255));
        rechargebtn.setText("Recharge");
        rechargebtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rechargebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechargebtnActionPerformed(evt);
            }
        });
        jPanel2.add(rechargebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 130, 40));

        viewbtn.setBackground(new java.awt.Color(0, 51, 153));
        viewbtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        viewbtn.setForeground(new java.awt.Color(255, 255, 255));
        viewbtn.setText("View All");
        viewbtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtnActionPerformed(evt);
            }
        });
        jPanel2.add(viewbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 410, 110, 40));

        jButton3.setBackground(new java.awt.Color(0, 51, 153));
        jButton3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Order History");
        jButton3.setActionCommand("");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 150, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 520, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddbtnActionPerformed
        // TODO add your handling code here:
        ai = new AddItem();
        ai.setVisible(true);
    }//GEN-LAST:event_AddbtnActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        // TODO add your handling code here:
        //new UpdateDetails().setVisible(true);
        si = new SearchItems();
        si.setVisible(true);
    }//GEN-LAST:event_updatebtnActionPerformed

    private void rechargebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechargebtnActionPerformed
        // TODO add your handling code here:
        //new SearchItems().setVisible(true);
        new rechargeUser().setVisible(true);
    }//GEN-LAST:event_rechargebtnActionPerformed

    private void viewbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbtnActionPerformed

        new ViewItems().setVisible(true);
    }//GEN-LAST:event_viewbtnActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        CanteenInterface.al1 = new AdminLogin();
        CanteenInterface.al1.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void OrderPlacedTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrderPlacedTableMouseClicked
        // TODO add your handling code here:
        OrderplacedInfo o=new OrderplacedInfo();
        int index = OrderPlacedTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) OrderPlacedTable.getModel(); 
        
        for(OrderplacedInfo i : OrderInfo.oa)
        {
            if(i.getOrderid()==Integer.parseInt(model.getValueAt(index, 0).toString()))
            {
                o=i;
                break;
            }
        }
        new ServerOrder(o,index).setVisible(true);
    }//GEN-LAST:event_OrderPlacedTableMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new OrderHistoryAdmin().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(ManageItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageItems("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addbtn;
    public static javax.swing.JTable OrderPlacedTable;
    private javax.swing.JLabel Userbox;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton rechargebtn;
    private javax.swing.JButton updatebtn;
    private javax.swing.JButton viewbtn;
    // End of variables declaration//GEN-END:variables
}