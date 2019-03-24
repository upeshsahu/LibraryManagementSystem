package Interface;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class AllMember extends javax.swing.JInternalFrame {

    Connection conn=null;
    PreparedStatement pstmt=null;
    ResultSet rs=null;

    public AllMember() {
        initComponents();
        conn=DBConnect.connect();
        table_l();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        detailtable = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jButton1.setText("CLEAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, 220, 60));

        jLabel15.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel15.setText("Member Name");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 24, 110, 20));

        txtname.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        txtname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnameKeyReleased(evt);
            }
        });
        jPanel2.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 200, 30));

        detailtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(detailtable);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 77, 880, 320));

        jLabel14.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel14.setText("All Members");
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

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
       
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnameKeyReleased
        try
        {
            String s="SELECT `mid`, `name`,`nic`, `birthday`, `gender`, `address`, `email`, `contact`, `type` FROM `members` WHERE `name` LIKE '%"+txtname.getText()+"%'";
            pstmt=(PreparedStatement)conn.prepareStatement(s);
            rs=pstmt.executeQuery();
          detailtable.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
          System.out.println("from all member class and table_l method the data is fetch and placed in table ");
        }
        catch(Exception e)
        { System.out.println("from the all member class and table_l method facing prob "+e);
        }
    }//GEN-LAST:event_txtnameKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txtname.setText("");
        table_l();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    
   private void table_l()
    {
        try
        {
            String s="SELECT `mid`,`name`, `nic`, `birthday`, `gender`, `address`, `email`, `contact`, `type` FROM `members`";
            pstmt=(PreparedStatement)conn.prepareStatement(s);
            rs=pstmt.executeQuery();
          detailtable.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
          System.out.println("from all member class and table_l method the data is fetch and placed in table ");
        }
        catch(Exception e)
        { System.out.println("from the all member class and table_l method facing prob "+e);
        }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable detailtable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
