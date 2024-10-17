public class Main {
    public static void main(String[] args) {
        Author johnTolkien = new Author("John", "Tolkien");
        Author brandonSanderson = new Author("Brandon", "Sanderson");
        Book lordOfTheRings = new Book("Lord of the rings", johnTolkien, 1954);
        Book windAndTruth = new Book("Wind and truth", brandonSanderson, 2023);
        windAndTruth.setYear(2024);
    }
}

