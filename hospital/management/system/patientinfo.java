package hospital.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class patientinfo extends JFrame {
    JTable table;

    patientinfo(){
        JPanel paneln = new JPanel();
        paneln.setSize(1200,500);
        paneln.setBackground(new Color(255,255,255));
        paneln.setBounds(5,5,1200,500);
        paneln.setLayout(null);

        add(paneln);

        JLabel label = new JLabel("Patient Information");
        label.setBounds(350,10,300,50);
        label.setFont(new Font("Tahoma",Font.BOLD,30));
//        label.setForeground(Color.white);
        paneln.add(label);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/info.png"));
        Image image = imageIcon.getImage().getScaledInstance(200,180,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1= new ImageIcon(image);
        JLabel label1 = new JLabel(imageIcon1);
        label1.setBounds(500,250,200,200);
        paneln.add(label1);

        JLabel lname = new JLabel("ID NAME");
        lname.setBounds(35,55,200,50);
        lname.setFont(new Font("Tahoma ",Font.BOLD,20));
        paneln.add(lname);

        JLabel lname1 = new JLabel("ID NUMBER");
        lname1.setBounds(185,55,200,50);
        lname1.setFont(new Font("Tahoma ",Font.BOLD,20));
        paneln.add(lname1);


        JLabel lname2 = new JLabel("NAME");
        lname2.setBounds(310,55,200,50);
        lname2.setFont(new Font("Tahoma ",Font.BOLD,20));
        paneln.add(lname2);


        JLabel lname3 = new JLabel("GENDER");
        lname3.setBounds(460,55,200,50);
        lname3.setFont(new Font("Tahoma ",Font.BOLD,20));
        paneln.add(lname3);


        JLabel lname4 = new JLabel("DIEASES");
        lname4.setBounds(580,55,200,50);
        lname4.setFont(new Font("Tahoma ",Font.BOLD,20));
        paneln.add(lname4);

        JLabel lname5 = new JLabel("ROOM NO");
        lname5.setBounds(720,55,200,50);
        lname5.setFont(new Font("Tahoma ",Font.BOLD,20));
        paneln.add(lname5);

        JLabel lname6 = new JLabel("DATE");
        lname6.setBounds(880,55,200,50);
        lname6.setFont(new Font("Tahoma ",Font.BOLD,20));
        paneln.add(lname6);

        JLabel lname7 = new JLabel("DIPOSITE");
        lname7.setBounds(1000,55,200,50);
        lname7.setFont(new Font("Tahoma ",Font.BOLD,20));
        paneln.add(lname7);

        JButton button = new JButton("Back");
        button.setBackground(Color.BLACK);
        button.setForeground(Color.white);
        button.setBounds(150,350,100,30);
        paneln.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });


        table = new JTable();
        table.setBounds(30,100,1100,300);
//        table.setBackground(new Color(2));
//        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
//        JScrollPane scrollPane = new JScrollPane(table);
//        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
//        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);


        table.setForeground(new Color(179, 31, 184));
        table.setGridColor(new Color(10));
        table.setShowGrid(true);
//        table.getGridColor().darker().darker().createContext(table,10,10,20,10)
        table.setFont(new Font("Tahom",Font.BOLD,17));
        paneln.add(table);





        try {
            conn c = new conn();
            String q = "select * from patientinfo";
            ResultSet resultSet = c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));


        }catch (Exception e){
            e.printStackTrace();
        }
//        add(new JScrollPane(table));


//        setUndecorated(true);
        getContentPane().setBackground(new Color(242,0,250));
        setSize(1210,510);
//        add(scrollBar, BorderLayout.CENTER);
        setLocation(100,140);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    public static void main(String[] args) {
        new patientinfo();
    }
}
