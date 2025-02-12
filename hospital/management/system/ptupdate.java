package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;
import java.util.ResourceBundle;

public class ptupdate extends JFrame {

    ptupdate(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(245, 17, 101));
        panel.setBounds(5,5,780,410);
        add(panel);



        JLabel labeltitle = new JLabel("Update Patient Details");
        labeltitle.setBounds(200,10,300,30);
        labeltitle.setForeground(Color.white);
        labeltitle.setFont(new Font("Tahoma",Font.BOLD,25));
        panel.add(labeltitle);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/update.png"));
        Image image = imageIcon.getImage().getScaledInstance(200,230,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel imagelabel = new JLabel(imageIcon1);
        imagelabel.setBounds(500,60,200,300);
        panel.add(imagelabel);

        JLabel labelname = new JLabel("Name :");
        labelname.setBounds(20,60,200,30);
        labelname.setFont(new Font("Tahoma",Font.BOLD,18));
        labelname.setForeground(Color.white);
        panel.add(labelname);

        Choice choice = new Choice();
        choice.setBounds(280,60,180,25);
        panel.add(choice);

        try {
            conn c = new conn();
            ResultSet resultSet = c.statement.executeQuery("select * from patientinfo");
            while (resultSet.next()){
                choice.add(resultSet.getString("Name"));

            }
        }catch (Exception e){
            e.printStackTrace();
        }

        JLabel labelroom = new JLabel("Room No :");
        labelroom.setBounds(20,110,200,30);
        labelroom.setFont(new Font("Tahoma",Font.BOLD,18));
        labelroom.setForeground(Color.white);
        panel.add(labelroom);

        JTextField getroom = new JTextField(" ");
        getroom.setBounds(280,110,180,25);
        getroom.setFont(new Font("Tahoma",Font.BOLD,18));
        getroom.setOpaque(false);
        panel.add(getroom);

        JTextField padamt = new JTextField(" ");
        padamt.setBounds(280,210,180,25);
        padamt.setFont(new Font("Tahoma",Font.BOLD,18));
        padamt.setOpaque(false);
        panel.add(padamt);

        JTextField pendingamt = new JTextField(" ");
        pendingamt.setBounds(280,260,180,25);
        pendingamt.setFont(new Font("Tahoma",Font.BOLD,18));
        pendingamt.setOpaque(false);
        panel.add(pendingamt);

        JLabel labelintime = new JLabel("In Time :");
        labelintime.setBounds(20,160,200,30);
        labelintime.setFont(new Font("Tahoma",Font.BOLD,18));
        labelintime.setForeground(Color.white);
        panel.add(labelintime);

        JTextField updatetime = new JTextField(" ");
        updatetime.setBounds(280,160,180,25);
        updatetime.setFont(new Font("Tahoma",Font.BOLD,18));
        updatetime.setOpaque(false);
        panel.add(updatetime);

//        Date date = new Date();
//
//        JLabel gettime = new JLabel(""+date);
//        gettime.setForeground(Color.white);
//        gettime.setFont(new Font("Tahoma",Font.BOLD,18));
//        gettime.setBounds(280,160,250,30);
//        panel.add(gettime);

        JLabel labelAmount = new JLabel("Paid Amoutn (Rs) :");
        labelAmount.setBounds(20,210,200,30);
        labelAmount.setFont(new Font("Tahoma",Font.BOLD,18));
        labelAmount.setForeground(Color.white);
        panel.add(labelAmount);

        JLabel labelpendingamount = new JLabel("Pending Amount (Rs) :");
        labelpendingamount.setBounds(20,260,230,30);
        labelpendingamount.setFont(new Font("Tahoma",Font.BOLD,18));
        labelpendingamount.setForeground(Color.white);
        panel.add(labelpendingamount);


        JButton updatebutton = new JButton("UPDATE");
        updatebutton.setBackground(Color.BLACK);
        updatebutton.setForeground(Color.white);
        updatebutton.setFont(new Font("Tahoma",Font.BOLD,18));
        updatebutton.setBounds(35,330,130,30);
        panel.add(updatebutton);

        updatebutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    conn c = new conn();
                    String q = choice.getSelectedItem();
                    String roomd = getroom.getText();
                    String time = updatetime.getText();
                    String amount =padamt.getText();
                    c.statement.executeUpdate("update patientinfo set Room_Number = '"+roomd+"',Time = '"+time+"' , Diposit = '"+amount+"' where name = '"+q+"'");
                    JOptionPane.showMessageDialog(null,"Update Successfuly");
                    setVisible(false);


                }catch (Exception E ){
                    E.printStackTrace();
                }
            }
        });














        JButton checkbutton =  new JButton("Check");
        checkbutton.setBackground(Color.BLACK);
        checkbutton.setForeground(Color.white);
        checkbutton.setFont(new Font("Tahoma",Font.BOLD,18));
        checkbutton.setBounds(230,330,130,30);
        panel.add(checkbutton);
//        checkbutton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String id = choice.getSelectedItem();
//                String q = "select * from patientinfo where Name = '"+id+"'";
//                try {
//                    conn c = new conn();
//                    ResultSet resultSet = c.statement.executeQuery(q);
//                    while (resultSet.next()) {
//                        getroom.setText(resultSet.getString("Room_Number"));
//                        updatetime.setText(resultSet.getString("Time"));
//                        padamt.setText(resultSet.getString("Diposit"));
//                    }
//
//                    ResultSet resultSet1 = c.statement.executeQuery("select * from Room where room_no = '"+getroom.getText()+"' ");
//                    while (resultSet1.next()) {
//                        String price = resultSet1.getString("Price");
//                        int amountpaid = Integer.parseInt(price) - Integer.parseInt(padamt.getText());
//                        pendingamt.setText(""+amountpaid);
//
//                    }
//
//                }catch (Exception E){
//                    E.printStackTrace();
//                }
//            }
//        });

       checkbutton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               String id = choice.getSelectedItem();
               String q = "select * from patientinfo where Name = '"+id+"'";
               try {
                   conn c = new conn();
                   ResultSet resultSet = c.statement.executeQuery(q);
                   while (resultSet.next()) {
                    getroom.setText(resultSet.getString("Room_Number"));
                    updatetime.setText(resultSet.getString("Time"));
                    padamt.setText(resultSet.getString("Diposit"));

                   }
                   ResultSet resultSet1 = c.statement.executeQuery("select * from Room where room_no = '"+getroom.getText()+"'");
                   while (resultSet1.next()) {
                       String price1 = resultSet1.getString("Price");
                       int ig = Integer.parseInt(price1) - Integer.parseInt(padamt.getText());
                       pendingamt.setText(""+ig);
                   }



               }catch (Exception E){
                   E.printStackTrace();
               }
           }
       });
        JButton backbutton = new JButton("Back");
        backbutton.setBackground(Color.BLACK);
        backbutton.setForeground(Color.white);
        backbutton.setFont(new Font("Tahoma",Font.BOLD,18));
        backbutton.setBounds(400,330,130,30);
        panel.add(backbutton);

        backbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });


        setLayout(null);
        setLocation(400,180);
        setUndecorated(true);

        setSize(790,425);
        setVisible(true);


    }

    public static void main(String[] args) {
        new ptupdate();
    }
}
