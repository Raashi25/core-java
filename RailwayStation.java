class RailwayStation {
    String stationName;
    String code;
    Train train;

    RailwayStation(String stationName, String code, Train train) {
        this.stationName = stationName;
        this.code = code;
        this.train = train;
    }

    void getStationInfo() {
        System.out.println("Station: " + stationName);
        System.out.println("Code: " + code);
        train.getTrainInfo();
    }
}


