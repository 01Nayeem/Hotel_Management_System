/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.hotel.ui;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author Raofin
 */
public class BookingJFrame extends javax.swing.JFrame {

    /**
     * Creates new form BookingJFrame
     */
    public BookingJFrame() {
        initComponents();
        populateRoomComboBox();
        populateCustomerComboBox();
    }

    private void populateRoomComboBox() {
        try {
            Connection connection = DatabaseConnection.getConnection();

            String sqlQuery = "SELECT Room_no FROM Room";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlQuery);

            while (resultSet.next()) {
                String roomNo = resultSet.getString("Room_no");
                roomComboBox.addItem(roomNo);
            }

            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void populateCustomerComboBox() {
        try {
            Connection connection = DatabaseConnection.getConnection();

            String sqlQuery = "SELECT customer_id FROM Customer";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlQuery);

            while (resultSet.next()) {
                String customerId = resultSet.getString("customer_id");
                customerComboBox.addItem(customerId);
            }

            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        roomComboBox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        customerComboBox = new javax.swing.JComboBox<>();
        status = new javax.swing.JLabel();
        number = new javax.swing.JLabel();
        type = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        book = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hotel Management System");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Room Booking");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel2.setText("Room");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setText("Number");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel4.setText("Type");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel5.setText("Price");

        roomComboBox.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        roomComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select room..." }));
        roomComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                roomComboBoxItemStateChanged(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel6.setText("Status");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel8.setText("Customer");

        customerComboBox.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        customerComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select customer..." }));

        status.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        status.setText("Status");

        number.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        number.setText("Number");

        type.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        type.setText("Type");

        price.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        price.setText("Price");

        back.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        book.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        book.setText("Book");
        book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(customerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(roomComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(number)
                                    .addComponent(status)
                                    .addComponent(price)
                                    .addComponent(type))))
                        .addGap(0, 74, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(back)
                .addGap(35, 35, 35)
                .addComponent(book)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(roomComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(number, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(type)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(price)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(status)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back)
                    .addComponent(book))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookActionPerformed
        int selectedRoomIndex = roomComboBox.getSelectedIndex();
        int selectedCustomerIndex = customerComboBox.getSelectedIndex();

        if (selectedRoomIndex == 0 || selectedCustomerIndex == 0) {
            JOptionPane.showMessageDialog(this, "Please select a valid room and customer.");
            return;
        }

        String selectedRoomNo = (String) roomComboBox.getSelectedItem();
        String selectedCustomer = (String) customerComboBox.getSelectedItem();

        try {
            Connection connection = DatabaseConnection.getConnection();

            // Check if the selected room is available
            String availabilityQuery = "SELECT Is_Available FROM Room WHERE Room_no = ?";
            PreparedStatement availabilityStatement = connection.prepareStatement(availabilityQuery);
            availabilityStatement.setString(1, selectedRoomNo);
            ResultSet availabilityResultSet = availabilityStatement.executeQuery();

            if (availabilityResultSet.next()) {
                boolean isAvailable = availabilityResultSet.getBoolean("Is_Available");
                if (!isAvailable) {
                    JOptionPane.showMessageDialog(this, "Selected room is not available.");
                    return;
                }
            }

            availabilityResultSet.close();
            availabilityStatement.close();

            // Update room availability
            String updateAvailabilityQuery = "UPDATE Room SET Is_Available = 0 WHERE Room_no = ?";
            PreparedStatement updateAvailabilityStatement = connection.prepareStatement(updateAvailabilityQuery);
            updateAvailabilityStatement.setString(1, selectedRoomNo);
            updateAvailabilityStatement.executeUpdate();
            updateAvailabilityStatement.close();

            // Insert booking record
            String insertQuery = "INSERT INTO Booking (Room_no, customer_id, total_rooms, startDate, endDate) "
                    + "VALUES (?, ?, 1, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, selectedRoomNo);
            preparedStatement.setInt(2, Integer.parseInt(selectedCustomer));

            // Set the startDate as the current date and endDate as current date + 1 day
            LocalDate currentDate = LocalDate.now();
            LocalDate endDate = currentDate.plusDays(1);
            preparedStatement.setDate(3, java.sql.Date.valueOf(currentDate));
            preparedStatement.setDate(4, java.sql.Date.valueOf(endDate));

            preparedStatement.executeUpdate();
            preparedStatement.close();

            status.setText("Not Available");
            JOptionPane.showMessageDialog(this, "Booking successful!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_bookActionPerformed

    private void roomComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_roomComboBoxItemStateChanged
        int selectedIndex = roomComboBox.getSelectedIndex();

        if (selectedIndex == 0) {
            number.setText("-");
            type.setText("-");
            status.setText("-");
            price.setText("-");
            return;
        }

        String selectedRoomNo = (String) roomComboBox.getSelectedItem();

        try {
            Connection connection = DatabaseConnection.getConnection();

            String sqlQuery = "SELECT * FROM Room WHERE Room_no = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setString(1, selectedRoomNo);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String roomNumber = resultSet.getString("room_no");
                String roomType = resultSet.getString("room_type");
                boolean isAvailable = resultSet.getBoolean("Is_Available");
                double roomPrice = resultSet.getDouble("room_price");

                number.setText(roomNumber);
                type.setText(roomType);
                status.setText(isAvailable ? "Available" : "Not Available");
                price.setText(Double.toString(roomPrice));
            }

            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_roomComboBoxItemStateChanged

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        setVisible(false);
        DashboardJFrame frame = new DashboardJFrame();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(BookingJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookingJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton book;
    private javax.swing.JComboBox<String> customerComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel number;
    private javax.swing.JLabel price;
    private javax.swing.JComboBox<String> roomComboBox;
    private javax.swing.JLabel status;
    private javax.swing.JLabel type;
    // End of variables declaration//GEN-END:variables

}
