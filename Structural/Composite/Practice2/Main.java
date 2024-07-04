package Structural.Composite.Practice2;

// Client
public class Main {
    public static void main(String[] args) {
        File file1 = new File("file1.txt", 100);
        File file2 = new File("file2.txt", 200);

        Folder folder1 = new Folder("folder1");
        folder1.add(file1);
        folder1.add(file2);

        Folder folder2 = new Folder("folder2");
        folder2.add(folder1);
        folder2.add(file2);

        Folder folder3 = new Folder("folder3");
        folder3.add(folder2);
        folder3.add(file1);

        System.out.println("USER Folder1 sixe: " + folder1.getSize());
        System.out.println("HOME Folder2 size: " + folder2.getSize());
        System.out.println("ROOT Folder3 size: " + folder3.getSize());

    }
}
