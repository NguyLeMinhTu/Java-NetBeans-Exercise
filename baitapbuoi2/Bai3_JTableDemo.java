/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package baitapbuoi2;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Admin
 */
public class Bai3_JTableDemo extends javax.swing.JFrame {

    public Bai3_JTableDemo() {
        setTitle("Demo JTable");

        // Dữ liệu
        String[][] data = {
            {"Nguyễn Văn A", "0932907666", "Lecture"},
            {"Nguyễn Văn B", "09191999000", "IT"},
            {"Nguyễn Văn C", "0989000111", "Marketing"}
        };

        // Tên cột
        String[] columns = {"Họ và Tên", "Số điện thoại", "Nghề nghiệp"};

        // Tạo table model
        DefaultTableModel model = new DefaultTableModel(data, columns);
        JTable table = new JTable(model);

        // Thêm vào scroll pane
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);

        setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> {
            new Bai3_JTableDemo().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
