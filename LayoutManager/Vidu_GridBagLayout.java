/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LayoutManager;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Admin
 */
public class Vidu_GridBagLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridBagLayout Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        
        // Khai báo GridBagLayout
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        // Thiết lập padding mặc định
        gbc.insets = new Insets(5, 5, 5, 5);
        
        // Button 1 - hàng 0, cột 0, chiếm 2 cột
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        frame.add(new JButton("Button 1 (span 2 columns)"), gbc);
        
        // Button 2 - hàng 1, cột 0
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0.5;
        gbc.weighty = 0.5;
        frame.add(new JButton("Button 2"), gbc);
        
        // Button 3 - hàng 1, cột 1
        gbc.gridx = 1;
        gbc.gridy = 1;
        frame.add(new JButton("Button 3"), gbc);
        
        // Button 4 - hàng 2, cột 0, chiếm 2 cột
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        frame.add(new JButton("Button 4 (span 2 columns)"), gbc);
        
        frame.setVisible(true);
    }
}
