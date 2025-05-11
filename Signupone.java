package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static java.awt.Color.*;
import java.awt.event.*;

public class Signupone  extends JFrame   implements ActionListener {
    long random;
    JTextField nameTextField, fnameTextField , dobTextField , emailTextField , addressTextField , cityTextField , stateTextField, pinTextField;
    JButton next;

    JRadioButton male , female , other , married , unmarried;
    Signupone(){
     //created constructor for the 1st page of application form
        setLayout(null);     //selayout to null so frame set to the provided dimenstions
        Random ran= new Random();
        random =Math.abs((ran.nextLong()%9000L)+1000L);
                                                              // Label for application form number
        JLabel formno= new JLabel("APPLICATION  FORM NO:" + random);
        formno.setFont(new Font("Raleway" , Font.BOLD , 38));
        formno.setBounds(140 , 20 , 600 , 40);
        formno.setForeground(white);
        add(formno);
                                                                     // Label for page title
        JLabel personaldetails= new JLabel("PAGE 1: PERSONAL DETAILS");
        personaldetails.setFont(new Font("Raleway" , Font.BOLD , 22));
        personaldetails.setBounds(290 , 80 , 400 , 30);
        personaldetails.setForeground(white);
        add(personaldetails);
                                                                 // Label and text field for name
        JLabel name= new JLabel("NAME :");
        name.setFont(new Font("Raleway" , Font.BOLD , 20));
        name.setBounds(100 , 140 , 100 , 30);
        name.setForeground(white);
        add(name);
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway" , Font.BOLD, 14));
        nameTextField.setBounds(300 , 140 , 400, 30);
        add(nameTextField);
                                                                    // Label and text field for father name
        JLabel fname= new JLabel("FATHER'S NAME :");
        fname.setFont(new Font("Raleway" , Font.BOLD , 20));
        fname.setBounds(100 , 190 , 200 , 30);
        fname.setForeground(white);
        add(fname);
        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway" , Font.BOLD, 14));
        fnameTextField.setBounds(300 , 190 , 400, 30);
        add(fnameTextField);
                                                                            // Label and text field for date of birth
        JLabel dob= new JLabel("DATE OF BIRTH :");
        dob.setFont(new Font("Raleway" , Font.BOLD , 20));
        dob.setBounds(100 , 240, 200 , 30);
        dob.setForeground(white);

        add(dob);
        dobTextField = new JTextField();
        dobTextField.setFont(new Font("Raleway" , Font.BOLD, 14));
        dobTextField.setBounds(300 , 240 , 400, 30);
        add(dobTextField);
                                                       // Label and text field for gender
        JLabel gender= new JLabel("GENDER : ");
        gender.setFont(new Font("Raleway" , Font.BOLD , 20));
        gender.setBounds(100 , 290, 200 , 30);
        gender.setForeground(white);

        add(gender);
                                                          // creating an object for radiobutton of male
        male = new JRadioButton("MALE ");
        male.setBounds(300 , 290 , 60 , 30);
        male.setBackground(white);
        add(male);
                                                          // creating an object for radiobutton of female
        female = new JRadioButton("FEMALE ");
        female.setBounds(450 , 290 , 120 , 30);
        female.setBackground(white);
        add(female);
        ButtonGroup gendergroup = new ButtonGroup();         //addinmg button group to the frame
        gendergroup.add(male);
        gendergroup.add(female);
        JLabel email= new JLabel("EMAIL ADDRESS ");      //label and text field for email address
        email.setFont(new Font("Raleway" , Font.BOLD , 20));
        email.setBounds(100 , 340, 200 , 30);
        email.setForeground(white);

        add(email);
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway" , Font.BOLD, 14));
        emailTextField.setBounds(300 , 340 , 400, 30);
        add(emailTextField);
        JLabel merital= new JLabel("MARITAL STATUS:  ");        //label for marital status
        merital.setFont(new Font("Raleway" , Font.BOLD , 20));
        merital.setBounds(100 , 390, 200 , 30);
        merital.setForeground(white);

        add(merital);
        married = new JRadioButton("MARRIED ");    // creating an object for radiobutton of married , ummarried  and other
        married.setBounds(300  , 390 , 100, 30);
        married.setBackground(white);
        add(married);
        unmarried=new  JRadioButton("UNMARRIED");
        unmarried .setBounds(430 , 390 , 100 , 30);
        unmarried.setBackground(white);
        add(unmarried);
        other=new  JRadioButton("OTHER");
        other .setBounds(550 , 390 , 120 , 30);
        other.setBackground(white);
        add(other);
        ButtonGroup statusgroup = new ButtonGroup();   //add button group to the frame
        statusgroup.add(married);
        statusgroup.add(unmarried);
        statusgroup.add(other);
        JLabel address= new JLabel("ADDRESS :  ");    // creating an object for label address and text field
        address.setFont(new Font("Raleway" , Font.BOLD , 20));
        address.setBounds(100 , 440, 200 , 30);
        address.setForeground(white);

        add(address);
        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway" , Font.BOLD, 14));
        addressTextField.setBounds(300 , 440 , 400, 30);
        add(addressTextField);
        JLabel city= new JLabel("CITY :  ");  // creating an object for label of city  and  its text field
        city.setFont(new Font("Raleway" , Font.BOLD , 20));
        city.setBounds(100 , 490, 200 , 30);
        city.setForeground(white);

        add(city);
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway" , Font.BOLD, 14));
        cityTextField.setBounds(300 , 490 , 400, 30);
        add(cityTextField);       // creating an object for label state and its text field
        JLabel state= new JLabel("STATE:  ");
        state.setFont(new Font("Raleway" , Font.BOLD , 20));
        state.setBounds(100 , 540, 200 , 30);
        state.setForeground(white);

        add(state);
        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway" , Font.BOLD, 14));
        stateTextField.setBounds(300 , 540 , 400, 30);
        add(stateTextField);
        JLabel pincode= new JLabel("PIN CODE :  ");  // creating an object for label pin code  and text field
        pincode.setFont(new Font("Raleway" , Font.BOLD , 20));
        pincode.setBounds(100 , 590, 200 , 30);
        pincode.setForeground(white);

        add( pincode);
        pinTextField = new JTextField();
        pinTextField.setFont(new Font("Raleway" , Font.BOLD, 14));
        pinTextField.setBounds(300 , 590 , 400, 30);
        add(pinTextField);
        next=new JButton("NEXT");      // creating an object for next radio button so we can turn in to the 2nd poage ogf application form address and text field
        next.setBackground(black);
        next.setForeground(white);
        next.setFont( new Font("Raleway" , Font.BOLD, 14));
        next.setBounds(620 , 660 , 80 , 30);
        next.addActionListener(this);
        add(next);
        ImageIcon iii3= new ImageIcon(ClassLoader.getSystemResource("icon/gray.jpg"));   //adding image to the full backgrounf
        Image i4 = iii3.getImage().getScaledInstance(850, 800, Image.SCALE_DEFAULT);
        ImageIcon i5=new ImageIcon(i4);
        JLabel image2 = new JLabel(i5);
        image2.setBounds(0 , 0, 850, 800 );
        add(image2);
        getContentPane().setBackground(GRAY);
        setSize(850 , 800);   //sourting the size of frame
        setLocation(350 , 10);
        setUndecorated(true);
        setVisible(true);


    }

