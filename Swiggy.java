class Swiggy {
    public static double takeOrder(String dishName) {
        double price = 0.0;

        if (dishName == "Biryani") {
            price = 150;
        } else if (dishName == "Paneer Butter Masala") {
            price = 180;
        } else if (dishName == "Masala Dosa") {
            price = 60;
        } else if (dishName == "Chicken Curry") {
            price = 200;
        } else if (dishName == "Veg Pulao") {
            price = 120;
        } else if (dishName == "Palak Paneer") {
            price = 160;
        } else if (dishName == "Butter Naan") {
            price = 30;
        } else if (dishName == "Tandoori Roti") {
            price = 20;
        } else if (dishName == "Dal Tadka") {
            price = 100;
        } else if (dishName == "Chole Bhature") {
            price = 90;
        } else if (dishName == "Fried Rice") {
            price = 130;
        } else if (dishName == "Gobi Manchurian") {
            price = 110;
        } else if (dishName == "Momos") {
            price = 80;
        } else if (dishName == "Chicken Tikka") {
            price = 210;
        } else if (dishName == "Rajma Chawal") {
            price = 95;
        } else if (dishName == "Pav Bhaji") {
            price = 85;
        } else if (dishName == "Aloo Paratha") {
            price = 70;
        } else if (dishName == "Idli Vada") {
            price = 50;
        } else if (dishName == "Fish Curry") {
            price = 220;
        } else {
            System.out.println("0.0 invalid dish name");
        }

        return price;
    }
}

