package Composite.Practice2;

// Leaf
public class File extends FileSystemComponent {
    int size;

    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    @Override
    int getSize() {
        return size;
    }
}
