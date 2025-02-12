package hospital.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Room extends JFrame {

    JTable table;


    Room(){


        JPanel panel = new JPanel();
        panel.setBounds(5,5,890,680);
        panel.setBackground(new Color(90,156,163));
        panel.setLayout(null);
        add(panel);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/room.png"));
        Image image = imageIcon.getImage().getScaledInstance(500,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(400,250,500,200);
       panel.add(label);

        table = new JTable();
        table.setBounds(10,80,500,400);
        table.setBackground(new Color(90,156,163));
        panel.add(table);

      try {
         conn c = new conn();
         String q = "select * from Room";
         ResultSet resultSet = c.statement.executeQuery(q);
         table.setModel(DbUtils.resultSetToTableModel(resultSet));

      }catch (Exception e){
          e.printStackTrace();
      }
        JLabel label1 = new JLabel("Patient Room ");
      label1.setFont(new Font("Tahom",Font.BOLD,30));
      label1.setBounds(270,2,200,50);
      label1.setForeground(Color.orange);
      panel.add(label1);


      JLabel l1 =new JLabel("Room No");
      l1.setBounds(12,52,80,15);
      l1.setFont( new Font("Tahoma ",Font.BOLD,15));
      panel.add(l1);

        JLabel l2 =new JLabel("Availbility");
        l2.setBounds(130,52,80,15);
        l2.setFont( new Font("Tahoma ",Font.BOLD,15));
        panel.add(l2);

        JLabel l3 =new JLabel("Price");
        l3.setBounds(270,52,80,15);
        l3.setFont( new Font("Tahoma ",Font.BOLD,15));
        panel.add(l3);

        JLabel l4 =new JLabel("Bed Type");
        l4.setBounds(390,52,80,15);
        l4.setFont( new Font("Tahoma ",Font.BOLD,15));
        panel.add(l4);

        JButton jButton = new JButton("Back");
        jButton.setBounds(200,500,120,30);
        jButton.setBackground(Color.BLACK);
        jButton.setForeground(Color.white);
        panel.add(jButton);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });


        setSize(900,680);
        setLayout(null);
        setUndecorated(true);
        setLocation(300,15);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Room();
    }
}
