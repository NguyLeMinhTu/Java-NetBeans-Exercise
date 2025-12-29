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
public class Vidu_GridLayout {
     public static void main(String[] args) {
        JFrame frame = new JFrame("GridLayout Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        
        // Khai báo GridLayout: 3 hàng, 2 cột, khoảng cách 5px ngang, 10px dọc
        frame.setLayout(new GridLayout(3, 2, 5, 10));
        
        // Thêm các thành phần
        String[] labels = {"1", "2", "3", "4", "5", "6"};
        
        for (String label : labels) {
            frame.add(new JButton("Button " + label));
        }
        
        frame.setVisible(true);
    }
}
