import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;


public class AnimalGUI extends JFrame {

	private JPanel contentPane;
	private JTextArea textArea;
	private ArrayList<Animal> animalFarm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnimalGUI frame = new AnimalGUI();
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
	public AnimalGUI() {
		animalFarm = new ArrayList<Animal>();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textArea = new JTextArea();
		textArea.setBounds(0, 25, 432, 228);
		contentPane.add(textArea);
		
		JLabel lblAnimallist = new JLabel("AnimalList");
		lblAnimallist.setFont(new Font("Microsoft Tai Le", Font.BOLD, 15));
		lblAnimallist.setBounds(12, 0, 99, 23);
		contentPane.add(lblAnimallist);
		
		animalFarm.add(new hund ("Canis latrans", 3 , true ));
		animalFarm.add(new cat ("Lynx Lynx",5 , 4 ));
		animalFarm.add(new snake ("Python regius", true ));
		animalFarm.add(new hund ("Canis aureus", 4 , false ));
		animalFarm.add(new cat ("Lynx pardinus", 5 , 9 ));
		animalFarm.add(new snake ("Leiopython fredparkeri", false ));
		
		for(Animal x : animalFarm ) {
			textArea.append (x.getInfo() + "\n");
		}
	}

	
}
