public class Main {
    public static void main(String[] args) {

        Order regularOrder = OrderFactory.createOrder("regular", "Commande de 100 unités de produit A");
        regularOrder.process();

        Order urgentOrder = OrderFactory.createOrder("urgent", "Commande de 50 unités de produit B");
        urgentOrder.process();

        Stock stock = new Stock();

        Patron patron1 = new Patron("Benjamin", "De Dardel", 100000);
        Patron patron2 = new Patron("Manu", "Macron", 120000);

        stock.registerObserver(patron1);
        stock.registerObserver(patron2);

        stock.addArticle("Laptop");
        stock.addArticle("Smartphone");
    }

    
}
