public class CommandeEteindreAlarme implements Commande{
    AlarmeMouvement alarme;
    CommandeEteindreAlarme(AlarmeMouvement alarme){
        this.alarme=alarme;
    }
    @Override
    public void executer() {
        this.alarme.arreter();
        System.out.println("Arrêt de l'alarme");

    }
}
