package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

class Login extends JFrame implements ActionListener {
    JTextField textField;
    JPasswordField password;
    JButton b1,b2;


    Login() {

        JLabel title = new JLabel("Hospital Service Login");
        title.setBounds(150,-100,500,250);
        title.setFont(new Font("Tahoma",Font.BOLD,30));
        add(title);

        JLabel namelabale = new JLabel("Username");
        namelabale.setBounds(40,70,200,30);
        namelabale.setFont(new Font("Tahoma",Font.BOLD,16));
        namelabale.setForeground(Color.BLACK);
        add(namelabale);

        JLabel passwordlabale = new JLabel("Password");
        passwordlabale.setBounds(40,150,200,30);
        passwordlabale.setFont(new Font("Tahoma",Font.BOLD,16));
        passwordlabale.setForeground(Color.BLACK);
        add(passwordlabale);


        textField = new JTextField();
        textField.setBounds(150,70,200,30);
        textField.setFont(new Font("Tahoma",Font.PLAIN,14));
        textField.setBackground(new Color(255,179,0));
        textField.setOpaque(false);
        add(textField);

        password = new JPasswordField();
        password.setBounds(150,150,200,30);
        password.setFont(new Font("Tahoma",Font.PLAIN,15));
        password.setBackground(new Color(255,160,0));
        password.setOpaque(false);
//        password.setVisible(true);
        add(password);


        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icon/hicon2.png"));
//        Image image = icon.getImage().getScaledInstance(200,200,Image.SCALE_AREA_AVERAGING)
        Image image = icon.getImage().getScaledInstance(250,250,Image.SCALE_AREA_AVERAGING);
        ImageIcon icon1 = new ImageIcon(image);
        JLabel label = new JLabel(icon1);
        label.setBounds(300,30,400,300);
        add(label);

        b1=new JButton("Login");
        b1.setBounds(40,250,120,30);
        b1.setFont(new Font("serif",Font.BOLD,20));
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.BLACK);
        b1.addActionListener(this);
        add(b1);


        b2=new JButton("Cancel");
        b2.setBounds(200,250,120,30);
        b2.setFont(new Font("serif",Font.BOLD,20));
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.RED);
//        b2.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                setVisible(false);
//            }
//        });
        b2.addActionListener(this);
        add(b2);






        getContentPane().setBackground(new Color(109,164,170));
        setSize(700,400);
        setLocation(370,150);
        setUndecorated(true);
        setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
//        setBounds();





    }



     /**
      * Invoked when an action occurs.
      *
      * @param e the event to be processed
      */
     @Override
     public void actionPerformed(ActionEvent e) {
         if (e.getSource()==b1){
             try {

                 conn c = new conn();
                 String user = textField.getText();
                 String pass = password.getText();

                 String q = "select * from login where ID = '"+user+"' and PW = '"+pass+"'";
                 ResultSet resultSet= c.statement.executeQuery(q);
                 if (resultSet.next()){
                     new Reception();
                     setVisible(false);
                 }else {
                     JOptionPane.showMessageDialog(null,"Invalid With Database");
                 }

             }catch (Exception E){
                 E.printStackTrace();
             }

         }else {
             System.exit(10);
         }


     }
     public static void main(String[] args) {

         new Login();



     }
 }

