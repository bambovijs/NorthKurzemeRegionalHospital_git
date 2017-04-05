package Hospital;

public class Doctor extends Person {
    private final short OfficeNum;
    private final String Speciality;

    //added default constructor
    public Doctor(){
        super("N", "N", (short)0, 0);
        OfficeNum = 0;
        Speciality = "N";
    }
    
    public Doctor(String name, String surname, short age, int id, short OfficeNum, String Speciality) {
        super(name, surname, age, id);
        this.OfficeNum = OfficeNum;
        this.Speciality = Speciality;
    }

    public short getOfficeNum() {
        return OfficeNum;
    }

    public String getSpeciality() {
        return Speciality;
    }
       
}
