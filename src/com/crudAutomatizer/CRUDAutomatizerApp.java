package com.crudAutomatizer;

import javax.swing.*;

public class CRUDAutomatizerApp {
    private JPanel containerPane;
    private JLabel PathLabel;
    private JLabel ClassLabel;
    private JLabel TestLabel;
    private JButton button1;
    private JButton button2;
    private JCheckBox checkBox1;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setContentPane(new CRUDAutomatizerApp().containerPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
