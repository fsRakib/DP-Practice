package Structural.Composite2;

public class Main {
    public static void main(String[] args) {
        // create files
        FileComponent file1 = new File("file1.txt", 100);
        FileComponent file2 = new File("file2.txt", 200);
        FileComponent file3 = new File("file3.txt", 300);

        // create sub folder
        Folder subFolder = new Folder("Subfolder");
        subFolder.add(file1);
        subFolder.add(file2);

        Folder mainFolder = new Folder("MainFolder");
        mainFolder.add(file3);
        mainFolder.add(subFolder);
        mainFolder.add(file2);

        System.out.println("Total size: " + mainFolder.getSize());

    }
}
