package org.example;
import javax.swing.*;
import java.awt.*;

class CarlysMotto2 extends JFrame
{
    JButton b1;
    JLabel l1;
    public CarlysMotto2()
    {
        setTitle("CarlysMotto");
        setSize(700,500); //setam afisajul ferestrei pe ecran
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        setLayout(new BorderLayout());
        setContentPane(new JLabel(new ImageIcon("C:\\Users\\petru\\OneDrive\\Documente\\JavaL\\lab\\temeLaborator\\src\\main\\stelute.jpg")));
        setLayout(new FlowLayout());
        l1=new JLabel("Carly's makes the food that makes it a party");
        b1=new JButton("Buton");
        add(l1);
        add(b1);
        b1.setBounds(200,200,200,50);
        l1.setFont(new Font("Serif", Font.BOLD,32));
        b1.setForeground(Color.BLUE);



        setSize(800,500);
    }
    public static void main(String args[])
    {
        new CarlysMotto2();
    }
}