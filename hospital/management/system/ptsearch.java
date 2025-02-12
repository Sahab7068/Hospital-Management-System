package hospital.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;

public class ptsearch extends JFrame {

    JTable table;
    ptsearch(){



        JPanel panel = new JPanel();
        panel.setBounds(5,5,890,680);
        panel.setBackground(new Color(90,156,163));
        panel.setLayout(null);
        add(panel);

        JLabel label1 = new JLabel("Search For Room ");
        label1.setFont(new Font("Tahom",Font.BOLD,30));
        label1.setBounds(350,2,300,50);
        label1.setForeground(Color.orange);
        panel.add(label1);
        label1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

       Choice choice = new Choice();
        choice.setBounds(280,60,180,25);
        choice.add("Availbe");
        choice.add("Ocupid");
        panel.add(choice);

        JButton jButton = new JButton("Search");
        jButton.setBounds(200,500,120,30);
        jButton.setBackground(Color.BLACK);
        jButton.setForeground(Color.white);
        panel.add(jButton);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String q = "select * from room where Availability = '"+choice.getSelectedItem()+"'";
                try {
                    conn c = new conn();
                    ResultSet resultSet = c.statement.executeQuery(q);
                    table.setModel(DbUtils.resultSetToTableModel(resultSet));
                }catch (Exception E ){
                    E.printStackTrace();
                }
            }
        });





        table = new JTable();
        table.setBounds(80,250,800,500);
        table.setBackground(new Color(90,156,163));
        table.setFont(new Font("Tahoma ",Font.BOLD,15));

        panel.add(table);

        try {
            conn c = new conn();
            String q = "select * from room";
            ResultSet resultSet = c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        }catch (Exception e){
            e.printStackTrace();
        }


        setSize(900,680);
        setLayout(null);
        setUndecorated(true);
        setLocation(300,15);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        new ptsearch();
    }
}
