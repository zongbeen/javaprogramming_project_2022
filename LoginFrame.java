import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class LoginFrame extends JFrame {
    LoginFrame() {
        setTitle("Login");
        setLayout(new BorderLayout(10,10));
        showNorth();
        showCenter();
        showSouth();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000,1000);
        setVisible(true);
    }


    public void showNorth() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel label = new JLabel("JAVA POS");
        Font font = new Font("D2Coding ligature", Font.BOLD,80);
        label.setFont(font);
        label.setForeground(Color.BLUE);
        panel.add(label);
        add(panel, BorderLayout.NORTH);

    }
    public void showCenter() {
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel panel = new JPanel(new GridLayout(2,0));

        JLabel l1 = new JLabel(" 아이디 ");
        JLabel l2 = new JLabel("비밀번호");

        JTextField t1 = new JTextField(10);
        JTextField t2 = new JTextField(10);
        t2.setEnabled(true);

        p1.add(l1);
        p1.add(t1);
        p2.add(l2);
        p2.add(t2);
        panel.add(p1);
        panel.add(p2);

        add(panel, BorderLayout.CENTER);

    }
    public void showSouth() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton login = new JButton("로그인");
        login.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                setVisible(false);
                new OrderFrame();
            }
        });
        panel.add(login);
        add(panel, BorderLayout.SOUTH);

    }
    public static void main(String[] args) {
        new LoginFrame();
    }
}