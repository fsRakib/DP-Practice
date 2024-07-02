package Creational.Prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bs = new BookShop();
        bs.setShopName("Rokomari");
        bs.loadData();
        System.out.println(bs);

        BookShop bs2 = (BookShop)bs.clone();
      //  bs2.setShopName("Aladin");
        //bs2.loadData();
        System.out.println(bs2);
    }
}
