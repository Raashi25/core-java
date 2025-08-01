class Seat {
    int seatNumber;
    String constituency;
    Politician politician;

    void getSeatInfo() {
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Constituency: " + constituency);
        politician.getPoliticianInfo();
    }
}