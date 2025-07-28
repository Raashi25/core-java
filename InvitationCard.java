class InvitationCard {
    String title;
    String color;
    String occasion;
    String size;
    double price;
    boolean isPrinted;

    
    public InvitationCard(String title, String color, String occasion, String size, double price, boolean isPrinted) {
        this.title = title;
        this.color = color;
        this.occasion = occasion;
        this.size = size;
        this.price = price;
        this.isPrinted = isPrinted;
    }

    public void getInvitationCard() {
        System.out.println("Title: " + title);
        System.out.println("Color: " + color);
        System.out.println("Occasion: " + occasion);
        System.out.println("Size: " + size);
        System.out.println("Price: " + price);
        System.out.println("Printed: " + isPrinted);
        System.out.println();
    }
}
