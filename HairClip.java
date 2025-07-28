class HairClip {
    String brand;
    String material;
    String color;
    String size;
    boolean isDecorative;
    double price;

   
    public HairClip(String brand, String material, String color, String size, boolean isDecorative, double price) {
        this.brand = brand;
        this.material = material;
        this.color = color;
        this.size = size;
        this.isDecorative = isDecorative;
        this.price = price;
    }

    public void getHairClipInfo() {
        System.out.println("The brand name is " + brand);
        System.out.println("The material is " + material);
        System.out.println("The color is " + color);
        System.out.println("The size is " + size);
        System.out.println("The isDecorative is " + isDecorative);
        System.out.println("The price is " + price);
        System.out.println();
    }
}
