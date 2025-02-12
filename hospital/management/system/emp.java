package hospital.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class emp extends JFrame {
    JTable table;
    emp(){
        JPanel panel = new JPanel();
        panel.setBounds(5,5,890,680);
        panel.setLayout(null);
        panel.setBackground(new Color(90,156,163));
        add(panel);

        JLabel label1 = new JLabel("Employee List");
        label1.setBounds(280,2,200,50);
        label1.setFont(new Font("Tahoma ",Font.BOLD,20));
        panel.add(label1);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/doctor.png"));
        Image image = imageIcon.getImage().getScaledInstance(200,200 , Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(300,150,200,200);
        panel.add(label);

        JLabel lname = new JLabel("Name");
        lname.setBounds(53,50,200,50);
        lname.setFont(new Font("Tahoma ",Font.BOLD,16));
        panel.add(lname);



        JLabel lquli = new JLabel("Qulification");
        lquli.setBounds(145,50,200,50);
        lquli.setFont(new Font("Tahoma ",Font.BOLD,16));
        panel.add(lquli);

        JLabel ltype = new JLabel("Doctor");
        ltype.setBounds(300,50,200,50);
        ltype.setFont(new Font("Tahoma ",Font.BOLD,16));
        panel.add(ltype);

        JLabel lphone = new JLabel("Phone No");
        lphone.setBounds(410,50,200,50);
        lphone.setFont(new Font("Tahoma ",Font.BOLD,16));
        panel.add(lphone);


        JLabel lsalary = new JLabel("Salary");
        lsalary.setBounds(520,50,200,50);
        lsalary.setFont(new Font("Tahoma ",Font.BOLD,16));
        panel.add(lsalary);

        JButton button = new JButton("Back");
        button.setBackground(Color.BLACK);
        button.setForeground(Color.white);
        button.setBounds(150,350,100,30);
        panel.add(button);


        table = new JTable();
        table.setBackground(new Color(90,156,163));
       table.setBounds(50,100,600,200);
       table.setForeground(Color.white);
       table.setFont(new Font("Tahoma ",Font.BOLD,13));
        panel.add(table);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        try {
            conn c = new conn();
            String q = "select * from employee";
            ResultSet resultSet = c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        }catch (Exception e){
            e.printStackTrace();
        }



        setSize(700,550);
        setLayout(null);
        setUndecorated(true);
        setLocation(450,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new emp();
    }
}
