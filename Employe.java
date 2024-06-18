import java.io.Serializable;

class Employe extends Personne implements Serializable,Payable {
    private static final long serialVersionUID = 1L;
    private double salaire;

    public Employe(String nom, String prenom, double salaire) {
        super(nom, prenom);
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double getAnnualPay() {
        return salaire;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
}