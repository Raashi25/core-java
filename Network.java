class Network {
    String name;
    String type;
    double bandwidth;
    int connectedDevices;
    boolean isWireless;
    String protocol;
	
	Network(){
			
			System.out.println("The constructor is invoked");
			
		}
		Network(String name,String type,double bandwidth,int connectedDevices,boolean isWireless,String protocol){
			
			System.out.println("The parameterized constructor is invoked");
			
			this.name=name;
			this.type=type;
			this.bandwidth=bandwidth;
			this.isWireless=isWireless;
			this.protocol=protocol;
			this.connectedDevices=connectedDevices;
			
		}
	
	public void getNetworkInfo(){
		
		System.out.println("name: " + name);
		System.out.println("type: " + type);
		System.out.println("bandwidth: " + bandwidth);
		System.out.println("connectedDevices: " + connectedDevices);
		System.out.println("isWireless: " + isWireless);
		System.out.println("protocol: " + protocol);
	}
}
