class Department {
    String departmentName;
    int noOfStaff;
    Doctor doctor;

    public void getDepartmentInfo() {
        System.out.println("Department: " + departmentName);
        System.out.println("Staff Count: " + noOfStaff);
        doctor.getDoctorInfo();
    }
}