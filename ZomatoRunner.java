class ZomatoRunner {
    public static void main(String[] order) {
        double cost = Zomato.takeOrder("Gulab Jamun");
        System.out.println("The price of the GulabJamun is ₹" + cost);
    }
}