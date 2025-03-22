package view;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.*;
import view.LoginForm;
import java.awt.BorderLayout;
public class MainForm extends JFrame {
    public MainForm() {
        setTitle("Quản lý sinh viên");
        setSize(894, 767);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Tạo giao diện cơ bản
        JPanel panel = new JPanel();

        getContentPane().add(panel);
        panel.setLayout(new BorderLayout(0, 0));
        
        JPanel panel_1 = new JPanel();
        panel.add(panel_1, BorderLayout.NORTH);
    }
}
