/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package baitapbuoi2;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class Bai1_JCheckBoxDemo extends JFrame {

    public Bai1_JCheckBoxDemo() {
        setTitle("Demo JCheckBox");
        setLayout(new BorderLayout());

        JPanel pn = new JPanel();
        Border bd = BorderFactory.createLineBorder(Color.RED);
        TitledBorder tbd = new TitledBorder(bd, "Fruits");
        tbd.setTitleJustification(TitledBorder.RIGHT);
        pn.setBorder(tbd);

        JCheckBox cb1 = new JCheckBox("Apple", true);
        JCheckBox cb2 = new JCheckBox("Banana");
        JCheckBox cb3 = new JCheckBox("Grape", true);
        JCheckBox cb4 = new JCheckBox("Orange");
        JCheckBox cb5 = new JCheckBox("Pear", true);

        pn.add(cb1);
        pn.add(cb2);
        pn.add(cb3);
        pn.add(cb4);
        pn.add(cb5);

        add(pn, BorderLayout.CENTER);

        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Bai1_JCheckBoxDemo().setVisible(true);
        });
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
