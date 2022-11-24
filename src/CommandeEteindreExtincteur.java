public class CommandeEteindreExtincteur implements Commande{
    ExtincteurAutomatique extinct;
    CommandeEteindreExtincteur(ExtincteurAutomatique extinct){
        this.extinct=extinct;
    }
    @Override
    public void executer() {
        this.extinct.fermer();
        System.out.println("Arrêt de l’extincteur automatique");

    }
}
