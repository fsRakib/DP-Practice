package Structural.Composite.Practice2;

// Composite
import java.util.ArrayList;
import java.util.List;

public class Folder extends FileComponent {
    List<FileComponent> components = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    void add(FileComponent component) {
        components.add(component);
    }

    @Override
    int getSize() {
        int totalSize = 0;
        for (FileComponent component : components) {
            totalSize += component.getSize();
        }
        return totalSize;
    }

}
