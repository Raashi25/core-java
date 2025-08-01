class Ecommerce {
    String platform;
    String region;
    Category category;

    Ecommerce(String platform, String region, Category category) {
        this.platform = platform;
        this.region = region;
        this.category = category;
    }

    void getEcommerceInfo() {
        System.out.println("Platform: " + platform);
        System.out.println("Region: " + region);
        category.getCategoryInfo();
    }
}

