class LokSabha {
    String houseName;
    int totalSeats;
    Seat seat;

    LokSabha(String houseName, int totalSeats, Seat seat) {
        this.houseName = houseName;
        this.totalSeats = totalSeats;
        this.seat = seat;
    }

    void getLokSabhaInfo() {
        System.out.println("House: " + houseName);
        System.out.println("Total Seats: " + totalSeats);
        seat.getSeatInfo();
    }
}

