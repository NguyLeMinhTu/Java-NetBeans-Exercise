/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baiThucHanhB5;

/**
 *
 * @author Admin
 */
import java.awt.Color; 
import java.awt.Container; 
import java.awt.FlowLayout; 
import java.awt.Font; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*; 
import javax.swing.border.Border; 
import javax.swing.border.TitledBorder; 
  
/** 
 * 
 * @author btdtrinh 
 */ 
public class bai15 extends JFrame{ 
    JTextField txtA, txtB, txtC;
    JTextArea txtKQ;
    JButton btnGiai, btnXoaTrang, btnThoat;
    
    public bai15(){ 
        addControls(); 
        addEvents();
    } 
    public void showWindows(){ 
        setTitle("MinhTu-demo Giai PT Bac 2"); 
        setSize(400, 350); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setLocationRelativeTo(null); 
        setVisible(true);         
    } 
     
    public static void main(String[] args) { 
        new bai15().showWindows(); 
    } 
  
    private void addControls() { 
        Container con = getContentPane(); 
        JPanel pnMain = new JPanel(); 
        pnMain.setLayout(new BoxLayout(pnMain, BoxLayout.Y_AXIS)); 
         
        con.add(pnMain); 
//TIEU DE "GIAI PHUONG TRINH BAC 2 
        JPanel pnTitle = new JPanel(); 
        pnTitle.setLayout(new FlowLayout()); 
        JLabel lblTieuDe = new JLabel("GIẢI PHƯƠNG TRÌNH BẬC 2"); 
        lblTieuDe.setForeground(Color.BLUE); 
        Font fontTieuDe = new Font("arial", Font.BOLD, 20); 
        lblTieuDe.setFont(fontTieuDe); 
         
        pnTitle.add(lblTieuDe); 
        pnMain.add(pnTitle); 
//NHAP CAC HE SO A, B, C; 
          
        JPanel pnNhapHeSo = new JPanel(); 
        pnMain.add(pnNhapHeSo); 
        pnNhapHeSo.setLayout(new BoxLayout(pnNhapHeSo, BoxLayout.Y_AXIS)); 
         
        //NHAP HE SO A: 
        JPanel pnHeSoA = new JPanel(); 
        pnHeSoA.setLayout(new FlowLayout()); 
        JLabel lblA = new JLabel("HỆ SỐ A: "); 
        txtA = new JTextField(20); 
  
        pnHeSoA.add(lblA); 
        pnHeSoA.add(txtA); 
        pnNhapHeSo.add(pnHeSoA); 
         
        //NHAP HE SO B:  
        JPanel pnHeSoB = new JPanel(); 
        pnHeSoB.setLayout(new FlowLayout()); 
         
        JLabel lblB = new JLabel("HỆ SỐ B: "); 
        txtB = new JTextField(20); 
  
        pnHeSoB.add(lblB); 
        pnHeSoB.add(txtB); 
        pnNhapHeSo.add(pnHeSoB); 
         
        //NHAP HE SO C: 
        JPanel pnHeSoC = new JPanel(); 
        pnHeSoC.setLayout(new FlowLayout()); 
         
        JLabel lblC = new JLabel("HỆ SỐ C: "); 
        txtC = new JTextField(20); 
  
        pnHeSoC.add(lblC); 
        pnHeSoC.add(txtC); 
        pnNhapHeSo.add(pnHeSoC); 
         
        //HIEN THI KET QUA 
        JPanel pnKQ = new JPanel(); 
        pnKQ.setLayout(new FlowLayout()); 
         
        JLabel lblKQ = new JLabel("KẾT QUẢ: "); 
        txtKQ = new JTextArea(3, 20); 
        txtKQ.setWrapStyleWord(true); 
        txtKQ.setLineWrap(true); 
        txtKQ.setEditable(false); //Khong cho nhap lieu 
        JScrollPane sc = new JScrollPane(txtKQ, 
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS); 
  
 
        pnKQ.add(lblKQ); 
        pnKQ.add(sc); 
        pnNhapHeSo.add(pnKQ); 
         
//THIET LAP KHUNG DUONG VIEN CHO PHAN NHAP CAC HE SO A, B, C 
        Border borderThongTin = 
BorderFactory.createLineBorder(Color.BLUE); 
        TitledBorder borderTitleThongtin = new 
TitledBorder(borderThongTin,  
                "NHẬP HỆ A, B, C:"); 
        pnNhapHeSo.setBorder(borderTitleThongtin); 
        borderTitleThongtin.setTitleColor(Color.RED); 
        borderTitleThongtin.setTitleJustification(TitledBorder.LEFT); 
         
//THIET LAP CAC BUTTON XU LY  GIAI, XOATRANG, THOAT 
        JPanel pnButton = new JPanel(); 
        pnMain.add(pnButton); 
        pnButton.setLayout(new FlowLayout()); 
        //CAC BUTTON  
        btnGiai = new JButton("GIẢI"); 
        btnXoaTrang = new JButton("XOÁ TRẮNG"); 
        btnThoat = new JButton("THOÁT"); 
         
        pnButton.add(btnGiai); 
        pnButton.add(btnXoaTrang); 
        pnButton.add(btnThoat); 
         
//THIET LAP KHUNG DUONG VIEN CHO PHAN NHAP CAC HE SO A, B, C 
        Border borderButton = 
BorderFactory.createLineBorder(Color.RED); 
        TitledBorder borderTitleButton = new TitledBorder(borderButton,  
                "CHỌN THAO TÁC THỰC HIỆN: "); 
        pnButton.setBorder(borderTitleButton); 
        borderTitleButton.setTitleColor(Color.BLUE); 
        borderTitleButton.setTitleJustification(TitledBorder.LEFT);  
        
        lblB.setPreferredSize(lblA.getPreferredSize());
        lblC.setPreferredSize(lblA.getPreferredSize());
        lblKQ.setPreferredSize(lblA.getPreferredSize());
    } 
    
    private void addEvents() {
        btnGiai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(txtA.getText());
                    double b = Double.parseDouble(txtB.getText());
                    double c = Double.parseDouble(txtC.getText());
                    String result;
                    if (a == 0) {
                        if (b == 0) {
                            if (c == 0) {
                                result = "Vô số nghiệm";
                            } else {
                                result = "Vô nghiệm";
                            }
                        } else {
                            double x = -c / b;
                            result = "Nghiệm x = " + x;
                        }
                    } else {
                        double delta = b * b - 4 * a * c;
                        if (delta < 0) {
                            result = "Vô nghiệm";
                        } else if (delta == 0) {
                            double x = -b / (2 * a);
                            result = "Nghiệm kép x = " + x;
                        } else {
                            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                            result = "Nghiệm x1 = " + x1 + "\nNghiệm x2 = " + x2;
                        }
                    }
                    txtKQ.setText(result);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập số hợp lệ!");
                }
            }
        });
        
        btnXoaTrang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtA.setText("");
                txtB.setText("");
                txtC.setText("");
                txtKQ.setText("");
            }
        });
        
        btnThoat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}