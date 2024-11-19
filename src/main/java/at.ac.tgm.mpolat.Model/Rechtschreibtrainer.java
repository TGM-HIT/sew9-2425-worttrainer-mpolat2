package at.ac.tgm.mpolat.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 * Übernimmt die Logik des Wort checkens
 * @author Polat Enes
 * @version 18.9.2024
 */
public class Rechtschreibtrainer {
    private ArrayList<WortBildPaar> wortBildPaare;
    private WortBildPaar ausgewaehltesPaar;
    private int versucheGesamt;
    private int versucheRichtig;
    private int versucheFalsch;
    /**
     * Konstruktor für den Trainer, es werden eigene Paare erstellt
     */
    public Rechtschreibtrainer(){
        wortBildPaare = new ArrayList<>();
        wortBildPaare.add(new WortBildPaar("apfel", "https://res.cloudinary.com/saas-ag/image/upload/w_1200,h_630,b_white,c_pad,q_auto,f_auto/v1664972437/mpreis/products/ac8c0f84-00fa-4ae1-8f75-d32e6b9d5973.jpg"));
        wortBildPaare.add(new WortBildPaar("banane", "https://t4.ftcdn.net/jpg/00/64/75/97/360_F_64759733_oLj6dBUvvHeezmTluE7bOW7pW73uWjjA.jpg"));
        wortBildPaare.add(new WortBildPaar("birne", "https://www.kochschule.de/sites/default/files/images/kochwissen/470/birne.jpg"));
        wortBildPaare.add(new WortBildPaar("orange", "https://www.kochschule.de/sites/default/files/images/kochwissen/432/orange.jpg"));
        wortBildPaare.add(new WortBildPaar("ananas", "https://know-how.mnstry.com/wp-content/uploads/2021/01/Ananas.jpg"));
        versucheGesamt = 0;
        versucheRichtig = 0;
        versucheFalsch = 0;
    }
    /**
     * Wählt ein zufällige Paar von der Liste aus und speichert es
     */
    public void waehleZufaelligesPaar(){
        if (!wortBildPaare.isEmpty()) {
            Random rand = new Random();
            int randomIndex = rand.nextInt(wortBildPaare.size()); // generates a random index
            ausgewaehltesPaar = wortBildPaare.get(randomIndex); // sets the randomly selected pair
        } else {
            throw new NullPointerException("Leere Liste!");
        }
    }
    /**
     * Das eingegebene Wort wird mit der Lösung verglichen. Bei falscheingabe bleibt das Bild
     * ansonsten geht es zum nächsten.
     * @param wort Geratene Wort
     * @return ob es richtig erraten wurde
     */
    public boolean rateWort(String wort){
        this.versucheGesamt++;
        if(wort.equals(this.ausgewaehltesPaar.getWort())){
            this.versucheRichtig++;
            this.waehleZufaelligesPaar();
            return true;
        } else {
            this.versucheFalsch++;
            return false;
        }
    }
    /**
     * Statistik zu dem aktuellen Punktestand
     * @return die Statistik
     */
    public String statistik(){
        return "Stats - Gesamt: " + this.versucheGesamt + ", Richtig: " + this.versucheRichtig + ", Falsch: " + this.versucheFalsch;
    }
    /**
     * Das aktuelle Paar wird zurückgegeben
     * @return aktuelle Paar
     */
    public WortBildPaar getAusgewaehltesPaar() {
        return ausgewaehltesPaar;
    }

    public ArrayList<WortBildPaar> getWortBildPaare() {
        return wortBildPaare;
    }
}