#Laboratorijske vežbe – dvočas br. 12

Za kreiranje GUI-ja namestiti opciju Window Builder-a na lazy code generation u
Window > Preferences > WindowBuilder > Swing > Code Generation > Lazy

 namesti WindowBuilder na code generation lazy

##Zadatak 1
*(radi ga laborant u saradnji sa studentima)*

Napraviti javnu klasu **Konvertor** u paketu zadatak1.poslovna_logika koja ima:

1. Javnu metodu **konvertujDUE** koja kao ulazni argument dobija iznos u dinarima (realan broj). Ova
metoda konvertuje ovaj iznos u evre i vraća ga (1EUR = 120DIN).

2. Javnu metodu **konvertujEUD** koja kao ulazni argument dobija iznos u evrima (realan broj). Ova
metoda konvertuje ovaj iznos u dinare i vraća ga (1EUR = 120DIN).

Napraviti klasu **KonvertorGUI** u paketu **zadatak1.gui** koja izgleda kao na slici, namestiti da dimenzija prozora
 ne može da se menja, i:

1. Ima privatni atribut **konvertor** tipa **Konvertor** 

2. Na pritisak dugmeta **Konvertuj DUE** dinarski iznos koji je upisan u levo polje za unos konvertuje u evre i prikaže u desnom polju za unos. 

3. Na pritisak dugmeta **Konvertuj EUD** iznos u evrima koji je upisan u desno polje za unos konvertuje u dinare i prikaže u levom polju za unos.

![Konvertor Gui](konvertor-gui.png)


##Zadatak 2
*(studenti rade sami)*

Napisati javnu klasu **BMIKalkulator** u paketu **zadatak2.poslovna_logika** koja ima:

1. Javnu metodu **izracunajBMI** koja kao ulazni argument dobija visinu i težinu čoveka
(realni brojevi). Visina je data u metrima a težina u kilogramima. Metoda izračunava i vraća
BMI tj. Body Mass Index po formuli BMI = težina (kg)/[visina(m)]2

Napisati klasu **BMIKalkulatorGUI** u paketu **zadatak2.gui** kojom se kreira korisnički
interfejs prikazan na sledećoj slici. Namestiti da dimenzija prozora
 ne može da se menja. Klasa treba da:
 
1. Ima privatni atribut **bmiKalkulator** tipa **BMIKalkulator**  

2. Nakon što korisnik unese podatke o visini i težini u odgovarajuća polja i klikne na dugme
‘Izracunaj BMI’ u polju BMI se ispisuje izračunata vrednost BMI (Body Mass Index)-a. 
BMI izračunati koristeći metodu **izracunajBMI** klase **BMIKalkulator** 

![BMI Gui](bmi-gui.png)