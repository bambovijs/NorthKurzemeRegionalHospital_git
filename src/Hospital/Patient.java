package Hospital;

import java.util.ArrayList;

public class Patient extends Person{
    
    ArrayList<Appointment> Appointments;
    
    //added default constructor
    public Patient(){
        super("N", "N", (short)0, 0);
    }
    
    
    public Patient(String name, String surname, short age, int id){
        super(name, surname, age, id);
        Appointments = new ArrayList<Appointment>();
    }
    
    public Patient(String name, String surname, short age, int id, ArrayList<Appointment> Appointment) {
        super(name, surname, age, id);
        this.Appointments = Appointment;
    }
    
    public void printAllAppointments(){
        //Prints all appointments
        for(int i = 0; i < Appointments.size(); i++){
            System.out.println("APPOINTMENT: \n Appointment ID: " + Appointments.get(i).getAppointmentID()
                                           + "\n Appointment Date: " + Appointments.get(i).getDate()
                                           + "\n Appointment Description: " + Appointments.get(i).getDescription() );
        }
    }
    
    public void subscribeNewAppointment(Appointment newAppointment){
        //TO DO 
        //parbaudes ?!
        Appointments.add(newAppointment);
    }
    
    public void deleteExistingAppointment(int AppointmentID){
        //Delete Existing Appointment from list
        for(int i = 0; i < Appointments.size(); i++){
            if (AppointmentID == Appointments.get(i).getAppointmentID()){
                Appointments.remove(i);
            }
        }
    }
    
    public ArrayList<Appointment> getAppointmentList(){
        return Appointments;
    }
}
