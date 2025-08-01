class PhoneBook {
    int noOfContacts;
    String owner;
    Contact contact;

    void getPhoneBookInfo() {
        System.out.println("Owner: " + owner);
        System.out.println("No. of Contacts: " + noOfContacts);
        contact.getContactInfo();
    }
}
