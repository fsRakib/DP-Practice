package Bahavioral.Command;

import java.util.ArrayList;
import java.util.List;

//invoker class
public class FileOperationExecutor {
    private final List<FileOperation> fileOperations = new ArrayList<>();

    public String executeOperation(FileOperation fileOperation) {
        fileOperations.add(fileOperation);
        return fileOperation.execute();

    }
}
