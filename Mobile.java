class Mobile {
    String brand;
    String model;
    PhoneBook phoneBook;

    Mobile(String brand, String model, PhoneBook phoneBook) {
        this.brand = brand;
        this.model = model;
        this.phoneBook = phoneBook;
    }

    void getMobileInfo() {
        System.out.println("Mobile Brand: " + brand);
        System.out.println("Model: " + model);
        phoneBook.getPhoneBookInfo();
    }
}

