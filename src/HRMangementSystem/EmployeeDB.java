package HRMangementSystem;

public class EmployeeDB {



    public String Title;
    public String Name;
    public String  DOB;
    public String Address;
    public String  Town;
    public String County;
    public String PostCode;
    public String ContactNumber;
    public String EmailAdd;
    public String  EmployeeID;
    public String Position;
    public String  StartDate;


    public EmployeeDB(String title, String name, String DOB, String address, String town, String county, String postCode, String contactNumber, String emailAdd, String employeeID, String position, String startDate) {
        Title = title;
        Name = name;
        this.DOB = DOB;
        Address = address;
        Town = town;
        County = county;
        PostCode = postCode;
        ContactNumber = contactNumber;
        EmailAdd = emailAdd;
        EmployeeID = employeeID;
        Position = position;
        StartDate = startDate;
    }
}


