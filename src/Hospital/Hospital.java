package Hospital;

import java.util.ArrayList;

public class Hospital {

    static ArrayList<Patient> Patients = new ArrayList<>();
    static ArrayList<Doctor> Doctors = new ArrayList<>();
    
    public static void printAllPatients(ArrayList<Patient> Patients){
        //TODO parbaudes vai vispar kkas ir saraksta
        for(int i = 0; i < Patients.size(); i++){
            System.out.println("PATIENTS: " 
                               + "\n Patient ID: " + Patients.get(i).getId()
                               + "\n Patient Name: " + Patients.get(i).getName()
                               + "\n Patient Surename: " + Patients.get(i).getSurname()
                               + "\n Patient Age: " + Patients.get(i).getAge()
            );
        }
    }
    
    public static void addNewPatient(Patient newPatient){
        //TODO parbaudes
        Patients.add(newPatient);
    }
    
    public static boolean deleteExistingPatientByID(int id){
        //TODO parbaudes
        return true;
    }
    
    public static boolean deleteExistingPatientByObject(Patient Patient){
        return true;
    }
    
    public static void printAllPatientsForDate(String Date){
        
    }
    
    public static void printAllAppointmentsForPatient(int PatientID){
        
    }
    
    public static void makeNewAppointment(int PatientID, int AppointmentID, String Date, ArrayList<Doctor> Doctors){
        
    }
    
    public static void deleteAppointment(int PatientID, int AppointmentID){
        
    }
    
//    public static void printAllDoctors(ArrayList<Doctor>){
//        
//    }
    
    public static void addNewDoctor(Doctor newDoctor){
        Doctors.add(newDoctor);
    }
    
    public static boolean deleteExistingDoctorByID(int DoctorID){
        return true;
    }
    
    public static boolean deleteExistingDoctorByObject(Doctor DoctorObj) {
        return true;
    }
    
    public static void generateAndSaveDoctors(){
        
    }
    
//    public ArrayList<Doctor> uploadDoctorList(){
//        
//    }
//    
//    public String generateDayPlanForDoctor(Doctor){
//        
//    }
    
    public static void main(String[] args) {
        Doctor doc1 = new Doctor("Raivo", "Bambis", (short)22, 001, (short)456, "Dentist"); // doctor
        Person p1 = new Person("Matiss", "Malnieks", (short)25, 002); //person
        Patient pat1 = new Patient("Enija", "Griga", (short)22, 003); //patient
        
        addNewPatient(pat1);
        printAllPatients(Patients);
        printAllAppointmentsForPatient(3);
    }
    
}
