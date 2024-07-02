package Creational.Prototype;

public class Main {
    public static void main(String[] args) {
        BookShop bs = new BookShop();
        bs.setShopName("Rokomari");
        bs.loadData();
        System.out.println(bs);

        BookShop bs2 = new BookShop();
        bs2.setShopName("Rokomari");
    }
}
