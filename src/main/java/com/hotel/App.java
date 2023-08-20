package com.hotel;

import com.hotel.ui.HomeJFrame;
import javax.swing.UIManager;
import com.formdev.flatlaf.FlatDarkLaf;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    public static void main(String[] args) {        
        // Set the look and feel of the GUI to FlatLaf
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf()); // Use FlatDarkLaf or other FlatLaf themes
        } catch (Exception ex) {
            // If there's an error in setting the look and feel, log the error
            Logger.getLogger(HomeJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Start the GUI in the Event Dispatch Thread
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                HomeJFrame homeFrame = new HomeJFrame();
                homeFrame.setLocationRelativeTo(null);
                homeFrame.setVisible(true);
            }
        });
    }
}
