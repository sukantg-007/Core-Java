import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class MyAppletDemo extends Applet implements ActionListener
{
	TextField ftf, stf, rtf;
	Label first, second, result;
	Button add, mult, sub;

	public MyAppletDemo(){
		this.setSize(400,400);
		this.setBackground(Color.pink);
		this.setLayout(new GridBagLayout());		
		//add component
		ftf=new TextField(20);
		stf=new TextField(20);
		rtf=new TextField(20);

		first=new Label("First Number ");
		second=new Label("Second Number ");
		result=new Label("Result ");

		add=new Button("Add");add.addActionListener(this);
		mult=new Button("Mult");mult.addActionListener(this);
		sub=new Button("Sub");sub.addActionListener(this);

		GridBagConstraints gbc=new GridBagConstraints();
		gbc.fill=GridBagConstraints.HORIZONTAL;
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.gridwidth = 2;
		this.add(first,gbc);
		gbc.gridx=2;
		gbc.gridy=0;
		gbc.gridwidth = 2;
		this.add(ftf,gbc);

		gbc.gridx=0;
		gbc.gridy=2;
		gbc.gridwidth = 2;
		this.add(second,gbc);
		gbc.gridx=2;
		gbc.gridy=2;
		gbc.gridwidth = 2;
		this.add(stf,gbc);
		
		gbc.gridx=0;
		gbc.gridy=4;
		gbc.gridwidth = 2;
		this.add(result,gbc);
		gbc.gridx=2;
		gbc.gridy=4;
		gbc.gridwidth = 2;
		this.add(rtf,gbc);rtf.setEditable(false);
		gbc.gridx=0;
		gbc.gridy=6;
		gbc.gridwidth = 2;
		this.add(add,gbc);
		gbc.gridx=2;
		gbc.gridy=6;
		gbc.gridwidth = 2;
		this.add(mult,gbc);
		gbc.gridx=4;
		gbc.gridy=6;
		gbc.gridwidth = 2;
		this.add(sub,gbc);
		this.setVisible(true);

	}
	public void init(){		
		new MyAppletDemo();
	}
	public void actionPerformed(ActionEvent ae){
		String command=ae.getActionCommand();
		int x=0;
		int y=0;
		switch(command){
			case "Add": x=Integer.parseInt(ftf.getText());
						y=Integer.parseInt(stf.getText());
						rtf.setText(""+(x+y));
						break;
			case "Mult":x=Integer.parseInt(ftf.getText());
						y=Integer.parseInt(stf.getText());
						rtf.setText(""+(x*y));
						break;
			case "Sub": x=Integer.parseInt(ftf.getText());
						y=Integer.parseInt(stf.getText());
						rtf.setText(""+(x-y));
						break;
		}
	}
}

//<applet code="MyAppletDemo" width="400" height="400"></applet>