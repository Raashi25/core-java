class Projector {
    static String brand = "dell";
    static String modelName = "VPL-DX221";
    static String resolution = "XGA 1024x768";
    static String projectionType = "3LCD";
    static String lampType = "High-Pressure Mercury Lamp";
    static String color = "white";
    static String inputPorts = "HDMI, VGA, USB";
    static String remoteIncluded = "Yes";
    static String warrantyPeriod = "5 Years";
    static String countryOfOrigin = "india";
    static String compatibleDevices = "Laptop, PC, TV Stick";
    static int hdmiPortCount = 1;
    static int usbPortCount = 1;
    static int vgaPortCount = 1;
    static int builtInSpeakersWatt = 2;
    static int lampLifeHours = 10000;
    static int numberOfDisplayModes = 4;
    static int projectionDistanceFeet = 20;
    static int yearOfManufacture = 2024;
    static double priceInRupees = 37999.99;

    public static void main(String[] args) {

        System.out.println("=== Projector Details ===");
        System.out.println("Brand: " + brand);
        System.out.println("Model Name: " + modelName);
        System.out.println("Resolution: " + resolution);
        System.out.println("Projection Type: " + projectionType);
        System.out.println("Lamp Type: " + lampType);
        System.out.println("Color: " + color);
        System.out.println("Input Ports: " + inputPorts);
        System.out.println("Remote Included: " + remoteIncluded);
        System.out.println("Warranty Period: " + warrantyPeriod);
        System.out.println("Country of Origin: " + countryOfOrigin);
        System.out.println("Compatible Devices: " + compatibleDevices);
        System.out.println("HDMI Ports: " + hdmiPortCount);
        System.out.println("USB Ports: " + usbPortCount);
        System.out.println("VGA Ports: " + vgaPortCount);
        System.out.println("Speaker Output (W): " + builtInSpeakersWatt);
        System.out.println("Lamp Life (Hours): " + lampLifeHours);
        System.out.println("Display Modes: " + numberOfDisplayModes);
        System.out.println("Projection Distance: " + projectionDistanceFeet + " ft");
        System.out.println("Year of Manufacture: " + yearOfManufacture);
        System.out.println("Price: ₹" + priceInRupees);
    }
}