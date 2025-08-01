class TechPark {
    String name;
    String location;
    Block block;

    TechPark(String name, String location, Block block) {
        this.name = name;
        this.location = location;
        this.block = block;
    }

    void getTechParkInfo() {
        System.out.println("Tech Park Name: " + name);
        System.out.println("Location: " + location);
        block.getBlockInfo();
    }
}

