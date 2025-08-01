class Pvr {
    String name;
    String city;
    Screen screen;

    public Pvr(String name, String city, Screen screen) {
        this.name = name;
        this.city = city;
        this.screen = screen;
    }

    public void getPvrInfo() {
        System.out.println("PVR: " + name);
        System.out.println("City: " + city);
        screen.getScreenInfo();
    }
}

