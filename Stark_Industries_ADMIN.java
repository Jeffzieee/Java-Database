/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stark.industries;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;


/**
 *
 * @author DarkGamerX100
 */
public class Stark_Industries_ADMIN extends javax.swing.JFrame {

    /**
     * Creates new form Stark_Industries_ADMIN
     */
    public Stark_Industries_ADMIN() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        txtDept = new javax.swing.JTextField();
        ds = new javax.swing.JTextField();
        txtSal = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        txtAdd = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        txtCon = new javax.swing.JTextField();
        btn_Add = new javax.swing.JButton();
        btn_Term = new javax.swing.JButton();
        btn_Details = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btn_PurchaseHistory = new javax.swing.JButton();
        btn_Clear = new javax.swing.JButton();
        btn_Products = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("STARK INDUSTRIES ADMIN");

        jPanel2.setLayout(null);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jTextField1.setText("ID");
        jPanel2.add(jTextField1);
        jTextField1.setBounds(10, 20, 160, 30);

        txtID.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jPanel2.add(txtID);
        txtID.setBounds(190, 20, 160, 30);

        txtName.setEditable(false);
        txtName.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtName.setText("NAME");
        jPanel2.add(txtName);
        txtName.setBounds(10, 70, 160, 30);

        txtname.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jPanel2.add(txtname);
        txtname.setBounds(190, 70, 160, 30);

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jTextField3.setText("DEPARTMENT");
        jPanel2.add(jTextField3);
        jTextField3.setBounds(10, 120, 160, 30);

        txtDept.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jPanel2.add(txtDept);
        txtDept.setBounds(190, 120, 160, 30);

        ds.setEditable(false);
        ds.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        ds.setText("SALARY");
        jPanel2.add(ds);
        ds.setBounds(10, 170, 160, 30);

        txtSal.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jPanel2.add(txtSal);
        txtSal.setBounds(190, 170, 160, 30);

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jTextField4.setText("ADDRESS");
        jPanel2.add(jTextField4);
        jTextField4.setBounds(10, 230, 160, 30);

        txtAdd.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jPanel2.add(txtAdd);
        txtAdd.setBounds(190, 230, 160, 30);

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jTextField5.setText("CONTACT");
        jPanel2.add(jTextField5);
        jTextField5.setBounds(10, 340, 160, 30);

        txtCon.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jPanel2.add(txtCon);
        txtCon.setBounds(190, 340, 160, 30);

        btn_Add.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btn_Add.setText("ADD");
        btn_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Add);
        btn_Add.setBounds(150, 420, 80, 40);

        btn_Term.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btn_Term.setText("TERMINATE");
        btn_Term.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TermActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Term);
        btn_Term.setBounds(250, 420, 160, 40);

        btn_Details.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btn_Details.setText("DETAILS");
        btn_Details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DetailsActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Details);
        btn_Details.setBounds(10, 420, 130, 40);

        jTextField2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jTextField2.setText("GENDER");
        jPanel2.add(jTextField2);
        jTextField2.setBounds(10, 280, 160, 30);

        txtGender.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jPanel2.add(txtGender);
        txtGender.setBounds(190, 280, 160, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 51, 51));
        jButton1.setText("RETURN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(720, 10, 110, 30);

        btn_PurchaseHistory.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_PurchaseHistory.setText("Purchase History");
        btn_PurchaseHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PurchaseHistoryActionPerformed(evt);
            }
        });
        jPanel2.add(btn_PurchaseHistory);
        btn_PurchaseHistory.setBounds(420, 420, 200, 40);

        btn_Clear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_Clear.setText("CLEAR ");
        btn_Clear.setBorder(null);
        btn_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ClearActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Clear);
        btn_Clear.setBounds(720, 480, 120, 40);

        btn_Products.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_Products.setText("PRODUCTS");
        btn_Products.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ProductsActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Products);
        btn_Products.setBounds(640, 420, 150, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stark/industries/Admin.jpg"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 850, 530);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 851, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     Statement stmt = null;
     ResultSet rs = null;
     
     public static Connection getConnection(){
         Connection con=null;
         try{
             Class.forName("com.mysql.jdbc.Driver");
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stark_industries","root","stid");
         }
         catch (Exception ex){
             JOptionPane.showMessageDialog(null, "Stark Server Connection Failure");
         }
         
         return con;
     }
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Exiting Administrator Window..");
        Stark_Industries_Online obj= new Stark_Industries_Online();
        obj.setVisible(true);
        Close();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_DetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DetailsActionPerformed
        // TODO add your handling code here:
        
       Stark_Industries_DETAILS obj = new Stark_Industries_DETAILS();
       obj.setVisible(true);
       Close();
    }//GEN-LAST:event_btn_DetailsActionPerformed

    private void btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddActionPerformed
        // TODO add your handling code here:
        String id = txtID.getText();
        String name = txtname.getText();
        String dept = txtDept.getText();
        double sal = Double.parseDouble(txtSal.getText());
        String adr = txtAdd.getText();
        int cont = Integer.parseInt(txtCon.getText());
        String Gen = txtGender.getText();
        
        
        try{
            Connection con = getConnection();
            stmt=con.createStatement();
            
            String command="insert into employer values('"+id+"','"+name+"','"+dept+"','"+sal+"','"+adr+"','"+cont+"','"+Gen+"');";
            stmt.executeUpdate(command);
            JOptionPane.showMessageDialog(null, "New Employer Added");
            stmt.close();
            con.close();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        
        finally{}
        txtID.setText("");
        txtname.setText("");
        txtDept.setText("");
        txtSal.setText("");
        
        txtAdd.setText("");
        txtGender.setText("");
        txtCon.setText("");
        
        
    }//GEN-LAST:event_btn_AddActionPerformed

    private void btn_TermActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TermActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Opening Terminate Window...");
        Stark_Industries_TERMINATE tr = new Stark_Industries_TERMINATE();
        tr.setVisible(true);
        Close();
        
    }//GEN-LAST:event_btn_TermActionPerformed

    private void btn_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClearActionPerformed
        // TODO add your handling code here:
        txtID.setText("");
        txtname.setText("");
        txtDept.setText("");
        txtSal.setText("");
        
        txtAdd.setText("");
        txtGender.setText("");
        txtCon.setText("");
    }//GEN-LAST:event_btn_ClearActionPerformed

    private void btn_PurchaseHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PurchaseHistoryActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Opening Purchase History Window...");
        Stark_Industries_PurchaseHistory sh = new Stark_Industries_PurchaseHistory();
        sh.setVisible(true);
        Close();
        
    }//GEN-LAST:event_btn_PurchaseHistoryActionPerformed

    private void btn_ProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ProductsActionPerformed
        // TODO add your handling code here:
        Stark_Industries_PRODUCTS pro = new Stark_Industries_PRODUCTS();
        pro.setVisible(true);
        Close();
    }//GEN-LAST:event_btn_ProductsActionPerformed

    public void Close()
    {
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
         Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    
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
            java.util.logging.Logger.getLogger(Stark_Industries_ADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stark_Industries_ADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stark_Industries_ADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stark_Industries_ADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stark_Industries_ADMIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Add;
    private javax.swing.JButton btn_Clear;
    private javax.swing.JButton btn_Details;
    private javax.swing.JButton btn_Products;
    private javax.swing.JButton btn_PurchaseHistory;
    private javax.swing.JButton btn_Term;
    private javax.swing.JTextField ds;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField txtAdd;
    private javax.swing.JTextField txtCon;
    private javax.swing.JTextField txtDept;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSal;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
