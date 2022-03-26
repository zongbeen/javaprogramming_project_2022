import java.awt.*;
import javax.swing.*;

public class LoginFrame extends JFrame {
    LoginFrame() {
        setTitle("Login");

        setLayout(new BorderLayout(10,10));
        showNorth();
        showCenter();
        //showSouth();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,220);
        setVisible(true);
    }


    private void showNorth() {
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel panel = new JPanel(new GridLayout(2,0));

        JLabel l1 = new JLabel("아이디");
        JLabel l2 = new JLabel("비밀번호");

        JTextField t1 = new JTextField(10);
        JTextField t2 = new JTextField(10);
        t2.setEnabled(false);

        p1.add(l1);
        p1.add(t1);
        p2.add(l2);
        p2.add(t2);
        panel.add(p1);
        panel.add(p2);

        add(panel, BorderLayout.NORTH);
    }
    private void showCenter() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton login = new JButton("로그인");

        panel.add(login);
        add(panel, BorderLayout.CENTER);

    }
    /*private void showSouth() {
        JPanel panel = new JPanel();

        JTextArea result = new JTextArea(30,20);
    }*/
}