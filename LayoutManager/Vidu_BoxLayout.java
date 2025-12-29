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
public class Vidu_BoxLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BoxLayout Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        
        // Tạo panel với BoxLayout theo chiều dọc
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        
        // Thêm các thành phần với khoảng cách
        panel.add(new JButton("Button 1"));
        panel.add(Box.createRigidArea(new Dimension(0, 10))); // Khoảng cách cố định
        panel.add(new JButton("Button 2"));
        panel.add(Box.createVerticalGlue()); // Khoảng cách co dãn
        panel.add(new JButton("Button 3"));
        panel.add(Box.createVerticalStrut(20)); // Thanh chắn cố định
        
        frame.add(panel);
        frame.setVisible(true);
    }
}
