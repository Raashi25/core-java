class Majestic {
    String location;
    String city;
    BusStand busStand;

    Majestic(String location, String city, BusStand busStand) {
        this.location = location;
        this.city = city;
        this.busStand = busStand;
    }

    void getMajesticInfo() {
        System.out.println("Majestic Location: " + location);
        System.out.println("City: " + city);
        busStand.getBusStandInfo();
    }
}

