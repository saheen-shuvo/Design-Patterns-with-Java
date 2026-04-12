// TODO: Define the FileSystemComponent interface with a method `showDetails()`.
public interface FileSystemComponent {
    void showDetails();
}

// TODO: Complete the File class that provides a base implementation of the FileSystemComponent interface.
public class File implements FileSystemComponent {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        // Print the name of the file 
        System.out.println(name);
    }
}

import java.util.ArrayList;
import java.util.List;

// TODO: Complete the Folder class that can contain multiple FileSystemComponent objects.
public class Folder implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> components = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    // TODO: Complete the addComponent method to add a component to the folder
    public void addComponent(FileSystemComponent component) {
        // Add the component to the components list
        components.add(component);
    }

    // TODO: Complete the removeComponent method to remove a component from the folder
    public void removeComponent(FileSystemComponent component) {
        // Remove the component from the components list
        components.remove(component);
    }

    // TODO: Complete the showDetails() method to show the details of the folder
    @Override
    public void showDetails() {
        // Print the name of the folder
        System.out.println("Folder: " + name);

        // Iterate over the components and call showDetails() on each
        for (FileSystemComponent component : components) {
            component.showDetails();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // TODO: Create two File instances
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");

        // TODO: Create a Folder instance "MyFolder" and add the above files to it
        Folder folder = new Folder("MyFolder");
        folder.addComponent(file1);
        folder.addComponent(file2);

        // TODO: Show details of the folder and its contents
        folder.showDetails();
    }
}