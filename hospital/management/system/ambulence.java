package hospital.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class ambulence extends JFrame {
    JTable table;
    ambulence(){


        JPanel panel = new JPanel();
        panel.setBounds(5,5,890,500);
        panel.setBackground(new Color(90,156,163));
        panel.setLayout(null);
        add(panel);
        JLabel label2 = new JLabel("Ambulence");
        label2.setFont(new Font("Tahom",Font.BOLD,30));
        label2.setBounds(270,2,200,50);
        label2.setForeground(Color.orange);
        panel.add(label2);

        JLabel label1 = new JLabel("Vhical Type");
        label1.setFont(new Font("Tahom",Font.BOLD,18));
        label1.setBounds(60,150,150,30);
        label1.setForeground(Color.orange);
        panel.add(label1);

        JLabel label3 = new JLabel("Vhical Number");
        label3.setFont(new Font("Tahom",Font.BOLD,18));
        label3.setBounds(270,150,150,30);
        label3.setForeground(Color.orange);
        panel.add(label3);

        JLabel label = new JLabel("Driver Name");
        label.setFont(new Font("Tahom",Font.BOLD,18));
        label.setBounds(500,150,150,30);
        label.setForeground(Color.orange);
        panel.add(label);

        JLabel label4 = new JLabel("Phone No");
        label4.setFont(new Font("Tahom",Font.BOLD,18));
        label4.setBounds(680,150,100,30);
        label4.setForeground(Color.orange);
        panel.add(label4);
//


        table = new JTable();
        table.setBounds(80,200,600,300);
        table.setBackground(new Color(90,156,163));
        table.setFont(new Font("Tahoma ",Font.BOLD,15));

        panel.add(table);

        try {
            conn c = new conn();
            String q = "select * from Embu";
            ResultSet resultSet = c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        }catch (Exception e){
            e.printStackTrace();
        }





        JButton jButton = new JButton("Back");
        jButton.setBounds(20,20,120,30);
        jButton.setBackground(Color.BLACK);
        jButton.setForeground(Color.white);
        panel.add(jButton);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });



        setSize(900,500);
        setLayout(null);
        setUndecorated(true);
        setLocation(300,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        new ambulence();
    }
}
