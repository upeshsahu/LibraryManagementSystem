package Interface;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class LendHistory extends javax.swing.JInternalFrame {

    Connection conn=null;
    PreparedStatement pstmt=null;
    ResultSet rs=null;

    public LendHistory() {
        initComponents();
        conn=DBConnect.connect();
       table_l();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        datefrom = new com.toedter.calendar.JDateChooser();
        dateto = new com.toedter.calendar.JDateChooser();
        txtmid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnapply = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        detailtable = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        datefrom.setDateFormatString("yyyy-MM-dd");
        datefrom.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jPanel2.add(datefrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 400, 170, 30));

        dateto.setDateFormatString("yyyy-MM-dd");
        dateto.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jPanel2.add(dateto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 170, 30));

        txtmid.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        txtmid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmidKeyReleased(evt);
            }
        });
        jPanel2.add(txtmid, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, 200, 30));

        jLabel4.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel4.setText("FROM:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 50, -1));

        jLabel5.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel5.setText("TO:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 40, -1));

        btnapply.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        btnapply.setText("APPLY FILTER");
        btnapply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnapplyActionPerformed(evt);
            }
        });
        jPanel2.add(btnapply, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, 210, 70));

        jButton1.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jButton1.setText("CLEAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 400, 210, 70));

        jLabel15.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel15.setText("Member ID");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 24, 110, 20));

        detailtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(detailtable);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 77, 880, 310));

        jLabel14.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel14.setText("Lend History");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 190, -1));

        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 900, 410));

        jLabel2.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 900, 50));

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txtmid.setText("");
        table_l();
      ((JTextField)datefrom.getDateEditor().getUiComponent()).setText("");
      ((JTextField)dateto.getDateEditor().getUiComponent()).setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnapplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnapplyActionPerformed

        salefilter();
    }//GEN-LAST:event_btnapplyActionPerformed

    private void txtmidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmidKeyReleased
               try
        {
            String s="SELECT `recno`, `mid`, `bid`, `issuedate`, `returndate` FROM `booklend` WHERE `mid` LIKE '"+txtmid.getText()+"%'";
            pstmt=(PreparedStatement)conn.prepareStatement(s);
            rs=pstmt.executeQuery();
          detailtable.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
          System.out.println("from book lend history class and table_l method the data is fetch and placed in table ");
        }
        catch(Exception e)
        { System.out.println("from book lend history class and table_l method facing prob "+e);
        }
    }//GEN-LAST:event_txtmidKeyReleased

    
    
    private void salefilter()
    {
        String fromdate=((JTextField)datefrom.getDateEditor().getUiComponent()).getText().toString();
        String todate=((JTextField)dateto.getDateEditor().getUiComponent()).getText().toString();
        
        if(fromdate.length()>0 && todate.isEmpty())
            {
                try
                    {
                    String s="SELECT `recno`, `mid`, `bid`, `issuedate`, `returndate` FROM `booklend` WHERE `mid` LIKE '"+txtmid.getText()+"%' AND `issuedate`='"+fromdate+"'";
                    pstmt=(PreparedStatement)conn.prepareStatement(s);
                    rs=pstmt.executeQuery();
                    detailtable.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
                    System.out.println("from book lend history class and table_l method the data is fetch and placed in table ");
                    }
                catch(Exception e)
                    {
                        JOptionPane.showMessageDialog(this,"first Date");
                    }
           }
        else if(fromdate.length()>0 && todate.length()>0)
            {
                try
                {
                    String s="SELECT `recno`, `mid`, `bid`, `issuedate`, `returndate` FROM `booklend` WHERE `mid` LIKE '"+txtmid.getText()+"%' AND `issuedate` BETWEEN '"+fromdate+"' AND '"+todate+"'";
                    pstmt=(PreparedStatement)conn.prepareStatement(s);
                    rs=pstmt.executeQuery();
                    detailtable.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
                    System.out.println("from book lend history class and table_l method the data is fetch and placed in table ");
                }
                    catch(Exception e)
                    {   System.out.println("from lend history you have selected both the dates");
                        //JOptionPane.showMessageDialog(this,"first Date");
                    }
            }
        else
            {
                 JOptionPane.showMessageDialog(this,"Select Date to apply Filter");
            } 

   }
    
   private void table_l()
    {
        try
        {
            String s="SELECT `recno`, `mid`, `bid`, `issuedate`, `returndate` FROM `booklend`";
            pstmt=(PreparedStatement)conn.prepareStatement(s);
            rs=pstmt.executeQuery();
          detailtable.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
          System.out.println("from book lend history class and table_l method the data is fetch and placed in table ");
        }
        catch(Exception e)
        { System.out.println("from book lend history class and table_l method facing prob "+e);
        }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnapply;
    private com.toedter.calendar.JDateChooser datefrom;
    private com.toedter.calendar.JDateChooser dateto;
    private javax.swing.JTable detailtable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txtmid;
    // End of variables declaration//GEN-END:variables
}
