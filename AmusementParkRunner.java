class AmusementParkRunner {
    public static void main(String[] args) {
        System.out.println("Main Started - Amusement Park Data");
		

        AmusementPark park1 = new AmusementPark("Wonderla Bengaluru","Bengaluru",82.0,60,1249.00,true);
        park1.getAmmusement();

        AmusementPark park2 = new AmusementPark( "Imagicaa",
        "Khopoli, Maharashtra",
         130.0,
         25,
        1499.00,
       true);
        
        park2.getAmmusement();

        AmusementPark park3 = new AmusementPark( "EsselWorld", "Mumbai",
         64.0,
         30,
        999.00,
        false );
        park3.getAmmusement();

        AmusementPark park4 = new AmusementPark("Nicco Park",
         "Kolkata",
        40.0,
         35,
         300.00,
        true);
        
        park4.getAmmusement();

        AmusementPark park5 = new AmusementPark( "Ramoji Film City",
        "Hyderabad",
         2000.0,
         15,
       1350.00,
       false);
        
        park5.getAmmusement();

        AmusementPark park6 = new AmusementPark( "Adlabs Aquamagica","Khopoli, Maharashtra",30.0,12,999.00, true);
        
        park6.getAmmusement();

        AmusementPark park7 = new AmusementPark( "GRS Fantasy Park",
        "Mysuru, Karnataka",
        30.0,
         20,
         800.00,
         true);
        
        park7.getAmmusement();

        AmusementPark park8 = new AmusementPark( "Queensland Amusement Park", "Chennai",70.0, 50, 600.0,true);
        
        park8.getAmmusement();

        AmusementPark park9 = new AmusementPark("Worlds of Wonder",
        "Noida",
         10.0,
        20,
         1000.00,
         true);
        
        park9.getAmmusement();

        AmusementPark park10 = new AmusementPark("Fun N Food Village",
         "Delhi",
         15.0,
        10,
        1200.00,
         true);
        
        park10.getAmmusement();

        AmusementPark park11 = new AmusementPark( "Funtasia Island",
        "Patna",
         5.0,
         8,
        400.00,
        true);
        
        park11.getAmmusement();

        AmusementPark park12 = new AmusementPark( "Snow Kingdom",
       "Bengaluru",
        2.0,
        5,
         700.00,
 false);
       
        park12.getAmmusement();

        AmusementPark park13 = new AmusementPark( "Innovative Film City",
        "Bengaluru",
      58.0,
         10,
        600.00,
        true);
        
        park13.getAmmusement();

        AmusementPark park14 = new AmusementPark( "Wonderla Kochi",
         "Kochi, Kerala",
        30.0,
         50,
  1050.00,
        true);
        
        park14.getAmmusement();
		
        AmusementPark park15 = new AmusementPark("Aquatica", "Kolkata", 17.0, 15, 450.00, true);

        park15.getAmmusement();

        AmusementPark park16 = new AmusementPark( "Adventure Island","Delhi", 62.0, 25,800.00, false);
        
        park16.getAmmusement();

        AmusementPark park17 = new AmusementPark( "Snow World",
         "Hyderabad", 3.0, 5, 3500.00,false);
        
        park17.getAmmusement();

        AmusementPark park18 = new AmusementPark("Wonderla Hyderabad","Hyderabad", 50.0,43, 1149.00, true);
        
        park18.getAmmusement();

        AmusementPark park19 = new AmusementPark( "Splash Water Park",
 "Delhi",8.0, 10,700.00, true);
        
        park19.getAmmusement();
		
        AmusementPark park20 = new AmusementPark( "DREAM WORLD Water Park",
         "Surat, Gujarat",
         10.0,
         18,
       650.00,
        true);
        
        park20.getAmmusement();

        System.out.println("Main Ended - Amusement Park Data Display Complete");
    }
}