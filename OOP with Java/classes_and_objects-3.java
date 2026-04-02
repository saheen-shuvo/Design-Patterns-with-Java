public class Film {
    private String title;
    private String director;

    public Film(String title, String director){
        this.director = director;
        this.title = title;
    }

    public void display() {
        System.out.println("Title: " + title + ", Director: " + director);
    }
}

public class Main {
    public static void main(String[] args) {
        // TODO: Create an instance of Film with the title "Inception" and director "Christopher Nolan" and display its data
        Film f = new Film("Inception", "Christopher Nolan");
        
        f.display();
    }
}

//output:
//Title: Inception, Director: Christopher Nolan