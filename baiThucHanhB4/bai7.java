/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baiThucHanhB4;

import java.awt.event.*; 
import javax.swing.*; 

public class bai7 extends JFrame{ 
public bai7(){ 
 
        JPanel pn = new JPanel(); 
        pn.setLayout(new BoxLayout(pn, BoxLayout.Y_AXIS)); 
        pn.setBorder(BorderFactory.createTitledBorder("Lựa chọn HĐH yêu thích:")); 
        //Cretae JRadionButton 
        JRadioButton rdLinux = new JRadioButton("Linux"); 
        JRadioButton rdWindows = new JRadioButton("Windows"); 
        JRadioButton rdMacOS = new JRadioButton("MacOS"); 
        //Gom nhom 3 RadioButton vao ButtonGroup 
        ButtonGroup bgr = new ButtonGroup(); 
        bgr.add(rdLinux); 
        bgr.add(rdWindows); 
        bgr.add(rdMacOS); 
        //DANG KY LANG NGHE SU KIEN CHO CAC JRadioButton 
        ActionListener listener = new ActionListener(){ 
            @Override 
            public void actionPerformed(ActionEvent e) { 
                if(e.getSource() == rdLinux){ 
                    JOptionPane.showMessageDialog(null,  
                            "Linux được chọn"); 
                }if(e.getSource() == rdWindows){ 
                    JOptionPane.showMessageDialog(null,  
                            "Windows được chọn"); 
                }if(e.getSource() == rdMacOS){ 
                    JOptionPane.showMessageDialog(null,  
                            "MacOS được chọn"); 
                } 
            } 
        }; 
        rdLinux.addActionListener(listener); 
        rdWindows.addActionListener(listener); 
        rdMacOS.addActionListener(listener); 
        //Add the 3 RadioButton into the panel 
        pn.add(rdLinux); 
        pn.add(rdWindows); 
        pn.add(rdMacOS); 
        // 
        this.add(pn); 
    } 
    public void showWindow(){ 
        setTitle("MinhTu JRadio Môn học lựa chọn"); 
        setSize(400, 150); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setLocationRelativeTo(null); 
        setVisible(true);         
    } 
    public static void main(String[] args) { 
        new bai7().showWindow(); 
    } 
} 
