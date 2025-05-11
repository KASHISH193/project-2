package bank.management.system;



import javax.swing.*;
import java.awt.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import java.awt.event.*;
import java.util.Random;

import static java.awt.Color.white;

public class SignupThree extends JFrame  implements ActionListener {
    JRadioButton r1 , r2 , r3 , r4;
    JCheckBox c1 ,c2  , c3 , c4 , c5 , c6 , c7;
    JButton submit , cancel;
    String formno;
    SignupThree( String formno){
        this.formno=formno;
        setLayout(null);
        JLabel l1 = new JLabel("PAGE 3: ACCOUNT DETAILS");
        l1.setFont(new Font("raleway" , Font.BOLD , 22));
        l1.setBounds(280 , 40 , 400 , 40);
        l1.setForeground(white);

        add(l1);
        JLabel type = new JLabel("ACCOUNT TYPE");
        type.setFont(new Font("raleway" , Font.BOLD , 22));
        type.setBounds(100 , 140 , 200 , 30);
        type.setForeground(white);

        add(type);
        r1=new JRadioButton("SAVING ACCOUNT");
        r1.setFont(new Font("raleway " , Font.BOLD , 16));
        r1.setBackground(Color.white);
        r1.setBounds(100 , 180 , 200 , 20);


        add(r1);
        r2=new JRadioButton("FIXED DEPOSITE ACCOUNT");
        r2.setFont(new Font("raleway " , Font.BOLD , 16));
        r2.setBackground(Color.white);
        r2.setBounds(350 , 180 , 250  , 20);

        add(r2);
        r3=new JRadioButton("CURRENT ACCOUNT");
        r3.setFont(new Font("raleway " , Font.BOLD , 16));
        r3.setBackground(Color.white);
        r3.setBounds(100 , 220 , 200  , 20);

        add(r3);
        r4=new JRadioButton("RECURRING DEPOSIT ACCOUNT");
        r4.setFont(new Font("raleway " , Font.BOLD , 16));
        r4.setBackground(Color.white);
        r4.setBounds(350 , 220 , 300  , 20);
        add(r4);
        ButtonGroup groupAccount = new ButtonGroup();
        groupAccount.add(r1);
        groupAccount.add(r2);
        groupAccount.add(r3);
        groupAccount.add(r4);
        JLabel card = new JLabel("CARD NUMBER ");
        card.setFont(new Font("raleway" , Font.BOLD , 22));
        card.setBounds(100 , 270 , 200 , 30);
        card.setForeground(white);

        add(card);
        JLabel number = new JLabel("XXXX-XXXX-XXXX-4312");
        number.setFont(new Font("raleway" , Font.BOLD , 22));
        number.setBounds(350, 270 , 250 , 30);
        number.setForeground(white);

        add(number);
        JLabel carddetail = new JLabel("your 16 digit card no");
        carddetail.setFont(new Font("raleway" , Font.PLAIN , 15));
        carddetail.setBounds(100, 300 , 300, 30);
        carddetail.setForeground(white);

        add(carddetail);
        JLabel pin = new JLabel("PIN : ");
        pin.setFont(new Font("raleway" , Font.BOLD , 22));
        pin.setBounds(100 , 350 , 200 , 30);
        pin.setForeground(white);

        add(pin);
        JLabel pnumber = new JLabel("XYZX");
        pnumber.setFont(new Font("raleway" , Font.BOLD , 22));
        pnumber.setBounds(350, 350, 250 , 30);
        pnumber.setForeground(white);

        add(pnumber);
        JLabel pindetail = new JLabel("your 4 digit password");
        pindetail.setFont(new Font("raleway" , Font.PLAIN , 15));
        pindetail.setBounds(100, 370 , 300, 30);
        pindetail.setForeground(white);

        add(pindetail);
        JLabel services = new JLabel("SERVICES REQUIRED : ");
        services.setFont(new Font("raleway" , Font.BOLD , 22));
        services.setBounds(100 , 420, 300 , 30);
        services.setForeground(white);

        add(services);
        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.white);
        c1.setFont(new Font("raleway" , Font.BOLD , 16));
        c1.setBounds(100 , 470 , 200 , 30);
        add(c1);
        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.white);
        c2.setFont(new Font("raleway" , Font.BOLD , 16));
        c2.setBounds(350 , 470 , 200 , 30);
        add(c2);
        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.white);
        c3.setFont(new Font("raleway" , Font.BOLD , 16));
        c3.setBounds(100 , 510 , 200 , 30);
        add(c3);
        c4 = new JCheckBox("Email Alerts");
        c4.setBackground(Color.white);
        c4.setFont(new Font("raleway" , Font.BOLD , 16));
        c4.setBounds(350 , 510 , 200 , 30);
        add(c4);
        c5 = new JCheckBox("Cheque book");
        c5.setBackground(Color.white);
        c5.setFont(new Font("raleway" , Font.BOLD , 16));
        c5.setBounds(100 , 550, 200 , 30);
        add(c5);
        c6 = new JCheckBox("E statement");
        c6.setBackground(Color.white);
        c6.setFont(new Font("raleway" , Font.BOLD , 16));
        c6.setBounds(350 , 550 , 200 , 30);
        add(c6);
        c7 = new JCheckBox("i hereby declares that the above entered details are correct to the best of my knowledge");
        c7.setBackground(Color.white);
        c7.setFont(new Font("raleway" , Font.BOLD , 12));
        c7.setBounds(100 ,590 , 600 , 30);
        add(c7);
        submit = new JButton("submit");
        submit.setBackground(Color.black);
        submit.setForeground(Color.white);
        submit.setFont(new Font("raleway" , Font.BOLD , 14));
        submit.setBounds(440 , 650, 100 , 30);
        add(submit);

        submit.addActionListener(this);
        cancel = new JButton("cancel");
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.white);
        cancel.setFont(new Font("raleway" , Font.BOLD , 14));
        cancel.setBounds(590 , 650 , 100 , 30);
        add(cancel);
        cancel.addActionListener(this);
        ImageIcon iii3= new ImageIcon(ClassLoader.getSystemResource("icon/gray.jpg"));
        Image i4 = iii3.getImage().getScaledInstance(900, 870, Image.SCALE_DEFAULT);
        ImageIcon i5=new ImageIcon(i4);
        JLabel image2 = new JLabel(i5);
        image2.setBounds(0 , 0, 900, 870 );
        add(image2);
        setSize(900 , 870);
        setLocation(350 , 0);
        setUndecorated(true);
        setVisible(true);


    }
    public static void main(String[] args) {
        new SignupThree("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== submit) {
            String accounttype = null;

            if (r1.isSelected()) {
                accounttype = "savng account";


            } else if (r2.isSelected()) {
                accounttype = "fixed deposite account";

            } else if (r3.isSelected()) {
                accounttype = "current account";

            } else if (r4.isSelected()) {
                accounttype = "reccuring deposite accoynt";

            }
            Random random = new Random();
            String cardnumber = " " + Math.abs((random.nextLong() % 90000000L) + 5040936000000000L);
            String pinnumber = " " + Math.abs((random.nextLong() % 9000L) + 100L);
            String facility = "";
            if (c1.isSelected()) {
                facility = facility + "ATM CARD";

            } else if (c2.isSelected()) {
                facility = facility + " Internet Banking";

            } else if (c3.isSelected()) {
                facility = facility + " Mobile banking";

            } else if (c4.isSelected()) {
                facility = facility + " Email alerts";

            } else if (c5.isSelected()) {
                facility = facility + "cheque box";

            } else if (c6.isSelected()) {
                facility = facility + " E-statement";

            }


        }

         if (e.getSource()==cancel){
setVisible(false);
new Login().setVisible(true);
        }
        else if (e.getSource()==submit){
             JOptionPane.showMessageDialog(null, "your information has been saved");
             setVisible(false);
             new Deposite().setVisible(true);

             //setVisible(false);
          //  new Login().setVisible(true);
        }
    }
}

