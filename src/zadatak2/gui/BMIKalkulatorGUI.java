package zadatak2.gui;

import zadatak2.poslovna_logika.BMIKalkulator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BMIKalkulatorGUI extends JFrame {
    private JTextField poljeVisina;
    private JTextField poljeTezina;
    private JButton izracunajBMIButton;
    private JTextField poljeBMI;
    private JPanel mojPanel;

    private BMIKalkulator bmiKalkulator = new BMIKalkulator();

    public BMIKalkulatorGUI() {
        setContentPane(mojPanel);
        setBounds(100, 100, 300, 250);
        //pack();
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("BMICalculator");


        izracunajBMIButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double visina = Double.parseDouble(poljeVisina.getText());
                double tezina = Double.parseDouble(poljeTezina.getText());

                double bmi = bmiKalkulator.izracunajBMI(visina,tezina);
                poljeBMI.setText(bmi+"");
            }
        });
    }

    public static void main(String[] args) {
        new BMIKalkulatorGUI().setVisible(true);
    }
}
