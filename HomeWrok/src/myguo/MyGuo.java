package myguo;
import javax.swing.*;

public class MyGuo {

    JFrame f;
    JButton bt1 , bt2 ;
    JTextField t1,t2;
    JLabel l1,l2;

   public MyGuo(){

        f=new JFrame("LOG IN FORM");
        f.setLocation(500,300);
        f.setSize(400,300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1=new JLabel("NAME");
        l1.setBounds(50,70,80,30);

        l2=new JLabel("PASSWORD");
        l2.setBounds(50,100,80,30);

        t1=new JTextField();
        t1.setBounds(140, 70, 200,30);

         t2=new JTextField();
        t2.setBounds(140, 110, 200,30);

        bt1 =new JButton("LOG IN");
        bt1.setBounds(150,150,80,30);

        bt2 =new JButton("CLEAR");
        bt2.setBounds(235,150,80,30);

         f.add(l1);
        f.add(l2);
         f.add(t1);
         f.add(t2);
         f.add(bt1);
         f.add(bt2);

    f.setVisible(true);

    }
    public static void main(String[] args) {
        new MyGuo();
}
}