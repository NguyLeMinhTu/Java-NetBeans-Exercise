/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baiThucHanhB4;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * Bài 5: Xử lý sự kiện nhập số trên JTextField
 * Yêu cầu: Chỉ cho phép người dùng nhập ký tự số
 */
public class bai5 extends JFrame implements KeyListener {
    private JTextField txt;           // Trường nhập liệu
    private JLabel lblThongBao;       // Label hiển thị thông báo
    private JLabel lblHuongDan;       // Label hướng dẫn
    
    /**
     * Constructor - Khởi tạo giao diện
     */
    public bai5() {
        // Thiết lập frame
        setTitle("Xử lý sự kiện trên JTextField - Chỉ nhập số");
        setLayout(new FlowLayout());
        setSize(400, 200);            // Tăng kích thước để chứa thêm label
        setLocationRelativeTo(null);  // Hiển thị giữa màn hình
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Label hướng dẫn
        lblHuongDan = new JLabel("Vui lòng chỉ nhập số (0-9):");
        add(lblHuongDan);
        
        // Tạo JTextField
        txt = new JTextField(20);
        txt.addKeyListener(this);     // Đăng ký lắng nghe sự kiện bàn phím
        add(txt);
        
        // Label thông báo lỗi (ban đầu ẩn)
        lblThongBao = new JLabel("");
        lblThongBao.setForeground(java.awt.Color.RED); // Màu đỏ cho thông báo lỗi
        add(lblThongBao);
    }
    
    /**
     * Xử lý sự kiện khi gõ phím (phím được nhả ra)
     * Phương thức này được gọi sau khi keyTyped và keyPressed
     */
    @Override
    public void keyReleased(KeyEvent e) {
        // Kiểm tra nội dung hiện tại của textfield
        String currentText = txt.getText();
        
        // Nếu textfield rỗng, xóa thông báo lỗi
        if (currentText.isEmpty()) {
            lblThongBao.setText("");
            return;
        }
        
        // Kiểm tra xem có ký tự không phải số không
        boolean hasNonDigit = false;
        for (char c : currentText.toCharArray()) {
            if (c < '0' || c > '9') {
                hasNonDigit = true;
                break;
            }
        }
        
        // Nếu có ký tự không phải số
        if (hasNonDigit) {
            lblThongBao.setText("Lỗi: Chỉ được nhập số từ 0 đến 9!");
            
            // Hiển thị hộp thoại cảnh báo (chỉ hiển thị 1 lần)
            if (!currentText.matches("[0-9]+")) {
                JOptionPane.showMessageDialog(
                    this, 
                    "Chỉ được phép nhập số từ 0 đến 9!\n" +
                    "Ký tự không hợp lệ sẽ bị xóa tự động.",
                    "Cảnh báo nhập liệu", 
                    JOptionPane.WARNING_MESSAGE
                );
                
                // Tự động xóa ký tự không phải số
                String cleanedText = currentText.replaceAll("[^0-9]", "");
                txt.setText(cleanedText);
            }
        } else {
            // Nếu tất cả đều là số
            lblThongBao.setText("✓ Nhập liệu hợp lệ");
            lblThongBao.setForeground(java.awt.Color.GREEN);
        }
    }
    
    /**
     * Xử lý sự kiện khi nhấn phím
     * Phương thức này kiểm tra từng phím khi được nhấn
     */
    @Override
    public void keyPressed(KeyEvent e) {
        char keyChar = e.getKeyChar();
        
        // Cho phép các phím điều khiển: Backspace, Delete, mũi tên, Enter, Tab
        if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE || 
            e.getKeyCode() == KeyEvent.VK_DELETE ||
            e.getKeyCode() == KeyEvent.VK_LEFT ||
            e.getKeyCode() == KeyEvent.VK_RIGHT ||
            e.getKeyCode() == KeyEvent.VK_ENTER ||
            e.getKeyCode() == KeyEvent.VK_TAB ||
            e.isActionKey()) { // Các phím chức năng (F1-F12, Home, End, PageUp/Down)
            return; // Cho phép các phím này
        }
        
        // Kiểm tra nếu là số (0-9)
        if (keyChar >= '0' && keyChar <= '9') {
            // Cho phép nhập số
            lblThongBao.setText(""); // Xóa thông báo lỗi nếu có
        } else {
            // Không cho phép nhập ký tự khác số
            lblThongBao.setText("Không được nhập: '" + keyChar + "'");
            lblThongBao.setForeground(java.awt.Color.RED);
            e.consume(); // Hủy sự kiện, không cho nhập ký tự này
        }
    }
    
    /**
     * Xử lý sự kiện khi gõ phím (phím được nhấn và nhả ra)
     * Phương thức này được gọi sau khi keyPressed
     */
    @Override
    public void keyTyped(KeyEvent e) {
        // Không cần xử lý gì thêm, vì đã xử lý trong keyPressed
        // Giữ lại phương thức này vì interface KeyListener yêu cầu
    }
    
    /**
     * Phương thức main - Khởi chạy chương trình
     */
    public static void main(String[] args) {
        // Tạo và hiển thị giao diện
        bai5 frame = new bai5();
        frame.setVisible(true);
        
        // Hiển thị hộp thoại hướng dẫn khi bắt đầu
        JOptionPane.showMessageDialog(
            frame,
            "CHƯƠNG TRÌNH CHỈ CHO PHÉP NHẬP SỐ\n\n" +
            "Hướng dẫn:\n" +
            "1. Chỉ được nhập số từ 0 đến 9\n" +
            "2. Các phím điều khiển (Backspace, Delete, mũi tên) được phép\n" +
            "3. Ký tự không phải số sẽ bị tự động xóa",
            "Hướng dẫn sử dụng",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}
