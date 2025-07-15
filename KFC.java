class KFC {
    public static double takeOrder(String itemName) {
        double price = 0.0;

        if (itemName == "Zinger Burger") {
            price = 150;
        } else if (itemName == "Chicken Bucket 6pc") {
            price = 499;
        } else if (itemName == "Hot Wings 5pc") {
            price = 199;
        } else if (itemName == "Chicken Popcorn Regular") {
            price = 149;
        } else if (itemName == "Chicken Biryani Box") {
            price = 229;
        } else if (itemName == "Veg Zinger Burger") {
            price = 129;
        } else if (itemName == "Smoky Grilled Chicken") {
            price = 199;
        } else if (itemName == "Peri Peri Chicken 4pc") {
            price = 299;
        } else if (itemName == "KFC Rice Bowl Veg") {
            price = 179;
        } else if (itemName == "Chicken Strips 4pc") {
            price = 229;
        } else if (itemName == "Classic Chicken Roll") {
            price = 139;
        } else if (itemName == "Double Chicken Roll") {
            price = 189;
        } else if (itemName == "Fries Medium") {
            price = 99;
        } else if (itemName == "Fries Large") {
            price = 129;
        } else if (itemName == "Pepsi Can") {
            price = 60;
        } else if (itemName == "Chocolate Lava Cake") {
            price = 99;
        } else if (itemName == "Krusher") {
            price = 110;
        } else if (itemName == "Cheesy Chicken Snacker") {
            price = 89;
        } else {
            System.out.println("0.0 invalid item name");
        }

        return price;
    }
}


