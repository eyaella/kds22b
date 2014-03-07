package uppgift2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.SystemColor;

public class Calcuator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private CalculatorGUI myCalculator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calcuator frame = new Calcuator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the frame.
	 */
	public Calcuator() {
		myCalculator = new CalculatorGUI ();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 376, 359);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				myCalculator.numberButtonPressed(7);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		btnNewButton.setBounds(12, 98, 67, 37);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("4");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(4);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		btnNewButton_1.setBounds(12, 148, 67, 37);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("1");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(1);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		btnNewButton_2.setBounds(12, 196, 67, 37);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("0");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(0);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		btnNewButton_3.setBounds(108, 246, 67, 37);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("8");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(8);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		btnNewButton_4.setBounds(108, 98, 67, 37);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("5");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(5);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		btnNewButton_5.setBounds(108, 148, 67, 37);
		contentPane.add(btnNewButton_5);
		
		JButton button = new JButton("2");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(2);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button.setBounds(108, 196, 67, 37);
		contentPane.add(button);
		
		JButton button_1 = new JButton("9");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(9);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button_1.setBounds(201, 98, 67, 37);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("6");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(6);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button_2.setBounds(201, 148, 67, 37);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(3);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button_3.setBounds(201, 196, 67, 37);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("-");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.minus();
				String i = myCalculator.getOperator();
				textField.setText(String.valueOf(i));
			}
		});
		button_4.setBounds(280, 148, 69, 37);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("+");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.plus();
				String i = myCalculator.getOperator();
				textField.setText(String.valueOf(i));
			}
		});
		button_5.setBounds(280, 196, 69, 37);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("*");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.mult();
			    int i = myCalculator.getResult();
				textField.setText(String.valueOf(i));
				
			}
		});
		button_6.setBounds(280, 98, 69, 37);
		contentPane.add(button_6);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.equals();
			    int i = myCalculator.getResult();
				textField.setText(String.valueOf(i));
				
			}
			
		});
		btnEnter.setBounds(255, 246, 91, 37);
		contentPane.add(btnEnter);
		
		textField = new JTextField();
		textField.setBounds(12, 23, 338, 62);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
