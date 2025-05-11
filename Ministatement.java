package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import static java.awt.Color.black;



public class Ministatement extends JFrame implements ActionListener {
    long random;
    long random2 , random3 , random4 , random5 , random6;
    JButton back;
    Ministatement(){
        setLayout(null);
        JLabel text=new JLabel("ALHABIB-BANK");
        text.setFont(new Font("Raleway" , Font.BOLD, 18));
        text.setBounds(130 , 20 , 200, 20);
        add(text);
        JLabel text2=new JLabel("************************");
        text2.setFont(new Font("Raleway" , Font.BOLD, 18));
        text2.setBounds(115 , 50 , 200, 20);
        add(text2);
        JLabel card = new JLabel("CARD NUMBER:");
        card.setFont(new Font("raleway" , Font.BOLD , 15));
        card.setBounds(50 , 100 , 200 , 30);
        card.setForeground(black);
        add(card);
        Random ran= new Random();
        random =Math.abs((ran.nextLong()%9000L)+1000L);
        Random ran2= new Random();
        random2 =Math.abs((ran2.nextLong()%9000L)+1000L);
        JLabel formno= new JLabel( random + "XXXXXXXX"+ random2);
        formno.setFont(new Font("Raleway" , Font.BOLD , 15));
        formno.setBounds(180, 100, 200 , 30);
        formno.setForeground(black);
        add(formno);
        random =Math.abs((ran.nextLong()%9000L)+1000L);
        Random ran3= new Random();
        random3 =Math.abs((ran3.nextLong()%9000L)+1000L);
        JLabel statement = new JLabel("sun Apr 03 14:17:36 IST 2023      Deposite        " + random3);
        statement.setFont(new Font("raleway" , Font.BOLD , 13));
        statement.setBounds(50 , 200 , 600 , 30);
        statement.setForeground(black);
        add(statement);

        random =Math.abs((ran.nextLong()%9000L)+1000L);
        Random ran4= new Random();
        random4 =Math.abs((ran4.nextLong()%9000L)+1000L);
        JLabel statement2 = new JLabel("wed june 06 12:13:36 IST 2023    withdrawl      " + random4);
        statement2.setFont(new Font("raleway" , Font.BOLD , 13));
        statement2.setBounds(50 , 230 , 600 , 30);
        statement2.setForeground(black);
        add(statement2);

        random =Math.abs((ran.nextLong()%9000L)+1000L);
        Random ran5= new Random();
        random5 =Math.abs((ran4.nextLong()%9000L)+1000L);
        JLabel statement3 = new JLabel("wed june 06 12:13:36 IST 2023    withdrawl      " + random5);
        statement3.setFont(new Font("raleway" , Font.BOLD , 13));
        statement3.setBounds(50 , 260 , 600 , 30);
        statement3.setForeground(black);
        add(statement3);
        random =Math.abs((ran.nextLong()%900L)+100L);
        Random ran6= new Random();
        random6 =Math.abs((ran6.nextLong()%9000L)+1000L);
        JLabel statement4 = new JLabel(" your current balance is "  + random6+"00");
        statement4.setFont(new Font("raleway" , Font.BOLD , 16));
        statement4.setBounds(50 , 370 , 600 , 30);
        statement4.setForeground(black);
        add(statement4);

         back = new JButton("back");
        back.setBounds(250, 490, 100, 30);
        back.addActionListener(this);
        add(back);




        setTitle("Mini statement");
        setSize(400 , 600);
        setLocation(20 , 20);
        getContentPane().setBackground(Color.white);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ministatement();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
if (e.getSource()==back){
    setVisible(false);
    new Transections().setVisible(true);

}
    }
}
