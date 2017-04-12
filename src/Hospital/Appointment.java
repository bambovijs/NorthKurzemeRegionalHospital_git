package Hospital;

import java.util.ArrayList;

public class Appointment {
    private final int AppointmentID;
    private String Date;
    private String Description;
    
    private ArrayList<Doctor> Doctors;

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
    
    public void addNewDoctor(Doctor newDoctor){
        Doctors.add(newDoctor);
    }
    
    public void removeExistingDoctor(short id){
        //Removes existing doctor from the doctors list
        for(int i = 0; i < Doctors.size(); i++){
            if (id == Doctors.get(i).getId()){
                Doctors.remove(i);
            }
        }
    }
    
}
