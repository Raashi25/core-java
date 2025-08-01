class Army {
    String division;
    int soldierCount;
    Squad squad;

    void getArmyInfo() {
        System.out.println("Division: " + division);
        System.out.println("Soldiers: " + soldierCount);
        squad.getSquadInfo();
    }
}