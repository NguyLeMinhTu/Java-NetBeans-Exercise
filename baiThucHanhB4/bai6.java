/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baiThucHanhB4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;

public class bai6 extends JFrame implements ItemListener, ActionListener {
    private JComboBox<String> combo;          // ComboBox chứa danh sách
    private JLabel lblKetQua;                 // Label hiển thị kết quả
    private JLabel lblThongKe;                // Label thống kê số lần chọn
    private JLabel lblHuongDan;               // Label hướng dẫn
    private JButton btnReset;                 // Nút reset thống kê
    private int[] demChon;                    // Mảng đếm số lần chọn mỗi phần tử
    private String[] danhSachTinh;           // Danh sách các tỉnh/thành
    private String luaChonHienTai = "";      // Lưu lựa chọn hiện tại
    
    /**
     * Constructor - Khởi tạo giao diện
     */
    public bai6() {
        // Thiết lập frame
        setTitle("Ví dụ sự kiện trên JComboBox - Bài 6");
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        setSize(500, 250);                    // Tăng kích thước để chứa thêm các thành phần
        setLocationRelativeTo(null);          // Hiển thị giữa màn hình
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Khởi tạo danh sách tỉnh/thành
        danhSachTinh = new String[] {
            "-- Chọn một địa phương --",
            "Tỉnh Bạc Liêu",
            "Tỉnh Cà Mau", 
            "TP Cần Thơ",
            "Tỉnh Thừa Thiên Huế",
            "TP Hồ Chí Minh",
            "TP Hà Nội",
            "Tỉnh Đồng Tháp",
            "Tỉnh An Giang"
        };
        
        // Khởi tạo mảng đếm (bắt đầu từ 0)
        demChon = new int[danhSachTinh.length];
        
        // Label hướng dẫn - ĐÃ SỬA LỖI: lblHuongDan thay vì lHuongDan
        lblHuongDan = new JLabel("Vui lòng chọn một tỉnh/thành từ danh sách:");
        lblHuongDan.setFont(new Font("Arial", Font.BOLD, 14));
        add(lblHuongDan);  // ĐÃ SỬA: add(lblHuongDan) thay vì add(lHuongDan)
        
        // Tạo khoảng trống
        add(Box.createRigidArea(new Dimension(0, 10)));
        
        // Tạo JComboBox
        combo = new JComboBox<>(danhSachTinh);
        combo.setPreferredSize(new Dimension(300, 30));
        combo.setFont(new Font("Arial", Font.PLAIN, 14));
        
        // Đặt mục mặc định (không chọn)
        combo.setSelectedIndex(0);
        
        // Đăng ký lắng nghe sự kiện
        combo.addItemListener(this);          // Lắng nghe thay đổi item
        combo.addActionListener(this);        // Lắng nghe action
        add(combo);
        
        // Tạo khoảng trống
        add(Box.createRigidArea(new Dimension(0, 20)));
        
        // Label hiển thị kết quả
        lblKetQua = new JLabel("Hãy chọn một địa phương");
        lblKetQua.setFont(new Font("Arial", Font.BOLD, 16));
        lblKetQua.setForeground(Color.BLUE);
        lblKetQua.setPreferredSize(new Dimension(400, 30));
        add(lblKetQua);
        
        // Label thống kê
        lblThongKe = new JLabel("Số lần chọn: Chưa có lựa chọn nào");
        lblThongKe.setFont(new Font("Arial", Font.ITALIC, 12));
        lblThongKe.setForeground(Color.DARK_GRAY);
        add(lblThongKe);
        
        // Tạo khoảng trống
        add(Box.createRigidArea(new Dimension(0, 10)));
        
        // Nút Reset thống kê
        btnReset = new JButton("Reset Thống Kê");
        btnReset.setFont(new Font("Arial", Font.PLAIN, 12));
        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetThongKe();
            }
        });
        add(btnReset);
        
        // Thêm PopupMenuListener để xử lý sự kiện mở/đóng combo box
        combo.addPopupMenuListener(new PopupMenuListener() {
            @Override
            public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
                lblHuongDan.setText("Đang mở danh sách...");
                lblHuongDan.setForeground(Color.ORANGE);
            }
            
            @Override
            public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
                lblHuongDan.setText("Vui lòng chọn một tỉnh/thành từ danh sách:");
                lblHuongDan.setForeground(Color.BLACK);
                
                // Kiểm tra nếu chưa chọn gì (vẫn là mục mặc định)
                if (combo.getSelectedIndex() == 0) {
                    lblKetQua.setText("Hãy chọn một địa phương");
                    lblKetQua.setForeground(Color.BLUE);
                    lblThongKe.setText("Số lần chọn: Chưa có lựa chọn nào");
                }
            }
            
            @Override
            public void popupMenuCanceled(PopupMenuEvent e) {
                // Không cần xử lý
            }
        });
    }
    
    /**
     * Xử lý sự kiện khi thay đổi lựa chọn trong ComboBox
     */
    @Override
    public void itemStateChanged(ItemEvent e) {
        // Chỉ xử lý khi item được chọn (SELECTED), không xử lý khi bỏ chọn (DESELECTED)
        if (e.getStateChange() == ItemEvent.SELECTED) {
            String selectedItem = combo.getSelectedItem().toString();
            int selectedIndex = combo.getSelectedIndex();
            
            // Kiểm tra nếu chọn mục mặc định (hướng dẫn)
            if (selectedIndex == 0) {
                lblKetQua.setText("Hãy chọn một địa phương");
                lblKetQua.setForeground(Color.BLUE);
                lblThongKe.setText("Số lần chọn: Chưa có lựa chọn nào");
                return;
            }
            
            // Cập nhật lựa chọn hiện tại
            luaChonHienTai = selectedItem;
            
            // Tăng số lần chọn cho phần tử này
            demChon[selectedIndex]++;
            
            // Cập nhật label kết quả
            lblKetQua.setText("Bạn vừa chọn: " + selectedItem);
            lblKetQua.setForeground(new Color(0, 100, 0)); // Xanh đậm
            
            // Cập nhật thống kê
            capNhatThongKe();
            
            // Hiển thị thông báo chi tiết cho lần chọn đầu tiên của mỗi item
            if (demChon[selectedIndex] == 1) {
                JOptionPane.showMessageDialog(
                    this,
                    "Bạn đã chọn: " + selectedItem + "\n" +
                    "Đây là lần đầu tiên bạn chọn địa phương này.",
                    "Thông báo",
                    JOptionPane.INFORMATION_MESSAGE
                );
            }
            
            // Hiển thị cảnh báo nếu chọn quá nhiều lần
            if (demChon[selectedIndex] >= 5) {
                JOptionPane.showMessageDialog(
                    this,
                    "Bạn đã chọn '" + selectedItem + "' " + demChon[selectedIndex] + " lần!\n" +
                    "Có thể bạn muốn thử chọn địa phương khác?",
                    "Lưu ý",
                    JOptionPane.WARNING_MESSAGE
                );
            }
        }
    }
    
    /**
     * Xử lý sự kiện Action (khi nhấn Enter trên ComboBox)
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // Xử lý khi người dùng nhấn Enter sau khi chọn
        if (e.getSource() == combo) {
            if (combo.getSelectedIndex() > 0) {
                lblKetQua.setText("Đã xác nhận: " + combo.getSelectedItem());
                lblKetQua.setForeground(Color.RED);
                
                // Hiệu ứng visual feedback
                Timer timer = new Timer(500, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent evt) {
                        lblKetQua.setForeground(new Color(0, 100, 0));
                    }
                });
                timer.setRepeats(false);
                timer.start();
            }
        }
    }
    
    /**
     * Cập nhật label thống kê
     */
    private void capNhatThongKe() {
        int selectedIndex = combo.getSelectedIndex();
        if (selectedIndex > 0) {
            String selectedItem = combo.getSelectedItem().toString();
            int soLanChon = demChon[selectedIndex];
            
            String thongKeText = "Số lần chọn '" + selectedItem + "': " + soLanChon;
            
            // Thêm thông tin về tổng số lần chọn
            int tongSoLanChon = tinhTongSoLanChon();
            thongKeText += " | Tổng số lần chọn: " + tongSoLanChon;
            
            lblThongKe.setText(thongKeText);
            
            // Đổi màu theo số lần chọn
            if (soLanChon == 1) {
                lblThongKe.setForeground(Color.BLACK);
            } else if (soLanChon <= 3) {
                lblThongKe.setForeground(Color.BLUE);
            } else {
                lblThongKe.setForeground(Color.RED);
            }
        }
    }
    
    /**
     * Tính tổng số lần chọn tất cả các phần tử
     */
    private int tinhTongSoLanChon() {
        int tong = 0;
        for (int i = 1; i < demChon.length; i++) { // Bỏ qua phần tử 0 (hướng dẫn)
            tong += demChon[i];
        }
        return tong;
    }
    
    /**
     * Reset thống kê số lần chọn
     */
    private void resetThongKe() {
        int confirm = JOptionPane.showConfirmDialog(
            this,
            "Bạn có chắc muốn reset tất cả thống kê?\n" +
            "Tất cả số lần chọn sẽ về 0.",
            "Xác nhận Reset",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.WARNING_MESSAGE
        );
        
        if (confirm == JOptionPane.YES_OPTION) {
            // Reset mảng đếm
            for (int i = 0; i < demChon.length; i++) {
                demChon[i] = 0;
            }
            
            // Reset giao diện
            combo.setSelectedIndex(0);
            lblKetQua.setText("Hãy chọn một địa phương");
            lblKetQua.setForeground(Color.BLUE);
            lblThongKe.setText("Số lần chọn: Đã reset về 0");
            lblThongKe.setForeground(Color.DARK_GRAY);
            
            JOptionPane.showMessageDialog(
                this,
                "Đã reset thống kê thành công!",
                "Thông báo",
                JOptionPane.INFORMATION_MESSAGE
            );
        }
    }
    
    /**
     * Phương thức main - Khởi chạy chương trình
     */
    public static void main(String[] args) {
        // Sử dụng SwingUtilities để đảm bảo an toàn thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                bai6 frame = new bai6();
                frame.setVisible(true);
                
                // Hiển thị hộp thoại hướng dẫn khi bắt đầu
                JOptionPane.showMessageDialog(
                    frame,
                    "CHƯƠNG TRÌNH XỬ LÝ SỰ KIỆN TRÊN JCOMBOBOX\n\n" +
                    "Hướng dẫn:\n" +
                    "1. Chọn một tỉnh/thành từ danh sách\n" +
                    "2. Kết quả sẽ hiển thị ngay bên dưới\n" +
                    "3. Chương trình sẽ thống kê số lần bạn chọn mỗi địa phương\n" +
                    "4. Dùng nút 'Reset Thống Kê' để xóa thống kê\n\n" +
                    "Lưu ý: Mục đầu tiên '-- Chọn một địa phương --' chỉ là hướng dẫn",
                    "Hướng dẫn sử dụng",
                    JOptionPane.INFORMATION_MESSAGE
                );
            }
        });
    }
}
