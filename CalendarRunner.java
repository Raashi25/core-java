class CalendarRunner {
    public static void main(String[] date) {
        Invitee invitee = new Invitee();
        invitee.name = "Param";
        invitee.role = "Manager";

        Meeting meeting = new Meeting();
        meeting.subject = "Project Review";
        meeting.date = "2025-08-01";
        meeting.invitee = invitee;

        Calendar calendar = new Calendar("Bob", "2025", meeting);
        calendar.getCalendarInfo();
    }
}
