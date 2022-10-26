/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package database_project;

import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nethmi
 */
public class DoctorDetails extends javax.swing.JFrame {

    /** Creates new form DoctorDetails */
    public DoctorDetails() {
        initComponents();
        tableDetails();
    }
   Connection con;
   PreparedStatement pst;
   
private void tableDetails(){
    int c;
     try{

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/hospital management system","root","");
            pst = con.prepareStatement("select * from doctor");
            ResultSet rs = pst.executeQuery();
            ResultSetMetaData Rss = rs.getMetaData();
            c = Rss.getColumnCount();
            
            
            DefaultTableModel dftm = (DefaultTableModel)tableDetails.getModel();
            dftm.setRowCount(0);
            
            while(rs.next()){
                Vector  vector = new Vector();
                for(int i = 1; i<=c;i++){
                    vector.add(rs.getInt("Doctor_ID"));
                    vector.add(rs.getString("Doctor_Name"));
                    vector.add(rs.getString("DOB"));
                    vector.add(rs.getInt("Age"));
                    vector.add(rs.getString("Gender"));
                    vector.add(rs.getString("Address"));
                    vector.add(rs.getString("Contact_Number"));  
                    vector.add(rs.getInt("Charge"));
                }
                dftm.addRow(vector);
            }
        }

        catch(ClassNotFoundException ex){
            Logger.getLogger(Add_Record.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(SQLException ex){
            Logger.getLogger(Add_Record.class.getName()).log(Level.SEVERE, null, ex);
        }    
}

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        gender = new javax.swing.JComboBox<>();
        dob = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        buttonAdd = new javax.swing.JButton();
        address = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        buttonDelete = new javax.swing.JButton();
        chargePH = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        warnMsg = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cNo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        buttonUpdate = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        buttonBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDetails = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Garamond", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Doctors' Details");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 28, 376, 45));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gender.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanel2.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 129, 25));

        dob.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        dob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobActionPerformed(evt);
            }
        });
        jPanel2.add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 85, 225, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Age");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 77, 25));

        age.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });
        jPanel2.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 125, 225, 30));

        buttonAdd.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        buttonAdd.setText("Add");
        buttonAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonAddMouseClicked(evt);
            }
        });
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });
        jPanel2.add(buttonAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 80, 40));

        address.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        jPanel2.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 40, 225, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Gender");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 77, 25));

        buttonDelete.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        buttonDelete.setText("Delete");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(buttonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 210, 90, 40));

        chargePH.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jPanel2.add(chargePH, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 120, 225, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Name");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 77, 25));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("DOB");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 77, 25));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Address");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 77, 25));

        name.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameMouseClicked(evt);
            }
        });
        jPanel2.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 225, 30));
        jPanel2.add(warnMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 366, 188, 25));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Charge(Rs.)");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 160, 25));

        cNo.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jPanel2.add(cNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, 225, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Contact number");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 130, 25));

        buttonUpdate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        buttonUpdate.setText("Update");
        buttonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpdateActionPerformed(evt);
            }
        });
        jPanel2.add(buttonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 210, 90, 40));

        clearButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        clearButton.setText("Clear");
        clearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearButtonMouseClicked(evt);
            }
        });
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        jPanel2.add(clearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 80, 40));

        buttonBack.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        buttonBack.setText("Back");
        buttonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackActionPerformed(evt);
            }
        });
        jPanel2.add(buttonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 210, 90, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 351, 990, 273));

        tableDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Doctor_ID", "Doctor_Name", "DOB", "Age", "Gender", "Address", "Contact_Number", "Charge(RS.)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDetailsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableDetails);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 109, 990, 224));

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -13, 1030, 710));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed

        
        
        DefaultTableModel dftm = (DefaultTableModel)tableDetails.getModel();
        int selectedRow = tableDetails.getSelectedRow();
        
        try{
            int Doctor_ID = Integer.parseInt(dftm.getValueAt(selectedRow, 0).toString());
            int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to delete the record?", "WARNING", JOptionPane.YES_NO_OPTION);
            
            if(dialogResult == JOptionPane.YES_OPTION){
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/hospital management system","root","");
            pst = con.prepareStatement("delete from doctor where Doctor_ID=?");
            pst.setInt(1, Doctor_ID);
            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Record was succussesfully deleted...");
            tableDetails();
            
            name.setText("");
            dob.setText("");
            age.setText("");
            address.setText("");
            cNo.setText("");
            gender.setSelectedIndex(-1);
            chargePH.setText("");
            name.requestFocus();
        }
        }

        catch(ClassNotFoundException ex){
            Logger.getLogger(Add_Record.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(SQLException ex){
            Logger.getLogger(Add_Record.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed

    }//GEN-LAST:event_addressActionPerformed

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        try{

            String Doctor_Name = name.getText();
            String DOB = dob.getText();
            int Age = Integer.parseInt(age.getText());
            String Address = address.getText();
            String Contact_Number = cNo.getText();
            String Gender = gender.getSelectedItem().toString();
            int Charge = Integer.parseInt(chargePH.getText());

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/hospital management system","root","");
            pst = con.prepareStatement("insert into doctor(Doctor_Name,DOB,Age,Gender, "+
                    "Address,Contact_Number,Charge)values(?,?,?,?,?,?,?)");
            pst.setString(1, Doctor_Name);
            pst.setString(2, DOB);
            pst.setInt(3, Age);
            pst.setString(4, Gender);
            pst.setString(5, Address);
            pst.setString(6, Contact_Number);
            pst.setInt(7, Charge);
            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "new record was succussesfully added...");
            tableDetails();
            
            name.setText("");
            dob.setText("");
            age.setText("");
            address.setText("");
            cNo.setText("");
            gender.setSelectedIndex(-1);
            chargePH.setText("");
            name.requestFocus();
        }

        catch(ClassNotFoundException ex){
            Logger.getLogger(Add_Record.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(SQLException ex){
            Logger.getLogger(Add_Record.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonAddActionPerformed

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

    private void dobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dobActionPerformed

    private void buttonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackActionPerformed
        HospitalInfo newhp = new HospitalInfo();
        newhp.setVisible(true);
        dispose();
    }//GEN-LAST:event_buttonBackActionPerformed

    private void buttonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdateActionPerformed
         DefaultTableModel dftm = (DefaultTableModel)tableDetails.getModel();
        int selectedRow = tableDetails.getSelectedRow();
        
        try{
            int Doctor_ID = Integer.parseInt(dftm.getValueAt(selectedRow, 0).toString());

            String Doctor_Name = name.getText();
            String DOB = dob.getText();
            int Age = Integer.parseInt(age.getText());
            String Address = address.getText();
            String Contact_Number = cNo.getText();
            String Gender = gender.getSelectedItem().toString();
            int Charge = Integer.parseInt(chargePH.getText());

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/hospital management system","root","");
            pst = con.prepareStatement("update doctor set Doctor_Name=?,DOB=?,Age=?,Gender=?, "+
                    "Address=?,Contact_Number=?,Charge=? where Doctor_ID=?");
            pst.setString(1, Doctor_Name);
            pst.setString(2, DOB);
            pst.setInt(3, Age);
            pst.setString(4, Gender);
            pst.setString(5, Address);
            pst.setString(6, Contact_Number);
            pst.setInt(7, Charge);
            pst.setInt(8, Doctor_ID);
            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Record was succussesfully updated...");
            tableDetails();
            
            name.setText("");
            dob.setText("");
            age.setText("");
            address.setText("");
            cNo.setText("");
            gender.setSelectedIndex(-1);
            chargePH.setText("");
            name.requestFocus();
        }

        catch(ClassNotFoundException ex){
            Logger.getLogger(Add_Record.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(SQLException ex){
            Logger.getLogger(Add_Record.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_buttonUpdateActionPerformed

    private void tableDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDetailsMouseClicked
        DefaultTableModel dftm = (DefaultTableModel)tableDetails.getModel();
        int selectedRow = tableDetails.getSelectedRow();
        
        name.setText(dftm.getValueAt(selectedRow, 1).toString());
        dob.setText(dftm.getValueAt(selectedRow, 2).toString());
        age.setText(dftm.getValueAt(selectedRow, 3).toString());
        gender.setSelectedItem(dftm.getValueAt(selectedRow, 4).toString());
        address.setText(dftm.getValueAt(selectedRow, 5).toString());
        cNo.setText(dftm.getValueAt(selectedRow, 6).toString());
        chargePH.setText(dftm.getValueAt(selectedRow, 7).toString());
        
        
    }//GEN-LAST:event_tableDetailsMouseClicked

    private void buttonAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAddMouseClicked
             
    }//GEN-LAST:event_buttonAddMouseClicked

    private void nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameMouseClicked
        
    }//GEN-LAST:event_nameMouseClicked

    private void clearButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_clearButtonMouseClicked

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
             try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/hospital management system","root","");
            name.setText("");
            dob.setText("");
            age.setText("");
            address.setText("");
            cNo.setText("");
            gender.setSelectedIndex(-1);
            chargePH.setText("");
            name.requestFocus();
             }
           catch(ClassNotFoundException ex){
            Logger.getLogger(Add_Record.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(SQLException ex){
            Logger.getLogger(Add_Record.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_clearButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DoctorDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonBack;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonUpdate;
    private javax.swing.JTextField cNo;
    private javax.swing.JTextField chargePH;
    private javax.swing.JButton clearButton;
    private javax.swing.JTextField dob;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JTable tableDetails;
    private javax.swing.JLabel warnMsg;
    // End of variables declaration//GEN-END:variables

}