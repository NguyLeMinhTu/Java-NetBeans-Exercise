/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LayoutManager;
import javax.swing.*;
import java.awt.*;
public class Vidu_FlowLayout {
  public static void main(String[] args) {
        JFrame frame = new JFrame("FlowLayout Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        
        // Khai báo FlowLayout với căn giữa, khoảng cách 10px ngang, 20px dọc
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));
        
        // Thêm các nút
        for (int i = 1; i <= 8; i++) {
            frame.add(new JButton("Button " + i));
        }
        
        frame.setVisible(true);
    }  
}
