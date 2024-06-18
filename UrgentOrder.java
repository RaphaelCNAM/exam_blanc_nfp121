public class UrgentOrder implements Order {
    private String details;

    public UrgentOrder(String details) {
        this.details = details;
    }

    @Override
    public void process() {
        System.out.println("Commande urgent en cours : " + details + " (URGENT)");
    }
}
