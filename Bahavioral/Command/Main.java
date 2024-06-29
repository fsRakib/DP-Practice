package Bahavioral.Command;

public class Main {
    public static void main(String[] args) {
        FileOperationExecutor fileOperationExecutor = new FileOperationExecutor();

        String openResult = fileOperationExecutor.executeOperation(new OpenFile(new TextFile("file1.txt")));
        System.out.println(openResult); // Output: Opening file file1.txt

        String saveResult = fileOperationExecutor.executeOperation(new SaveFile(new TextFile("file2.txt")));
        System.out.println(saveResult); // Output: Saving file file2.txt
    }
}
