class Meeting {
    String subject;
    String date;
    Invitee invitee;

    void getMeetingInfo() {
        System.out.println("Meeting Subject: " + subject);
        System.out.println("Date: " + date);
        invitee.getInviteeInfo();
    }
}