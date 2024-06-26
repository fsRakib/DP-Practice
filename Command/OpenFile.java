package Command;

public class OpenFile implements FileOperation {

    //Receiver
    private TextFile textFile;

    public OpenFile(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public String execute() {
        return textFile.open();
    }

}
