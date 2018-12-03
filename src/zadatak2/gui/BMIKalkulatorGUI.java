package zadatak2.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import zadatak2.poslovna_logika.BMIKalkulator;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BMIKalkulatorGUI {

	private JFrame frmBmiKalkulator;
	private JTextField visinaField;
	private JTextField tezinaField;
	private JTextField bmiField;
	private BMIKalkulator bmiKalkulator = new BMIKalkulator();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BMIKalkulatorGUI window = new BMIKalkulatorGUI();
					window.frmBmiKalkulator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BMIKalkulatorGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBmiKalkulator = new JFrame();
		frmBmiKalkulator.setTitle("BMI Kalkulator");
		frmBmiKalkulator.setBounds(100, 100, 270, 300);
		frmBmiKalkulator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBmiKalkulator.getContentPane().setLayout(null);
		
		JLabel lblVisina = new JLabel("Visina:");
		lblVisina.setBounds(26, 32, 46, 14);
		frmBmiKalkulator.getContentPane().add(lblVisina);
		
		JLabel lblTezina = new JLabel("Tezina:");
		lblTezina.setBounds(26, 76, 46, 14);
		frmBmiKalkulator.getContentPane().add(lblTezina);
		
		visinaField = new JTextField();
		visinaField.setBounds(133, 29, 86, 20);
		frmBmiKalkulator.getContentPane().add(visinaField);
		visinaField.setColumns(10);
		
		tezinaField = new JTextField();
		tezinaField.setBounds(133, 73, 86, 20);
		frmBmiKalkulator.getContentPane().add(tezinaField);
		tezinaField.setColumns(10);
		
		JButton btnIzracunajBmi = new JButton("Izracunaj BMI");
		btnIzracunajBmi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double visina = Double.parseDouble(visinaField.getText());
				double tezina = Double.parseDouble(tezinaField.getText());
				double bmi = bmiKalkulator.izracunajBMI(visina, tezina);
				bmiField.setText(""+bmi);				
			}
		});
		btnIzracunajBmi.setBounds(58, 129, 105, 23);
		frmBmiKalkulator.getContentPane().add(btnIzracunajBmi);
		
		JLabel lblBmi = new JLabel("BMI:");
		lblBmi.setBounds(26, 190, 38, 14);
		frmBmiKalkulator.getContentPane().add(lblBmi);
		
		bmiField = new JTextField();
		bmiField.setBounds(133, 187, 86, 20);
		frmBmiKalkulator.getContentPane().add(bmiField);
		bmiField.setColumns(10);
	}

}
