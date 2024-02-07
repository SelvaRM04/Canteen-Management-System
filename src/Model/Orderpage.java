/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Model;

/**
 *
 * @author Ragul S
 */
//import canteenmanagementsystem.CustomerInfo;
import canteenmanagementsystem.ItemInfo;
import Model.Payment;
import canteenmanagementsystem.CustomerInfo;
import canteenmanagementsystem.Order;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
public class Orderpage extends javax.swing.JFrame {
    
    public static double grandTotal =0;
    public static String order_details="";
    public static String un;
    public static Boolean openvar;
    /**
     * Creates new form Orderpage
     */
    public Orderpage(String n) {
       // Searchbox.setText(String.valueOf(CustomerInfo.cus_array.get(0).getBal_amount()));
       openvar=true;
       CanteenInterface.opov=true;
       un = n;
       ///new ManageItems("").setVisible(true);
       setUndecorated(true);
       setBounds(0,100,0,0);
        initComponents();
        
        Userbox.setText(n+"'s Orderpage");
        Userbal.setText(String.valueOf(CustomerInfo.ub.get(Login.cur_user).getBal_amount()));
        DefaultTableModel dtm = (DefaultTableModel) Menutable.getModel();
        dtm.setRowCount(0);
        
        for(ItemInfo it: ItemInfo.item_array){
            if(it.getAvailable_quantity()>0)
            dtm.addRow(new Object[]{
                it.getName(),it.getPrice()
            });
        }
        double ta=0;
        DefaultTableModel ctm = (DefaultTableModel) Carttable.getModel();
        ctm.setRowCount(0);
        
        for(Order it: CustomerInfo.order){
            ctm.addRow(new Object[]{
                it.getName(),it.getQ(),it.getP()
            });
            ta+=it.getP();
        }
        Totalbox.setText(String.valueOf(ta));
        /*dtm.addRow(new Object[]{
            "pongal",12
        });*/
        this.addWindowListener(new WindowAdapter() {
  @Override
  public void windowClosed(WindowEvent e) {
     openvar=false;
     CanteenInterface.opov=false;
  }

  @Override
  public void windowClosing(WindowEvent e) {
     // Do something
     openvar=false;
     CanteenInterface.opov=false;
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Userbal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Carttable = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Userbox = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Menutable = new javax.swing.JTable();
        Refresh = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        Searchbox = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Totalbox = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(760, 632));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(760, 632));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Userbal.setEditable(false);
        Userbal.setBackground(new java.awt.Color(0, 102, 0));
        Userbal.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Userbal.setForeground(new java.awt.Color(255, 255, 255));
        Userbal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Userbal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserbalActionPerformed(evt);
            }
        });
        jPanel1.add(Userbal, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 70, 30));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 0));
        jLabel2.setText("Balance");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 80, 30));

        jButton1.setBackground(new java.awt.Color(0, 102, 0));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Proceed to pay");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 520, -1, 30));

        Carttable.setBackground(new java.awt.Color(204, 255, 204));
        Carttable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 102, 0), new java.awt.Color(0, 102, 0), new java.awt.Color(0, 102, 0), new java.awt.Color(0, 102, 0)));
        Carttable.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Carttable.setForeground(new java.awt.Color(0, 102, 0));
        Carttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Quantity", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
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
        Carttable.setRowHeight(30);
        Carttable.setSelectionBackground(new java.awt.Color(0, 102, 0));
        Carttable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        Carttable.setShowGrid(true);
        Carttable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CarttableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(Carttable);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 360, 352));

        jButton3.setBackground(new java.awt.Color(0, 102, 0));
        jButton3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Logout");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, 90, 30));

        jPanel3.setBackground(new java.awt.Color(0, 102, 0));
        jPanel3.setForeground(new java.awt.Color(0, 102, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Userbox.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Userbox.setForeground(new java.awt.Color(255, 255, 255));
        Userbox.setText("Order Page");
        jPanel3.add(Userbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 170, 30));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("  X");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 40, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -20, 820, 50));

        jPanel2.setBackground(new java.awt.Color(0, 102, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menutable.setBackground(new java.awt.Color(204, 255, 204));
        Menutable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Menutable.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Menutable.setForeground(new java.awt.Color(0, 102, 0));
        Menutable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Menutable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Menutable.setGridColor(new java.awt.Color(0, 102, 0));
        Menutable.setRowHeight(30);
        Menutable.setSelectionBackground(new java.awt.Color(0, 102, 0));
        Menutable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        Menutable.setShowGrid(true);
        Menutable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenutableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Menutable);
        if (Menutable.getColumnModel().getColumnCount() > 0) {
            Menutable.getColumnModel().getColumn(0).setResizable(false);
            Menutable.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 290, 290));

        Refresh.setBackground(new java.awt.Color(204, 255, 204));
        Refresh.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Refresh.setForeground(new java.awt.Color(0, 102, 0));
        Refresh.setText("Search");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });
        jPanel2.add(Refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 90, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Item Name:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 30));

        jButton5.setBackground(new java.awt.Color(204, 255, 204));
        jButton5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 102, 0));
        jButton5.setText("Clear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 80, -1));

        Searchbox.setBackground(new java.awt.Color(204, 255, 204));
        Searchbox.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Searchbox.setForeground(new java.awt.Color(0, 102, 0));
        Searchbox.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Searchbox.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Searchbox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Searchbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchboxActionPerformed(evt);
            }
        });
        jPanel2.add(Searchbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 200, 30));

        jButton2.setBackground(new java.awt.Color(204, 255, 204));
        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 0));
        jButton2.setText("Order History");
        jButton2.setActionCommand("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 560, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 700));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 0));
        jLabel3.setText("Total");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 520, 50, 30));

        Totalbox.setBackground(new java.awt.Color(0, 102, 0));
        Totalbox.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Totalbox.setForeground(new java.awt.Color(255, 255, 255));
        Totalbox.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Totalbox.setText("0");
        Totalbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalboxActionPerformed(evt);
            }
        });
        jPanel1.add(Totalbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 520, 70, 30));

        jPanel5.setBackground(new java.awt.Color(0, 102, 0));
        jPanel5.setForeground(new java.awt.Color(0, 102, 0));
        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 80, 640));

        jPanel7.setBackground(new java.awt.Color(0, 102, 0));
        jPanel7.setForeground(new java.awt.Color(102, 34, 6));
        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 600, 460, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public int Search(String itemname){
        TableModel model = Carttable.getModel();
        int rowcount = model.getRowCount();
        if(rowcount==0) return -1;
        
        for(int i=0;i<rowcount;i++){
            if(itemname.equals(model.getValueAt(i, 0))){
                return i;
            }
        }
        
        return -1;
    }
    private void MenutableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenutableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) Carttable.getModel();
        
        int index = Menutable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) Menutable.getModel(); 
        
        String itemname = model.getValueAt(index, 0).toString();
        String price = model.getValueAt(index,1).toString();
        for(ItemInfo i : ItemInfo.item_array)
        {
            if(itemname.equals(i.getName()))
            {
                if(i.getAvailable_quantity()>0)
                {
                   int foundIndex = Search(itemname);
        //int foundIndex=-1;
        
        grandTotal = Double.parseDouble(Totalbox.getText());
        
        if( foundIndex != -1){
            double pri = Double.parseDouble(dtm.getValueAt(foundIndex, 2).toString());
            int qt =Integer.parseInt(dtm.getValueAt(foundIndex, 1).toString());
            if(i.getAvailable_quantity()-qt>0)
            {
            pri += pri/qt;
            qt++;
            
            grandTotal += pri/qt;
            CustomerInfo.order.get(foundIndex).setP(pri);
            CustomerInfo.order.get(foundIndex).setQ(qt);
            dtm.setValueAt(pri, foundIndex, 2);
            dtm.setValueAt(qt,foundIndex,1);
            }
        }
        else
        {
            dtm.addRow(new Object[]{
                itemname,1,Double.valueOf(price)
            });
            CustomerInfo.order.add(new Order(itemname,1,Double.valueOf(price)));
            grandTotal += Double.valueOf(price);
        }
        
        Totalbox.setText(String.valueOf(grandTotal)); 
                }
            }
        }
        
    }//GEN-LAST:event_MenutableMouseClicked

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        // TODO add your handling code here:
        String name = Searchbox.getText();
        int flag = 0;
        //JOptionPane.showMessageDialog(null,name+" Not Found !"+ItemInfo.item_array.size());
        DefaultTableModel dtm = (DefaultTableModel) Menutable.getModel();
        dtm.setRowCount(0);
        
        for(ItemInfo it: ItemInfo.item_array){
            if(it.getName().equals(name)){
                if(it.getAvailable_quantity()>0)
                    dtm.addRow(new Object[]{
                        it.getName(),it.getPrice(),it.getAvailable_quantity()
                });
                flag = 1;
            }
        }
        
        if(flag == 0){
            JOptionPane.showMessageDialog(null,name+" Not Found !");
            Searchbox.setText("");
            for(ItemInfo it: ItemInfo.item_array){
            dtm.addRow(new Object[]{
                it.getName(),it.getPrice()
            });
        }
        }
    }//GEN-LAST:event_RefreshActionPerformed

    private void UserbalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserbalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserbalActionPerformed

    private void CarttableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CarttableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) Carttable.getModel();
        
        grandTotal = Double.parseDouble(Totalbox.getText());
        
        int index = Carttable.getSelectedRow();
        
        double pri = Double.parseDouble(dtm.getValueAt(index, 2).toString());
        int qt =Integer.parseInt(dtm.getValueAt(index, 1).toString());
        
        double ratio =pri/qt;
        pri -= ratio;
        qt--;
        
        grandTotal -= ratio;
        
        if(qt != 0){
            dtm.setValueAt(pri, index, 2);
            dtm.setValueAt(qt,index,1);
            CustomerInfo.order.get(index).setP(pri);
            CustomerInfo.order.get(index).setQ(qt);
        }
        else{
            dtm.removeRow(index);
            CustomerInfo.order.remove(index);
        }
        if(dtm.getRowCount() == 0) Totalbox.setText("0");
        else Totalbox.setText(String.valueOf(grandTotal));
    }//GEN-LAST:event_CarttableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel dtm = (DefaultTableModel) Carttable.getModel();
        
        for(int i=0;i<dtm.getRowCount();i++)
        {
            String itemname = dtm.getValueAt(i, 0).toString();
            String quantity = dtm.getValueAt(i,1).toString();
            for(ItemInfo it: ItemInfo.item_array){
                if(itemname.equals(it.getName()))
                {
                    it.setAvailable_quantity(it.getAvailable_quantity()-Integer.valueOf(quantity));
                    break;
                }
            }
            order_details+=itemname+" x "+quantity+"\n";
        }
        CustomerInfo.order.clear();

        CanteenInterface.cp =new Payment();
        CanteenInterface.cp.setVisible(true);
       // JOptionPane.showMessageDialog(null,order_details);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        CanteenInterface.cl1 = new Login();
        CanteenInterface.cl1.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Searchbox.setText("");
        DefaultTableModel dtm = (DefaultTableModel) Menutable.getModel();
        dtm.setRowCount(0);
        for(ItemInfo it: ItemInfo.item_array){
            dtm.addRow(new Object[]{
                it.getName(),it.getPrice()
            });
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void SearchboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchboxActionPerformed

    private void TotalboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalboxActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new OrderHistory().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Orderpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Orderpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Orderpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Orderpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Orderpage("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable Carttable;
    public static javax.swing.JTable Menutable;
    private javax.swing.JButton Refresh;
    private javax.swing.JTextField Searchbox;
    public static javax.swing.JTextField Totalbox;
    public static javax.swing.JTextField Userbal;
    private javax.swing.JLabel Userbox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}