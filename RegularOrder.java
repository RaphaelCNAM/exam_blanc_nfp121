public class RegularOrder implements Order {
    private String details;

    public RegularOrder(String details) {
        this.details = details;
    }

    @Override
    public void process() {
        System.out.println("Commande normale en cours : " + details);
    }
}
