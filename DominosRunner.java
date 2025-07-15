class DominosRunner {
    public static void main(String[] pizza) {
        double cost = Dominos.takeOrder("Farmhouse Pizza");
        System.out.println("The price of the Farmhouse Pizza is ₹" + cost);
    }
}