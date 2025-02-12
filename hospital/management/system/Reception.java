package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class Reception extends JFrame {

    Reception(){

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(5,160,1525,670);
        panel.setBackground(new Color(109,164,170));
        add(panel);

        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(5,5,1525,150);
        panel1.setBackground(new Color(109,164,170));
        add(panel1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/doctor.png"));
        Image image = i1.getImage().getScaledInstance(250,230,Image.SCALE_AREA_AVERAGING);
        ImageIcon i2 = new ImageIcon(image);
        JLabel label = new JLabel(i2);
        label.setLocation(100,200);
        label.setBounds(1050,-25,300,250);
        panel1.add(label);

//        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("icon/hicon2.png"));
//        Image image1 = i.getImage().getScaledInstance(250,230,Image.SCALE_AREA_AVERAGING);
//        ImageIcon im = new ImageIcon(image1);
//        JLabel label1 = new JLabel(im);
//        label.setBounds(800,-25,300,250);
//        panel1.add(label1);





//      ImageIcon i3 = new ImageIcon(ClassLoader.getSystemResource("icon/road.png"));
//        Image image3 = i3.getImage().getScaledInstance(300,230,Image.SCALE_AREA_AVERAGING);
//      ImageIcon i4 = new ImageIcon(image3);
//       JLabel label1 = new JLabel(i4);
//        label.setBounds(600,-25,350,100);
//        panel1.add(label1);


        JButton button1 = new JButton("Add New Patient");
        button1.setBounds(30,15,200,30);
        button1.setBackground(new Color(246,215,118));
        panel1.add(button1);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            new newpatient();

            }
        });

        JButton button2 = new JButton("Room");
        button2.setBounds(300,15,200,30);
        button2.setBackground(new Color(246,215,118));
        panel1.add(button2);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Room();
            }
        });

        JButton button3 = new JButton("Department");
        button3.setBounds(600,15,200,30);
        button3.setBackground(new Color(246,215,118));
        panel1.add(button3);
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            new dipartment();
            }
        });


        JButton button4 = new JButton("All Employee");
        button4.setBounds(30,60,200,30);
        button4.setBackground(new Color(246,215,118));
        panel1.add(button4);
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            new emp();

            }
        });


        JButton button5= new JButton("Patient Info");
        button5.setBounds(300,60,200,30);
        button5.setBackground(new Color(246,215,118));
        panel1.add(button5);
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new patientinfo();

            }
        });


        JButton button6= new JButton("Embulence");
        button6.setBounds(600,60,200,30);
        button6.setBackground(new Color(246,215,118));
        panel1.add(button6);
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            new ambulence();

            }
        });

        JButton button7= new JButton("Search Room");
        button7.setBounds(30,100,200,30);
        button7.setBackground(new Color(246,215,118));
        panel1.add(button7);
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ptsearch();
            }
        });

        JButton button8= new JButton("Patient Discharg");
        button8.setBounds(300,100,200,30);
        button8.setBackground(new Color(246,215,118));
        panel1.add(button8);
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            new ptdischarg();
            }
        });

        JButton button9= new JButton("Update Petient Details");
        button9.setBounds(600,100,200,30);
        button9.setBackground(new Color(246,215,118));
        panel1.add(button9);
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            new ptupdate();
            }
        });

        JButton button= new JButton("Logout");
        button.setBounds(820,100,200,30);
        button.setBackground(new Color(246,215,118));
        panel1.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            new Login();
            }
        });












        setSize(1950,1090);
        setUndecorated(true);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }



    public static void main(String[] args) {
        new Reception();



    }
}
