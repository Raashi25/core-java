class Roti {
    String type;
    String flourUsed;
    double diameterInInches;
    boolean isStuffed;
    String region;
    boolean isHot;
	
	NewsPaper(){
			
			System.out.println("The constructor is invoked");
			
		}
		NewsPaper(String type,String flourUsed,double diameterInInches,boolean isStuffed,String region,boolean isHot){
			
			System.out.println("The parameterized constructor is invoked");
			this.type=type;
			this.flourUsedf=flourUsed;
			this.diameterInInches=diameterInInches;
			this.isStuffed=isStuffed;
			this.region=region;
			this.isHot=isHot;
			
		}
	
	public void getRotiInfo(){
		
		System.out.println("The type is "+type);
		System.out.println("The flourUsed is "+flourUsed);
		System.out.println("The diameterInInches is "+diameterInInches);
		System.out.println("The isStuffed is "+isStuffed);
		System.out.println("The region is "+region);
		System.out.println("The hot is "+isHot);
	}
}
