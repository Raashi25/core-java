class Book {
    String title;
    String author;
    int pageCount;
    String genre;
    boolean isAvailable;

    public void getBookInfo() {
        System.out.println("Book Info:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Page Count: " + pageCount);
        System.out.println("Genre: " + genre);
        System.out.println("Available: " + isAvailable);
        System.out.println();
    }
}