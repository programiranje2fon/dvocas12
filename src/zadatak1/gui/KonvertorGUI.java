package zadatak1.gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import zadatak1.poslovna_logika.Konvertor;

public class KonvertorGUI extends JFrame {

	private static final long serialVersionUID = 1L;

	private Konvertor konvertor = new Konvertor();

	private JPanel contentPane;
	private JLabel lblIznosUDinarima;
	private JLabel lblIznosUEvrima;
	private JTextField dinariField;
	private JTextField evriField;
	private JButton btnKonvertujDue;
	private JButton btnKonvertujEud;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KonvertorGUI frame = new KonvertorGUI();
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
	public KonvertorGUI() {
		setTitle("Konvertor valuta");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 423, 220);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblIznosUDinarima());
		contentPane.add(getLblIznosUEvrima());
		contentPane.add(getDinariField());
		contentPane.add(getEvriField());
		contentPane.add(getBtnKonvertujDue());
		contentPane.add(getBtnKonvertujEud());
	}

	private JLabel getLblIznosUDinarima() {
		if (lblIznosUDinarima == null) {
			lblIznosUDinarima = new JLabel("Iznos u dinarima:");
			lblIznosUDinarima.setBounds(41, 47, 144, 14);
		}
		return lblIznosUDinarima;
	}

	private JLabel getLblIznosUEvrima() {
		if (lblIznosUEvrima == null) {
			lblIznosUEvrima = new JLabel("Iznos u evrima:");
			lblIznosUEvrima.setBounds(232, 47, 144, 14);
		}
		return lblIznosUEvrima;
	}

	private JTextField getDinariField() {
		if (dinariField == null) {
			dinariField = new JTextField();
			dinariField.setBounds(41, 79, 144, 20);
			dinariField.setColumns(10);
		}
		return dinariField;
	}

	private JTextField getEvriField() {
		if (evriField == null) {
			evriField = new JTextField();
			evriField.setBounds(232, 79, 144, 20);
			evriField.setColumns(10);
		}
		return evriField;
	}

	private JButton getBtnKonvertujDue() {
		if (btnKonvertujDue == null) {
			btnKonvertujDue = new JButton("Dinari u evre");
			btnKonvertujDue.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					double dinari = Double.parseDouble(dinariField.getText());
					double evri = konvertor.konvertujDinareUEvre(dinari);
					evriField.setText("" + evri);
				}
			});
			btnKonvertujDue.setBounds(41, 127, 144, 23);
		}
		return btnKonvertujDue;
	}

	private JButton getBtnKonvertujEud() {
		if (btnKonvertujEud == null) {
			btnKonvertujEud = new JButton("Evri u dinare");
			btnKonvertujEud.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					double evri = Double.parseDouble(evriField.getText());
					double dinari = konvertor.konvertujEvreUDinare(evri);
					dinariField.setText("" + dinari);
				}
			});
			btnKonvertujEud.setBounds(232, 127, 144, 23);
		}
		return btnKonvertujEud;
	}
}
