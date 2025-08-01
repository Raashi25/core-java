class PrimeMinister {
    String name;
    int term;
    CabinetMinister minister;

    void getPmInfo() {
        System.out.println("Prime Minister: " + name);
        System.out.println("Term: " + term + " years");
        minister.getMinisterInfo();
    }
}
