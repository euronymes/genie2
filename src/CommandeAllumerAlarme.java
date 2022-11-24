public class CommandeAllumerAlarme implements Commande {
    AlarmeMouvement alarme;
    CommandeAllumerAlarme(AlarmeMouvement alarme){
        this.alarme=alarme;
    }
    @Override
    public void executer() {
        this.alarme.demarrer();
        System.out.println("Démarrage de l'alarme");
    }
}
