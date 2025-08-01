class Platform {
    int number;
    Bus bus;

    void getPlatformInfo() {
        System.out.println("Platform Number: " + number);
        bus.getBusInfo();
    }
}