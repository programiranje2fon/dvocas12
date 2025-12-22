package zadatak1.gui;

import zadatak1.poslovna_logika.Konvertor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Klasa KonvertorGUI mora da nasledi JFrame da
// bi predstavljala pravi prozor na koji moze da
// se postavi panel koji se pravi u Swing UI grafickom editoru
public class KonvertorGUI extends JFrame {

    //Svaka od komponenti sa panela, a i sam panel
    //ce se ovde naci kao privatni atributi
    private JTextField poljeDinari;
    private JTextField poljeEvri;
    private JButton konvertujDUEButton;
    private JButton konvertujEUDButton;
    private JPanel mojPanel;

    //Konstruktor u kojem postavljamo osnovne parametre
    //samog prozora: dodavanje panela, naslov prozora,
    //kako se zatvara, da li se moze smanjiti/povecati i td.
    //Osim toga, tu su i event handler metode
    public KonvertorGUI(){
        //Postavljanje napravljenog panela na prozor
        setContentPane(mojPanel);

        //Postavljanje naslova prozora
        setTitle("Konvertor");

        //Kad se prozor zatvori, cela aplikacija se gasi
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Prozor se ne moze smanjiti/povecati
        setResizable(false);

        //Podesavanje velicine prozora u pikselima
        setSize(400, 200);
        //Umesto setSize, moze pack koji pravi prozor
        // u najmanjoj mogucoj dimenziji, a da se sve vidi
        //pack();

        // Podesavanje GDE ce se prozor iscrtati u odnosu na ekran
        // ovako ce se iscrtati na sredini
        setLocationRelativeTo(null);

        konvertujDUEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Konvertor k = new Konvertor();

                //Preuzimanje dinara iz polja za unos dinara
                // i pretvaranje iz String u double
                double dinari = Double.parseDouble(poljeDinari.getText());

                //Konverzija dinara u evre
                double evri = k.konvertujDinareUEvre(dinari);

                //Postavljanje vrednosti u evrima u polje za evre
                poljeEvri.setText(evri + "");
            }
        });
        konvertujEUDButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Konvertor k = new Konvertor();

                //Preuzimanje iznosa u evrima iz polja za unos
                // i pretvaranje iz String u double
                double evri = Double.parseDouble(poljeEvri.getText());

                //Konverzija iz evra u dinare
                double dinari = k.konvertujEvreUDinare(evri);

                //Postavljanje vrednosti u dinarima u polje za dinare
                poljeDinari.setText(dinari + "");
            }
        });
    }

    public static void main(String[] args) {
        new KonvertorGUI().setVisible(true);
    }
}
