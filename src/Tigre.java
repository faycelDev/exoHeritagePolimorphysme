public class Tigre implements Animal{

    protected String nom;
    @Override
    public void manger() {
        System.out.println("le tigre mange des proies plus petites que lui");
    }

    @Override
    public void dormir() {
        System.out.println("le tigre dors quand il a fini de manger");
    }

    @Override
   public void marcher() {
        System.out.println("le tigre marche avec prudence");
    }

    @Override
    public void marcher(int vitesse) {

    }

    public Tigre(String nom) {
        this.nom = nom;
    }
}
