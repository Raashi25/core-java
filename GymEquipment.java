class GymEquipment {
    String name;
    String type;
    String brand;
    double weight;
    double price;
    boolean isElectronic;

 
    public GymEquipment(String name, String type, String brand, double weight, double price, boolean isElectronic) {
        this.name = name;
        this.type = type;
        this.brand = brand;
        this.weight = weight;
        this.price = price;
        this.isElectronic = isElectronic;
    }

    public void getGymEquipmentInfo() {
        System.out.println("The name is " + name);
        System.out.println("The type is " + type);
        System.out.println("The brand is " + brand);
        System.out.println("The weight is " + weight);
        System.out.println("The price is " + price);
        System.out.println("The electronic is " + isElectronic);
        System.out.println();
    }
}
