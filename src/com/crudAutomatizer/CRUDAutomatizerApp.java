package com.crudAutomatizer;

import javax.swing.*;

public class CRUDAutomatizerApp {
    private JButton Aceptar;
    private JPanel containerPane;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setContentPane(new CRUDAutomatizerApp().containerPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
