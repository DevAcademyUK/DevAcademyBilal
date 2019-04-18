package LibraryList;

import java.util.Comparator;

public class member implements Comparable<member> {

    public int memeberID;
    public String memberForname;
    public String memberSurname;
    public byte memberAge;

    public member(int memeberID, String memberForname, String memberSurname, byte memberAge) {
        this.memeberID = memeberID;
        this.memberForname = memberForname;
        this.memberSurname = memberSurname;
        this.memberAge = memberAge;
    }

    @Override
    public int compareTo(member o) {

        String member = o.memberForname;
        return this.memberForname.compareTo(member);

    }

    public  static Comparator<member> SurnameBook = new Comparator<member>() {
        @Override
        public int compare(member S1, member S2) {

            String Surname1 = S1.memberSurname.toUpperCase();
            String Surname2 = S2.memberSurname.toUpperCase();

            return Surname1.compareTo(Surname2);
        }
    };


    public  static Comparator<member> membersAge = new Comparator<member>() {
        @Override
        public int compare(member Age1, member Age2) {



            Byte Mage = Age2.memberAge;
            Byte mAge = Age2.memberAge;

            return Mage.compareTo(mAge);
        }
    };


}
