class Blazzer {
    String brand;
    String size;
    String color;
    double price;
    boolean isFormal;
    String material;
	
	Blazzer(){
			
			System.out.println("The constructor is invoked");
			
		}
		Blazzer(String  String brand,String size,String color,double price, boolean isFormal;
    String material){
			
			System.out.println("The parameterized constructor is invoked");
			
			this.material=material;
			this.size=size;
			this.price=price;
			this.color=color;
			this.isFormal=isFormal;
			this.brand=brand;
			
		}
	
	public void getBlazzerInfo(){
		 System.out.println("brand: " + brand);
        System.out.println("size: " + size);
        System.out.println("color: " + color);
        System.out.println("price: " + price);
        System.out.println("isFormal: " + isFormal);
        System.out.println(".material: " + material);
	}
}
