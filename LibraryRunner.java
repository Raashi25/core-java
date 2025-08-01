class LibraryRunner {
    public static void main(String[] book) {
        // Create objects and set values
        Library library = new Library("City Central Library", "Mr. Pal", 5000, null);

        Shelf shelf = new Shelf();
        shelf.shelfNumber = 3;
        shelf.shelfType = "Fiction";

        Book book = new Book();
        book.title = "The Alchemist";
        book.author = "Paulo Coelho";
        book.pageCount = 208;
        book.genre = "Adventure";
        book.isAvailable = true;

        // Setting references
        shelf.book = book;
        library.shelf = shelf;

        // Call method
        library.getLibraryInfo();
    }
}