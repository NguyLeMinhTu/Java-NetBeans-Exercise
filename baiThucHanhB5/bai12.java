/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baiThucHanhB5;

/**
 *
 * @author Minh Tú
 */
import java.awt.Color; 
import java.awt.Container; 
import java.awt.FlowLayout; 
import java.awt.Font; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import java.util.concurrent.Flow; 
import javax.swing.*; 
  
/** 
 * 
 * @author btdtrinh 
 */ 
public class bai12 extends JFrame implements ActionListener{ 
    JTextField txtHeSoA, txtHeSoB, txtKQ; 
    JButton btnGiai, btnHelp, btnExit; 
     
    public bai12(){ 
        addControl(); 
        addEvent(); 
    } 
     
    ActionListener eventGiai = new ActionListener() { 
        @Override 
        public void actionPerformed(ActionEvent e) { 
           GiaiPT(); 
        } 
    }; 
     
    private void GiaiPT(){ 
        String hsA, hsB; 
        hsA = txtHeSoA.getText(); 
        hsB = txtHeSoB.getText(); 
        double a = Double.parseDouble(hsA); 
        double b = Double.parseDouble(hsB); 
        double kq = -b/a; 
         
        if(a == 0 && b == 0){ 
            txtKQ.setText("Vô số nghiệm"); 
        }else if(a == 0 && b != 0){ 
            txtKQ.setText("Vô nghiệm"); 
        }else{ 
            txtKQ.setText("X = " +kq); 
        } 
    } 
    public void showWindows(){ 
        setTitle("MinhTu - demo Giai PT Bac 1"); 
        setSize(400, 300); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setLocationRelativeTo(null); 
        setVisible(true); 
    } 
     
     
    public static void main(String[] args) { 
        new bai12().showWindows(); 
    } 
  
    private void addControl() {  
        Container con = getContentPane(); 
        JPanel pnMain = new JPanel(); 
        pnMain.setLayout(new BoxLayout(pnMain, BoxLayout.Y_AXIS)); 
        con.add(pnMain); 
         
        JPanel pnTitle = new JPanel(); 
        pnTitle.setLayout(new FlowLayout()); 
        JLabel lblTieuDe = new JLabel("Giải phương trình bậc 1"); 
        pnTitle.add(lblTieuDe); 
        pnMain.add(pnTitle); 
        lblTieuDe.setForeground(Color.BLUE); 
        Font fontTieuDe = new Font("arial", Font.BOLD, 20); 
        lblTieuDe.setFont(fontTieuDe); 
        // 
     JPanel pnHeSoa = new JPanel(); 
        pnHeSoa.setLayout(new FlowLayout()); 
        JLabel lblHeSoa = new JLabel("HỆ SỐ A:"); 
        txtHeSoA = new JTextField(15); 
        pnHeSoa.add(lblHeSoa); 
        pnHeSoa.add(txtHeSoA); 
        pnMain.add(pnHeSoa); 
  
        JPanel pnHeSob = new JPanel(); 
        pnHeSob.setLayout(new FlowLayout()); 
        JLabel lblHeSob = new JLabel("HỆ SỐ B:"); 
        txtHeSoB = new JTextField(15); 
        pnHeSob.add(lblHeSob); 
        pnHeSob.add(txtHeSoB); 
        pnMain.add(pnHeSob); 
  
        JPanel pnButton = new JPanel(); 
        pnButton.setLayout(new FlowLayout()); 
        btnGiai = new JButton("GIẢI"); 
        btnGiai.setForeground(Color.red); 
        btnGiai.setFont(new Font("VNI",Font.BOLD,18)); 
  
        btnExit = new JButton("EXIT"); 
        btnExit.setForeground(Color.red); 
        btnExit.setFont(new Font("VNI",Font.BOLD,18)); 
  
        //btnExit.setIcon(new ImageIcon("hinh/exit.png")); 
  
        btnHelp = new JButton("HELP"); 
        btnHelp.setForeground(Color.red); 
        btnHelp.setFont(new Font("VNI",Font.BOLD,18)); 
  
        pnButton.add(btnGiai); 
        pnButton.add(btnHelp); 
        pnButton.add(btnExit); 
        pnMain.add(pnButton); 
  
        JPanel pnKetQua = new JPanel(); 
        pnKetQua.setLayout(new FlowLayout()); 
        JLabel lblKetQua = new JLabel("Kết quả :"); 
        lblKetQua.setForeground(Color.BLUE); 
        lblKetQua.setFont(new Font("VNI", Font.BOLD, 18)); 
         
        txtKQ = new JTextField(15); 
        txtKQ.setEditable(false); 
        pnKetQua.add(lblKetQua); 
        pnKetQua.add(txtKQ); 
        pnMain.add(pnKetQua); 
  
    } 
  
    private void addEvent() { 
        btnGiai.addActionListener(eventGiai); 
        btnHelp.addActionListener(new eventHelp()); 
        btnExit.addActionListener(new eventExit()); 
    } 
    @Override 
    public void actionPerformed(ActionEvent e) { 
    } 
    private static class eventHelp implements ActionListener{ 
  
        public eventHelp() { 
        } 
        @Override 
        public void actionPerformed(ActionEvent e) { 
            JOptionPane.showMessageDialog(null, "" 
                    + "Liên hệ Admin để được giải đáp"); 
        } 
    } 
    private static class eventExit implements ActionListener { 
        public eventExit() { 
        } 
        @Override 
        public void actionPerformed(ActionEvent e) { 
            System.exit(0); 
        } 
    } 
} 
  
 
