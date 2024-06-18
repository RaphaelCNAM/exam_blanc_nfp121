class PrimeDecorator implements Decorator {
    private Personne personne;
    private double prime;

    public PrimeDecorator(Personne personne, double prime) {
        this.personne = personne;
        this.prime = prime;
    }

    @Override
    public double primeAnnuelle() {
        return prime;
    }

    @Override
    public String toString() {
        return personne.toString() + " avec une prime de " + prime + " par an.";
    }
}
