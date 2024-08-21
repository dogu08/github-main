package ornek;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CheckboxFrame extends JFrame implements ItemListener {

	Font myFont = new Font("SERİF", Font.BOLD, 12);
	private Font f;
	private JCheckBox check1, check2, check3;
	private JTextField text1;

	public CheckboxFrame() {
		check1 = new JCheckBox("Bold");
		check2 = new JCheckBox("İtalic");
		check3 = new JCheckBox("Bold + İtalic");

		text1 = new JTextField("Advance Java Program");

		setLayout(new FlowLayout());
		add(check1);
		check1.addItemListener(this);
		add(check2);
		check2.addItemListener(this);
		add(check3);
		check3.addItemListener(this);

		add(text1);

		setTitle("Testing with Checkbox");
		setVisible(true);
		setSize(300, 150);
		setLocationRelativeTo(null);

	}

	public static void main(String[] args) {
		new CheckboxFrame();

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (check1.isSelected()) {

			f = new Font("SERİF", Font.BOLD, 12);
			text1.setFont(f);
		} else if (check2.isSelected()) {
			f = new Font("SERİF", Font.ITALIC, 12);
			text1.setFont(f);
		} else if (check3.isSelected()) {
			f = new Font("SERİF", Font.ITALIC + Font.BOLD, 12);
			text1.setFont(f);
		}
	}

}
