import java.util.ArrayList;
import java.util.List;

public class Stock implements Subject {
    private List<Observer> observers;
    private List<String> articles;

    public Stock() {
        observers = new ArrayList<>();
        articles = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(articles.get(articles.size() - 1));
        }
    }

    public void addArticle(String article) {
        articles.add(article);
        notifyObservers();
    }
}
