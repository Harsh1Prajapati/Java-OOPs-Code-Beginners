import javax.swing.*;
class Sec{
public static void main(String args[]){
JFrame f=new JFrame();
JButton b=new JButton("Harsh");
JButton b1=new JButton("Aayush");
JButton b2=new JButton("Gauri");
b.setBounds(40,50,90,40);
b1.setBounds(140,50,90,40);
b2.setBounds(240,50,90,40);
f.add(b);
f.add(b1);
f.add(b2);
f.setSize(400,400);
f.setLayout(null);
f.setVisible(true);
}}
