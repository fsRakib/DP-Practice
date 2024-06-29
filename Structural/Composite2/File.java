package Structural.Composite2;

// Leaf class representing a file
public class File implements FileComponent {
   
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }

}
