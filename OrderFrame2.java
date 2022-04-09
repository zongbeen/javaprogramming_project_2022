import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.*;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.*;
import java.util.Arrays;

public class OrderFrame2 extends JFrame {
    //private Image backgroundImage = new ImageIcon("images/backgroundimage2.jpg").getImage();
    JButton button1 = new JButton();
    JButton button2 = new JButton();
    JButton button3 = new JButton();
    JButton button4 = new JButton();
    JButton button5 = new JButton();
    JButton button6 = new JButton();


    String columnNames[] = {"No.", "품명", "수량", "가격"};
    String check[] = {};
    Object rowdata[][] = {
            {"", "", "", ""}, {"", "", "", ""}, {"", "", "", ""}, {"", "", "", ""}, {"", "", "", ""}, {"", "", "", ""},
            {"", "", "", ""}, {"", "", "", ""}, {"", "", "", ""}, {"", "", "", ""}, {"", "", "", ""}, {"", "", "", ""},
            {"", "", "", ""}, {"", "", "", ""}, {"", "", "", ""}, {"", "", "", ""}, {"", "", "", ""}, {"", "", "", ""}
    };

    JTable table = new JTable(rowdata, columnNames);

    JScrollPane scrollPane = new JScrollPane(table);


    public OrderFrame2() {
        choice();
        setTitle("Menu");
        setSize(1000, 1000);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        scrollPane.setLocation(10, 10);
        scrollPane.setSize(500, 500);

        button1.setBounds(525, 50, 100, 80);
        button1.setText("아메리카노");

        button2.setBounds(635, 50, 100, 80);
        button2.setText("카페라떼");

        button3.setBounds(745, 50, 100, 80);
        button3.setText("카페모카");

        button4.setBounds(855, 50, 100, 80);
        button4.setText("바닐라라떼");

        button5.setBounds(525, 140, 100, 80);
        button5.setText("<HTML><body style='text-align:center;'>카라멜<br>마키아또</body></HTML>");

        button6.setBounds(855, 700, 100, 80);
        button6.setText("뒤로가기");

        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);

        add(scrollPane);
        setVisible(true);
    }

    /*public void paint(Graphics g) {
        g.drawImage(backgroundImage, 0, 0, null);
    }*/

    public void choice() {
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
            }
            @Override
            public void mouseExited(MouseEvent e) {
            }
            @Override
            public void mousePressed(MouseEvent e) {
                for (int i = 0; i <= 10; i++) {
                    if (table.getValueAt(i, 0) == "") {
                        table.setValueAt(i + 1, i, 0);
                        table.setValueAt(button1.getText(), i, 1);
                        table.setValueAt(1, i, 2);
                        table.setValueAt(2000, i, 3);
                        break;
                    } else if (table.getValueAt(i, 1) == button1.getText()) {
                        int count = (int) table.getValueAt(i, 2);
                        table.setValueAt(count + 1, i, 2);
                        int price = (int) table.getValueAt(i,3);
                        table.setValueAt(price + 2000, i, 3);
                        break;
                    }
                }
            }
        });

        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
            }
            @Override
            public void mouseExited(MouseEvent e) {
            }
            @Override
            public void mousePressed(MouseEvent e) {
                for (int i = 0; i <= 10; i++) {
                    if (table.getValueAt(i, 0) == "") {
                        table.setValueAt(i + 1, i, 0);
                        table.setValueAt(button2.getText(), i, 1);
                        table.setValueAt(1, i, 2);
                        table.setValueAt(3000, i, 3);
                        break;
                    } else if (table.getValueAt(i, 1) == button2.getText()) {
                        int count = (int) table.getValueAt(i, 2);
                        table.setValueAt(count + 1, i, 2);
                        int price = (int) table.getValueAt(i,3);
                        table.setValueAt(price + 3000, i, 3);
                        break;
                    }
                }
            }
        });

        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
            }
            @Override
            public void mouseExited(MouseEvent e) {
            }
            @Override
            public void mousePressed(MouseEvent e) {
                for (int i = 0; i <= 10; i++) {
                    if (table.getValueAt(i, 0) == "") {
                        table.setValueAt(i + 1, i, 0);
                        table.setValueAt(button3.getText(), i, 1);
                        table.setValueAt(1, i, 2);
                        table.setValueAt(3500, i, 3);
                        break;
                    } else if (table.getValueAt(i, 1) == button3.getText()) {
                        int count = (int) table.getValueAt(i, 2);
                        table.setValueAt(count + 1, i, 2);
                        int price = (int) table.getValueAt(i,3);
                        table.setValueAt(price + 3500, i, 3);
                        break;
                    }
                }
            }
        });

        button4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
            }
            @Override
            public void mouseExited(MouseEvent e) {
            }
            @Override
            public void mousePressed(MouseEvent e) {
                for (int i = 0; i <= 10; i++) {
                    if (table.getValueAt(i, 0) == "") {
                        table.setValueAt(i + 1, i, 0);
                        table.setValueAt(button4.getText(), i, 1);
                        table.setValueAt(1, i, 2);
                        table.setValueAt(4000, i, 3);
                        break;
                    } else if (table.getValueAt(i, 1) == button4.getText()) {
                        int count = (int) table.getValueAt(i, 2);
                        table.setValueAt(count + 1, i, 2);
                        int price = (int) table.getValueAt(i,3);
                        table.setValueAt(price + 4000, i, 3);
                        break;
                    }
                }
            }
        });

        button5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
            }
            @Override
            public void mouseExited(MouseEvent e) {
            }
            @Override
            public void mousePressed(MouseEvent e) {
                for (int i = 0; i <= 10; i++) {
                    if (table.getValueAt(i, 0) == "") {
                        table.setValueAt(i + 1, i, 0);
                        table.setValueAt(button5.getText(), i, 1);
                        table.setValueAt(1, i, 2);
                        table.setValueAt(4000, i, 3);
                        break;
                    } else if (table.getValueAt(i, 1) == button5.getText()) {
                        int count = (int) table.getValueAt(i, 2);
                        table.setValueAt(count + 1, i, 2);
                        int price = (int) table.getValueAt(i,3);
                        table.setValueAt(price + 4000, i, 3);
                        break;
                    }
                }
            }
        });

        button6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
            }
            @Override
            public void mouseExited(MouseEvent e) {
            }
            @Override
            public void mousePressed(MouseEvent e) {
                setVisible(false);
                new OrderFrame();
            }
        });

    }
}