import java.awt.*;
import java.awt.event.*;
class Login implements ActionListener
{
	
Frame f;
Label L1,L2;
TextField T1,T2;
Button b1,b2;
login()
{
f=new Frame();
L1=new Label("username");
L2=new Label("password");
T1=new TextField(10);
T2=new TextField(10);
b1=new Button("submit");
b2=new Button("clear");
f.add(L1);f.add(T1);
f.add(L2);f.add(T2);
f.add(b1);f.add(b2);
b1.addActionListener(this);
b2.addActionListener(this);
f.setLayout(new FlowLayout());
f.setSize(200,200);
f.setLocation(400,400);
f.setVisible(true);
f.setTtile("logindemo");
}
public void actionPerformed(ActionEvent ae)
{
String s1=T1.getText();
String s2=T2.getText();
if(ae.getSource()==b1)
{
if(s1.equals("kanifnath") && s2.equals("7028534834"))
{
	Frame f=new Frame();
	Label n=new Label("valid username and password");
	f.add(n);
	f.setLayout(new FlowLayout());
	f.setVisible(true);
	f.setSize(200,200);
	f.setLocation(400,400);
	

}
else
{
    Frame f=new Frame();
	Label n=new Label("invalid username and password");
	f.add(n);
	f.setLayout(new FlowLayout());
	f.setVisible(true);
	f.setSize(200,200);
	f.setLocation(400,400);
}
if(ae.getSource==b2)
{
	T1.setText("");
	T2.ste.Text("");
}
		
}

public static void main(String [] args)
{
new Login();
}
}

