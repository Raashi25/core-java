class KarateSuit {
    String brand;
    String size;
    String color;
    String material;
    boolean isProfessional;
    double price;
	
	KarateSuit(){
			
			System.out.println("The constructor is invoked");
			
		}
		KarateSuit(String brand,String size,String color,String material,boolean isProfessional, double price){
			
			System.out.println("The parameterized constructor is invoked");
			
			this.brand=brand;
			this.size=size;
			this.color=color;
			this.material=material;
			this.isProfessional=isProfessional;
			this.price=price;
			
		}
	
	public void getKarateSuitInfo(){
		
		System.out.println("brand: " + brand);
		System.out.println("size: " + size);
		System.out.println("color: " + color);
		System.out.println("material: " + material);
		System.out.println("isProfessional: " + isProfessional);
		System.out.println("price: " +price);
		
	}
}
