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
public class Vidu_GroupLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GroupLayout Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        
        JPanel panel = new JPanel();
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);
        
        // Tạo các component
        JLabel label = new JLabel("Username:");
        JTextField textField = new JTextField(15);
        JButton button = new JButton("Login");
        
        // Thiết lập tự động tạo khoảng cách
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        
        // Tạo layout theo chiều ngang
        layout.setHorizontalGroup(
            layout.createSequentialGroup()
                .addComponent(label)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(textField)
                    .addComponent(button))
        );
        
        // Tạo layout theo chiều dọc
        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(label)
                    .addComponent(textField))
                .addComponent(button)
        );
        
        frame.add(panel);
        frame.setVisible(true);
    }
}
