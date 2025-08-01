class MobileRunner {
    public static void main(String[] mbl) {
        Contact contact = new Contact();
        contact.name = "Rahul";
        contact.number = "9876543210";

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.owner = "Raashi";
        phoneBook.noOfContacts = 200;
        phoneBook.contact = contact;

        Mobile mobile = new Mobile("Samsung", "S23", phoneBook);
        mobile.getMobileInfo();
    }
}
