package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Balanceenquiry extends JFrame implements ActionListener {
JButton back;
    long random;

    Balanceenquiry()
    {
       setLayout(null);
        ImageIcon iii3 = new ImageIcon(ClassLoader.getSystemResource("icon/atm6.jpg"));
        Image i4 = iii3.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i5 = new ImageIcon(i4);
        JLabel image2 = new JLabel(i5);
        image2.setBounds(0, 0, 850, 850);
        add(image2);

         back=new JButton("Back");
         back.setBounds(355 , 520, 150 , 30);
         back.addActionListener(this);
         image2.add(back);
        Random ran= new Random();
        random =Math.abs((ran.nextLong()%90000L)+10000L);
        JLabel formno= new JLabel("your available balance is :" + random);
        formno.setFont(new Font("Raleway" , Font.BOLD , 18));
        formno.setBounds(140 , 300, 600 , 40);
        formno.setForeground(Color.white);
        image2.add(formno);

        setSize(850, 850);
        setLocation(250, 0);
        setUndecorated(true);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Balanceenquiry();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==back) {


            setVisible(false);
            new Transections().setVisible(true);
        }
    }
}
