import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class try1 extends JFrame implements ActionListener
{
    JLabel l1;
    JTextField t1;
    JLabel l2;
    JTextField t2;
    JLabel l3;
    JTextField t3;
    JButton b1,b2,b3,b4,b5;

    public try1()
    {
        l1 = new JLabel("Enter First no.");
        t1 = new JTextField(20);
        l2 = new JLabel("Enter Second no.");
        t2 = new JTextField(20);
        l3 = new JLabel("Result");
        t3 = new JTextField(20);
        b1 = new JButton("+");
        b2 = new JButton("-");
        b3 = new JButton("*");
        b4 = new JButton("/");
        b5 = new JButton("CLEAR");
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae)
    {
        int num1= Integer.parseInt(t1.getText());
        int num2= Integer.parseInt(t2.getText());
        int result = 0;
        if (ae.getActionCommand()==("+"))
        {
            result = num1+num2;
            t3.setText(" "+result);
        }
        if (ae.getActionCommand()==("-"))
        {
            result = num1-num2;
            t3.setText(" "+result);
        }
        if (ae.getActionCommand()==("*"))
        {
            result = num1*num2;
            t3.setText(" "+result);
        }
        if (ae.getActionCommand()==("/"))
        {
            result = num1/num2;
            t3.setText(" "+result);
        }
        if (ae.getActionCommand()==("CLEAR"))
        {
            t1.setText("");
            t2.setText("");
            t3.setText("");
        }
    }
    public static void main(String args[])
    {
        new try1();
    }
}