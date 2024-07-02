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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
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
        return "BookShop [shopName=" + shopName + ", books=" + books + "]";
    }

}
