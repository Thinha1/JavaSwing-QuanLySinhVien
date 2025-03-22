package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JButton btnLogin;

    public LoginForm() {
        setTitle("Đăng Nhập");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Tạo giao diện
        JPanel panel = new JPanel();
        panel.setLayout(null);
        
        JLabel lblUsername = new JLabel("Tài khoản:");
        lblUsername.setBounds(20, 30, 80, 25);
        panel.add(lblUsername);
        
        txtUsername = new JTextField();
        txtUsername.setBounds(100, 30, 150, 25);
        panel.add(txtUsername);
        
        JLabel lblPassword = new JLabel("Mật khẩu:");
        lblPassword.setBounds(20, 70, 80, 25);
        panel.add(lblPassword);
        
        txtPassword = new JPasswordField();
        txtPassword.setBounds(100, 70, 150, 25);
        panel.add(txtPassword);
        
        btnLogin = new JButton("Đăng Nhập");
        btnLogin.setBounds(100, 110, 150, 30);
        panel.add(btnLogin);
        
        add(panel);
        
        // Xử lý sự kiện nút đăng nhập
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = txtUsername.getText();
                String password = new String(txtPassword.getPassword());
                
                // Kiểm tra thông tin đăng nhập
                if (username.equals("admin") && password.equals("1234")) {
                    JOptionPane.showMessageDialog(null, "Đăng nhập thành công!");
                    
                    // Hiển thị MainForm và ẩn LoginForm
                    MainForm mainForm = new MainForm();
                    mainForm.setVisible(true);
                    dispose(); // Đóng LoginForm
                } else {
                    JOptionPane.showMessageDialog(null, "Sai tài khoản hoặc mật khẩu!");
                }
            }
        });
    }
}
