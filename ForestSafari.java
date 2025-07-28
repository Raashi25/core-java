class ForestSafari {
    String name;
    String location;
    boolean isGuided;
    int durationDays;
    double entryFee;
    boolean nightSafariAvailable;

    ForestSafari(String name, String location, boolean isGuided, int durationDays, double entryFee, boolean nightSafariAvailable) {
        this.name = name;
        this.location = location;
        this.isGuided = isGuided;
        this.durationDays = durationDays;
        this.entryFee = entryFee;
        this.nightSafariAvailable = nightSafariAvailable;
    }

    public void getInfo() {
        System.out.println("Name: " + name); 
		System.out.println(" Location: " + location); 
		System.out.println(", Guided: " + isGuided );
		System.out.println(", Duration: " + durationDays );
		
                System.out.println(" days, Entry Fee:" entryFee );
				System.out.println(" Night Safari: " + nightSafariAvailable);
    }
}
