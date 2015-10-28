public class PatientRun {
    public static void main(String args[]){
        
        Patient patientObject1 = new Patient("Juan", "dela Cruz", 21, "Apalit Pampanga" ); 
        patientObject1.output();
        
        Patient patientObject2 = new Patient("Maria", "Corazon", 18, "Calamba Laguna" ); 
        patientObject2.output();
        
        Patient patientObject3 = new Patient("Antonio", "Luna", 65, "Taguig Cavite" ); 
        patientObject3.output();
    }
}
