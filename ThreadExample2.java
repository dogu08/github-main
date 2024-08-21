package D2Ders14;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ThreadExample2 extends JFrame implements ActionListener{
	
	private JLabel lblNumber;
	static JLabel lblEmpty; 
	static JTextField text1;
	private JButton btn;
	
	
	
	
	public ThreadExample2()
	{
		setLayout(new GridLayout(2,2));
		
		lblNumber = new JLabel("Number");
		lblEmpty = new JLabel();
		text1 =new JTextField();
		btn = new JButton("Calculate");
		btn.addActionListener(this);
		
		Component[] comp = {lblNumber, text1, lblEmpty, btn};
		
		for(int i=0;i<comp.length;i++)
		{
			add(comp[i]);
		}
		
		
		
		setTitle("My Frame");
		setVisible(true);
		setSize(300,150);
		setLocationRelativeTo(null);
	}
	
	
	
	 

	public static void main(String[] args) {
		new ThreadExample2();
	}





	@Override
	public void actionPerformed(ActionEvent e) {
		
		new ThreadExample3().start();
	}
}
