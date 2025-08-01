class MajesticRunner {
    public static void main(String[] stop) {
        Bus bus = new Bus();
        bus.busName = "KSRTC";
        bus.route = "Bangalore to Mysore";

        Platform platform = new Platform();
        platform.number = 6;
        platform.bus = bus;

        BusStand busStand = new BusStand();
        busStand.name = "Kempegowda Bus Stand";
        busStand.platform = platform;

        Majestic majestic = new Majestic("Kempegowda", "Bangalore", busStand);
        majestic.getMajesticInfo();
    }
}
