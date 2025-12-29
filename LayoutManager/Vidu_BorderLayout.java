
package LayoutManager;

import javax.swing.*;
import java.awt.*;

public class Vidu_BorderLayout {
     public static void main(String[] args) {
        JFrame frame = new JFrame("BorderLayout Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        
        // Khai báo BorderLayout
        frame.setLayout(new BorderLayout());
        
        // Thêm các thành phần vào các vùng
        frame.add(new JButton("North"), BorderLayout.NORTH);
        frame.add(new JButton("South"), BorderLayout.SOUTH);
        frame.add(new JButton("East"), BorderLayout.EAST);
        frame.add(new JButton("West"), BorderLayout.WEST);
        frame.add(new JButton("Center"), BorderLayout.CENTER);
        
        frame.setVisible(true);
    }
}
