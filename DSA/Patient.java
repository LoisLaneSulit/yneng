class Patient {
    
    private String firstname;
    private String lastname;
    private int age;
    private String address;
    
    public Patient(String fname, String lname, int yearOld, String add ){
        firstname = fname;
        lastname = lname;
        age = yearOld;
        address = add;
    }
    
    public String getFullname(){
        return firstname + " " + lastname;
    }
    
    public int getAge(){
        return age;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void output(){
        System.out.println("***PATIENT INFORMATION***");
        System.out.println("Name    : " + getFullname());
        System.out.println("Age     : " + getAge());
        System.out.println("Address : " + getAddress());
        System.out.println();
    }
}