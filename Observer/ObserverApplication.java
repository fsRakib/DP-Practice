package Observer;

public class ObserverApplication {
    public static void main(String[] args) {
		NewsAgency observable = new NewsAgency();
		NewsChannel observer = new NewsChannel();

		observable.addObserver(observer);
		observable.setNews("news2");
        observable.setNews("news3");
		System.out.println(observer.getNews());
	}
}
