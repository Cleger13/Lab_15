import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CountWin extends JFrame{
    private JLabel lb1;
    private TextField tf1;
    private  JButton bt1, bt2;
    private int count = 0;

    public CountWin(){
        setBounds(850, 300, 300, 250);
        setTitle("Счетчик");
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        lb1 = new JLabel("Число");
        lb1.setBounds(50, 50, 50, 30);

        tf1 = new TextField("0");
        tf1.setBounds(90, 55, 50, 25);
        tf1.setEditable(false);

        bt1 = new JButton("+1");
        bt2 = new JButton("-1");
        bt1.setBounds(160, 55, 50, 30);
        bt2.setBounds(160, 85, 50, 30);

        bt1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (count < 3){
                    count++;
                    tf1.setText(String.valueOf(count));
                }
            }
        });

        bt2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (count > -5){
                    count--;
                    tf1.setText(String.valueOf(count));
                }
            }
        });

        add(lb1);
        add(tf1);
        add(bt1);
        add(bt2);
        setVisible(true);
    }
    public static void main(String[] args){
        new CountWin();
    }
}