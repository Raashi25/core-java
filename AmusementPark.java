class AmusementPark {
    String name;
    String locationCity;
    double areaAcres;
    int numberOfRides;
    double ticketPriceAdult;
    boolean hasWaterParkSection;
	
	AmusementPark(){
			
			System.out.println("The constructor is invoked");
			
		}
		AmusementPark(String name,StringlocationCity,double areaAcres,int numberOfRides,double ticketPriceAdult,boolean hasWaterParkSection);
			System.out.println("The parameterized constructor is invoked");
			
			this.name=name;
			this.locationCity=locationCity;
			this.areaAcres=areaAcres;
			this.numberOfRides=numberOfRides;
			this.ticketPriceAdult=ticketPriceAdult;
			this.hasWaterParkSection=hasWaterParkSection;
			
			
		}
	
	
	public void getParkInfo() {
		
		System.out.println("Name: " + name);
        System.out.println("Location: " + locationCity);
        System.out.println("Area (Acres): " +areaAcres);
        System.out.println("Number of Rides: " + numberOfRides);
        System.out.println("Adult Ticket Price: Rs." + ticketPriceAdult);
        System.out.println("Has Water Park: " +hasWaterParkSection);
        System.out.println();
	}

}
