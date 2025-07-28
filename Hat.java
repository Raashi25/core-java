class Hat {
    String brand;
    String color;
    String type;
    String size;
    double price;
    boolean isAdjustable;

    
    public Hat(String brand, String color, String type, String size, double price, boolean isAdjustable) {
        this.brand = brand;
        this.color = color;
        this.type = type;
        this.size = size;
        this.price = price;
        this.isAdjustable = isAdjustable;
    }

    public void getHatInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
        System.out.println("Size: " + size);
        System.out.println("Price: " + price);
        System.out.println("Adjustable: " + isAdjustable);
        System.out.println();
    }
}
