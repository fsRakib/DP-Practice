package Creational.Factory2;

public class Main {
    public static void main(String[] args) {
        Button winBtn = ButtonFactory.createButton("windows");
        winBtn.click();

        Button macBtn = ButtonFactory.createButton("mac");
        macBtn.click();
    }
}
