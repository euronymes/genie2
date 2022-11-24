import java.io.FileNotFoundException;

public class DetecteurMouvement {
    private Commande commande;
    public void alerter() throws FileNotFoundException {
    Sms sms = new Sms();
    Journal journal = new Journal();
    sms.envoyerMessage("Mouvement detecté !");
    journal.ecrire("Mouvement");
    }

}
