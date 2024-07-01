package Composite_Design_Pattern.Practice2;

// Composite
import java.util.ArrayList;
import java.util.List;

public class Folder extends FileSystemComponent {
    List<FileSystemComponent> components = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    void add(FileSystemComponent component) {
        components.add(component);
    }

    @Override
    int getSize() {
        int totalSize = 0;
        for (FileSystemComponent component : components) {
            totalSize += component.getSize();
        }
        return totalSize;
    }

}
