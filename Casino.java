class Casino {
    String name;
    String location;
    boolean isOpen24Hours;
    int numberOfGames;
    boolean hasHotel;
    double entryFee;
	
	
	Casino(){
			
			System.out.println("The constructor is invoked");
			
		}
		Casino(    String name,String location,boolean isOpen24Hours,int numberOfGames,boolean hasHotel,double entryFee,String material){
			
			System.out.println("The parameterized constructor is invoked");
			
			this.name=name;
			this.location=location;
			this.isOpen24Hours=isOpen24Hours;
			this.numberOfGames=numberOfGames;
			this.hasHotel=hasHotel;
			this.entryFee=entryFee;
			
		}
	
	public void getCasinoInfo(){
		System.out.println("name: " + name);
		System.out.println("location: " + location);
		System.out.println("isOpen24Hours: " + isOpen24Hours);
		System.out.println("numberOfGames: " + numberOfGames);
		System.out.println("hasHotel: " + hasHotel);
		System.out.println("entryFee: " + entryFee);
	}
}
