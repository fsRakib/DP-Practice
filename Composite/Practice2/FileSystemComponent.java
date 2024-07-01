package Composite.Practice2;

// Component
abstract class FileSystemComponent {
    String name;

    public FileSystemComponent(String name) {
        this.name = name;
    }

    abstract int getSize();
}
