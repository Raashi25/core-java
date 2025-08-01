class Pmo {
    String officeLocation;
    String establishedYear;
    PrimeMinister pm;

    Pmo(String officeLocation, String establishedYear, PrimeMinister pm) {
        this.officeLocation = officeLocation;
        this.establishedYear = establishedYear;
        this.pm = pm;
    }

    void getPmoInfo() {
        System.out.println("PMO Location: " + officeLocation);
        System.out.println("Established: " + establishedYear);
        pm.getPmInfo();
    }
}

