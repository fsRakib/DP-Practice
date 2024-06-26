package Command;

public class SaveFile implements FileOperation{
    private TextFile textFile;

    public SaveFile(TextFile textFile) {
        this.textFile = textFile;
    }
    
}
