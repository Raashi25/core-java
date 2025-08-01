class Library {
    String libraryName;
    String librarian;
    int noOfBooks;

    Shelf shelf;

    Library(String libraryName, String librarian, int noOfBooks, Shelf shelf) {
        this.libraryName = libraryName;
        this.librarian = librarian;
        this.noOfBooks = noOfBooks;
        this.shelf = shelf;
    }

    public void getLibraryInfo() {
        System.out.println("Library Info:");
        System.out.println("Library Name: " + libraryName);
        System.out.println("Librarian: " + librarian);
        System.out.println("Number of Books: " + noOfBooks);
        System.out.println();

        this.shelf.getShelfInfo();
    }
}

