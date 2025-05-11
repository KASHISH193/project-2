package bank.management.system;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class Fastcash extends JFrame implements ActionListener {
    JButton deposite, withdrawl, fastcash, ministatement, pinchange, balanceenquiry, exit;

    Fastcash() {
        setLayout(null);
        JLabel text = new JLabel("SELECT WITHDRAWL AMOUNT");
        text.setBounds(170, 270, 500, 35);
        text.setForeground(Color.white);
        text.setFont(new Font("system", Font.BOLD, 17));
        ImageIcon iii3 = new ImageIcon(ClassLoader.getSystemResource("icon/atm6.jpg"));
        Image i4 = iii3.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i5 = new ImageIcon(i4);
        JLabel image2 = new JLabel(i5);
        image2.setBounds(0, 0, 850, 850);
        add(image2);
        image2.add(text);
        deposite = new JButton("RS- 5,000");
        deposite.setBounds(150, 415, 150, 30);
        deposite.addActionListener(this);
        image2.add(deposite);
        withdrawl = new JButton("RS- 10,000");
        withdrawl.setBounds(330, 415, 150, 30);
        withdrawl.addActionListener(this);
        image2.add(withdrawl);
        fastcash = new JButton(" RS- 15,000");
        fastcash.setBounds(150, 450, 150, 30);
        fastcash.addActionListener(this);
        image2.add(fastcash);
        ministatement = new JButton("RS- 20,000");
        ministatement.setBounds(330, 450, 150, 30);
        ministatement.addActionListener(this);
        image2.add(ministatement);
        pinchange = new JButton("RS- 25,000");
        pinchange.setBounds(150, 485, 150, 30);
        pinchange.addActionListener(this);
        image2.add(pinchange);
        balanceenquiry = new JButton("RS- 30,0000");
        balanceenquiry.setBounds(330, 485, 150, 30);
        balanceenquiry.addActionListener(this);
        image2.add(balanceenquiry);
        exit = new JButton("BACK");
        exit.setBounds(400, 520, 80, 30);
        exit.addActionListener(this);
        image2.add(exit);

        setSize(850, 850);
        setLocation(250, 0);
        setUndecorated(true);
        setVisible(true);
        //  setUndecorated(true);

    }

    public static void main(String[] args) {
        new Fastcash();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == exit) {
            setVisible(false);
            new Transections().setVisible(true);
        } else  {
            String amount = ((JButton)e.getSource()).getText().substring(3);
            JOptionPane.showMessageDialog(null, "amount " + amount  +" withdraw successfully");
           setVisible(false);
           new Transections().setVisible(true);
        }

    }
}

