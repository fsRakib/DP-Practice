package Structural.Composite2;

public class Main {
    public static void main(String[] args) {
        // create files
        FileComponent file1 = new File("file1", 100);
        FileComponent file2 = new File("file2", 200);
        FileComponent file3 = new File("file3", 300);

        // create sub folder
        Folder subFolder = new Folder("Subfolder");
        subFolder.add(file1);
        subFolder.add(file2);

        Folder mainFolder = new Folder("MainFolder");
        mainFolder.add(file3);
        mainFolder.add(subFolder);
        System.out.println("Total size: " + mainFolder.getSize());

    }
}
