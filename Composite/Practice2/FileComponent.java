package Composite.Practice2;

// Component
abstract class FileComponent {
    String name;

    public FileComponent(String name) {
        this.name = name;
    }

    abstract int getSize();
}
