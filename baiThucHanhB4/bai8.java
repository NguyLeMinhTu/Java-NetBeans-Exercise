/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baiThucHanhB4;

import java.awt.Button; 
import java.awt.Color; 
import java.awt.FlowLayout; 
import java.awt.Frame; 
import java.awt.HeadlessException; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import java.awt.event.WindowAdapter; 
import java.awt.event.WindowEvent; 
  
/** 
 * 
 * @author btdtrinh 
 */ 
public class bai8 extends Frame implements 
ActionListener{ 
    Button btnRed, btnGreen, btnYellow; 
  
    public bai8(String title) throws HeadlessException { 
        super(title); 
         
        btnGreen = new Button("Green"); 
        btnYellow = new Button("Yellow"); 
        btnRed = new Button("Red"); 
         
        setLayout(new FlowLayout()); 
        add(btnGreen); 
        add(btnYellow); 
        add(btnRed); 
         
        btnGreen.addActionListener(this); 
        btnYellow.addActionListener(this); 
        btnRed.addActionListener(this); 
    } 
     
    @Override 
    public void actionPerformed(ActionEvent e) { 
        String cmd = e.getActionCommand(); 
        if(cmd.equals("Green")){ 
            setBackground(Color.GREEN); 
        }else if(cmd.equals("Yellow")){ 
            setBackground(Color.YELLOW); 
        }else{ 
            setBackground(Color.RED); 
        } 
    } 
     
    public static void main(String[] args) { 
        bai8 bai8 = new bai8("MinhTu demo JButton Background"); 
        bai8.setSize(350, 150); 
        //Thiet lap hanh dong nhan nut thoat de tat chuong trinh 
        bai8.addWindowListener(new WindowAdapter(){ 
            
        @Override 
        public void windowClosing(WindowEvent e) { 
        System.exit(0); 
        } 
       }); 
        bai8.setVisible(true); //Cho phep hien thi    
        bai8.setLocationRelativeTo(null); 
    } 
} 
