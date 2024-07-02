package Creational.Prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bs = new BookShop();
        bs.setShopName("Rokomari");
        bs.loadData();

        BookShop bs2 = bs.clone();
        bs.getBooks().remove(1);
        bs2.setShopName("Aladin.. ");

        System.out.println(bs);
        System.out.println(bs2);
    }
}
