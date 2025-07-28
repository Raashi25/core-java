class GiTag {
    String name; 
    String category; 
    String geographicalArea; 
    int registrationYear;
    String description; 
    String registeredHolder; 

    public GiTag(String name, String category, String geographicalArea, int registrationYear,
                 String description, String registeredHolder) {
        this.name = name;
        this.category = category;
        this.geographicalArea = geographicalArea;
        this.registrationYear = registrationYear;
        this.description = description;
        this.registeredHolder = registeredHolder;
    }

    public void getGiTagInfo() {
        System.out.println("Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Geographical Area: " + geographicalArea);
        System.out.println("Registration Year: " + registrationYear);
        System.out.println("Description: " + description);
        System.out.println("Registered Holder: " + registeredHolder);
        System.out.println();
    }
}
