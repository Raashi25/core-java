class DefenceRunner {
    public static void main(String[] post) {
        Squad squad = new Squad();
        squad.codeName = "Bravo";
        squad.members = 12;

        Army army = new Army();
        army.division = "Infantry";
        army.soldierCount = 500;
        army.squad = squad;

        Defence defence = new Defence("Indian Defence", "India", army);
        defence.getDefenceInfo();
    }
}
