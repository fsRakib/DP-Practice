package Structural.Composite2;

// Leaf class representing a file
public class File implements FileComponent {
    private String name;
    private int Size;

    public File(String name, int size) {
        this.name = name;
        Size = size;
    }

    @Override
    public int getSize() {
        return 0;
    }

}
