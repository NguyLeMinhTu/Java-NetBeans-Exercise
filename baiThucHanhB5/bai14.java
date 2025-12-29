/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baiThucHanhB5;

/**
 *
 * @author Minh Tú
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author btdtrinh
 */
public class bai14 extends JFrame {
    JButton btnAdd, btnClear, btnExit;
    JTextField txtAccNumber, txtAccName, txtAccMoney;
    JTable tblAcc;
    DefaultTableModel tblModelAcc;

    public bai14() {
        addControls();
        addEvents();
    }

    private void addControls() {
        Container con = getContentPane();
        JPanel pnMain = new JPanel();
        pnMain.setLayout(new BoxLayout(pnMain, BoxLayout.Y_AXIS));
        con.add(pnMain);

        // Account Number
        JPanel pnAccNumber = new JPanel();
        pnAccNumber.setLayout(new FlowLayout(FlowLayout.LEFT));
        JLabel lblAccNumber = new JLabel("Account Number:");
        txtAccNumber = new JTextField(20);
        pnAccNumber.add(lblAccNumber);
        pnAccNumber.add(txtAccNumber);
        pnMain.add(pnAccNumber);

        // Account Name
        JPanel pnAccName = new JPanel();
        pnAccName.setLayout(new FlowLayout(FlowLayout.LEFT));
        JLabel lblAccName = new JLabel("Account Name:");
        txtAccName = new JTextField(20);
        pnAccName.add(lblAccName);
        pnAccName.add(txtAccName);
        pnMain.add(pnAccName);

        // Account Money
        JPanel pnAccMoney = new JPanel();
        pnAccMoney.setLayout(new FlowLayout(FlowLayout.LEFT));
        JLabel lblAccMoney = new JLabel("Account Money:");
        txtAccMoney = new JTextField(20);
        pnAccMoney.add(lblAccMoney);
        pnAccMoney.add(txtAccMoney);
        pnMain.add(pnAccMoney);

        // Align labels
        lblAccName.setPreferredSize(lblAccNumber.getPreferredSize());
        lblAccMoney.setPreferredSize(lblAccNumber.getPreferredSize());

        // Table
        String[] columns = {"Acc Number", "Acc Name", "Acc Money"};
        tblModelAcc = new DefaultTableModel(columns, 0);
        tblAcc = new JTable(tblModelAcc);
        JScrollPane scTable = new JScrollPane(tblAcc);
        scTable.setPreferredSize(new Dimension(350, 100));
        JPanel pnTable = new JPanel(new FlowLayout(FlowLayout.CENTER));
        pnTable.add(scTable);
        pnMain.add(pnTable);

        // Buttons
        JPanel pnButtons = new JPanel();
        pnButtons.setLayout(new FlowLayout(FlowLayout.CENTER));
        btnAdd = new JButton("Add");
        btnClear = new JButton("Clear");
        btnExit = new JButton("Exit");
        pnButtons.add(btnAdd);
        pnButtons.add(btnClear);
        pnButtons.add(btnExit);
        pnMain.add(pnButtons);
    }

    private void addEvents() {
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num = txtAccNumber.getText();
                String name = txtAccName.getText();
                String money = txtAccMoney.getText();
                tblModelAcc.addRow(new Object[]{num, name, money});
            }
        });

        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtAccNumber.setText("");
                txtAccName.setText("");
                txtAccMoney.setText("");
                txtAccName.requestFocus();
            }
        });

        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ret = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Exit", JOptionPane.YES_NO_OPTION);
                if (ret == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });
    }

    public void showWindows() {
        this.setTitle("Minh Tú - demo Account Table");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new bai14().showWindows();
    }
}
