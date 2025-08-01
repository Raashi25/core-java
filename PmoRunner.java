class PmoRunner {
    public static void main(String[] post) {
        CabinetMinister minister = new CabinetMinister();
        minister.name = "Nirmala Sitharaman";
        minister.portfolio = "Finance";

        PrimeMinister pm = new PrimeMinister();
        pm.name = "Narendra Modi";
        pm.term = 10;
        pm.minister = minister;

        Pmo pmo = new Pmo("South Block", "1947", pm);
        pmo.getPmoInfo();
    }
}
