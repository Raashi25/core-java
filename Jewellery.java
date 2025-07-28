class Jewellery {
    String type;
    String material;
    double weight;
    String design;
    double price;
    String occasion;
	
	Jewellery(){
			
			System.out.println("The constructor is invoked");
			
		}
		Jewellery(String type,String material,double weight,String design,double price,String occasion){
			
			System.out.println("The parameterized constructor is invoked");
			
			this.type=type;
			this.material=material;
			this.weight=weight;
			this.design=design;
			this.price=price;
			this.occasion=occasion;
			
		}
	
	public void getJewelleryInfo(){
		
		System.out.println("the type is "+type);
		System.out.println("the material is "+material);
		System.out.println("theweight is "+weight);
		System.out.println("the design is "+design);
		System.out.println("the price is "+price);
		System.out.println("the occasion is "+occasion);
	}
}
