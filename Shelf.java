class Shelf {
    int shelfNumber;
    String shelfType;

    Book book;

    public void getShelfInfo() {
        System.out.println("Shelf Info:");
        System.out.println("Shelf Number: " + shelfNumber);
        System.out.println("Shelf Type: " + shelfType);
        System.out.println();

        this.book.getBookInfo();
    }
}