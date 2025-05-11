package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Color.white;

public class Pinchange extends JFrame implements ActionListener {
    JLabel pintext;
    JLabel repintext;
    JButton change, back;
    JPasswordField pin2 , pin3 ;
    JTextField repin , pin;

    Pinchange() {
        setLayout(null);
        ImageIcon iii3 = new ImageIcon(ClassLoader.getSystemResource("icon/atm6.jpg"));
        Image i4 = iii3.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i5 = new ImageIcon(i4);
        JLabel image2 = new JLabel(i5);
        image2.setBounds(0, 0, 900, 900);
        add(image2);
        JLabel text = new JLabel(" CHANGE YOUR PIN ");
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setBounds(250, 280, 500, 35);
        text.setForeground(Color.white);
        image2.add(text);
        pintext = new JLabel(" NEW PIN:");
        pintext.setFont(new Font("System", Font.BOLD, 15));
        pintext.setBounds(165, 320, 180, 25);
        pintext.setForeground(Color.white);
        image2.add(pintext);
        pin2=new JPasswordField();
        pin2.setFont(new Font("Raleway" , Font.BOLD , 25));
        pin2.setBounds(330 , 320 , 180 , 25);
        image2.add(pin2);
         pin = new JTextField();
        pin.setBounds(330, 320, 180, 25);
        image2.add(pin);

        repintext = new JLabel(" RE-ENTER NEW PIN: ");
        repintext.setFont(new Font("System", Font.BOLD, 14));
        repintext.setBounds(165, 360, 180, 25);
        repintext.setForeground(Color.white);
        image2.add(repintext);
        pin3=new JPasswordField();
        pin3.setFont(new Font("Raleway" , Font.BOLD , 25));
        pin3.setBounds(330 , 320 , 180 , 25);
        image2.add(pin3);
        repin = new JTextField();
        repin.setBounds(330, 360, 180, 25);
        image2.add(repin);

        change = new JButton("CHANGE");
        change.setBounds(355, 485, 150, 30);
        change.setBackground(white);
        change.addActionListener(this);
        image2.add(change);
        back = new JButton("BACK");
        back.setBounds(355, 520, 150, 30);
        back.setBackground(white);
        back.addActionListener(this);
        image2.add(back);
        ButtonGroup statusgroup = new ButtonGroup();
        statusgroup.add(change);
        statusgroup.add(back);


        setSize(900, 900);
        setLocation(250, 0);
        setUndecorated(true);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Pinchange().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if(pin.equals("")|| repin.equals("")){
            JOptionPane.showMessageDialog(null, "please enter pin");

        }

      else  if (e.getSource() == change) {
            JOptionPane.showMessageDialog(null, "your passwor has been changed");

            setVisible(false);
            new Transections().setVisible(true);
        }
        else if (e.getSource() == back) {
            setVisible(false);
            new Transections().setVisible(true);
        }

    }
}




