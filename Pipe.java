class Pipe {
    String material;
    double length;
    double diameter;
    String color;
    boolean isFlexible;
    String usage;
	
	Pipe(){
			
			System.out.println("The constructor is invoked");
			
		}
		Pipe(String material,double length,double diameter,String color,boolean isFlexible,String usage){
			
			System.out.println("The parameterized constructor is invoked");
			
			this.material=material;
			this.length=length;
			this.diameter=diameter;
			this.color=color;
			this.isFlexible=isFlexible;
			this.usage=usage;
			
		}
		
	public void getPipeInfo(){
		
		System.out.println("Pipe ID: " + pipeId);
        System.out.println("Material: " +material);
        System.out.println("Diameter: " +diameterCm + " cm");
        System.out.println("Length: " + lengthCm + " cm");
        System.out.println("Usage: " + usage);
        System.out.println("Pressure Rating: " + pressureRatingPsi + " PSI");
        System.out.println("Price per Meter: $" +pricePerMeter);
		
	}
}
