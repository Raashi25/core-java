class Cracker {
    String name;
    String type;
    String brand;
    double price;
    int quantityPerPack;
    String safetyStandard;
    boolean isSoundCracker;
    String manufacturingLocation;

    Cracker(String name, String type, String brand, double price, int quantityPerPack, String safetyStandard, boolean isSoundCracker, String manufacturingLocation) {
        this.name = name;
        this.type = type;
        this.brand = brand;
        this.price = price;
        this.quantityPerPack = quantityPerPack;
        this.safetyStandard = safetyStandard;
        this.isSoundCracker = isSoundCracker;
        this.manufacturingLocation = manufacturingLocation;
    }

    void getCrackerInfo() {
        System.out.println("Name: " + name + ", Type: " + type + ", Brand: " + brand + ", Price: ₹" + price + ", Qty/Pack: " + quantityPerPack +
                ", Safety: " + safetyStandard + ", Sound: " + isSoundCracker + ", Location: " + manufacturingLocation);
    }
}
