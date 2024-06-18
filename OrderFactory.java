public class OrderFactory {
    public static Order createOrder(String type, String details) {
        if (type.equalsIgnoreCase("regular")) {
            return new RegularOrder(details);
        } else if (type.equalsIgnoreCase("urgent")) {
            return new UrgentOrder(details);
        } else {
            throw new IllegalArgumentException("Type de commande inconnue: " + type);
        }
    }
}
