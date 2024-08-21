package ornek;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorApp extends JFrame implements ActionListener {
	private JTextField textField1, textField2, resultField;
	private JComboBox<String> operationComboBox;

	public CalculatorApp() {
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		textField1 = createTextField(100, 50);
		textField2 = createTextField(100, 50);

		operationComboBox = new JComboBox<>(new String[] { "İşlemi Seçin", "+", "-", "*", "/" });
		operationComboBox.setPreferredSize(new Dimension(100, 50));
		operationComboBox.addActionListener(this);

		resultField = createTextField(150, 50);
		resultField.setEditable(false);

		add(textField1);
		add(operationComboBox);
		add(textField2);
		add(new JLabel("="));
		add(resultField);

		pack();
		setVisible(true);
	}

	private JTextField createTextField(int width, int height) {
		JTextField textField = new JTextField(10);
		textField.setPreferredSize(new Dimension(150, 50));
		return textField;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		calculate();
	}

	private void calculate() {
		if (!operationComboBox.getSelectedItem().equals("İşlemi Seçin")) {
			try {
				double num1 = Double.parseDouble(textField1.getText());
				double num2 = Double.parseDouble(textField2.getText());
				String operation = (String) operationComboBox.getSelectedItem();
				double result = 0;

				switch (operation) {
				case "+":
					result = num1 + num2;
					break;
				case "-":
					result = num1 - num2;
					break;
				case "*":
					result = num1 * num2;
					break;
				case "/":
					if (num2 != 0) {
						result = num1 / num2;
					} else {
						resultField.setText("0'a bölme hatası!");
						return;
					}
					break;
				}

				resultField.setText(Double.toString(result));
			} catch (NumberFormatException e) {
				resultField.setText("Geçersiz sayı");
			}
		} else {
			resultField.setText("");
		}
	}

	public static void main(String[] args) {

		new CalculatorApp();

	}
}
