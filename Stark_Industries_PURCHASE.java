/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stark.industries;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.Timer;



/**
 *
 * @author DarkGamerX100
 */
public class Stark_Industries_PURCHASE extends javax.swing.JFrame {

    /**
     * Creates new form Stark_Industries_PURCHASE
     */
    public Stark_Industries_PURCHASE() {
        initComponents();
        txt_ProID.setVisible(false);
        showDate();
        showTime();
        
    }
    
    void showDate(){
        java.util.Date d = new java.util.Date();
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM--dd");
         txtDate.setText(f.format(d));
    
    }
    
    void showTime(){
            new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
        java.util.Date d = new java.util.Date();
        SimpleDateFormat f = new SimpleDateFormat("hh:mm a");
         txtTime.setText(f.format(d));
            }
        }).start();
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
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPlace = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtAcc = new javax.swing.JTextField();
        btnProceed = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtProName = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTime = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_ProID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("www.starkindustries.org/payment");

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 290, 140, 30);

        txtName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtName.setForeground(new java.awt.Color(51, 51, 51));
        txtName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        jPanel1.add(txtName);
        txtName.setBounds(320, 280, 240, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Contact Number");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 350, 200, 30);

        txtContact.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtContact.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        jPanel1.add(txtContact);
        txtContact.setBounds(320, 350, 240, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Place");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 410, 200, 40);

        txtPlace.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPlace.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        jPanel1.add(txtPlace);
        txtPlace.setBounds(320, 410, 240, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Payment Method");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 490, 220, 40);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(204, 204, 204));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Paypal", "VISA", "MasterCard", "Maestro" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(320, 470, 240, 50);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Account Number");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 540, 220, 40);

        txtAcc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtAcc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        jPanel1.add(txtAcc);
        txtAcc.setBounds(320, 540, 240, 30);

        btnProceed.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnProceed.setForeground(new java.awt.Color(255, 51, 0));
        btnProceed.setText("PROCEED");
        btnProceed.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnProceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProceedActionPerformed(evt);
            }
        });
        jPanel1.add(btnProceed);
        btnProceed.setBounds(670, 560, 160, 60);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("EMAIL ID");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(50, 600, 220, 40);

        txtEmail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        jPanel1.add(txtEmail);
        txtEmail.setBounds(320, 600, 240, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Product Name ");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(50, 110, 180, 40);

        txtProName.setEditable(false);
        txtProName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtProName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        txtProName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtProName);
        txtProName.setBounds(320, 120, 240, 30);

        txtDate.setEditable(false);
        txtDate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        jPanel1.add(txtDate);
        txtDate.setBounds(320, 170, 240, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Date");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(50, 160, 170, 40);

        txtTime.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtTime.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        jPanel1.add(txtTime);
        txtTime.setBounds(320, 220, 240, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Time");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(50, 220, 100, 40);
        jPanel1.add(txt_ProID);
        txt_ProID.setBounds(700, 150, 170, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stark/industries/Payment Background .jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 970, 670);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 967, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
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
     
      public void Close(){
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
         Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
        
    }
     
    private void btnProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProceedActionPerformed
        // TODO add your handling code here:
       if(txtName.getText().isEmpty()||txtContact.getText().isEmpty()||txtPlace.getText().isEmpty()||txtAcc.getText().isEmpty())
       {
           JOptionPane.showMessageDialog(null, "ERROR!. ONE OR MORE FIELDS ARE EMPTY");
           
       }
       else
       {
           
           String Pro_ID = txt_ProID.getText();
           String Product_Name = txtProName.getText();
           String Customer_Name = txtName.getText();
           String Date = txtDate.getText();
           String Time = txtTime.getText();
           int Contact_No = Integer.parseInt(txtContact.getText());
           String Place = txtPlace.getText();
           int Acc_No = Integer.parseInt(txtAcc.getText());
           String Email_ID= txtEmail.getText();
           
           
           
           try{
            Connection con = getConnection();
            stmt=con.createStatement();
            
            String command="insert into purchase_history values('"+Pro_ID+"','"+Product_Name+"','"+Customer_Name+"','"+Date+"','"+Time+"','"+Contact_No+"','"+Place+"','"+Acc_No+"','"+Email_ID+"');";
            stmt.executeUpdate(command);
            JOptionPane.showMessageDialog(null, "TRANSACTION IN PROGRESS.....");
            stmt.close();
            con.close();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        
        finally{}
           {
          Stark_Industries_TransactionSuccess obj = new Stark_Industries_TransactionSuccess();
          obj.setVisible(true);
          Close();
           }
       }
       
        
    }//GEN-LAST:event_btnProceedActionPerformed

    private void txtProNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProNameActionPerformed

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
            java.util.logging.Logger.getLogger(Stark_Industries_PURCHASE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stark_Industries_PURCHASE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stark_Industries_PURCHASE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stark_Industries_PURCHASE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stark_Industries_PURCHASE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProceed;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAcc;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPlace;
    public static javax.swing.JTextField txtProName;
    private javax.swing.JTextField txtTime;
    public static javax.swing.JTextField txt_ProID;
    // End of variables declaration//GEN-END:variables
}