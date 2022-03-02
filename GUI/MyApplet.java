import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class MyApplet extends Applet implements ActionListener
{
	Button b;
	Label l;
	public void init()
	{
		this.setLayout(new FlowLayout());
		this.setSize(400,400);
		this.setBackground(Color.green);
		this.setForeground(Color.RED);
		b=new Button("Click Me");
		this.add(b);b.addActionListener(this);
		Font f=new Font("Times New Roman", Font.BOLD, 25);
		
		l=new Label();l.setFont(f);		
		this.add(l);
		validate();		
		
	}
	
	public void paint(Graphics g)
	{
		Font f=new Font("Times New Roman", Font.BOLD, 25);
		g.setFont(f);
		g.drawString("Welcome to Applet", 100, 200);
	}

	public void actionPerformed(ActionEvent ae)
	{
			l.setText("This is from button");			
			revalidate();
	}
}