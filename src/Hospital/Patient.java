package Hospital;

import java.util.ArrayList;

public class Patient extends Person{
    
    ArrayList<Appointment> Appointments;
    
    //added default constructor
    public Patient(String name, String surname, short age, int id){
        super(name, surname, age, id);
        Appointments = new ArrayList<Appointment>();
    }
    
    public Patient(String name, String surname, short age, int id, ArrayList<Appointment> list) {
        super(name, surname, age, id);
        this.Appointments = list;
    }
    
    public void printAllAppointments(){
        //Prints all appointments
        for(int i = 0; i < Appointments.size(); i++){
            System.out.println("APPOINTMENTS: \n Appointment ID: " + Appointments.get(i).getAppointmentID()
                                           + "\n Appointment Date: " + Appointments.get(i).getDate()
                                           + "\n Appointment Description: " + Appointments.get(i).getDescription() );
        }
    }
    
    public void subscribeNewAppointment(Appointment newAppointment){
        //TO DO
        //Adds new appointment into the list
        Appointments.add(newAppointment);
    }
    
    public void deleteExistingAppointment(int AppointmentID){
        //TO DO
        //Delete Existing Appointment from list
    }
    
    public ArrayList<Appointment> getAppointmentList(){
        return Appointments;
    }
}
