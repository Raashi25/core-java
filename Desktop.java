class Desktop {

    
    static String brand = "MSI";
    static String model = "Bravo15";
    static String processor = "Ryzen 7n";
    static String operatingSystem = "Windows 11 Pro";
    static String graphicsCard = "NVIDIA GeForce GTX 1660";
    static String cabinetType = "Tower";
    static String keyboardType = "Mechanical";
    static String mouseType = "Optical";
    static String monitorType = "LED";
    static String portsAvailable = "USB, HDMI, LAN, Audio";
    static String color = "Black";
    static int ramGB = 16;
    static int storageSSDGB = 512;
    static int storageHDDGB = 1000;
    static int usbPorts = 6;
    static int hdmiPorts = 1;
    static int audioPorts = 2;
    static int monitorSizeInches = 24;
    static int releaseYear = 2023;
    static double priceInRupees = 78999.99;

    public static void main(String[] args) {

        System.out.println("=== Desktop Specifications ===");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Processor: " + processor);
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("Graphics Card: " + graphicsCard);
        System.out.println("Cabinet Type: " + cabinetType);
        System.out.println("Keyboard Type: " + keyboardType);
        System.out.println("Mouse Type: " + mouseType);
        System.out.println("Monitor Type: " + monitorType);
        System.out.println("Ports Available: " + portsAvailable);
        System.out.println("Color: " + color);
        System.out.println("RAM: " + ramGB + " GB");
        System.out.println("SSD: " + storageSSDGB + " GB");
        System.out.println("HDD: " + storageHDDGB + " GB");
        System.out.println("USB Ports: " + usbPorts);
        System.out.println("HDMI Ports: " + hdmiPorts);
        System.out.println("Audio Ports: " + audioPorts);
        System.out.println("Monitor Size: " + monitorSizeInches + " inches");
        System.out.println("Release Year: " + releaseYear);

        System.out.println("Price: ₹" + priceInRupees);
    }
}