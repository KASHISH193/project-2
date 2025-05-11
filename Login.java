

package bank.management.system;
import javax.swing.*; // to activate the gui elements.
import java.awt.*;                    // Import necessary packages
import java.awt.event.*;   //to provide the action behind buttons
import static java.awt.Color.*;   //for the color of text
public  class Login extends JFrame implements ActionListener{
    JButton signin , signup , clear;
    JTextField cardTextField;
    JTextField pinTextField ;
      public Login() {                                            //constructor of the class
                                                             //create object for image

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/card.jpg"));

        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
          JLabel image = new JLabel(i3);
          image.setBounds(0 , 220, 400 , 250 );
       add(image);                                                     //adding image
                                                             //creating another object for image 2
        ImageIcon a= new ImageIcon(ClassLoader.getSystemResource("icon/icon.jpg"));
        Image b = a.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon c=new ImageIcon(b);
        JLabel image3 = new JLabel(c);
        image3.setBounds(550 , 300, 300 , 300 );
        add(image3);
                                               //creating object for signin button
        signin = new JButton("SIGN IN");
        signin.setBounds(300 , 300 , 100 , 30);
        signin.setBackground(BLACK);
       signin.setForeground(Color.white);
        signin.addActionListener(this);
        add(signin);                                //adding the object to the frame


        clear= new JButton("CLEAR");    //creating object for clear button
        clear.setBounds(430 , 300 , 100 , 30);
        clear.setBackground(BLACK);
        clear.setForeground(Color.white);
        clear.addActionListener(this);
        add(clear);
        signup = new JButton("SIGN UP");     //creating object for sign up button
        signup.setBounds(300 , 350 , 230 , 30);
        signup.setBackground(BLACK);
        signup.setForeground(Color.white);
        signup.addActionListener(this);
        add(signup);
        setLayout(null);
        setTitle("*********BANK MANAGEMENT SYSTEM ********");    //set title
                                                                  //label for welcome to bank
        JLabel text=new JLabel(" ----WELCOME TO BANK----");
        text.setFont(new Font("osward" , Font.CENTER_BASELINE, 40));
        text.setBounds(200, 20, 700, 60);
        text.setForeground(white);
        add(text);
        JLabel text3=new JLabel("**********************************");
        text3.setFont(new Font("osward" , Font.CENTER_BASELINE, 40));
        text3.setBounds(200, 20, 700, 170);
        text3.setForeground(white);

        add(text3);
                                                             // creating object for label card number
        JLabel pinno=new JLabel("   CARD NO : ");
        pinno.setFont(new Font("Raleway" , Font.TYPE1_FONT,30));
        pinno.setBounds(100, 200, 250, 50);
        pinno.setForeground(white);

        add(pinno);                                              //adding card number to the frame
        pinTextField = new JTextField();
        pinTextField.setBounds(305, 200, 250, 35);
        add(pinTextField);
        JLabel card = new JLabel(" ");
        card.setFont(new Font( "Raleway", Font.BOLD, 38));
        card.setBounds(400, 200,0,5);
        add(card);
                                                            //creating object for pin number to the frame
        JLabel cardno=new JLabel("   ENTER PIN : ");
        cardno.setFont(new Font("Raleway" , Font.TYPE1_FONT,30));
        cardno.setBounds(100, 150, 250, 50);
        cardno.setForeground(white);

        add(cardno);
                                             //and there text fields by creating its objects
        cardTextField = new JTextField();
        cardTextField.setBounds(305, 160, 250, 35);
        add(cardTextField);
        JLabel Pin = new JLabel(" ");
        Pin.setFont(new Font( "Raleway", Font.BOLD, 38));
        Pin.setBounds(400, 200,0,5);
        add(Pin);
                                  //adding an image and created the image image in the background
          ImageIcon iii3= new ImageIcon(ClassLoader.getSystemResource("icon/gray.jpg"));
        Image i4 = iii3.getImage().getScaledInstance(900, 580, Image.SCALE_DEFAULT);
        ImageIcon i5=new ImageIcon(i4);
        JLabel image2 = new JLabel(i5);
        image2.setBounds(0 , 0, 900 , 580 );

        add(image2);
                                                    //setting the size for frame
        setSize(900 , 580);
        setLocation(350 , 200);
        setUndecorated(true);
        setVisible(true);





    }
    public static void main(String[] args){
        new Login();    //called the constructor in the main class

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if(ae.getSource()== clear){//if a user enter clear button then obove written text fields will be removed

            cardTextField.setText("");
         pinTextField.setText("");
        }

        else  if(ae.getSource()== signin){//if a user enter sign in  button then application form will appeared
           if(cardTextField.equals("")){
               JOptionPane.showMessageDialog(null , "fill complete details");
           }
           else if (pinTextField.equals("")){
               JOptionPane.showMessageDialog(null , "please complete deails ");
           }
             setVisible(false);
        new Transections().setVisible(true);


        }
        else if(ae.getSource()== signup){ //if a user enter sign up  button then transection page will appear
            setVisible(false);
            new Signupone().setVisible(true);
        }

    }
}


