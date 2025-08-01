class TechParkRunner {
    public static void main(String[] park) {
        Company company = new Company();
        company.companyName = "Infosys";
        company.domain = "IT Services";

        Block block = new Block();
        block.blockName = "Block A";
        block.floorCount = 5;
        block.company = company;

        TechPark techPark = new TechPark("Manyata Tech Park", "Bangalore", block);
        techPark.getTechParkInfo();
    }
}