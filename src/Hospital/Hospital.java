package Hospital;

import java.util.ArrayList;

public class Hospital {

    static ArrayList<Patient> Patients = new ArrayList<>();
    static ArrayList<Doctor> Doctors = new ArrayList<>();
    
    public static void printAllPatients(ArrayList<Patient> Patients){
        //TODO parbaudes vai vispar kkas ir saraksta
        for(int i = 0; i < Patients.size(); i++){
            System.out.println("PATIENT: " 
                               + "\n Patient ID: " + Patients.get(i).getId()
                               + "\n Patient Name: " + Patients.get(i).getName()
                               + "\n Patient Surename: " + Patients.get(i).getSurname()
                               + "\n Patient Age: " + Patients.get(i).getAge()
            );
        }
    }
    
    public static void addNewPatient(Patient newPatient){
        Patients.add(newPatient);
    }
    
    public static boolean deleteExistingPatientByID(int id){
        for(int i = 0; i < Patients.size(); i++){
            if(id == Patients.get(i).getId()){
                Patients.remove(id);
                return true;
            }
        }
        return false;
    }
    
    public static boolean deleteExistingPatientByObject(Patient existingPatient){
        // nezinu vai tā ir pareizi bet citadi nevareju izdomat
        if( Patients.isEmpty() ){
            return false;
        }
        else{
            for(int i = 0; i < Patients.size(); i++){
                if(Patients.get(i).getId() == existingPatient.getId()){
                    Patients.remove(i);
                    return true;
                }       
            }
        }
        return false;
        
//        for(int i = 0; i < Patients.size(); i++){
//            if( Patients.get(i) != null && Patients.get(i).getName().equals(existingPatient.getName())){
//                
//            }
//        }
    }
    
    public static void printAllPatientsForDate(String Date){
        
    }
    
    public static void printAllAppointmentsForPatient(int PatientID){
        
    }
    
    public static void makeNewAppointment(int PatientID, int AppointmentID, String Date, ArrayList<Doctor> Doctors){
        
    }
    
    public static void deleteAppointment(int PatientID, int AppointmentID){
        
    }
    
    public static void printAllDoctors(ArrayList<Doctor> Doctors){
        for(int i = 0; i < Doctors.size(); i++){
            System.out.println("Doctor: "
                               + "\n Name: " + Doctors.get(i).getName()
                               + "\n Surname: " + Doctors.get(i).getSurname()
                               + "\n Speciality: " + Doctors.get(i).getSpeciality()
            );
        }
    }
    
    public static void addNewDoctor(Doctor newDoctor){
        Doctors.add(newDoctor);
    }
    
    public static boolean deleteExistingDoctorByID(int DoctorID){
        for(int i = 0; i < Doctors.size(); i++){
            if(DoctorID == Doctors.get(i).getId()){
               Doctors.remove(DoctorID);
               return true;
            }
        }
        return false;
    }
    
    public static boolean deleteExistingDoctorByObject(Doctor DoctorObj) {
        // ka lai atrod DoctorObj Doctor lista
        Doctors.remove(DoctorObj);
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
        Patient pat2 = new Patient("Reinis", "Bambis", (short)25, 004); // patient
        
        addNewPatient(p1);
        addNewPatient(pat2);
        addNewDoctor(doc1);
        printAllPatients(Patients);
        printAllDoctors(Doctors);
        
        
    }
    
}
