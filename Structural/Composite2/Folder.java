package Structural.Composite2;

import java.util.ArrayList;
import java.util.List;

// Composite class as folder which can contain files and subfolders
public class Folder implements FileComponent {
    private String name;
    private List<FileComponent> children;

    public Folder(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    public void add(FileComponent component) {
        children.add(component);
    }

    public
    @Override
    public int getSize() {
        // TODO Auto-generated method stub
        return 0;
    }

}
