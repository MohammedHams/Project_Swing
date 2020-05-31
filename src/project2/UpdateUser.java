/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.ComboBox;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author MOH
 */
public class UpdateUser extends javax.swing.JFrame {

    int idCheck = 0;
    String checkUser = "U";
    int count = 0;
    Connection conn = new Connection();

    /**
     * Creates new form UpdateAdmin
     */
    public UpdateUser() {
        selectName1 = new JComboBox<>();

        initComponents();
        fetchUsers();
        HideComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        selectName = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        dateOfBirth = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        previousPage = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        phoneNumber2 = new javax.swing.JTextField();
        selectName1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Update User");

        selectName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectNameActionPerformed(evt);
            }
        });

        jLabel2.setText("Select Name :");

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        jLabel3.setText("Level :");

        jLabel4.setText("ID :");

        jLabel5.setText("Age :");

        jLabel6.setText("Address :");

        save.setBackground(new java.awt.Color(0, 153, 153));
        save.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        logout.setBackground(new java.awt.Color(255, 51, 51));
        logout.setText("LogOut");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        previousPage.setBackground(new java.awt.Color(0, 102, 102));
        previousPage.setText("Previous Page");
        previousPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousPageActionPerformed(evt);
            }
        });

        jLabel7.setText("Phone Number :");

        selectName1.setModel(selectName1.getModel());
        selectName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectName1ActionPerformed(evt);
            }
        });

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(address)
                            .addComponent(phoneNumber2)
                            .addComponent(dateOfBirth)
                            .addComponent(id)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 63, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82))
                            .addComponent(selectName1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(selectName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(121, 121, 121))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(previousPage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(previousPage, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectNameActionPerformed

    }//GEN-LAST:event_selectNameActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        String x = Functions.checkInput(id.getText(), dateOfBirth.getText(), phoneNumber2.getText());

        try {

            if (x == null && dateOfBirth.getText().length() <= 3) {
                ResultSet res = conn.selectStmt("id,name , COUNT(*)  AS 'rowcount' ", "users", "id = '" + Integer.parseInt(id.getText()) + "' And id !=" + idCheck);
                ResultSet res2 = conn.selectStmt("id,name , COUNT(*)  AS 'rowcount' ", "customers", "id = '" + Integer.parseInt(id.getText()) + "' And id !=" + idCheck);
                if (res.next() || res2.next()) {

                    if (checkUser.equals("C")) {

                        if (res2.getInt("rowcount") == 0) {
                            conn.UpdateStmt("customers", "id = " + Integer.parseInt(id.getText()) + " , age = '" + dateOfBirth.getText() + "' , address = '" + address.getText() + "' , phoneNumber = " + Integer.parseInt(phoneNumber2.getText()), "name = '" + selectName1.getSelectedItem().toString() + "'");
                            Functions.logFile("Customer By name : '" + selectName1.getSelectedItem() + "' has Updated ");
                            JOptionPane.showMessageDialog(rootPane, "Updated has successfuly", "Update", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(this, "this user has already exist", "error", JOptionPane.WARNING_MESSAGE);
                        }

                    } else {

                        if (res.getInt("rowcount") == 0) {
                            conn.UpdateStmt("users", "id = " + Integer.parseInt(id.getText()) + " , age = '" + dateOfBirth.getText() + "' , address = '" + address.getText() + "' , phoneNumber = " + Integer.parseInt(phoneNumber2.getText()) + ", level = '" + selectName.getSelectedItem() + "'", "name = '" + selectName1.getSelectedItem().toString() + "'");
                            Functions.logFile("User By name : '" + selectName1.getSelectedItem() + "' has Updated ");
                            JOptionPane.showMessageDialog(rootPane, "Updated has successfuly", "Update", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(this, "this user has already exist", "error", JOptionPane.WARNING_MESSAGE);
                        }

                    }

                }
            } else {
                if (dateOfBirth.getText().length() > 3) {
                    JOptionPane.showMessageDialog(this, "enter just 3 digits", "error", JOptionPane.WARNING_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, x, "error", JOptionPane.WARNING_MESSAGE);
                }

            }
        } catch (Exception e) {

        }


    }//GEN-LAST:event_saveActionPerformed

    private void selectName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectName1ActionPerformed
        try {
            ResultSet res = conn.selectStmt("*", "users", "name = '" + selectName1.getSelectedItem() + "'");
            ResultSet res2 = conn.selectStmt("*", "customers", "name = '" + selectName1.getSelectedItem() + "'");
            if (res.next()) {
                id.setText(res.getString("id"));
                idCheck = res.getInt("id");
                dateOfBirth.setText(res.getString("age"));
                address.setText(res.getString("address"));
                phoneNumber2.setText(res.getString("phoneNumber"));
                if (count == 0) {
                    selectName.addItem("Admin");
                    selectName.addItem("Employee");
                    count++;
                }

                if (res.getString("level").equals("Admin")) {
                    selectName.setSelectedIndex(0);
                } else {
                    selectName.setSelectedIndex(1);
                }
                checkUser = "U";
                selectName.setVisible(true);

            } else if (res2.first()) {
                id.setText(res2.getString("id"));
                dateOfBirth.setText(res2.getString("age"));
                address.setText(res2.getString("address"));
                phoneNumber2.setText(res2.getString("phoneNumber"));
                checkUser = "C";
                selectName.setVisible(false);

            }

        } catch (SQLException ex) {
            System.out.println("" + ex.getMessage());
        }
        HideComponents();
        jButton1.setVisible(true);
        jButton2.setVisible(true);
    }//GEN-LAST:event_selectName1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        showComponents();

        jButton1.setVisible(false);
        jButton2.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        conn.deleteStmt("users", selectName1.getSelectedItem().toString());
        conn.deleteStmt("customers", selectName1.getSelectedItem().toString());
        JOptionPane.showMessageDialog(rootPane, "Delete has successfuly", "Delete", JOptionPane.INFORMATION_MESSAGE);
        Functions.logFile("User By name : '" + selectName1.getSelectedItem() + "' has Deleted ");
        this.setVisible(false);
        new UpdateUser().setVisible(true);


    }//GEN-LAST:event_jButton2ActionPerformed

    private void previousPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousPageActionPerformed
        this.setVisible(false);
        new AdminScreen().setVisible(true);
    }//GEN-LAST:event_previousPageActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateUser().setVisible(true);
            }
        });
    }

    public void HideComponents() {
        id.setVisible(false);
        address.setVisible(false);
        dateOfBirth.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        phoneNumber2.setVisible(false);
        selectName.setVisible(false);
        save.setVisible(false);
    }

    public void showComponents() {
        id.setVisible(true);
        address.setVisible(true);
        dateOfBirth.setVisible(true);

        jLabel4.setVisible(true);
        jLabel5.setVisible(true);
        jLabel6.setVisible(true);
        jLabel7.setVisible(true);
        phoneNumber2.setVisible(true);
        if (checkUser.equals("U")) {
            selectName.setVisible(true);
            jLabel3.setVisible(true);
        }

        save.setVisible(true);
    }

    public void fetchUsers() {
        ResultSet res = conn.selectStmt("name", "users", "1");
        ResultSet res2 = conn.selectStmt("name", "customers", "1");

        try {
            while (res.next()) {
                selectName1.addItem(res.getString("name"));

            }
            while (res2.next()) {
                selectName1.addItem(res2.getString("name"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateUser.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JTextField dateOfBirth;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton logout;
    private javax.swing.JTextField phoneNumber2;
    private javax.swing.JButton previousPage;
    private javax.swing.JButton save;
    private javax.swing.JComboBox<String> selectName;
    private javax.swing.JComboBox<String> selectName1;
    // End of variables declaration//GEN-END:variables
}