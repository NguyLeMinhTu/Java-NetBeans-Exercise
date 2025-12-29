/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baiThucHanhB5;

/**
 *
 * @author Admin
 */
import java.awt.BorderLayout; 
import java.awt.Color; 
import java.awt.Container; 
import java.awt.Dimension; 
import java.awt.FlowLayout; 
import java.awt.Font; 
import java.awt.GridLayout; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import javax.swing.*; 
import javax.swing.border.BevelBorder; 
import javax.swing.border.Border; 
import javax.swing.border.TitledBorder; 
  
/** 
 * 
 * @author btdtrinh 
 */ 
public class bai16 extends JFrame{ 
    JButton btnGiai, btnXoaTrang, btnThoat;  
    Font ft; 
    public bai16(){ 
        addControls(); 
    } 
    public void showWindows(){ 
        setTitle("Minh Tú-demo Cộng-Trừ-Nhân-Chia"); 
        setSize(400, 300); 
        setLocationRelativeTo(null); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setResizable(false); 
        setVisible(true); 
    } 
  
    public static void main(String[] args) { 
        new bai16().showWindows(); 
    } 
  
    private void addControls() { 
        Container con=getContentPane(); 
//PHAN VUNG TIEU DE 
        JPanel pnBorder = new JPanel(); 
        pnBorder.setLayout(new BorderLayout()); 
        JPanel pnNorth = new JPanel(); 
        JLabel lblTitle = new JLabel("Cộng Trừ Nhân Chia"); 
        pnNorth.add(lblTitle); 
        pnBorder.add(pnNorth, BorderLayout.NORTH); 
        lblTitle.setForeground(Color.BLUE); 
        ft = new Font("arial", Font.BOLD, 25); 
        lblTitle.setFont(ft); 
         
//PHAN VUNG LUA CHON  TAC VU: GIA-XOA-THOAT 
        JPanel pnWest = new JPanel(); 
        pnWest.setLayout(new BoxLayout(pnWest, BoxLayout.Y_AXIS)); 
        JButton btnGiai = new JButton("Giải "); 
        btnGiai.setFont(new Font("arial", Font.BOLD, 14)); 
         
        JButton btnXoa = new JButton("Xóa "); 
        btnXoa.setFont(new Font("arial", Font.BOLD, 14)); 
         
        JButton btnThoat = new JButton("Thoát"); 
        btnThoat.setFont(new Font("arial", Font.BOLD, 14)); 
         
        pnWest.add(btnGiai); 
        pnWest.add(Box.createVerticalStrut(10)); 
        pnWest.add(btnXoa); 
        pnWest.add(Box.createVerticalStrut(10)); 
        pnWest.add(btnThoat); 
        pnBorder.add(pnWest, BorderLayout.WEST); 
        pnWest.setBackground(Color.LIGHT_GRAY); 
        //Thiet lap Tieu de cho phan vung tac vu 
        Border southborder 
                = BorderFactory.createLineBorder(Color.RED); 
        TitledBorder southTitleBorder 
                = new TitledBorder(southborder, "Chọn tác vụ"); 
        pnWest.setBorder(southTitleBorder); 
        //Thiet lap mau chu 
        southTitleBorder.setTitleColor(Color.BLUE); 
        
//PHAN VUNG SOUTH-BOTTOM (CHAN TRANG) 
        JPanel pnSouth = new JPanel(); 
        pnSouth.setPreferredSize(new Dimension(0, 30)); 
        pnSouth.setBackground(Color.PINK); 
        JPanel pns1 = new JPanel(); 
        pns1.setBackground(Color.BLUE); 
        pnSouth.add(pns1); 
        JPanel pns2 = new JPanel(); 
        pns2.setBackground(Color.RED); 
        pnSouth.add(pns2); 
        JPanel pns3 = new JPanel(); 
        pns3.setBackground(Color.YELLOW); 
        pnSouth.add(pns3); 
        pnBorder.add(pnSouth, BorderLayout.SOUTH); 
//PHAN VUNG NHAP CAC HE SO 
        //Nhap he so A: 
        JPanel pnCenter = new JPanel(); 
        pnCenter.setLayout(new BoxLayout(pnCenter, BoxLayout.Y_AXIS)); 
        pnBorder.add(pnCenter, BorderLayout.CENTER); 
        Border centerborder = BorderFactory.createLineBorder(Color.RED); 
        TitledBorder centerTitleBorder = new TitledBorder(centerborder, "Nhập 2 số a và b:"); 

        centerTitleBorder.setTitleColor(Color.BLUE); 
         
        pnCenter.setBorder(centerTitleBorder); 
        JPanel pna = new JPanel(); 
        JLabel lbla = new JLabel("nhập a:"); 
        final JTextField txta = new JTextField(15); 
        pna.add(lbla); 
        pna.add(txta); 
        pnCenter.add(pna); 
        //Nhap he so B: 
        JPanel pnb = new JPanel(); 
        JLabel lblb = new JLabel("nhập b:"); 
        final JTextField txtb = new JTextField(15); 
        pnb.add(lblb); 
        pnb.add(txtb); 
        pnCenter.add(pnb); 
        //Phan vung lua chon cac phep toan 
        JPanel pnc = new JPanel(); 
        JPanel pnpheptoan = new JPanel(); 
        pnpheptoan.setLayout(new GridLayout(2, 2)); 
        pnpheptoan.setBorder(new TitledBorder( BorderFactory.createLineBorder(Color.BLACK), "Chọn phép toán:")); 
        final JRadioButton radCong = new JRadioButton("Cộng"); 
        pnpheptoan.add(radCong); 
        final JRadioButton radTru = new JRadioButton("Trừ"); 
        pnpheptoan.add(radTru); 
        final JRadioButton radNhan = new JRadioButton("Nhân"); 
        pnpheptoan.add(radNhan); 
        final JRadioButton radChia = new JRadioButton("Chia"); 
        pnpheptoan.add(radChia); 
        ButtonGroup group = new ButtonGroup(); 
        group.add(radCong); 
        group.add(radTru); 
        group.add(radNhan); 
        group.add(radChia); 
        pnc.add(pnpheptoan); 
        pnCenter.add(pnc); 
        //Phan vung hien thi ket qua 
        JPanel pnkq = new JPanel(); 
        JLabel lblkq = new JLabel("Kết quả:"); 
        final JTextField txtkq = new JTextField(15); 
        pnkq.add(lblkq); 
        pnkq.add(txtkq); 
        pnCenter.add(pnkq); 
        lbla.setPreferredSize(lblkq.getPreferredSize()); 
        lblb.setPreferredSize(lblkq.getPreferredSize()); 
//DANG KE LANG NGHE SU KIEN CHO CAC BUTTON HANH DONG 
        btnThoat.addActionListener(new ActionListener(){ 
            @Override 
            public void actionPerformed(ActionEvent arg0){ 
                int ret = JOptionPane.showConfirmDialog(null, 
                        "Muốn thoát hả?", "Thoát",  
                        JOptionPane.YES_NO_OPTION); 
                if (ret == JOptionPane.YES_OPTION) 
                    System.exit(0); 
            } 
             
        }); 
        btnXoa.addActionListener(new ActionListener(){ 
            @Override 
            public void actionPerformed(ActionEvent e) { 
                txta.setText(""); 
                txtb.setText(""); 
                txtkq.setText(""); 
                txta.requestFocus(); 
            } 
        }); 
        btnGiai.addActionListener(new ActionListener(){ 
            @Override 
            public void actionPerformed(ActionEvent arg0) { 
                String sa = txta.getText(); 
                String sb = txtb.getText(); 
                double a, b; 
                try{ 
                    a = Double.parseDouble(sa); 
                }catch(Exception ex){ 
                    JOptionPane.showMessageDialog(null, 
                            "Sai định dạng đối số a"); 
                    txta.selectAll(); 
                    txta.requestFocus(); 
                    return; 
                } 
                try{ 
                    b = Double.parseDouble(sb); 
                }catch(Exception ex){ 
                    JOptionPane.showMessageDialog(null, 
                            "Sai định dạng đối số b"); 
                    txtb.selectAll(); 
                    txtb.requestFocus(); 
                    return; 
                } 
                double kq = 0; 
                if(radCong.isSelected()){ 
                    kq = (a + b); 
                }else if(radTru.isSelected()){ 
                    kq = (a - b); 
                }else if(radNhan.isSelected()){ 
                    kq = (a * b); 
                }else{ 
                    kq = a/b; 
                } 
txtkq.setText(kq + " "); 
} 
}); 
// 
con.add(pnBorder); 
} 
} 
