package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.Date;
import javax.swing.JTextField;


public class withdrawl extends JFrame implements ActionListener {
    JTextField amount;


    JButton withdrawl, back;

   withdrawl () {
        setLayout(null);
        ImageIcon iii3 = new ImageIcon(ClassLoader.getSystemResource("icon/atm6.jpg"));
        Image i4 = iii3.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i5 = new ImageIcon(i4);
        JLabel image2 = new JLabel(i5);
        image2.setBounds(0, 0, 900, 900);
        add(image2);
        JLabel text = new JLabel("Enter the amount you want to withdraw ");
        text.setForeground(Color.white);
        text.setFont(new Font("system", Font.BOLD, 16));
        text.setBounds(170, 300, 400, 20);
        image2.add(text);
        amount = new JTextField();
        amount.setFont(new Font("raleway", Font.BOLD, 22));
        amount.setBounds(170, 350, 320, 25);
        image2.add(amount);
        withdrawl = new JButton("withdraw");
        withdrawl.setBounds(355, 500, 150, 30);
        withdrawl.addActionListener(this);
        image2.add(withdrawl);
        back = new JButton("back");
        back.setBounds(355, 535, 150, 30);
        back.addActionListener(this);
        image2.add(back);

        setSize(900, 900);
        setLocation(250, 0);
        setUndecorated(true);
        setVisible(true);
    }


    public static void main(String[] args) {
        new withdrawl();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == withdrawl) {
            String number = amount.getText();
            if (number.equals("")) {
                JOptionPane.showMessageDialog(null, "please Enter the Amount you want to withdraw");
            } else {
                JOptionPane.showMessageDialog(null, "amount "  +number+ " withdraw successfully");
                setVisible(false);
                new Transections().setVisible(true);
            }

        } else if (e.getSource() == back) {
            setVisible(false);
            new Transections().setVisible(true);
        }
    }
}

