class Stagiaire extends Personne implements Payable{
    private double indemnite;

    public Stagiaire(String nom, String prenom, double indemnite) {
        super(nom, prenom);
        this.indemnite = indemnite;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double getAnnualPay() {
        return indemnite;
    }

    public double getIndemnite() {
        return indemnite;
    }

    public void setIndemnite(double indemnite) {
        this.indemnite = indemnite;
    }
}