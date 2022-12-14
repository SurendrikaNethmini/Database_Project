/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Nethmi
 */
public class bill extends javax.swing.JFrame {

    /**
     * Creates new form bill
     */
    public bill() {
        initComponents();
    }
    
    Connection con;
    PreparedStatement pst;
    int pid;
    int doctorID = 0;
    int labID = 0;
    int clinicID = 0;

    int total = 0;

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        pID = new javax.swing.JTextField();
        buttonSearch = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        totalF = new javax.swing.JLabel();
        labF = new javax.swing.JLabel();
        checkupF = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        pName = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        pName1 = new javax.swing.JLabel();
        pName2 = new javax.swing.JLabel();
        pName3 = new javax.swing.JLabel();
        date1 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        okButton = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bill details");
        setBackground(new java.awt.Color(153, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Adobe Heiti Std R", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("BILL");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 297, 42));

        jLabel12.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel12.setText("Patient ID");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 101, -1, 30));

        pID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pIDActionPerformed(evt);
            }
        });
        getContentPane().add(pID, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 101, 74, 29));

        buttonSearch.setFont(new java.awt.Font("Californian FB", 0, 18)); // NOI18N
        buttonSearch.setText("Search");
        buttonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 101, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLabel4.setText("Checkup fee");
        jLabel4.setOpaque(true);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLabel6.setText("Laboratory fee");
        jLabel6.setOpaque(true);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLabel9.setText("Total Payment");
        jLabel9.setOpaque(true);

        totalF.setBackground(new java.awt.Color(255, 255, 255));
        totalF.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        totalF.setOpaque(true);

        labF.setBackground(new java.awt.Color(255, 255, 255));
        labF.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        labF.setOpaque(true);

        checkupF.setBackground(new java.awt.Color(255, 255, 255));
        checkupF.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        checkupF.setOpaque(true);

        jLabel5.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel5.setText("NO.");

        jLabel7.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel7.setText("DESCRIPTION");

        jLabel10.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel10.setText("AMOUNT");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLabel8.setText("01 .");
        jLabel8.setOpaque(true);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLabel11.setText("02 . ");
        jLabel11.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(103, 103, 103)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(totalF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(checkupF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(checkupF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(185, 185, 185))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 640, -1));

        pName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        getContentPane().add(pName, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 149, 266, 30));

        age.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        getContentPane().add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 197, 266, 30));

        pName1.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        pName1.setText("Patient Name");
        getContentPane().add(pName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 149, -1, 30));

        pName2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(pName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 101, -1, 30));

        pName3.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        pName3.setText("Age");
        getContentPane().add(pName3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 197, 109, 30));

        date1.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        date1.setText("Date");
        getContentPane().add(date1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 129, 30));

        date.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 223, 30));

        okButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        getContentPane().add(okButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 620, 90, 40));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setOpaque(true);
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 14, 640, 270));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pIDActionPerformed

    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
        
        try{
            
        pid = Integer.parseInt(pID.getText().toString());

          Class.forName("com.mysql.jdbc.Driver");
          con = DriverManager.getConnection("jdbc:mysql://localhost/hospital management system","root","");  
          pst = con.prepareStatement("select * from patient where Patient_ID = ? ");
          pst.setInt(1, pid);           
           ResultSet rsl = pst.executeQuery();          
           if(!rsl.next()){
               pName.setText("");
               age.setText("");
                JOptionPane.showMessageDialog(this, "ERROR...! This patient ID does not exist.");
          }
            else{
               pName.setText(rsl.getString("Patient_Name")); 
               age.setText(rsl.getString("Age"));
               clinicID = rsl.getInt("Clinic_ID");
               labID = rsl.getInt("Lab_ID");
            }
           
            pst = con.prepareStatement("select * from health_record where HR_ID=?");
           pst.setInt(1, pid);
            rsl = pst.executeQuery();  
            if(!rsl.next()){
                
            }
            else{
            date.setText(rsl.getString("Last_Updated_date"));
            }
            
           pst = con.prepareStatement("select * from clinic where Clinic_ID = ? ");
            pst.setInt(1, clinicID);           
           rsl = pst.executeQuery();   
             if(!rsl.next()){
                
            }
            else{
           doctorID = rsl.getInt("Doctor_ID"); 
             }
           
           pst = con.prepareStatement("select * from doctor where Doctor_ID = ? ");
           pst.setInt(1, doctorID);           
           rsl = pst.executeQuery();     
             if(!rsl.next()){
              }
            else{
           checkupF.setText(Integer.toString(rsl.getInt("Charge")));
             }

           pst = con.prepareStatement("select * from laboratory where Lab_ID = ? ");
           pst.setInt(1, labID);           
           rsl = pst.executeQuery();    
             if(!rsl.next()){
                
            }
            else{
           labF.setText(Integer.toString(rsl.getInt("Charge")));
                 }
 
          total = (Integer.parseInt(checkupF.getText()))+(Integer.parseInt(labF.getText()));
          totalF.setText(Integer.toString(total));
        }
        catch(ClassNotFoundException ex){
            Logger.getLogger(Add_Record.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(SQLException ex){
           Logger.getLogger(Add_Record.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    }//GEN-LAST:event_buttonSearchActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        HomePage homePage = new HomePage();
        homePage.setVisible(true);
        dispose();
        
      
    }//GEN-LAST:event_okButtonActionPerformed

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
            java.util.logging.Logger.getLogger(bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JLabel checkupF;
    private javax.swing.JLabel date;
    private javax.swing.JLabel date1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labF;
    private javax.swing.JButton okButton;
    private javax.swing.JTextField pID;
    private javax.swing.JLabel pName;
    private javax.swing.JLabel pName1;
    private javax.swing.JLabel pName2;
    private javax.swing.JLabel pName3;
    private javax.swing.JLabel totalF;
    // End of variables declaration//GEN-END:variables
}
