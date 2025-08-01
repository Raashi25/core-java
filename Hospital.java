class Hospital {
    String hospitalName;
    String location;
    Department department;

    public Hospital(String hospitalName, String location, Department department) {
        this.hospitalName = hospitalName;
        this.location = location;
        this.department = department;
    }

    public void getHospitalInfo() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Location: " + location);
        department.getDepartmentInfo();
    }
}