    public static void main(String[] args) {

        new Signupone();   //calling the constructor
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String formno =" "+  random;
        String name= nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob= fnameTextField.getText();
        String email = emailTextField.getText();
        String gender = null;
        if (male.isSelected()){     //if user enter male , the selecteed button wshould be male,
            gender="male";
        }
        else if(female.isSelected()){  //if user enter female , the selecteed button should be female,not makle
            gender="female";
        }
        String marital=null;
        if(married.isSelected()){
            marital=" married";
        }
        else if(unmarried.isSelected()){
            marital="unmarried";
        }
        else if (other.isSelected()){
            marital="other";
        }
        String address= addressTextField.getText();
        String city = cityTextField.getText();
        String state=stateTextField.getText();
        String pin = pinTextField.getText();


            if (name.equals("")){   //if user has not entered name or haven't filled complete  information the messae will be generated "please enter you information
                JOptionPane.showMessageDialog(null , "name is required");

            }
            else if (fname.equals("")){
                JOptionPane.showMessageDialog(null , "please fill your complete details");
            }
         else if (city.equals("")){
                JOptionPane.showMessageDialog(null , " please fill your complete details");
            }
            else if (gender.equals("")){
                JOptionPane.showMessageDialog(null , " please fill complete details");
            }
            else if (address.equals("")){
                JOptionPane.showMessageDialog(null , " please fill complete details");
            }
            else if (marital.equals("")){
                JOptionPane.showMessageDialog(null , " please fill complete details ");
            }
            else if (email.equals("")){
                JOptionPane.showMessageDialog(null , " please fill your complete details");
            }
            else if (pin.equals("")){
                JOptionPane.showMessageDialog(null , " please fill your complete details");
            }
            else {
            //if user enter next the next page of application form will be appeared
                setVisible(false);
                new SignupTwo().setVisible(true);
            }

        }
}


