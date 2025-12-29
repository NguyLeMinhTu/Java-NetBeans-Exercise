/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baiThucHanhB5;
/**
 *
 * @author Minh Tú
 */
import java.awt.Button;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class bai13 extends JFrame{
JTextField txtTen;
JTextArea txtDiaChi;
JButton btnOK, btnCancel, btnRefresh;
JCheckBox chkDiBoi, chkDiXemPhim, chkKhac;
JRadioButton radNam, radNu, radChuaXacDinh;
ButtonGroup groupGioiTinh;
    public bai13(){
        addControls();
        addEvents();
    }
    public void showWindows(){
        this.setTitle("MinhTu - demo Border&JTextArea_CheckBoxRadio");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
 
    }
    public static void main(String[] args) {
        new bai13().showWindows();
    }
 
    private void addControls() {
        Container con = getContentPane();
        JPanel pnMain = new JPanel();
        pnMain.setLayout(new BoxLayout(pnMain, BoxLayout.Y_AXIS));
        con.add(pnMain);
 
        JPanel pnThongTin = new JPanel();
        pnMain.add(pnThongTin);
        pnThongTin.setLayout(new BoxLayout(pnThongTin,
BoxLayout.Y_AXIS));
//NHAP TEN
        JPanel pnTen = new JPanel();
        pnTen.setLayout(new FlowLayout());
        JLabel lblTen = new JLabel("Nhập tên: ");
        txtTen = new JTextField(15);
 
        pnTen.add(lblTen);
        pnTen.add(txtTen);
        pnThongTin.add(pnTen);
//NHAP DIA CHI
 JPanel pnDiaChi = new JPanel();
        pnDiaChi.setLayout(new FlowLayout());
        JLabel lblDiaChi = new JLabel("Địa Chỉ:");
        txtDiaChi = new JTextArea(3, 15);
 
        txtDiaChi.setWrapStyleWord(true);
        txtDiaChi.setLineWrap(true);
 
        JScrollPane sc = new JScrollPane(txtDiaChi,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        
        pnDiaChi.add(lblDiaChi);
        pnDiaChi.add(sc);
        pnThongTin.add(pnDiaChi);
//THIET LAP TIEU DE CHO PHAN THONG TIN
        Border borderThongTin = BorderFactory.createLineBorder(Color.BLUE);
        TitledBorder borderTitleThongtin = new TitledBorder(borderThongTin, "Thông tin:");
        pnThongTin.setBorder(borderTitleThongtin);
        borderTitleThongtin.setTitleColor(Color.RED);
        borderTitleThongtin.setTitleJustification(TitledBorder.RIGHT);
 
//PHAN SOTHICH - GIOITINH
        JPanel pnSoThichVaGioiTinh = new JPanel();
 
        // pnSoThichVaGioiTinh.setLayout(new BoxLayout(pnSoThichVaGioiTinh, BoxLayout.X_AXIS));
        pnSoThichVaGioiTinh.setLayout(new GridLayout(1, 2));
        
        JPanel pnSoThich = new JPanel();
        pnSoThich.setPreferredSize(new Dimension(200, 100));
 
        Border borderSoThich = BorderFactory.createLineBorder(Color.RED);
        TitledBorder titleBorderSoThich = new TitledBorder(borderSoThich, "Sở thích");
        pnSoThich.setBorder(titleBorderSoThich);
 
        pnSoThich.setLayout(new BoxLayout(pnSoThich,BoxLayout.Y_AXIS));
        chkDiBoi = new JCheckBox("Đi bơi");
        chkDiXemPhim = new JCheckBox("Đi xem phim");
        chkKhac = new JCheckBox("Khác");
        
        pnSoThich.add(chkDiBoi);
        pnSoThich.add(chkDiXemPhim);
        pnSoThich.add(chkKhac);
        
        pnSoThichVaGioiTinh.add(pnSoThich);
 
        //
 JPanel pnGioiTinh = new JPanel();
 pnGioiTinh.setPreferredSize(new Dimension(100, 50));
 
        Border borderGioiTinh = BorderFactory.createLineBorder(Color.RED);
        TitledBorder titleBorderGioiTinh = new TitledBorder(borderGioiTinh, "Giới tính");
        pnGioiTinh.setBorder(titleBorderGioiTinh);
 
        pnGioiTinh.setLayout(new BoxLayout(pnGioiTinh, BoxLayout.Y_AXIS));
        radNam = new JRadioButton("Nam");
        radNu = new JRadioButton("Nữ");
        radChuaXacDinh = new JRadioButton("Chưa xác định");
        
        groupGioiTinh = new ButtonGroup();
        groupGioiTinh.add(radNam);
        groupGioiTinh.add(radNu);
        groupGioiTinh.add(radChuaXacDinh);
        
        pnGioiTinh.add(radNam);
        pnGioiTinh.add(radNu);
        pnGioiTinh.add(radChuaXacDinh);
        
        pnSoThichVaGioiTinh.add(pnGioiTinh);
        pnMain.add(pnSoThichVaGioiTinh);
 
        JPanel pnOk = new JPanel();
        //pnOk.setLayout(new FlowLayout(FlowLayout.RIGHT));
        btnOK = new JButton("OK");
        btnOK.setFont(new Font("VNI", Font.BOLD,13));
        
        btnRefresh = new JButton("Refresh");
        btnRefresh.setFont(new Font("VNI", Font.BOLD,13));
        
        btnCancel = new JButton("Cancel");
        btnCancel.setFont(new Font("VNI", Font.BOLD,13));
        
        pnOk.add(btnOK);
        pnOk.add(btnRefresh);
        pnOk.add(btnCancel);
        
        pnMain.add(pnOk);
 
        lblDiaChi.setPreferredSize(lblTen.getPreferredSize());
    }
 
    private void addEvents() {
        btnOK.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String msg = "";
                msg += "Họ Tên:" +txtTen.getText() + "\n";
                msg += "Địa chỉ: " +txtDiaChi.getText() + "\n";
                
                String soThich = "Sở thích: ";
                if(chkDiBoi.isSelected()){
                    soThich += chkDiBoi.getText() + ", ";
                }
                if(chkDiXemPhim.isSelected()){
                    soThich += chkDiXemPhim.getText() + ", ";
                }
                if(chkKhac.isSelected()){
                    soThich += chkKhac.getText() + ", ";
                }
                if (soThich.endsWith(", ")) {
                    soThich = soThich.substring(0, soThich.length() - 2);
                }
                soThich += "\n";
                msg += soThich;
                
                String gioiTinh = "Giới Tính: ";
                if(radNam.isSelected())
                    gioiTinh += radNam.getText() + "\n";
                else if(radNu.isSelected())
                    gioiTinh += radNu.getText() + "\n";
                else
                    gioiTinh += radChuaXacDinh.getText() + "\n";
                msg += gioiTinh;
                
                JOptionPane.showMessageDialog(null, msg);
                
            }
        });
        btnRefresh.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                txtTen.setText("");
                txtDiaChi.setText("");
                
                chkDiBoi.setSelected(false);
                chkDiXemPhim.setSelected(false);
                chkKhac.setSelected(false);
                
                radChuaXacDinh.setSelected(true);
                
            }
        });
        btnCancel.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        }
        );
    }
    
}