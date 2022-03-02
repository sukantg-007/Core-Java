import java.awt.*;
import java.awt.event.*;
class MyWindowListener extends WindowAdapter
{		
		public  void windowClosing(WindowEvent we){			
			System.exit(0);
		}		
}
class MyFrame extends Frame
{
	MyFrame()
	{
		this.setSize(500,500);
		this.setTitle("WindowFrame");
		this.setBackground(Color.orange);
		this.addWindowListener(new MyWindowListener());
		this.setVisible(true);
	}
}