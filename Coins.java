class Coins {
    String name;
    String country;
    int year;
    String material;
    double weight;
    double value;
	
	
	Coins(){
			
			System.out.println("The constructor is invoked");
			
		}
		Coins(    String name,String country,int year,String material,double weight,double value){
			
			System.out.println("The parameterized constructor is invoked");
			
			this.name=name;
			this.country=country;
			this.year=year;
			this.material=material;
			this.weight=weight;
			this.value=value;
			
		}
	
	public void getCoinsInfo(){
		System.out.println("the name is "+name);
		System.out.println("the country is "+country);
		System.out.println("the year is "+year);
		System.out.println("the material is "+material);
		System.out.println("the weight is "+weight);
		System.out.println("the value is "+value);
	
		
	}
}
