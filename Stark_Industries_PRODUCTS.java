/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stark.industries;
import java.sql.*;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author DarkGamerX100
 */
public class Stark_Industries_PRODUCTS extends javax.swing.JFrame {

    /**
     * Creates new form Stark_Industries_PRODUCTS
     */
    public Stark_Industries_PRODUCTS() {
        initComponents();
        jScrollPane1.setVisible(false);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        proTable = new javax.swing.JTable();
        btn_View = new javax.swing.JButton();
        btn_Back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PRODUCTS WINDOW");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("PRODUCTS");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(430, 30, 290, 70);

        proTable.setBackground(new java.awt.Color(204, 0, 102));
        proTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        proTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Product ID", "Product Name", "Category", "Sub Category"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(proTable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 150, 1070, 450);

        btn_View.setBackground(new java.awt.Color(255, 0, 51));
        btn_View.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_View.setText("VIEW");
        btn_View.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ViewActionPerformed(evt);
            }
        });
        jPanel1.add(btn_View);
        btn_View.setBounds(30, 90, 120, 30);

        btn_Back.setBackground(new java.awt.Color(255, 0, 51));
        btn_Back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_Back.setText("<<BACK");
        btn_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BackActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Back);
        btn_Back.setBounds(929, 625, 150, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stark/industries/Hard Background.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1130, 680);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1132, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ViewActionPerformed
        // TODO add your handling code here:
        jScrollPane1.setVisible(true);
        PreparedStatement pstmt;
        pstmt = null;
       Connection conn=null;
       ResultSet rs = null;
         try{
             
             Class.forName("com.mysql.jdbc.Driver");
           conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/stark_industries","root","stid");
         String sql="select * from products";
          pstmt=conn.prepareStatement(sql);
      rs=pstmt.executeQuery();
        proTable.setModel(DbUtils.resultSetToTableModel(rs));
}
catch(Exception ex){
JOptionPane.showMessageDialog(null, ex.getMessage());
}
finally{
    try{
        rs.close();
        pstmt.close();
         
    }
    catch(Exception ex){}}
        
    }//GEN-LAST:event_btn_ViewActionPerformed

    private void btn_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BackActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Exiting Products Window..");
        Stark_Industries_ADMIN adm = new Stark_Industries_ADMIN();
        adm.setVisible(true);
        Close();
        
    }//GEN-LAST:event_btn_BackActionPerformed

    public void Close(){
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
            java.util.logging.Logger.getLogger(Stark_Industries_PRODUCTS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stark_Industries_PRODUCTS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stark_Industries_PRODUCTS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stark_Industries_PRODUCTS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stark_Industries_PRODUCTS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Back;
    private javax.swing.JButton btn_View;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable proTable;
    // End of variables declaration//GEN-END:variables
}
