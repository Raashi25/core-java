class Dominos {
    public static double takeOrder(String itemName) {
        double price = 0.0;

        if (itemName == "Margherita Pizza") {
            price = 99;
        } else if (itemName == "Farmhouse Pizza") {
            price = 249;
        } else if (itemName == "Peppy Paneer Pizza") {
            price = 279;
        } else if (itemName == "Veg Extravaganza Pizza") {
            price = 299;
        } else if (itemName == "Chicken Dominator Pizza") {
            price = 349;
        } else if (itemName == "Indi Tandoori Paneer Pizza") {
            price = 269;
        } else if (itemName == "Cheese Burst Pizza") {
            price = 229;
        } else if (itemName == "Paneer Makhani Pizza") {
            price = 259;
        } else if (itemName == "Chicken Golden Delight Pizza") {
            price = 319;
        } else if (itemName == "Garlic Breadsticks") {
            price = 99;
        } else if (itemName == "Stuffed Garlic Bread") {
            price = 129;
        } else if (itemName == "Cheesy Dip") {
            price = 25;
        } else if (itemName == "Taco Mexicana Veg") {
            price = 105;
        } else if (itemName == "Veg Parcel") {
            price = 45;
        } else if (itemName == "Chicken Parcel") {
            price = 59;
        } else if (itemName == "Choco Lava Cake") {
            price = 99;
        } else if (itemName == "Butterscotch Mousse Cake") {
            price = 90;
        } else if (itemName == "Pepsi") {
            price = 60;
        } else if (itemName == "Coke") {
            price = 60;
        } else {
            System.out.println("0.0 invalid item name");
        }

        return price;
    }
}


