package baiThucHanhB4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class bai4 extends JFrame {
    private JTextField userText;
    private JPasswordField passText;

    public bai4() {
        Container con = getContentPane();
        JPanel pn = new JPanel();
        pn.setLayout(new FlowLayout(FlowLayout.CENTER));

        // Panel chứa USERNAME
        JPanel pn1 = new JPanel();
        JLabel userLabel = new JLabel("USER NAME: ");
        userText = new JTextField(15);
        pn1.add(userLabel);
        pn1.add(userText);
        pn.add(pn1);

        // Panel chứa PASSWORD
        JPanel pn2 = new JPanel();
        JLabel passLabel = new JLabel("PASSWORD: ");
        passText = new JPasswordField(15);
        passText.setEchoChar('*');
        pn2.add(passLabel);
        pn2.add(passText);
        pn.add(pn2);

        // Panel chứa BUTTON SIGNIN
        JPanel pnSignIn = new JPanel();
        JButton btnSignIn = new JButton("Sign in");
        pnSignIn.add(btnSignIn);
        pn.add(pnSignIn);

        con.add(pn);

        // Đăng ký lắng nghe sự kiện cho nút Sign in
        btnSignIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText().trim();
                String password = new String(passText.getPassword()).trim();
                
                // Kiểm tra các trường nhập liệu
                if (username.isEmpty() && password.isEmpty()) {
                    JOptionPane.showMessageDialog(
                        null, 
                        "Vui lòng nhập Username và Password!", 
                        "Lỗi", 
                        JOptionPane.ERROR_MESSAGE
                    );
                    userText.requestFocus(); // Đặt con trỏ vào trường username
                } else if (username.isEmpty()) {
                    JOptionPane.showMessageDialog(
                        null, 
                        "Vui lòng nhập Username!", 
                        "Lỗi", 
                        JOptionPane.ERROR_MESSAGE
                    );
                    userText.requestFocus();
                } else if (password.isEmpty()) {
                    JOptionPane.showMessageDialog(
                        null, 
                        "Vui lòng nhập Password!", 
                        "Lỗi", 
                        JOptionPane.ERROR_MESSAGE
                    );
                    passText.requestFocus();
                } else {
                    // Nếu cả hai trường đều có dữ liệu
                    String msg = "Bạn vừa nhập username: " + username + " ; Và Password: " + password;
                    JOptionPane.showMessageDialog(null, msg, "Thông tin đăng nhập", JOptionPane.INFORMATION_MESSAGE);
                    
                    // Xóa dữ liệu sau khi hiển thị (tùy chọn)
                    userText.setText("");
                    passText.setText("");
                    userText.requestFocus();
                }
            }
        });
    }

    public void showWindow() {
        setTitle("MinhTu221359-Demo SignIn Form");
        setSize(300, 150);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new bai4().showWindow();
    }
}
