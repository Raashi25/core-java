class HospitalRunner {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        doctor.name = "Dr. Meena";
        doctor.specialization = "Cardiology";

        Department department = new Department();
        department.departmentName = "Heart Department";
        department.noOfStaff = 20;
        department.doctor = doctor;

        Hospital hospital = new Hospital("Apollo", "Bangalore", department);

        hospital.getHospitalInfo();
    }
}
