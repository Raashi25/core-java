class Block {
    String blockName;
    int floorCount;
    Company company;

    void getBlockInfo() {
        System.out.println("Block Name: " + blockName);
        System.out.println("Floor Count: " + floorCount);
        company.getCompanyInfo();
    }
}
