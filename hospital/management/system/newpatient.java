package hospital.management.system;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.*;
import java.awt.*;

public class newpatient extends JFrame implements ActionListener {
    JComboBox comboBox;

    JTextField textFieldnumber ,textName,textcountry ,diposit;
    JRadioButton r1 ,r2;
    Choice c1;

    JLabel date;
    JButton b1 ,b2;

newpatient(){
    JPanel panel = new JPanel();
    panel.setBounds(5,5,840,540);
    panel.setBackground(new Color(90,156,163));
    panel.setLayout(null);

    add(panel);

    ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/pt.png"));
    Image image = imageIcon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
    ImageIcon imageIcon1 = new ImageIcon(image);
    JLabel label = new JLabel(imageIcon1);
    label.setBounds(550,150,200,200);
    panel.add(label);

    JLabel label1 = new JLabel("NEW PATIENT FORM ");
    label1.setBounds(118,11,260,53);
    label1.setFont(new Font("Tahoma ",Font.BOLD,20));
    panel.add(label1);

    JLabel label2 = new JLabel("ID : ");
    label2.setFont(new Font("Tahoma",Font.BOLD,15));
    label2.setForeground(Color.WHITE);
    label2.setBounds(25,100,260,53);
    panel.add(label2);

    comboBox = new JComboBox(new String[] { "Adhar ","voter","Driveing "});
    comboBox.setBounds(200,110,150,30);
    comboBox.setBackground((new Color(119, 2, 166)));
    comboBox.setForeground(Color.WHITE);
    comboBox.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    comboBox.setFont(new Font("Tahoma",Font.BOLD,20));
    panel.add(comboBox);

    JLabel labelNumber = new JLabel("ID Number : ");
    labelNumber.setBounds(25,75,200,200);
    labelNumber.setFont(new Font("Tahoma",Font.BOLD,15));
    labelNumber.setForeground(Color.white);
    panel.add(labelNumber);



    textFieldnumber = new JTextField();
    textFieldnumber.setBounds(200,150,150,30);
    textFieldnumber.setFont(new Font("Tahoma",Font.BOLD,14));
//    textFieldnumber.setBackground(new Color(9, 150, 136));
    textFieldnumber.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
    panel.add(textFieldnumber);


    JLabel labalname = new JLabel("Patient Name : ");
    labalname.setBounds(25,110,200,200);
    labalname.setFont(new Font("Tahoma",Font.BOLD,15));
    labalname.setForeground(Color.white);
    panel.add(labalname);

    textName = new JTextField();
    textName.setBounds(200,200,150,30);
    textName.setFont(new Font("Tahoma",Font.BOLD,14));
//    textName.setBackground(new Color(9, 150, 136));
    textName.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
    panel.add(textName);


//    textName = new JTextField();
//    textName.setBounds(200,200,150,30);
//    textName.setFont(new Font("Tahoma",Font.BOLD,14));
//    textName.setBackground(new Color(9, 150, 136));
//    textName.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
//    panel.add(textName);

    JLabel labalgender = new JLabel("Gender ");
    labalgender.setBounds(25,155,200,200);
    labalgender.setFont(new Font("Tahoma",Font.BOLD,15));
    labalgender.setForeground(Color.white);
    panel.add(labalgender);

    r1 =new JRadioButton("Male");
    r1.setBounds(200,250,80,15);
    r1.setForeground(Color.white);
    r1.setFont(new Font("Tahoma",Font.BOLD,15));
    r1.setBackground(new Color(90,156,163));

    panel.add(r1);

    r2 =new JRadioButton("Female");
    r2.setBounds(280,250,100,15);
    r2.setForeground(Color.white);
    r2.setFont(new Font("Tahoma",Font.BOLD,15));
    r2.setBackground(new Color(90,156,163));
    panel.add(r2);

    JLabel labalDises = new JLabel("Disese ");
    labalDises.setBounds(25,200,200,200);
    labalDises.setFont(new Font("Tahoma",Font.BOLD,15));
    labalDises.setForeground(Color.white);
    panel.add(labalDises);

    textcountry = new JTextField();
    textcountry.setBounds(200,280,150,30);
    textcountry.setFont(new Font("Tahoma",Font.BOLD,14));
//    textcountry.setBackground(new Color(9, 150, 136));
    textcountry.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
    panel.add(textcountry);

    JLabel labalroom = new JLabel("Room : ");
    labalroom.setBounds(25,240,200,200);
    labalroom.setFont(new Font("Tahoma",Font.BOLD,15));
    labalroom.setForeground(Color.white);
    panel.add(labalroom);

    c1 = new Choice();
    try {
        conn c = new conn();
        ResultSet resultSet = c.statement.executeQuery("select * from room");
        while (resultSet.next()){
            c1.add(resultSet.getString("room_no"));
        }
    } catch (Exception e) {
        e.printStackTrace();

    }

    c1.setBounds(180,325,200,30);
    c1.setFont(new Font("Tahoma",Font.BOLD,15));
    c1.setForeground(Color.WHITE);
    c1.setForeground(new Color(3,45,48));
    panel.add(c1);

//    JTextField Room = new JTextField();
//    Room.setBounds(200,325,150,30);
//    Room.setFont(new Font("Tahoma",Font.BOLD,14));
////    textcountry.setBackground(new Color(9, 150, 136));
//    Room.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
//    panel.add(Room);

     date = new JLabel("Date and Time : ");
    date.setBounds(25,280,200,200);
    date.setFont(new Font("Tahoma",Font.BOLD,15));
    date.setForeground(Color.white);
    panel.add(date);

    Date date1 = new Date();
    date = new JLabel(""+date1);
    date.setBounds(200,370,300,14);
    date.setFont(new Font("Tahoma",Font.BOLD,15));
    date.setForeground(Color.red);
    panel.add(date);



    JLabel labaldiposit = new JLabel("Diposit : ");
    labaldiposit.setBounds(25,315,200,200);
    labaldiposit.setFont(new Font("Tahoma",Font.BOLD,15));
    labaldiposit.setForeground(Color.white);
    panel.add(labaldiposit);

     diposit = new JTextField();
    diposit.setBounds(200,400,150,30);
    diposit.setFont(new Font("Tahoma",Font.BOLD,14));
//    textcountry.setBackground(new Color(9, 150, 136));
    diposit.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
    panel.add(diposit);

    b1 = new JButton("ADD");
    b1.setBounds(60,450,100,30);
    b1.setFont(new Font("Tahoma",Font.BOLD,15));
    b1.setBackground(Color.BLACK);
    b1.setForeground(Color.white);
    b1.addActionListener(this);
    panel.add(b1);


    b2 = new JButton("Back");
    b2.setBounds(250,450,100,30);
    b2.setFont(new Font("Tahoma",Font.BOLD,15));
    b2.setBackground(Color.BLACK);
    b2.setForeground(Color.white);
    b2.addActionListener(this);
    panel.add(b2);









    setUndecorated(true);
   setLayout(null);
   setLocation(270,180);
    setSize(800,500);
    setVisible(true);

}

    public static void main(String[] args) {
        new newpatient();
    }

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== b1){
            conn c = new conn();
            String redioBTN = null;
            if (r1.isSelected()){
                redioBTN = "Male";

            }else if (r2.isSelected()){
                redioBTN = "Female";
            }
            String s1 = (String) comboBox.getSelectedItem();
            String s2 = (String) textFieldnumber.getText();
            String s3 = (String) textName.getText();
            String s4 = redioBTN;
            String s5 = (String)textcountry.getText();
            String s6 = c1.getSelectedItem();
            String s7 = date.getText();
            String s8 = (String)diposit.getText();

            try {
                String q = "insert into patientinfo values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"')";
                String q1 = "update Room set Availability = 'Occupied' where room_no ="+s6;
                c.statement.executeUpdate(q);
                c.statement.executeUpdate(q1);
                JOptionPane.showMessageDialog(null,"Added Successefuly");
                setVisible(false);
            }catch (Exception E){
                E.printStackTrace();
            }
        }else {
            setVisible(false);
        }


    }
}
