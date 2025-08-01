class Calendar {
    String owner;
    String year;
    Meeting meeting;

    Calendar(String owner, String year, Meeting meeting) {
        this.owner = owner;
        this.year = year;
        this.meeting = meeting;
    }

    void getCalendarInfo() {
        System.out.println("Calendar Owner: " + owner);
        System.out.println("Year: " + year);
        meeting.getMeetingInfo();
    }
}

