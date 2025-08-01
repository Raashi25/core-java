class RailwayRunner {
    public static void main(String[] train) {
        Train train = new Train();
        train.trainName = "Shatabdi Express";
        train.trainNumber = 12001;

        RailwayStation station = new RailwayStation("KSR Bengaluru", "SBC", train);
        station.getStationInfo();
    }
}
