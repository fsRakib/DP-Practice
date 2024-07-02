package Creational.Prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {
    private String shopName;
    List<Book> books = new ArrayList<>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void loadData() {
        for (int i = 0; i < 3; i++) {
            Book b = new Book();
            b.setBookId(i);
            b.setBookName("Book" + i);
            getBooks().add(b);
        }
    }

    @Override
    public String toString() {
        return "BookShop [shopName= " + shopName + ", books= " + books + "]";
    }

    @Override // clone old object data to new object
    protected BookShop clone() throws CloneNotSupportedException {
        BookShop shop = new BookShop();

        for (Book b : this.getBooks()) { // this.getBooks() == bs object (bs.clone())
            shop.getBooks().add(b);
        }

        return shop;
    }
}
