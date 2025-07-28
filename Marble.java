class Marble {
    String color;
    String material;
    double diameterInCm;
    boolean isTransparent;
    String pattern;
    double weightInGrams;
	
	KarateSuit(){
			
			System.out.println("The constructor is invoked");
			
		}
		KarateSuit(String color,String material,double diameterInCm,,boolean isTransparent, String pattern,double weightInGrams){
			
			System.out.println("The parameterized constructor is invoked");
			
			this.color=color;
			this.material=material;
			this.diameterInCmd=diameterInCm;
			this.isTransparent=isTransparent;
			this.pattern=pattern;
			this.weightInGrams=weightInGrams;
			
		}
	
	public void getMarbleInfo(){
		
		System.out.println("color: " + color);
		 System.out.println("material: " + material);
		  System.out.println("diameterInCm: " + diameterInCm);
		   System.out.println("isTransparent: " + isTransparent);
		    System.out.println("pattern: " + pattern);
	}
}
