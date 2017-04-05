package Hospital;

import java.util.ArrayList;

public class Appointment {
    private final int AppointmentID;
    private String Date;
    private String Description;
    
    private final ArrayList<Doctor> Doctors;

    public Appointment(int AppointmentID, String Date, ArrayList<Doctor> Doctors, String Description) {
        this.AppointmentID = AppointmentID;
        this.Date = Date;
        this.Doctors = Doctors;
        this.Description = Description;
    }

    public int getAppointmentID() {
        return AppointmentID;
    }
    
    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
    
    public void printInvolvedDoctors(){
        //TO DO
        //Print Involved Doctors
    }
    
//    public void addNewDoctor(Doctor){
//        //TO DO
//        // add New Doctor
//    }
//    
//    public void removeExistingDoctor(int){
//        //TO DO
//        // remove Existing Doctor
//    }
    
}
