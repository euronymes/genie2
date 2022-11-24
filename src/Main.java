import java.util.Scanner;
/*
public class Main {
  public static void main(String[] args) {
    // Singleton
    Journal journal = Journal.getInstance();

    // Classes quelconques
    AlarmeMouvement alarme = new AlarmeMouvement();
    ExtincteurAutomatique extincteur = new ExtincteurAutomatique();
    
    // Commande
    Commande cmdAllumerAlarme = new CommandeAllumerAlarme(alarme);
    Commande cmdEteindreAlarme = new CommandeEteindreAlarme(alarme);
    Commande cmdAllumerExtincteur = new CommandeAllumerExtincteur(extincteur);
    Commande cmdEteindreExtincteur = new CommandeEteindreExtincteur(extincteur);

    TelesurveillanceMaison telecommande = new TelesurveillanceMaison();
    telecommande.setCommande(0,cmdAllumerAlarme, cmdEteindreAlarme);
    telecommande.setCommande(1, cmdAllumerExtincteur, cmdEteindreExtincteur);
    
    // Fabrique abstraite
    FabriqueDetecteur fabrique = null;
    Scanner scanner = new Scanner(System.in);
    boolean correct = false;
    while (!correct) {
      System.out.println("Quel type de fabrique voulez-vous ? (A ou B)");
      String input = scanner.nextLine();
      if (input.equals("A")) {
        fabrique = new FabriqueA();
        correct = true;
      } else if (input.equals("B")) {
        fabrique = new FabriqueB();
        correct = true;
      } else {
        System.out.println("Saisie incorrecte...");
      }
    }
    
    DetecteurFumee detecteurFumee = fabrique.creerDetecteurFumee(cmdAllumerExtincteur);
    DetecteurMouvement detecteurMouvement = fabrique.creerDetecteurMouvement(cmdAllumerAlarme);
    
    // Observateur
    Maison maison = new Maison();
    maison.enregister((Observateur) detecteurFumee);
    maison.enregister((Observateur) detecteurMouvement);    
    maison.setFeu(true);
    maison.setIndividu(true);
    
    telecommande.appuyerArret(0);
    telecommande.appuyerArret(1);
  }
}
*/