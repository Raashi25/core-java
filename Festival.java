class Festival {
    String name;
    String country;
    String religion;
    String season;
    String mainDeityOrFigure;
    boolean isNationalHoliday;

    Festival(String name, String country, String religion, String season, String mainDeityOrFigure, boolean isNationalHoliday) {
        this.name = name;
        this.country = country;
        this.religion = religion;
        this.season = season;
        this.mainDeityOrFigure = mainDeityOrFigure;
        this.isNationalHoliday = isNationalHoliday;
    }

    void getFestivalInfo() {
        System.out.println("Festival: " + name + ", Country: " + country + ", Religion: " + religion + ", Season: " + season + ", Main Deity/Figure: " + mainDeityOrFigure + ", National Holiday: " + isNationalHoliday);
    }
}
