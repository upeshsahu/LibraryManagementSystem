package Interface;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class AddMember extends javax.swing.JInternalFrame {

    Connection conn=null;
    PreparedStatement pstmt=null;
    ResultSet rs=null;
    
    public AddMember() {
        initComponents();
        conn=DBConnect.connect();
        autoid();
        table_l();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        datebath = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        txtmid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtnic = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaddress = new javax.swing.JTextArea();
        txtcon = new javax.swing.JTextField();
        txtmail = new javax.swing.JTextField();
        cmbgender = new javax.swing.JComboBox();
        cmbtype = new javax.swing.JComboBox();
        btnadd = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndel = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabledetails = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        datebath.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(datebath, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 160, 30));

        jLabel15.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel15.setText("Members");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 340, -1));

        txtmid.setEditable(false);
        jPanel1.add(txtmid, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 160, 30));

        jLabel5.setFont(new java.awt.Font("Sitka Display", 1, 16)); // NOI18N
        jLabel5.setText("Member ID");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 90, -1));

        jLabel6.setFont(new java.awt.Font("Sitka Display", 1, 16)); // NOI18N
        jLabel6.setText("Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 70, -1));

        jLabel7.setFont(new java.awt.Font("Sitka Display", 1, 16)); // NOI18N
        jLabel7.setText("NIC");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 60, -1));

        jLabel8.setFont(new java.awt.Font("Sitka Display", 1, 16)); // NOI18N
        jLabel8.setText("Birthday");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 80, -1));

        jLabel9.setFont(new java.awt.Font("Sitka Display", 1, 16)); // NOI18N
        jLabel9.setText("Gender");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 80, -1));

        jLabel10.setFont(new java.awt.Font("Sitka Display", 1, 16)); // NOI18N
        jLabel10.setText("Member Type");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 100, -1));

        jLabel11.setFont(new java.awt.Font("Sitka Display", 1, 16)); // NOI18N
        jLabel11.setText("E Mail");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 50, -1));

        jLabel12.setFont(new java.awt.Font("Sitka Display", 1, 16)); // NOI18N
        jLabel12.setText("Contact");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 60, -1));

        jLabel13.setFont(new java.awt.Font("Sitka Display", 1, 16)); // NOI18N
        jLabel13.setText("Address");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 60, -1));
        jPanel1.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 160, 30));
        jPanel1.add(txtnic, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 160, 30));

        txtaddress.setColumns(20);
        txtaddress.setRows(5);
        jScrollPane1.setViewportView(txtaddress);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 160, 70));
        jPanel1.add(txtcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 160, 30));
        jPanel1.add(txtmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 160, 30));

        cmbgender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Gender", "Male", "Female" }));
        jPanel1.add(cmbgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 150, 30));

        cmbtype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Type", "Student", "Other" }));
        jPanel1.add(cmbtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 160, 30));

        btnadd.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        btnadd.setText("ADD");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        jPanel1.add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, 140, 40));

        btnupdate.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        btnupdate.setText("UPDATE");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 180, 140, 40));

        btndel.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        btndel.setText("DELETE");
        btndel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelActionPerformed(evt);
            }
        });
        jPanel1.add(btndel, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 230, 140, 40));

        tabledetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabledetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabledetailsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabledetails);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 330, 880, 140));

        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 110, 200, 190));

        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 880, 240));

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

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
       
        String mid,name,gen,birth,type,addr,email,nic,contact,date;
        mid=txtmid.getText();
        name=txtname.getText();
        nic=txtnic.getText();
        contact=txtcon.getText();
        addr=txtaddress.getText();
        email=txtmail.getText();
        date=((JTextField)datebath.getDateEditor().getUiComponent()).getText().toString();
        gen=cmbgender.getSelectedItem().toString();
        type=cmbtype.getSelectedItem().toString();
        
        
        try{
        //preparing the query to insert
         String sql="INSERT INTO `Members`(`mid`,`name`,  `nic`  , `birthday`, `gender`,  `address`, `email`  ,  `contact`  ,  `type`) VALUES ('"+mid+"','"+name+"','"+nic+"','"+date+"' ,'"+gen+"','"+addr+"','"+email+"','"+contact+"','"+type+"')";
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
        
    }//GEN-LAST:event_btnaddActionPerformed

    private void tabledetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabledetailsMouseClicked
        DefaultTableModel tmodel=(DefaultTableModel)tabledetails.getModel();
        int select_row_index=tabledetails.getSelectedRow();
        
        txtmid.setText(tmodel.getValueAt(select_row_index,0).toString());
        txtname.setText(tmodel.getValueAt(select_row_index,1).toString());
        txtnic.setText(tmodel.getValueAt(select_row_index,2).toString());
        ((JTextField)datebath.getDateEditor().getUiComponent()).setText(tmodel.getValueAt(select_row_index,3).toString());
       
        cmbgender.setSelectedItem(tmodel.getValueAt(select_row_index,4).toString());
        txtaddress.setText(tmodel.getValueAt(select_row_index,5).toString());
        txtmail.setText(tmodel.getValueAt(select_row_index,6).toString());
        txtcon.setText(tmodel.getValueAt(select_row_index,7).toString());
        cmbtype.setSelectedItem(tmodel.getValueAt(select_row_index,8).toString());
    }//GEN-LAST:event_tabledetailsMouseClicked

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
       
        String mid,name,gen,birth,type,addr,email,nic,contact,date;
        mid=txtmid.getText();
        name=txtname.getText();
        nic=txtnic.getText();
        contact=txtcon.getText();
        addr=txtaddress.getText();
        email=txtmail.getText();
        date=((JTextField)datebath.getDateEditor().getUiComponent()).getText().toString();
        gen=cmbgender.getSelectedItem().toString();
        type=cmbtype.getSelectedItem().toString();
        try
       {
           
           String s="UPDATE `members` SET `name`='"+name+"',`nic`='"+nic+"',`birthday`='"+date+"',`gender`='"+gen+"',`address`='"+addr+"',`email`='"+email+"',`contact`='"+contact+"',`type`='"+type+"' WHERE `mid`='"+mid+"'";
           pstmt=(PreparedStatement)conn.prepareStatement(s);
           pstmt.execute();
           JOptionPane.showMessageDialog(this, "updated successfully!");
           System.out.println("from the add memeber class and update is done");
          table_l();
       }
       catch(Exception e)
       {
           System.out.println("from the add memeber class and update is facing prob "+e);
       }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelActionPerformed
       try
       {
           String s="DELETE FROM `members` WHERE `mid`='"+txtmid.getText()+"'";
           
           pstmt=(PreparedStatement)conn.prepareStatement(s);
           pstmt.execute();
           JOptionPane.showMessageDialog(this, "deleted successfully!");
           System.out.println("from the add memeber class and deletion is done");
           table_l();
           clear();
           autoid();
       }
       catch(Exception e)
       {
           System.out.println("from the add memeber class and delete is facing prob "+e);
       }
    }//GEN-LAST:event_btndelActionPerformed
  
    private void table_l()
    {
        try
        {
            String s="SELECT `mid`, `name`, `nic`, `birthday`, `gender`, `address`, `email`, `contact`, `type` FROM `members`";
            pstmt=(PreparedStatement)conn.prepareStatement(s);
            rs=pstmt.executeQuery();
          tabledetails.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
          System.out.println("from add members class and table_l method the data is fetch and placed in table ");
        }
        catch(Exception e)
        { System.out.println("from the add memeber class and table_l method facing prob "+e);
        }
    }
    
    private void autoid()
    {
        
        try{
            String que="SELECT `mid` FROM `Members` ORDER  BY mid DESC LIMIT 1";
            pstmt=(PreparedStatement) conn.prepareStatement(que);
            rs = pstmt.executeQuery();
            if(rs.next())
            {
                String rnno=rs.getString("mid");
                int co=rnno.length();
                String txt=rnno.substring(0,2);
                String num=rnno.substring(2,co);
                int n=Integer.parseInt(num);
                n++;
                String snum=Integer.toString(n);
                String ftxt=txt+snum;
                txtmid.setText(ftxt);
            }
            else
                txtmid.setText("MI1");
           }
       catch(Exception e)
          {
              System.out.println("from the addmemebr class thers is a problem in autoid method "+e);
          }
    }
    
    private void clear()
    {
        
        txtmid.setText("");
        txtname.setText("");
        txtnic.setText("");
        txtcon.setText("");
        txtaddress.setText("");
        txtmail.setText("");
       ((JTextField)datebath.getDateEditor().getUiComponent()).setText("");
        cmbgender.setSelectedIndex(0);
        cmbtype.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btndel;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox cmbgender;
    private javax.swing.JComboBox cmbtype;
    private com.toedter.calendar.JDateChooser datebath;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabledetails;
    private javax.swing.JTextArea txtaddress;
    private javax.swing.JTextField txtcon;
    private javax.swing.JTextField txtmail;
    private javax.swing.JTextField txtmid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtnic;
    // End of variables declaration//GEN-END:variables
}
