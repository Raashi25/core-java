class LokSabhaRunner {
    public static void main(String[] constituency) {
        Politician politician = new Politician();
        politician.name = "Rahul Gandhi";
        politician.party = "INC";

        Seat seat = new Seat();
        seat.seatNumber = 123;
        seat.constituency = "Wayanad";
        seat.politician = politician;

        LokSabha lokSabha = new LokSabha("Lower House", 545, seat);
        lokSabha.getLokSabhaInfo();
    }
}