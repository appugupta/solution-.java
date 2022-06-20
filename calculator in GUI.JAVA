package calculater;
import java.awt.*;

import java.awt.event.*;
import javax.swing.*;
public class program1 extends JFrame implements ActionListener
{
//Frame f;
JFrame f=new JFrame();
Label l1=new Label("enter 1st number");
Label l2=new Label("enter 2nd number");
Label l3=new Label("Result");
TextField t1=new TextField();
TextField t2=new TextField();
TextField t3=new TextField();
Button b1=new Button("Add");
Button b2=new Button("Sub");
Button b3=new Button("Mult");
Button b4=new Button("div");
Button b5=new Button("cancel");
program1()
{
l1.setBounds(50,100,100,20);
l2.setBounds(50,130,100,20);
l3.setBounds(50,170,100,20);
t1.setBounds(200,100,100,20);
t2.setBounds(200,140,100,20);
t3.setBounds(200,180,100,20);
b1.setBounds(10,250,100,20);
b2.setBounds(100,250,100,20);
b3.setBounds(200,250,100,20);
b4.setBounds(300,250,100,20);
b5.setBounds(400,250,100,20);
f.setLayout(null);
f.setVisible(true);
f.setSize(600,400);
f.add(l1);
f.add(t1);
f.add(l2);
f.add(t2);
f.add(b1);
f.add(b2);
f.add(b3);
f.add(b4);
f.add(b5);
f.add(l3);
f.add(t3); 
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);

}
public void actionPerformed(ActionEvent ee)
{
int n1=Integer.parseInt(t1.getText());
int n2=Integer.parseInt(t2.getText());
if(ee.getSource().equals(b1))
{
t3.setText(String.valueOf(n1+n2));
}

if(ee.getSource().equals(b2))
{
t3.setText(String.valueOf(n1-n2));
}

if(ee.getSource().equals(b3))
{
t3.setText(String.valueOf(n1*n2));
}

if(ee.getSource().equals(b4))
{
t3.setText(String.valueOf(n1/n2));
}
if(ee.getSource().equals(b5))
{
System.exit(0);
}
}
 public static void main(String [] args)
{
new program1();
}
}
