package Interface;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

//this class is for adding a new book record into the library
public class AddBook extends javax.swing.JInternalFrame {
 
    Connection conn=null;
    PreparedStatement pstmt=null;
    ResultSet rs=null;

    public AddBook() {
        initComponents();
        conn=DBConnect.connect();
        autoid();
        table_l();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        date_ = new com.toedter.calendar.JDateChooser();
        txtbookid = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtpublisher = new javax.swing.JTextArea();
        txtbcode = new javax.swing.JTextField();
        txtprice = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        detailtable = new javax.swing.JTable();
        txtname = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        cmbtype = new javax.swing.JComboBox();
        cmbcat = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtdate = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        date_.setDateFormatString("yyyy-MM-d");
        jPanel2.add(date_, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 170, 30));

        txtbookid.setEditable(false);
        jPanel2.add(txtbookid, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 170, 30));

        txtpublisher.setColumns(20);
        txtpublisher.setRows(5);
        jScrollPane2.setViewportView(txtpublisher);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 170, 90));
        jPanel2.add(txtbcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 170, 30));
        jPanel2.add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 170, 30));

        detailtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        detailtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                detailtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(detailtable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 327, 880, 140));
        jPanel2.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 170, 30));

        jLabel14.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel14.setText("Books");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 120, -1));

        jButton1.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 120, 130, 40));

        btnupdate.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        btnupdate.setText("UPDATE");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel2.add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 170, 130, 40));

        btndelete.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        btndelete.setText("DELETE");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 220, 130, 40));

        cmbtype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Type", "Borrow", "Read Only" }));
        jPanel2.add(cmbtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 170, 30));

        cmbcat.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Category", "Language", "Technology", "History", "Other" }));
        jPanel2.add(cmbcat, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 170, 30));

        jLabel5.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        jLabel5.setText("Book ID");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        jLabel6.setText("Name");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel7.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        jLabel7.setText("B. Code");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel8.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        jLabel8.setText("Date");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel9.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        jLabel9.setText("Category");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jLabel10.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        jLabel10.setText("Book Type");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, -1));

        jLabel11.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        jLabel11.setText("publisher");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, -1, -1));

        jLabel12.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        jLabel12.setText("Price");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, -1, -1));

        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 100, 200, 180));

        txtdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(txtdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 880, 240));

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
      
        String bid,name,bcode,date,category,type,publisher,mark,price;
        bid=txtbookid.getText();
        name=txtname.getText();
        bcode=txtbcode.getText();
        date=((JTextField)date_.getDateEditor().getUiComponent()).getText().toString();
        category=cmbcat.getSelectedItem().toString();
        type=cmbtype.getSelectedItem().toString();
        publisher=txtpublisher.getText();
        price=txtprice.getText();
        
        try{
        //preparing the query to insert
         String sql="INSERT INTO `Books`(`bid`, `name`, `b_code`, `date`, `category`, `book_type`, `publisher`, `price`, `mark`) VALUES ('"+bid+"','"+name+"','"+bcode+"','"+date+"','"+category+"' ,'"+type+"','"+publisher+"','"+price+"','0')";
         pstmt=(PreparedStatement) conn.prepareStatement(sql); 
         pstmt.execute();
         JOptionPane.showMessageDialog(this,"Member is Successfully added");
         clear();
         autoid();
         table_l();
        }
        catch(Exception e)
        {   
            System.out.println("this is from addmember class facing difficulty to insert the data to members table "+e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        String bid,name,bcode,date,category,type,publisher,mark,price;
        bid=txtbookid.getText();
        name=txtname.getText();
        bcode=txtbcode.getText();
        date=((JTextField)date_.getDateEditor().getUiComponent()).getText().toString();
        category=cmbcat.getSelectedItem().toString();
        type=cmbtype.getSelectedItem().toString();
        publisher=txtpublisher.getText();
        price=txtprice.getText();
        try
       {
           
           
           String sql="UPDATE `Books` SET `name`='"+name+"',`b_code`='"+bcode+"',`date`='"+date+"',`category`='"+category+"',`book_type`='"+type+"',`publisher`='"+publisher+"',`price`='"+price+"' WHERE `bid`='"+bid+"'";
           pstmt=(PreparedStatement)conn.prepareStatement(sql);
           pstmt.execute();
           JOptionPane.showMessageDialog(this, "updated successfully!");
           System.out.println("from the add book class and update is done");
                   clear();
         autoid();
         table_l();
       }
       catch(Exception e)
       {
           System.out.println("from the add book class and update is facing prob "+e);
       }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        try
       {
           String s="DELETE FROM `Books` WHERE `bid`='"+txtbookid.getText()+"'";
           
           pstmt=(PreparedStatement)conn.prepareStatement(s);
           pstmt.execute();
           JOptionPane.showMessageDialog(this, "deleted successfully!");
           System.out.println("from the add book class and deletion is done");
           table_l();
           clear();
           autoid();
       }
       catch(Exception e)
       {
           System.out.println("from the add book class and delete is facing prob "+e);
       }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void detailtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detailtableMouseClicked
        DefaultTableModel tmodel=(DefaultTableModel)detailtable.getModel();
        int select_row_index=detailtable.getSelectedRow();
        
        txtbookid.setText(tmodel.getValueAt(select_row_index,0).toString());
        txtname.setText(tmodel.getValueAt(select_row_index,1).toString());
        txtbcode.setText(tmodel.getValueAt(select_row_index,2).toString());
        ((JTextField)date_.getDateEditor().getUiComponent()).setText(tmodel.getValueAt(select_row_index,3).toString());
        cmbcat.setSelectedItem(tmodel.getValueAt(select_row_index,4).toString());
        cmbtype.setSelectedItem(tmodel.getValueAt(select_row_index,5).toString());
        txtpublisher.setText(tmodel.getValueAt(select_row_index,6).toString());
        txtprice.setText(tmodel.getValueAt(select_row_index,7).toString());
       
    }//GEN-LAST:event_detailtableMouseClicked

    
   private void table_l()
    {
        try
        {
            String s="SELECT `bid`, `name`, `b_code`, `date`, `category`, `book_type`, `publisher`, `price` FROM `Books`";
            pstmt=(PreparedStatement)conn.prepareStatement(s);
            rs=pstmt.executeQuery();
          detailtable.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
          System.out.println("from add book class and table_l method the data is fetch and placed in table ");
        }
        catch(Exception e)
        { System.out.println("from the add book class and table_l method facing prob "+e);
        }
    }
    
    private void autoid()
    {
        
        try{
            String que="SELECT `bid` FROM `Books` ORDER  BY bid DESC LIMIT 1";
            pstmt=(PreparedStatement) conn.prepareStatement(que);
            rs = pstmt.executeQuery();
            if(rs.next())
            {
                String rnno=rs.getString("bid");
                int co=rnno.length();
                String txt=rnno.substring(0,2);
                String num=rnno.substring(2,co);
                int n=Integer.parseInt(num);
                n++;
                String snum=Integer.toString(n);
                String ftxt=txt+snum;
                txtbookid.setText(ftxt);
            }
            else
                txtbookid.setText("BI1");
           }
       catch(Exception e)
          {
              System.out.println("from the add Books class thers is a problem in autoid method "+e);
          }
    }
    
    private void clear()
    {
        
        txtbookid.setText("");
        txtname.setText("");
        txtbcode.setText("");
        txtprice.setText("");
        txtpublisher.setText("");
        ((JTextField)date_.getDateEditor().getUiComponent()).setText("");
        cmbcat.setSelectedIndex(0);
        cmbtype.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox cmbcat;
    private javax.swing.JComboBox cmbtype;
    private com.toedter.calendar.JDateChooser date_;
    private javax.swing.JTable detailtable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtbcode;
    private javax.swing.JTextField txtbookid;
    private javax.swing.JLabel txtdate;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextArea txtpublisher;
    // End of variables declaration//GEN-END:variables
}
