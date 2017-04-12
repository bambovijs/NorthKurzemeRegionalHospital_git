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
        //TODO parbaudes
        for(int i = 0; i < Patients.size(); i++){
            if(Patients.get(i).Appointments.get(i).getDate().equals(Date)){
                System.out.println("Date: " + Date 
                                   + "\nPATIENT: "
                                   + "\n Name: " + Patients.get(i).getName()
                                   + "\n Surname: " + Patients.get(i).getName() );
            }
        }
    }
    
    public static void printAllAppointmentsForPatient(int PatientID){
        for(int i = 0; i < Patients.size(); i++){
            if(Patients.get(i).getId() == PatientID){
                for(int j = 0; j < Patients.get(j).Appointments.size(); j++){
                    System.out.println("All Appointments for: " + Patients.get(j).getName()
                                       + "\n APPOINTMENTS: " + Patients.get(j).Appointments.toString()
                    );
                }
            }
        }
    }
    
    public static void makeNewAppointment(int PatientID, int AppointmentID, String Date, ArrayList<Doctor> Doctors){
        for(int i = 0; i < Patients.size(); i++){
            if(Patients.get(i).getId() == PatientID){
                Patients.get(PatientID).getAppointmentList()
            }
        }
    }
    
    public static void deleteAppointment(int PatientID, int AppointmentID){
        for(int i = 0; i < Patients.size(); i++){
            if(Patients.get(i).getId() == PatientID && Patients.get(i).Appointments.get(i).getAppointmentID() == AppointmentID ){
                Patients.get(i).Appointments.remove(AppointmentID);
            }
        }
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
        for(int i = 0; i < Doctors.size(); i++){
            if(Doctors.get(i).getId() == DoctorObj.getId()){
                Doctors.remove(i);
                return true;
            }
        }
        return false;
    }
    
//    public static void generateAndSaveDoctors(){
//        
//    }
    
//    public ArrayList<Doctor> uploadDoctorList(){
//        
//    }
//    
//    public String generateDayPlanForDoctor(Doctor){
//        
//    }
    
    public static void main(String[] args) {
        Doctor doc1 = new Doctor("Raivo", "Bambis", (short)22, 001, (short)456, "Dentist"); // doctor
        Patient pat1 = new Patient("Vards", "Uzvards", (short)23, 2);
        Appointment app1 = new Appointment(01, "01/01/2017", Doctors, "Kaut kas");
        Appointment app2 = new Appointment(02, "02/02/2017", Doctors, "Kaut kas nr2");
        
        
        
        addNewDoctor(doc1);
        addNewPatient(pat1);
        app1.addNewDoctor(doc1);
        pat1.Appointments.add(app1);
        pat1.Appointments.add(app2);
        
        printAllDoctors(Doctors);
        printAllPatients(Patients);
        printAllAppointmentsForPatient(2);
    }
    
}
