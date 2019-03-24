package Interface;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class AllBooks extends javax.swing.JInternalFrame {

    Connection conn=null;
    PreparedStatement pstmt=null;
    ResultSet rs=null;
    
    public AllBooks() {
        initComponents();
        conn=DBConnect.connect();
        table_l();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        detailtable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        detailtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(detailtable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 880, 320));

        jButton2.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jButton2.setText("CLEAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 410, 190, 60));

        jLabel16.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel16.setText("Book Name:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 24, 100, 20));

        txtsearch.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchKeyReleased(evt);
            }
        });
        jPanel1.add(txtsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 240, 30));

        jLabel15.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel15.setText("All Books");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 340, -1));

        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 900, 410));

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 900, 50));

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyReleased
       try
        {
            String s="SELECT `bid`, `name`,`b_code`, `date`, `category`, `book_type`, `publisher`, `price` FROM `books` WHERE `name` LIKE '%"+txtsearch.getText()+"%'";
            pstmt=(PreparedStatement)conn.prepareStatement(s);
            rs=pstmt.executeQuery();
          detailtable.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
          System.out.println("from all book class and table_l method the data is fetch and placed in table ");
        }
        catch(Exception e)
        { System.out.println("from the all book class and table_l method facing prob "+e);
        }
    }//GEN-LAST:event_txtsearchKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
           txtsearch.setText("");
           table_l();
    }//GEN-LAST:event_jButton2ActionPerformed
  
    private void table_l()
    {
        try
        {
            String s="SELECT `bid`, `name`, `b_code`, `date`, `category`, `book_type`, `publisher`, `price` FROM `books`";
            pstmt=(PreparedStatement)conn.prepareStatement(s);
            rs=pstmt.executeQuery();
          detailtable.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
          System.out.println("from all book class and table_l method the data is fetch and placed in table ");
        }
        catch(Exception e)
        { System.out.println("from the all book class and table_l method facing prob "+e);
        }
    }
    

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable detailtable;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
