class NetworkRunner {
    public static void main(String[] args) {

        Network n1 = new Network("HomeNet","LAN",100.0,5,true,"IPv4");
        
        n1.getNetworkInfo();

        Network n2 = new Network("OfficeNet","WAN",1000.0,5,false,"IPv6");
       
        n2.getNetworkInfo();

        Network n3 = new Network("CafeNet","WLAN",50.0,15,true,"IPv4");
        
        n3.getNetworkInfo();

        Network n4 = new Network("CollegeNet","MAN",500.0,300,true,"IPv6");
        
       n4.getNetworkInfo();

        Network n5 = new Network("ISPBackbone","WAN",10000.0,10000,false,"IPv6");

        n5.getNetworkInfo();

        Network n6 = new Network("MobileHotspot","PAN",20.0,5,true,"IPv4");
        
        n6.getNetworkInfo();

        Network n7 = new Network("LibraryNet","LAN",200.0,50,false,"IPv4");
     
        n7.getNetworkInfo();

        Network n8 = new Network("AirportWiFi","WLAN",300.0,120,true,"IPv6");
        
        n8.getNetworkInfo();

        Network n9 = new Network("HospitalNet","LAN",600.0,250,true,"IPv6");
        
        n9.getNetworkInfo();

        Network n10 = new Network("DataCenterNet","SAN",5000.0,400,false,"IPv6");
        
        n10.getNetworkInfo();

        Network n11 = new Network("GuessNetwork","WLAN",80.0,10,true,"IPv4");
        
        n11.getNetworkInfo();

        Network n12 = new Network("HomeNet","LAN",100.0,5,true,"IPv4");
       
        n12.getNetworkInfo();

        Network n13 = new Network("OfficeNet","WAN",1000.0,5,false,"IPv6");
        
        n13.getNetworkInfo();

        Network n14 = new Network("CafeNet","WLAN",50.0,15,true,"IPv4");
        
        n14.getNetworkInfo();

        Network n15 = new Network("CollegeNet","MAN",500.0,300,true,"IPv6");
       
        n15.getNetworkInfo();

        Network n16 = new Network("HomeNet","LAN",100.0,5,true,"IPv4");
        
        n16.getNetworkInfo();

        Network n17 = new Network("CollegeNet","MAN",500.0,300,true,"IPv6");
        
        n17.getNetworkInfo();

        Network n18 = new Network("HospitalNet","LAN",600.0,250,true,"IPv6");
        
        n18.getNetworkInfo();

        Network n19 = new Network("DataCenterNet","SAN",5000.0,400,false,"IPv6");
        
        n19.getNetworkInfo();

        Network n20 = new Network("BusWiFi","Mobile",15.0,10,true,"IPv4");
        
        n20.getNetworkInfo();
    }
}
