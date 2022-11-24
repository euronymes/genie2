public class CommandeAllumerExtincteur implements Commande{
    ExtincteurAutomatique extinct;
    CommandeAllumerExtincteur(ExtincteurAutomatique extinct){
        this.extinct=extinct;
    }
    @Override
    public void executer() {
        this.extinct.ouvrir();
        System.out.println("Allumage de l’extincteur automatique");
    }
}
