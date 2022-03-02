import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener
{
	JTextField tf1, tf2, tf3;
	JButton btn1, btn2, btn3;
	JLabel lbl1, lbl2, lbl3;

	MyFrame()
	{
		this.setSize(350,400);
		this.setTitle("ArithmeticFrame");
		this.setBackground(Color.gray);
		this.setForeground(Color.RED);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//font
		Font f=new Font("Consolas",Font.BOLD,20);
		//labels
		lbl1=new JLabel("First No");lbl1.setFont(f);
		lbl2=new JLabel("Second No");lbl2.setFont(f);
		lbl3=new JLabel("Result");lbl3.setFont(f);

		//buttons
		btn1=new JButton("ADD");btn1.addActionListener(this);btn1.setFont(f);
		btn2=new JButton("MULT");btn2.addActionListener(this);btn2.setFont(f);
		btn3=new JButton("SUB");btn3.addActionListener(this);btn3.setFont(f);

		//TextFields
		tf1=new JTextField(20);tf1.setFont(f);
		tf2=new JTextField(20);tf2.setFont(f);
		tf3=new JTextField(20);tf3.setFont(f);tf3.setEditable(false);
		this.setLayout(new FlowLayout());
		this.add(lbl1);this.add(tf1);
		this.add(lbl2);this.add(tf2);
		this.add(lbl3);this.add(tf3);
		this.add(btn1);this.add(btn2);this.add(btn3);

		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae){
		String action=ae.getActionCommand();
		int val1=Integer.parseInt(tf1.getText());
		int val2=Integer.parseInt(tf2.getText());
		switch(action)
		{
			case "ADD": tf3.setText(""+(val1+val2));
						break;
			case "MULT":tf3.setText(""+val1*val2);
						break;
			case "SUB": tf3.setText(""+(val1-val2));
						break;
		}
	}
}
class Test
{
	public static void main(String[] args)
	{
		MyFrame myFrame=new MyFrame();
	}
}