public interface Subscriber {
    void update(String news);
}

public class NewsSubscriber implements Subscriber {
    private String name;

    public NewsSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " received news: " + news);
    }
}

public interface NewsPublisher {
    void addSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void notifySubscribers(String news);
}

import java.util.ArrayList;
import java.util.List;

public class NewsTopic implements NewsPublisher {
    private List<Subscriber> subscribers = new ArrayList<>();

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(String news) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(news);
        }
    }

    // Method to simulate publishing news
    public void publishNews(String news) {
        System.out.println("Publishing news: " + news);
        notifySubscribers(news);
    }
}

public class Main {
    public static void main(String[] args) {
        NewsTopic newsTopic = new NewsTopic();

        Subscriber subscriber1 = new NewsSubscriber("Subscriber 1");
        Subscriber subscriber2 = new NewsSubscriber("Subscriber 2");

        newsTopic.addSubscriber(subscriber1);
        newsTopic.addSubscriber(subscriber2);

        newsTopic.publishNews("Breaking News 1");
        newsTopic.removeSubscriber(subscriber1);
        newsTopic.publishNews("Breaking News 2");
    }
}