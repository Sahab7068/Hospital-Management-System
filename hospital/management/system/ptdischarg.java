package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class ptdischarg extends JFrame {


     ptdischarg() {

        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 690, 580);
//        panel.setBorder(5,5);
        panel.setBackground(new Color(10, 145, 80));
        panel.setLayout(null);
        add(panel);

        JLabel label = new JLabel("Check Out");
        label.setBounds(250, 10, 200, 30);
        label.setForeground(Color.white);
        label.setFont(new Font("Tahoma ", Font.BOLD, 30));
        panel.add(label);

        JLabel label1 = new JLabel("Customer ID : ");
        label1.setForeground(Color.white);
        label1.setFont(new Font("Tahoma", Font.BOLD, 18));
        label1.setBounds(80, 130, 200, 30);
        panel.add(label1);

        JLabel labelname = new JLabel("Patient Name : ");
        labelname.setForeground(Color.white);
        labelname.setFont(new Font("Tahoma",Font.BOLD,18));
        labelname.setBounds(80,190,200,30);
        panel.add(labelname);

        JLabel patientname = new JLabel("");
         patientname.setForeground(Color.white);
         patientname.setFont(new Font("Tahoma",Font.BOLD,18));
         patientname.setBounds(300,190,200,30);
         panel.add(patientname);


        Choice choice = new Choice();
        choice.setBounds(300, 132, 150, 25);
        panel.add(choice);

        try {

            conn c = new conn();
            ResultSet resultSet = c.statement.executeQuery("select * from patientinfo");
            while (resultSet.next()) {
                choice.add(resultSet.getString("Number"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }


        JLabel label2 = new JLabel("Room No : ");
        label2.setForeground(Color.white);
        label2.setFont(new Font("Tahoma", Font.BOLD, 18));
        label2.setBounds(80, 250, 500, 30);
        panel.add(label2);

        JLabel label0 = new JLabel(" ");
        label0.setForeground(Color.white);
        label0.setFont(new Font("Tahoma", Font.BOLD, 18));
        label0.setBounds(300, 250, 500, 30);
        panel.add(label0);


//        try {
//            conn c = new conn();
//            ResultSet resultSet1 = c.statement.executeQuery("select * from patientinfo");
//            while (resultSet1.next()){
//                rom.add(resultSet1.getString("Room_Number"));
//
//            }
//
//        }catch (Exception E){
//            E.printStackTrace();
//        }


        JLabel label3 = new JLabel(" Admit Time : ");
        label3.setForeground(Color.white);
        label3.setFont(new Font("Tahoma", Font.BOLD, 18));
        label3.setBounds(80, 300, 500, 30);
        panel.add(label3);

        JLabel intime = new JLabel("");
        intime.setForeground(Color.white);
        intime.setFont(new Font("Tahoma", Font.BOLD, 18));
        intime.setBounds(300, 300, 500, 30);
        panel.add(intime);

        JLabel label4 = new JLabel("Discharge Time : ");
        label4.setForeground(Color.white);
        label4.setFont(new Font("Tahoma", Font.BOLD, 18));
        label4.setBounds(80, 350, 500, 30);
        panel.add(label4);


        Date date = new Date();
        JLabel outtime = new JLabel("" + date);
        outtime.setBounds(300, 350, 500, 30);
        outtime.setFont(new Font("Tahoma", Font.BOLD, 18));
        outtime.setForeground(Color.WHITE);
        panel.add(outtime);


        JButton button = new JButton("Discharge");
        button.setBounds(100, 450, 120, 40);
        button.setBackground(Color.BLACK);
        button.setForeground(Color.white);
        panel.add(button);
       button.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               conn c = new conn();
               try {
                   c.statement.executeUpdate("delete from patientinfo where number = '"+choice.getSelectedItem()+"'");
                   c.statement.executeUpdate("update room set Availability = 'Availab' where Room_No = '"+label0.getText()+"'");
                   JOptionPane.showMessageDialog(null,"Done");
                   setVisible(false);
               } catch (SQLException ex) {
                   throw new RuntimeException(ex);
               }
           }
       });


        JButton button1 = new JButton("Check");
        button1.setBounds(300, 450, 120, 40);
        button1.setBackground(Color.BLACK);
        button1.setForeground(Color.white);
        panel.add(button1);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                conn c = new conn();
                try {
                    ResultSet resultSet = c.statement.executeQuery("select * from patientinfo where number = '" + choice.getSelectedItem() + "'");
                    while (resultSet.next()) {
                        label0.setText(resultSet.getString("Room_Number"));
                        intime.setText(resultSet.getString("Time"));
                        patientname.setText(resultSet.getString("Name"));

                    }
                } catch (Exception E) {
                    E.printStackTrace();
                }
            }
        });

        JButton button2 = new JButton("Back");
        button2.setBounds(500, 450, 120, 40);
        button2.setBackground(Color.BLACK);
        button2.setForeground(Color.white);
        panel.add(button2);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });


        setLayout(null);
        setUndecorated(true);
        getContentPane().setBackground(Color.RED);
        setSize(705, 595);
        setLocation(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        setVisible(true);
    }




        public static void main(String[] args) {
            new ptdischarg();
        }

    }



