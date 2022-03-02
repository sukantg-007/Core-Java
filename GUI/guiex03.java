import java.awt.*;
import java.awt.event.*;
class MyWindowListener implements WindowListener
{
		public  void windowOpened(WindowEvent we){
			System.out.println("windowOpened");
		}
		public  void windowClosing(WindowEvent we){
			System.out.println("windowClosing");
			System.exit(0);
		}
		public  void windowClosed(WindowEvent we){
			System.out.println("windowClosed");
		}
		public  void windowIconified(WindowEvent we){
			System.out.println("windowIconified");
		}
		public  void windowDeiconified(WindowEvent we){
			System.out.println("windowDeiconified");
		}
		public  void windowActivated(WindowEvent we){
			System.out.println("windowActivated");
		}
		public  void windowDeactivated(WindowEvent we){
			System.out.println("windowDeactivated");
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