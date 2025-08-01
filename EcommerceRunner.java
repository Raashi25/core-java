class EcommerceRunner {
    public static void main(String[] websites) {
        Product product = new Product();
        product.productName = "Laptop";
        product.price = 65000;

        Category category = new Category();
        category.categoryName = "Electronics";
        category.noOfItems = 500;
        category.product = product;

        Ecommerce ecommerce = new Ecommerce("Amazon", "India", category);
        ecommerce.getEcommerceInfo();
    }
}
