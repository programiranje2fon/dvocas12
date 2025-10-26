package zadatak2.gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import zadatak2.poslovna_logika.BMIKalkulator;

public class BMIKalkulatorGUI extends JFrame {

	private static final long serialVersionUID = 1L;

	private BMIKalkulator bmiKalkulator = new BMIKalkulator();
	
	private JPanel contentPane;
	private JLabel lblVisina;
	private JLabel lblTezina;
	private JTextField visinaField;
	private JTextField tezinaField;
	private JButton btnIzracunajBmi;
	private JLabel lblBmi;
	private JTextField bmiField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BMIKalkulatorGUI frame = new BMIKalkulatorGUI();
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
	public BMIKalkulatorGUI() {
		setTitle("BMI Kalkulator");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 296, 279);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblVisina());
		contentPane.add(getLblTezina());
		contentPane.add(getVisinaField());
		contentPane.add(getTezinaField());
		contentPane.add(getBtnIzracunajBmi());
		contentPane.add(getLblBmi());
		contentPane.add(getBmiField());
	}

	private JLabel getLblVisina() {
		if (lblVisina == null) {
			lblVisina = new JLabel("Visina:");
			lblVisina.setBounds(35, 40, 46, 14);
		}
		return lblVisina;
	}

	private JLabel getLblTezina() {
		if (lblTezina == null) {
			lblTezina = new JLabel("Tezina:");
			lblTezina.setBounds(35, 90, 46, 14);
		}
		return lblTezina;
	}

	private JTextField getVisinaField() {
		if (visinaField == null) {
			visinaField = new JTextField();
			visinaField.setBounds(123, 37, 136, 20);
			visinaField.setColumns(10);
		}
		return visinaField;
	}

	private JTextField getTezinaField() {
		if (tezinaField == null) {
			tezinaField = new JTextField();
			tezinaField.setBounds(123, 87, 136, 20);
			tezinaField.setColumns(10);
		}
		return tezinaField;
	}

	private JButton getBtnIzracunajBmi() {
		if (btnIzracunajBmi == null) {
			btnIzracunajBmi = new JButton("Izracunaj BMI");
			btnIzracunajBmi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					double visina = Double.parseDouble(visinaField.getText());
					double tezina = Double.parseDouble(tezinaField.getText());
					double bmi = bmiKalkulator.izracunajBMI(visina, tezina);
					bmiField.setText("" + bmi);
				}
			});
			btnIzracunajBmi.setBounds(35, 142, 131, 23);
		}
		return btnIzracunajBmi;
	}

	private JLabel getLblBmi() {
		if (lblBmi == null) {
			lblBmi = new JLabel("BMI:");
			lblBmi.setBounds(35, 205, 61, 14);
		}
		return lblBmi;
	}

	private JTextField getBmiField() {
		if (bmiField == null) {
			bmiField = new JTextField();
			bmiField.setBounds(123, 202, 136, 20);
			bmiField.setColumns(10);
		}
		return bmiField;
	}
}
