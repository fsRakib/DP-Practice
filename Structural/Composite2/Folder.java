package Structural.Composite2;

import java.util.ArrayList;
import java.util.List;

//------ Composite class----------- as folder which can contain files and subfolders
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

    public void remove(FileComponent component) {
        children.remove(component);
    }

    @Override
    public int getSize() {
        int totalSize = 0;
        for (FileComponent files : children) {
            totalSize += files.getSize();
        }
        return totalSize;
    }

}
