class BusStand {
    String name;
    Platform platform;

    void getBusStandInfo() {
        System.out.println("Bus Stand Name: " + name);
        platform.getPlatformInfo();
    }
}