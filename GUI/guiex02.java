import java.awt.*;
class MyFrame extends Frame
{
	MyFrame()
	{
		this.setSize(400,400);
		this.setTitle("Demo Frame");
		this.setBackground(Color.lightGray);
		this.setResizable(false);
		this.setVisible(true);
		this.repaint();
	}
	public void paint(Graphics g)
	{
		Font f=new Font("Consolas", Font.BOLD,40);
		g.setFont(f);
		g.drawString("AWT Programming",50,100);
	}
}
class Test
{
	public static void main(String[] args)
	{
		MyFrame f=new MyFrame();
	}
}