class Flower {
    String name;
    String color;
    String species;
    String fragrance;
    int lifespanDays;
    double pricePerStem;
    boolean isSeasonal;
    String nativeRegion;

    // Constructor
    public Flower(String name, String color, String species, String fragrance,
                  int lifespanDays, double pricePerStem, boolean isSeasonal, String nativeRegion) {
        this.name = name;
        this.color = color;
        this.species = species;
        this.fragrance = fragrance;
        this.lifespanDays = lifespanDays;
        this.pricePerStem = pricePerStem;
        this.isSeasonal = isSeasonal;
        this.nativeRegion = nativeRegion;
    }

    public void getFlowerInfo() {
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Species: " + species);
        System.out.println("Fragrance: " + fragrance);
        System.out.println("Lifespan: " + lifespanDays + " days");
        System.out.println("Price/Stem: Rs." + pricePerStem);
        System.out.println("Seasonal: " + isSeasonal);
        System.out.println("Native Region: " + nativeRegion);
        System.out.println();
    }
}
