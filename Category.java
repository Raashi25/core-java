class Category {
    String categoryName;
    int noOfItems;
    Product product;

    void getCategoryInfo() {
        System.out.println("Category: " + categoryName);
        System.out.println("No. of Items: " + noOfItems);
        product.getProductInfo();
    }
}