public class TelesurveillanceMaison {
    private Commande commandeMarche;
    private Commande commandesArret;

    public void setCommande(int i,Commande comMarche,Commande comArret) {
        this.commandeMarche = comMarche;
        this.commandesArret = comArret;
    }
    public void appuyerMarche(int i){}
    public void appyerArret(int i){}
}
