class Zomato {
    public static double takeOrder(String dishName) {
        double price = 0.0;

        if (dishName == "Gulab Jamun") {
            price = 40;
        } else if (dishName == "Rasgulla") {
            price = 45;
        } else if (dishName == "Kaju Katli") {
            price = 120;
        } else if (dishName == "Mysore Pak") {
            price = 60;
        } else if (dishName == "Jalebi") {
            price = 50;
        } else if (dishName == "Motichoor Laddu") {
            price = 55;
        } else if (dishName == "Rasmalai") {
            price = 90;
        } else if (dishName == "Peda") {
            price = 70;
        } else if (dishName == "Badam Halwa") {
            price = 100;
        } else if (dishName == "Sandesh") {
            price = 80;
        } else if (dishName == "Kesar Barfi") {
            price = 110;
        } else if (dishName == "Chum Chum") {
            price = 60;
        } else if (dishName == "Besan Laddu") {
            price = 50;
        } else if (dishName == "Halwa") {
            price = 90;
        } else if (dishName == "Milk Cake") {
            price = 85;
        } else if (dishName == "Dry Fruit Laddu") {
            price = 120;
        } else if (dishName == "Soan Papdi") {
            price = 45;
        } else if (dishName == "Coconut Barfi") {
            price = 70;
        } else if (dishName == "Boondi Laddu") {
            price = 40;
        } else {
            System.out.println("0.0 invalid dish name");
        }

        return price;
    }
}


