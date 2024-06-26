package Command;

public class Main {
    public static void main(String[] args) {
        FileOperationExecutor fileOperationExecutor = new FileOperationExecutor();
        fileOperationExecutor.executeOperation(new OpenFileOperation(new TextFile("file1.txt")));
        fileOperationExecutor.executeOperation(new SaveFile(new TextFile("file2.txt")));
    }
}
