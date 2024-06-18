public class Patron extends Personne implements Observer,Payable {
    private double salaire;

    public Patron(String nom, String prenom, double salaire) {
        super(nom, prenom);
        this.salaire = salaire;
    }

    @Override
    public void update(String article) {
        System.out.println("Notification au Patron: " + nom + " " + prenom + " - Nouvel article au stock: " + article);
    }

    @Override
    public double getAnnualPay() {
        return salaire;
    }

    @Override
    public String toString() {
        return nom + " " + prenom;
    }
}
