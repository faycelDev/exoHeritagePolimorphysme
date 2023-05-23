public class Lion implements Animal{

    protected String nom;
    @Override
    public void manger() {
        System.out.println("le lion mange de la viande fraiche");
    }

    @Override
   public void dormir() {
        System.out.println("le lion dors beaucoup pendant que la lionne chasse");
    }

    @Override
    public void marcher() {
        System.out.println("le lion marche beaucoup");
    }

    @Override
    public String toString() {
        return "Lion " +
                "nom : " + nom + '\'';

    }

    public void marcher(int vitesse){

        System.out.println("le lion marche a " + vitesse + "km/h");
    }

    public Lion(String nom) {
        this.nom = nom;
    }
}
