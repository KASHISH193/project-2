package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class Transections extends JFrame implements ActionListener {
    JButton deposite, withdrawl, fastcash, ministatement, pinchange, balanceenquiry, exit;

    Transections() {
        setLayout(null);
        JLabel text = new JLabel("please select your transection");
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
        deposite = new JButton("deposite");
        deposite.setBounds(150, 415, 150, 30);
        deposite.addActionListener(this);
        image2.add(deposite);
        withdrawl = new JButton("cash withdrawl");
        withdrawl.setBounds(330, 415, 150, 30);
        withdrawl.addActionListener(this);
        image2.add(withdrawl);
        fastcash = new JButton("Fast cash");
        fastcash.setBounds(150, 450, 150, 30);
        fastcash.addActionListener(this);
        image2.add(fastcash);
        ministatement = new JButton("mini statement");
        ministatement.setBounds(330, 450, 150, 30);
        ministatement.addActionListener(this);
        image2.add(ministatement);
        pinchange = new JButton("pin change");
        pinchange.setBounds(150, 485, 150, 30);
        pinchange.addActionListener(this);
        image2.add(pinchange);
        balanceenquiry = new JButton("Balance Enquiry");
        balanceenquiry.setBounds(330, 485, 150, 30);
        balanceenquiry.addActionListener(this);
        image2.add(balanceenquiry);
        exit = new JButton("EXIT");
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
        new Transections();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == exit) {
            //System.exit(0);
            setVisible(false);
            new Login().setVisible(true);
        } else if (e.getSource() == deposite) {
            setVisible(false);
            new Deposite().setVisible(true);
        }
        else if (e.getSource() == withdrawl) {
            setVisible(false);
            new withdrawl().setVisible(true);
        }
        else if (e.getSource() == fastcash) {
            setVisible(false);
            new Fastcash().setVisible(true);
        }
        else if (e.getSource() == pinchange) {
            setVisible(false);
            new Pinchange().setVisible(true);
        }
        else if (e.getSource() ==balanceenquiry) {
            setVisible(false);
            new Balanceenquiry().setVisible(true);
        }
        else if (e.getSource() ==ministatement) {
            setVisible(false);
            new Ministatement().setVisible(true);
        }

    }
}
