package Command;

public class OpenFileOperation implements FileOperation {

    //Receiver
    private TextFile textFile;

    public OpenFileOperation(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public String execute() {
        return null;
    }

}
