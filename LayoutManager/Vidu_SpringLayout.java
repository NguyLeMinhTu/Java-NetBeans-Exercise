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
public class Vidu_SpringLayout {
   public static void main(String[] args) {
        JFrame frame = new JFrame("SpringLayout Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        
        JPanel panel = new JPanel();
        SpringLayout layout = new SpringLayout();
        panel.setLayout(layout);
        
        // Tạo các component
        JLabel label = new JLabel("Enter text:");
        JTextField textField = new JTextField(20);
        JButton button = new JButton("Submit");
        
        // Thêm vào panel
        panel.add(label);
        panel.add(textField);
        panel.add(button);
        
        // Thiết lập ràng buộc cho label
        layout.putConstraint(SpringLayout.WEST, label, 10, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, label, 10, SpringLayout.NORTH, panel);
        
        // Thiết lập ràng buộc cho textField
        layout.putConstraint(SpringLayout.WEST, textField, 10, SpringLayout.EAST, label);
        layout.putConstraint(SpringLayout.NORTH, textField, 10, SpringLayout.NORTH, panel);
        
        // Thiết lập ràng buộc cho button
        layout.putConstraint(SpringLayout.WEST, button, 10, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, button, 20, SpringLayout.SOUTH, label);
        
        frame.add(panel);
        frame.setVisible(true);
    } 
}
