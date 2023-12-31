/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.hotel.ui;

import javax.swing.*;
import java.sql.*;

/**
 *
 * @author Raofin
 */
public class EmpUpdateJFrame extends javax.swing.JFrame {

    /**
     * Creates new form EmpUpdateJFrame
     */    
    private int empId;

    public EmpUpdateJFrame() {
        initComponents();
    }
    
    public EmpUpdateJFrame(int id) {
        initComponents();
        fetchAndPopulateData(id);
        empId = id;
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        update = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        salary = new javax.swing.JTextField();
        jobDescription = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nid = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        empType = new javax.swing.JTextField();
        mobile = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        empName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Update Employee Information");

        update.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Mobile");

        address.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Emp Name");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Update Employee Info");

        salary.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N

        jobDescription.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Salary");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Job Desc");

        nid.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Address");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("NID");

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        empType.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N

        mobile.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Emp Type");

        empName.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(nid, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(jobDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(empName, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(empType, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(18, 18, 18)
                                    .addComponent(salary, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(18, 18, 18)
                                    .addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jButton4)
                                .addGap(18, 18, 18)
                                .addComponent(update)))))
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jobDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update)
                    .addComponent(jButton4))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fetchAndPopulateData(int empId) {
        try {
            Connection connection = DatabaseConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM dbo.Employees WHERE Emp_ID = ?");
            preparedStatement.setInt(1, empId);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String empNameText = resultSet.getString("Emp_Name");
                String jobDescriptionText = resultSet.getString("Job_Description");
                int nidNumber = resultSet.getInt("NID");
                String empTypeText = resultSet.getString("Emp_Type");
                int mobileNumber = resultSet.getInt("Mobile_No");
                double salaryValue = resultSet.getDouble("Salary");
                String addressText = resultSet.getString("Address");

                // Update the text fields with the fetched data
                empName.setText(empNameText);
                jobDescription.setText(jobDescriptionText);
                nid.setText(String.valueOf(nidNumber));
                empType.setText(empTypeText);
                mobile.setText(String.valueOf(mobileNumber));
                salary.setText(String.valueOf(salaryValue));
                address.setText(addressText);
            } else {
                // Handle the case when no matching employee is found
                // Clear the text fields or show an appropriate message
                empName.setText("");
                jobDescription.setText("");
                nid.setText("");
                empType.setText("");
                mobile.setText("");
                salary.setText("");
                address.setText("");
            }

            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // Get the updated data from the text fields
        String updatedEmpName = empName.getText();
        String updatedJobDescription = jobDescription.getText();
        String updatedNid = nid.getText();
        String updatedEmpType = empType.getText();
        String updatedMobile = mobile.getText();
        String updatedSalary = salary.getText();
        String updatedAddress = address.getText();

        // Validate non-empty fields
        if (updatedEmpName.isEmpty() || updatedJobDescription.isEmpty() || updatedNid.isEmpty() ||
            updatedEmpType.isEmpty() || updatedMobile.isEmpty() || updatedSalary.isEmpty() || updatedAddress.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill in all the fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validate numeric fields
        try {
            int nidValue = Integer.parseInt(updatedNid);
            int mobileValue = Integer.parseInt(updatedMobile);
            // Additional validation for salary (e.g., decimal format) can be added if needed.
            double salaryValue = Double.parseDouble(updatedSalary);

            // Perform the update query in the database
            Connection connection = DatabaseConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE dbo.Employees " +
                "SET Emp_Name = ?, Job_Description = ?, NID = ?, Emp_Type = ?, Mobile_No = ?, Salary = ?, Address = ? " +
                "WHERE Emp_ID = ?");
            preparedStatement.setString(1, updatedEmpName);
            preparedStatement.setString(2, updatedJobDescription);
            preparedStatement.setInt(3, nidValue);
            preparedStatement.setString(4, updatedEmpType);
            preparedStatement.setInt(5, mobileValue);
            preparedStatement.setDouble(6, salaryValue);
            preparedStatement.setString(7, updatedAddress);
            preparedStatement.setInt(8, empId);

            int rowsAffected = preparedStatement.executeUpdate();

            // Check if the update was successful
            if (rowsAffected > 0) {
                // Refresh the table after successful update
                fetchAndPopulateData(empId);
                JOptionPane.showMessageDialog(null, "Data updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Failed to update data.", "Error", JOptionPane.ERROR_MESSAGE);
            }

            preparedStatement.close();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Please enter valid numeric values for NID, Mobile No, and Salary.",
                "Invalid Input", JOptionPane.ERROR_MESSAGE);
                                             
            setVisible(false);
            EmployeesJFrame frame = new EmployeesJFrame();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_updateActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        setVisible(false);
        EmployeesJFrame frame = new EmployeesJFrame();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(EmpUpdateJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmpUpdateJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmpUpdateJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmpUpdateJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmpUpdateJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JTextField empName;
    private javax.swing.JTextField empType;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jobDescription;
    private javax.swing.JTextField mobile;
    private javax.swing.JTextField nid;
    private javax.swing.JTextField salary;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
