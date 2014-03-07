import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class HumansAndDogs extends JFrame {

	private JTextArea info;
	private JTextArea error;
	private JPanel contentPane;
	private JTextField humanname;
	private JTextField dogname;
	
	Human humans;
	Dog dog;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HumansAndDogs frame = new HumansAndDogs();
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
	public HumansAndDogs() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 458, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHumansAndDogs = new JLabel("Humans and Dogs");
		lblHumansAndDogs.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblHumansAndDogs.setBounds(152, 13, 154, 46);
		contentPane.add(lblHumansAndDogs);
		
		humanname = new JTextField();
		humanname.setBounds(28, 68, 116, 22);
		contentPane.add(humanname);
		humanname.setColumns(10);
		
		dogname = new JTextField();
		dogname.setBounds(28, 106, 116, 22);
		contentPane.add(dogname);
		dogname.setColumns(10);
		
		JButton btnNewHuman = new JButton("New Human");
		btnNewHuman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				if (humanname.getText().length()>=2){
					humans = new Human (humanname.getText());
					error.setText("");	
				}
				
				else{
					error.setText("Invalid name for human");
				}
			}
		});
		btnNewHuman.setBounds(191, 67, 115, 25);
		contentPane.add(btnNewHuman);
		
		JButton btnBuyDog = new JButton("Buy Dog");
		btnBuyDog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {if (humans!=null){
				dog = new Dog(); 
				dog.setName(dogname.getText());
				humans.buyDog(dog); 
				error.setText(" ");
	      } else {
	    	  error.setText("Dog needs to have a human");
		}
				
				
			}
		});
		btnBuyDog.setBounds(191, 105, 115, 25);
		contentPane.add(btnBuyDog);
		
		JButton btnPrintInfo = new JButton("Print info");
		btnPrintInfo.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
				
				info.setText(humans.getInfo());
					
			}
		});
		btnPrintInfo.setBounds(191, 143, 115, 25);
		contentPane.add(btnPrintInfo);
		
		JLabel lblInfo = new JLabel("Info");
		lblInfo.setBounds(28, 199, 56, 16);
		contentPane.add(lblInfo);
		
		JLabel lblErrormessage = new JLabel("ErrorMessage");
		lblErrormessage.setBounds(28, 247, 92, 16);
		contentPane.add(lblErrormessage);
		
		info = new JTextArea();
		info.setBounds(28, 217, 334, 22);
		contentPane.add(info);
		
		error= new JTextArea();
		error.setBounds(28, 268, 334, 22);
		contentPane.add(error);
	}
}
