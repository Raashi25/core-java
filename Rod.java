class Rod {
	
	Rod(){
		System.out.println("The constructor is invoked");
	}
	Rod Constructor(int id,String material,double lengthCm,double diameterCm,String color,double weightKg,double price){
		
		System.out.println("The parameterized constructor is invoked");
		
		this.id=id;
		this.material=material;
		this.lengthCm=lengthCm;
		this.diameterCm=diameterCm;
		this.color=color;
		this.weightKg=weightKg;
		this.price=price;
	}
    int id;
    String material;
    double lengthCm;
    double diameterCm;
    String color;
    double weightKg;
    double price;
	
	public void getRodInfo(){
		
		System.out.println("ID: " + id);
        System.out.println("Material: " + material);
        System.out.println("Length: " + lengthCm + " cm");
        System.out.println("Diameter: " + diameterCm + " cm");
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weightKg + " kg");
        System.out.println("Price: $" + price);
        
	}
}