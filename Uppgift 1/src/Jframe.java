import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Jframe extends JFrame {

	private JPanel contentPane;
	private House[] myHouses;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jframe frame = new Jframe();
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
	public Jframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 413, 344);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(176, 165, -30, -26);
		contentPane.add(scrollPane);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(29, 25, 354, 231);
		contentPane.add(textArea);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 395, 297);
		lblNewLabel.setIcon(new ImageIcon(Jframe.class
				.getResource("/image/NY11.jpg")));
		contentPane.add(lblNewLabel);

		House house1 = new House(1985, 120);
		House house2 = new House(1993, 150);
		House house3 = new House(1996, 160);
		House house4 = new House(1996, 160);

		myHouses = new House[10];
		myHouses[1] = house1;
		myHouses[2] = house2;
		myHouses[3] = house3;
		myHouses[4] = house4;

		for (int i = 0; i < myHouses.length; i++) {
			if (myHouses[i] != null) {
				int houseSize = myHouses[i].getSize();
				int houseYear = myHouses[i].getYear();

				textArea.append("detta huset är byggt " + houseYear + "som är "
						+ houseSize + "kvm stort \n");
			}
		}
		textArea.append("Det finns totalt: " + House.getNbrHouses()+ " stycken hus ");
	}
}
