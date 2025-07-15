class SwiggyRunner {
    public static void main(String[] order) {
        double cost = Swiggy.takeOrder("Biryani");
        System.out.println("The price of the Biryani is ₹" + cost);
    }
}
