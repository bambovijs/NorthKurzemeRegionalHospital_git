package Hospital;

import java.util.ArrayList;

public class Hospital {

    ArrayList<Patient> Patients;
    ArrayList<Doctor> Doctors;
    
    public void printAllPatients(ArrayList<Patient> Patient){
        //TODO parbaudes vai vispar kkas ir saraksta
        for(int i = 0; i < Patient.size(); i++){
            System.out.println("PATIENTS: " 
                               + "\n Patient ID: " + Patient.get(i).getId()
                               + "\n Patient Name: " + Patient.get(i).getName()
                               + "\n Patient Surename: " + Patient.get(i).getSurname()
                               + "\n Patient Age: " + Patient.get(i).getAge()
            );
        }
    }
    
    public void addNewPatient(Patient newPatient){
        //TODO parbaudes
        
    }
    
    public boolean deleteExistingPatientByID(int id){
        //TODO parbaudes
        return true;
    }
    
    public boolean deleteExistingPatientByObject(Patient Patient){
        return true;
    }
    
    public void printAllPatientsForDate(String Date){
        
    }
    
    public void printAllAppointmentsForPatient(int PatientID){
        
    }
    
    public void makeNewAppointment(int PatientID, int AppointmentID, String Date, ArrayList<Doctor> Doctors){
        
    }
    
    public void deleteAppointment(int PatientID, int AppointmentID){
        
    }
    
//    public void printAllDoctors(ArrayList<Doctor>){
//        
//    }
    
    public void addNewDoctor(Doctor newDoctor){
        
    }
    
    public boolean deleteExistingDoctorByID(int DoctorID){
        return true;
    }
    
    public boolean deleteExistingDoctorByObject(Doctor DoctorObj) {
        return true;
    }
    
    public void generateAndSaveDoctors(){
        
    }
    
//    public ArrayList<Doctor> uploadDoctorList(){
//        
//    }
//    
//    public String generateDayPlanForDoctor(Doctor){
//        
//    }
    
    public static void main(String[] args) {
        Person p1;
        p1 = new Person("Name", "Surename", (short)1, 1);
        //p1 = new Doctor("Raivo", "Bambis", (short)1, 2, (short)3, "m");
        Person pat1 = new Patient("Raivo", "Bambis", (short)1, 1);
        
        System.out.println(p1.getName() + " " + p1.getSurname() + " " + p1.getAge() + " " + p1.getId() );
        System.out.println(pat1.getName() + " " + pat1.getSurname() + " " + pat1.getAge() + " " + pat1.getId() );
    }
    
}
