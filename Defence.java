class Defence {
    String department;
    String nation;
    Army army;

    Defence(String department, String nation, Army army) {
        this.department = department;
        this.nation = nation;
        this.army = army;
    }

    void getDefenceInfo() {
        System.out.println("Defence Dept: " + department);
        System.out.println("Nation: " + nation);
        army.getArmyInfo();
    }
}


