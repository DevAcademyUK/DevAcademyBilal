package HRMangementSystem;

import java.util.Comparator;

public class ManagerSession implements Comparable<ManagerSession> {

    public String Title;
    public String Name;
    public String DOB;
    public String Address;
    public String Town;
    public String County;
    public String PostCode;
    public String ContactNumber;
    public String EmailAdd;
    public String EmployeeID;
    public String Position;
    public String StartDate;



    @Override
    public int compareTo(ManagerSession M) {

        String town = M.Town ;
        String post = M.PostCode;
        String name = M.Name;
        String dob = M.DOB;
        String add = M.Address;
        String county = M.County;
        String num = M.ContactNumber;
        String email = M.EmailAdd;
        String id = M.EmployeeID;
        String pos = M.Position;
        String date = M.StartDate;


        return this.Town.compareTo(town) + this.County.compareTo(county) +
                this.PostCode.compareTo(post)+ this.Name.compareTo(name)+
                this.DOB.compareTo(dob)+ this.Address.compareTo(add)+
                this.County.compareTo(county)+ this.ContactNumber.compareTo(num)+
                this.EmailAdd.compareTo(email)+ this.EmailAdd.compareTo(id)+
                this.Position.compareTo(pos)+ this.StartDate.compareTo(date);

    }




    // public static Comparator<ManagerSession> MangerTown= new Comparator<ManagerSession>() {
    //  @Override
    //   public int compare(ManagerSession TW1, ManagerSession TW2,) {

    //  String TWN1 = TW1.Town.toUpperCase ();
    // String TWN2 = TW2.Town.toUpperCase();
    // return TWN1.compareTo(TWN2);



    public ManagerSession(String title, String name, String DOB, String address, String town, String county, String postCode, String contactNumber, String emailAdd, String employeeID, String position, String startDate) {
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



