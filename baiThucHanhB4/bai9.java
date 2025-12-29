/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baiThucHanhB4;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

/**
 * Bài 9: Sử dụng Border và JTextField, JTextArea
 * Yêu cầu: Thiết kế giao diện với Border và các thành phần nhập liệu
 */
public class bai9 extends JFrame {
    
    // Khai báo các thành phần
    private JTextField txtTen;
    private JTextArea txtDiaChi;
    private JButton btnOK;
    private JButton btnClear;
    private JLabel lblThongBao;
    
    /**
     * Constructor
     */
    public bai9() {
        addControls();
        addEvents();
    }
    
    /**
     * Thêm các controls vào giao diện
     */
    private void addControls() {
        // Thiết lập layout chính
        Container con = getContentPane();
        con.setLayout(new BorderLayout(10, 10));
        
        // Tạo panel chính với BorderLayout
        JPanel pnMain = new JPanel();
        pnMain.setLayout(new BorderLayout(10, 10));
        pnMain.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        
        // ================== PHẦN TIÊU ĐỀ ==================
        JPanel pnTitle = new JPanel();
        JLabel lblTitle = new JLabel("MinhTu Border & JTextAreaUI");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 20));
        pnTitle.add(lblTitle);
        pnMain.add(pnTitle, BorderLayout.NORTH);
        
        // ================== PHẦN THÔNG TIN ==================
        JPanel pnThongTin = new JPanel();
        pnThongTin.setLayout(new BoxLayout(pnThongTin, BoxLayout.Y_AXIS));
        
        // Tạo border có tiêu đề cho phần thông tin
        TitledBorder borderThongTin = BorderFactory.createTitledBorder(
            BorderFactory.createLineBorder(Color.GRAY, 1),
            "Thông tin:",
            TitledBorder.DEFAULT_JUSTIFICATION,
            TitledBorder.DEFAULT_POSITION,
            new Font("Arial", Font.BOLD, 14),
            Color.BLACK
        );
        pnThongTin.setBorder(borderThongTin);
        
        // ===== PHẦN NHẬP TÊN =====
        JPanel pnTen = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        
        JLabel lblTen = new JLabel("Nhập tên:");
        lblTen.setFont(new Font("Arial", Font.BOLD, 13));
        lblTen.setPreferredSize(new Dimension(100, 25));
        
        txtTen = new JTextField(25);
        txtTen.setFont(new Font("Arial", Font.PLAIN, 13));
        
        pnTen.add(lblTen);
        pnTen.add(txtTen);
        pnThongTin.add(pnTen);
        
        // Thêm khoảng cách
        pnThongTin.add(Box.createRigidArea(new Dimension(0, 10)));
        
        // ===== PHẦN NHẬP ĐỊA CHỈ =====
        JPanel pnDiaChi = new JPanel(new BorderLayout(10, 5));
        
        JLabel lblDiaChi = new JLabel("Địa Chỉ:");
        lblDiaChi.setFont(new Font("Arial", Font.BOLD, 13));
        lblDiaChi.setPreferredSize(new Dimension(100, 25));
        
        // Panel chứa label và text area
        JPanel pnDiaChiContent = new JPanel(new BorderLayout(10, 5));
        
        // Tạo JTextArea với ScrollPane
        txtDiaChi = new JTextArea(5, 25);
        txtDiaChi.setFont(new Font("Arial", Font.PLAIN, 13));
        txtDiaChi.setLineWrap(true); // Tự động xuống dòng
        txtDiaChi.setWrapStyleWord(true); // Xuống dòng theo từ
        
        JScrollPane scrollDiaChi = new JScrollPane(txtDiaChi);
        scrollDiaChi.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollDiaChi.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        
        // Tạo border cho TextArea
        Border borderTextArea = BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(Color.GRAY, 1),
            BorderFactory.createEmptyBorder(5, 5, 5, 5)
        );
        txtDiaChi.setBorder(borderTextArea);
        
        pnDiaChiContent.add(lblDiaChi, BorderLayout.WEST);
        pnDiaChiContent.add(scrollDiaChi, BorderLayout.CENTER);
        pnThongTin.add(pnDiaChiContent);
        
        // Thêm khoảng cách
        pnThongTin.add(Box.createRigidArea(new Dimension(0, 15)));
        
        // ===== PHẦN NÚT BẤM =====
        JPanel pnButtons = new JPanel(new FlowLayout(FlowLayout.RIGHT, 20, 10));
        
        // Nút OK
        btnOK = new JButton("OK");
        btnOK.setFont(new Font("Arial", Font.BOLD, 13));
        btnOK.setPreferredSize(new Dimension(100, 35));
        
        // Nút Clear
        btnClear = new JButton("Clear");
        btnClear.setFont(new Font("Arial", Font.BOLD, 13));
        btnClear.setPreferredSize(new Dimension(100, 35));
        
        pnButtons.add(btnOK);
        pnButtons.add(btnClear);
        pnThongTin.add(pnButtons);
        
        // Thêm panel thông tin vào panel chính
        pnMain.add(pnThongTin, BorderLayout.CENTER);
        
        // ================== PHẦN THÔNG BÁO ==================
        JPanel pnThongBao = new JPanel();
        lblThongBao = new JLabel(" ");
        lblThongBao.setFont(new Font("Arial", Font.ITALIC, 12));
        lblThongBao.setForeground(Color.RED);
        pnThongBao.add(lblThongBao);
        pnMain.add(pnThongBao, BorderLayout.SOUTH);
        
        // Thêm panel chính vào container
        con.add(pnMain, BorderLayout.CENTER);
    }
    
    /**
     * Thêm các sự kiện
     */
    private void addEvents() {
        // Sự kiện cho nút OK
        btnOK.addActionListener(e -> {
            String ten = txtTen.getText().trim();
            String diaChi = txtDiaChi.getText().trim();
            
            // Kiểm tra dữ liệu nhập
            if (ten.isEmpty() && diaChi.isEmpty()) {
                lblThongBao.setText("Vui lòng nhập tên và địa chỉ!");
                JOptionPane.showMessageDialog(this, 
                    "Vui lòng nhập đầy đủ thông tin!",
                    "Thông báo",
                    JOptionPane.WARNING_MESSAGE);
                txtTen.requestFocus();
            } else if (ten.isEmpty()) {
                lblThongBao.setText("Vui lòng nhập tên!");
                JOptionPane.showMessageDialog(this, 
                    "Vui lòng nhập tên!",
                    "Thông báo",
                    JOptionPane.WARNING_MESSAGE);
                txtTen.requestFocus();
            } else if (diaChi.isEmpty()) {
                lblThongBao.setText("Vui lòng nhập địa chỉ!");
                JOptionPane.showMessageDialog(this, 
                    "Vui lòng nhập địa chỉ!",
                    "Thông báo",
                    JOptionPane.WARNING_MESSAGE);
                txtDiaChi.requestFocus();
            } else {
                // Hiển thị thông tin đã nhập
                String message = String.format(
                    "THÔNG TIN ĐÃ NHẬP:\n\n" +
                    "Họ tên: %s\n" +
                    "Địa chỉ: %s\n\n" +
                    "Cảm ơn bạn đã nhập thông tin!",
                    ten, diaChi
                );
                
                JOptionPane.showMessageDialog(this,
                    message,
                    "Thông tin đã nhập",
                    JOptionPane.INFORMATION_MESSAGE);
                
                lblThongBao.setText("Đã lưu thông tin thành công!");
                lblThongBao.setForeground(new Color(0, 100, 0)); // Màu xanh lá
            }
        });
        
        // Sự kiện cho nút Clear
        btnClear.addActionListener(e -> {
            int confirm = JOptionPane.showConfirmDialog(this,
                "Bạn có chắc muốn xóa tất cả thông tin?",
                "Xác nhận xóa",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
            
            if (confirm == JOptionPane.YES_OPTION) {
                txtTen.setText("");
                txtDiaChi.setText("");
                lblThongBao.setText("Đã xóa thông tin!");
                lblThongBao.setForeground(Color.BLUE);
                txtTen.requestFocus();
            }
        });
        
        // Sự kiện khi nhấn Enter trong txtTen
        txtTen.addActionListener(e -> {
            txtDiaChi.requestFocus();
        });
        
        // Sự kiện khi text thay đổi
        txtTen.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(javax.swing.event.DocumentEvent e) {
                capNhatThongBao();
            }
            
            @Override
            public void removeUpdate(javax.swing.event.DocumentEvent e) {
                capNhatThongBao();
            }
            
            @Override
            public void changedUpdate(javax.swing.event.DocumentEvent e) {
                capNhatThongBao();
            }
            
            private void capNhatThongBao() {
                if (!txtTen.getText().trim().isEmpty() && !txtDiaChi.getText().trim().isEmpty()) {
                    lblThongBao.setText("Thông tin đã đầy đủ, nhấn OK để lưu!");
                    lblThongBao.setForeground(new Color(0, 100, 0));
                } else {
                    lblThongBao.setText(" ");
                }
            }
        });
        
        txtDiaChi.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(javax.swing.event.DocumentEvent e) {
                capNhatThongBao();
            }
            
            @Override
            public void removeUpdate(javax.swing.event.DocumentEvent e) {
                capNhatThongBao();
            }
            
            @Override
            public void changedUpdate(javax.swing.event.DocumentEvent e) {
                capNhatThongBao();
            }
            
            private void capNhatThongBao() {
                if (!txtTen.getText().trim().isEmpty() && !txtDiaChi.getText().trim().isEmpty()) {
                    lblThongBao.setText("Thông tin đã đầy đủ, nhấn OK để lưu!");
                    lblThongBao.setForeground(new Color(0, 100, 0));
                } else {
                    lblThongBao.setText(" ");
                }
            }
        });
    }
    
    /**
     * Hiển thị cửa sổ
     */
    public void showWindows() {
        setTitle("MinhTu221359-Border & JTextAreaUI");
        setSize(550, 450);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    /**
     * Phương thức main
     */
    public static void main(String[] args) {
        // Thiết lập Look and Feel mặc định của hệ thống
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // Sử dụng SwingUtilities để đảm bảo an toàn thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new bai9().showWindows();
            }
        });
    }
}