package zadatak1.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import zadatak1.poslovna_logika.Konvertor;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class KonvertorGUI {

	private JFrame frmKonverrorValuta;
	private JTextField dinField;
	private JTextField eurField;
	
	private Konvertor konvertor = new Konvertor();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KonvertorGUI window = new KonvertorGUI();
					window.frmKonverrorValuta.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public KonvertorGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmKonverrorValuta = new JFrame();
		frmKonverrorValuta.setTitle("Konverror valuta");
		frmKonverrorValuta.setBounds(100, 100, 450, 300);
		frmKonverrorValuta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmKonverrorValuta.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dinarski iznos");
		lblNewLabel.setBounds(43, 51, 86, 14);
		frmKonverrorValuta.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Iznos u evrima");
		lblNewLabel_1.setBounds(206, 51, 94, 14);
		frmKonverrorValuta.getContentPane().add(lblNewLabel_1);
		
		dinField = new JTextField();
		dinField.setBounds(43, 86, 111, 20);
		frmKonverrorValuta.getContentPane().add(dinField);
		dinField.setColumns(10);
		
		eurField = new JTextField();
		eurField.setBounds(206, 86, 111, 20);
		frmKonverrorValuta.getContentPane().add(eurField);
		eurField.setColumns(10);
		
		JButton btnKonvertujDUE = new JButton("Konvertuj DUE");
		btnKonvertujDUE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double dinari = Double.parseDouble(dinField.getText());
				double evri = konvertor.konvertujDUE(dinari);
				eurField.setText(""+evri);				
			}
		});
		btnKonvertujDUE.setBounds(43, 133, 111, 23);
		frmKonverrorValuta.getContentPane().add(btnKonvertujDUE);
		
		JButton btnKonvertujEUD = new JButton("Konvertuj EUD");
		btnKonvertujEUD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double evri = Double.parseDouble(eurField.getText());
				double dinari = konvertor.konvertujEUD(evri);
				dinField.setText(""+dinari);
				
			}
		});
		btnKonvertujEUD.setBounds(206, 133, 125, 23);
		frmKonverrorValuta.getContentPane().add(btnKonvertujEUD);
	}
}
