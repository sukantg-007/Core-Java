import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame
{
	MyFrame()
	{
		this.setSize(500,500);
		this.setTitle("WindowFrame");
		this.setBackground(Color.orange);
		this.addWindowListener(new WindowAdapter(){
				public  void windowClosing(WindowEvent we){			
				System.exit(0);
		 }	
		});
		this.setVisible(true);
	}
}