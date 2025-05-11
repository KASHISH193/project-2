package bank.management.system;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;

import static java.awt.Color.*;

public class SignupTwo  extends JFrame implements ActionListener {


    JTextField pan, aadhar;
    JButton next;
    JRadioButton syes , sno , eyes, eno;
    JComboBox religion ,  catagory ,income ,  education  , occupation;
    String formno;
    SignupTwo(){
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

        JLabel additionaldetails= new JLabel("PAGE 2: ADDITIONAL DETAILS");
        additionaldetails.setFont(new Font("Raleway" , Font.BOLD , 22));
        additionaldetails.setBounds(290 , 80 , 400 , 30);
        additionaldetails.setForeground(white);

        add(additionaldetails);
        JLabel name= new JLabel("RELIGION:");
        name.setFont(new Font("Raleway" , Font.BOLD , 20));
        name.setBounds(100 , 140 , 100 , 30);
        name.setForeground(white);

        add(name);
        String valRiligion[] = {"Hindu" , "Muslim" , "Cristian" , "Sikh" , "other"};
        religion = new JComboBox(valRiligion);
        religion.setBounds(300 , 140 , 400, 30);
        religion.setBackground(white);
        add(religion);
        JLabel fname= new JLabel("CATAGORY :");
        fname.setFont(new Font("Raleway" , Font.BOLD , 20));
        fname.setBounds(100 , 190 , 200 , 30);
        fname.setForeground(white);
        add(fname);
        String valcategoy[]={"general ", "OBC" , "SC" , "ST" , "other"};
        catagory = new JComboBox(valcategoy);
        catagory .setBounds(300 , 190 , 400, 30);
        catagory.setBackground(white);
        add( catagory );
        JLabel dob= new JLabel("INCOME :");
        dob.setFont(new Font("Raleway" , Font.BOLD , 20));
        dob.setBounds(100 , 240, 200 , 30);
        dob.setForeground(white);

        add(dob);
        String incomecategoy[]={" null ", "<50,000" , "<2,50,000" , "5,00,000" , "up to 10,00,000"};
        income= new JComboBox(incomecategoy);
        income.setBounds(300 , 240 , 400, 30);
        income.setBackground(white);
        add( income );
        JLabel gender= new JLabel("EDUCATIONAL : ");
        gender.setFont(new Font("Raleway" , Font.BOLD , 20));
        gender.setBounds(100 , 290, 200 , 30);
        gender.setForeground(white);

        add(gender);


        JLabel email= new JLabel("QUALIFICATION");
        email.setFont(new Font("Raleway" , Font.BOLD , 20));
        email.setBounds(100 , 315, 200 , 30);
        email.setForeground(white);

        add(email);
        String educationalvalues[]={" non graduation ", "graduate" , "post graduation " , "doctrate" , "other"};
        education= new JComboBox(educationalvalues);
        education.setBounds(300, 315 , 400, 30);
        education.setBackground(white);
        add(  education );

        JLabel merital= new JLabel("OCCUPATION:  ");
        merital.setFont(new Font("Raleway" , Font.BOLD , 20));
        merital.setBounds(100 , 390, 200 , 30);
        merital.setForeground(white);

        add(merital);
        String occcupationvalues[]={" salaried", "self employed" , "bussiness " , "student" , "retired" , "other"};
        occupation= new JComboBox(occcupationvalues);
        occupation.setBounds(300, 390 , 400, 30);
        occupation.setBackground(white);
        add( occupation );
        JLabel address= new JLabel("PAN NUMBER :  ");
        address.setFont(new Font("Raleway" , Font.BOLD , 20));
        address.setBounds(100 , 440, 200 , 30);
        address.setForeground(white);

        add(address);
        pan= new JTextField();
        pan.setFont(new Font("Raleway" , Font.BOLD, 14));
        pan.setBounds(300 , 440 , 400, 30);
        add(pan);
        JLabel city= new JLabel("AADHAR NUMBER :  ");
        city.setFont(new Font("Raleway" , Font.BOLD , 20));
        city.setBounds(100 , 490, 200 , 30);
        city.setForeground(white);

        add(city);
        aadhar= new JTextField();
        aadhar.setFont(new Font("Raleway" , Font.BOLD, 14));
        aadhar.setBounds(300 , 490 , 400, 30);
        add(aadhar);
        JLabel state= new JLabel("SENIOR CITIZEN  ");
        state.setFont(new Font("Raleway" , Font.BOLD , 20));
        state.setBounds(100 , 540, 200 , 30);
        state.setForeground(white);

        add(state);
        syes=new  JRadioButton("YES");
        syes .setBounds(350 , 540 , 100 , 30);
        syes.setBackground(white);
        add(syes);
        sno=new  JRadioButton("NO");
        sno .setBounds(500 , 540 , 100 , 30);
        sno.setBackground(white);
        add(sno);
        ButtonGroup statusgroup = new ButtonGroup();
        statusgroup.add(syes);
        statusgroup.add(sno);

        JLabel pincode= new JLabel("EXISTING ACC:");
        pincode.setFont(new Font("Raleway" , Font.BOLD , 20));
        pincode.setBounds(100 , 590, 200 , 30);
        pincode.setForeground(white);

        add( pincode);
        eyes=new  JRadioButton("YES");
        eyes .setBounds(350 , 590 , 100 , 30);
        eyes.setBackground(white);
        add(eyes);
        eno=new  JRadioButton("NO");
        eno .setBounds(500 , 590 , 100 , 30);
        eno.setBackground(white);
        add(eno);
        ButtonGroup estatusgroup = new ButtonGroup();
        estatusgroup.add(eyes);
        estatusgroup.add(eno);
        next=new JButton("NEXT");
        next.setBackground(black);
        next.setForeground(white);
        next.setFont( new Font("Raleway" , Font.BOLD, 14));
        next.setBounds(620 , 660 , 80 , 30);
        next.addActionListener(this);
        add(next);
        ImageIcon iii3= new ImageIcon(ClassLoader.getSystemResource("icon/gray.jpg"));
        Image i4 = iii3.getImage().getScaledInstance(850, 800, Image.SCALE_DEFAULT);
        ImageIcon i5=new ImageIcon(i4);
        JLabel image2 = new JLabel(i5);
        image2.setBounds(0 , 0, 850, 800 );
        add(image2);
        getContentPane().setBackground(GRAY);
        setSize(850 , 800);
        setLocation(350 , 10);
        setUndecorated(true);
        setVisible(true);


    }



    public static void main(String[] args) {

        new SignupTwo();
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        String sreligion = (String) religion.getSelectedItem();
        String scategory = (String) catagory.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();
        String seniorcitizen = null;
        if (syes.isSelected()){
            seniorcitizen="YES";
        }
        else if(sno.isSelected()){
            seniorcitizen="NO";
        }
        String existingaccount = null;
        if (eyes.isSelected()){
            existingaccount ="YES";
        }
        else if(eno.isSelected()){
            existingaccount="NO";
        }

        String span  = pan.getText();
        String saadhar = aadhar.getText();

        setVisible(false);
        new SignupThree(formno).setVisible(true);


    }
}

