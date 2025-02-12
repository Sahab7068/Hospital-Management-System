package hospital.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class dipartment extends JFrame {
    JTable table;
    dipartment(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,600,450);
        panel.setBackground(Color.BLUE);
        panel.setLayout(null);
//        panel.setBorder(5);
        add(panel);

        JLabel label = new JLabel("Department");
        label.setFont(new Font("Tahoma ",Font.BOLD,30));
        label.setBounds(80,10,200,30);
        label.setForeground(Color.white);
        panel.add(label);

        JLabel label1 = new JLabel("Phone No");
        label1.setFont(new Font("Tahoma ",Font.BOLD,30));
        label1.setBounds(350,10,200,30);
        label1.setForeground(Color.white);
        panel.add(label1);

         table = new JTable();
         table.setBounds(50,70,600,250);
         table.setFont(new Font("Tahoma ",Font.BOLD,18));
         table.setForeground(Color.white);
         table.setBackground(Color.blue);
         panel.add(table);

         try {
             conn c = new conn();
             String q = "select * from Dipartment";
             ResultSet resultSet = c.statement.executeQuery(q);
             table.setModel(DbUtils.resultSetToTableModel(resultSet));
         }catch (Exception e){
             e.printStackTrace();
         }




        JButton button = new JButton("Back");
        button.setBounds(250,400,130,30);
        button.setBackground(Color.BLACK);
        button.setForeground(Color.white);
        button.setFont(new Font("Tahoma",Font.BOLD,18));
        panel.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        setSize(630,500);
        setLayout(null);
        setLocation(350,170);
        setVisible(true);
    }

    public static void main(String[] args) {
        new dipartment();
    }
}
