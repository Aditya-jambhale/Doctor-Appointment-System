import java.util.Arrays; 
import java.util.Scanner; 
 
public class DoctorAppointmentSystem {    
 private String userpatientName;    
 private String userAddress;    
 private long userMobile;     
 private String userName;    
 private String password;    
 private int choice1;    
 private String loginUsername = null;    
 private String loginPassword = null;    
 private int patientChoice;    
 private int cityChoice;    
 private int doctorChoice;    
 private String patientName;    
 private int patientAge;    
 private long patientMobile; 
 private int patList;    
 private String[] user = new String[10];    
 private String[] pat = new String[10];    
 private int counter1 = 0;    
 private int counter2 = 0;    
 private int patientLoginCounter = 0;    
 Scanner sc = new Scanner(System.in); 
 
 public DoctorAppointmentSystem() { 
   System.out.println("------------Welcome to DMCE Hospitals------------"); 

   System.out.println("Please Follow the Procedure"); 
   System.out.println("-----------------------------------------------"); 
 } 
 
 public void patient() 
 { 
    System.out.println("------Welcome to Patient Menu------"); 
    System.out.println("Press 1 for Registration");       
    System.out.println("Press 2 for Login");     
    patientChoice = sc.nextInt(); 
 } 
 
 public void welcomeBar() 
 { 
    System.out.println("Press 1 for Patients"); 
    System.out.println("Press 2 for Doctors");        
    System.out.println("Press 3 for Admin Services"); 
    choice1 = sc.nextInt(); 
 } 
 
 public void welExecution() 
 {         
   switch (choice1) {            
     case 1: 
       patient();           
       switch (patientChoice) {         
         case 1: 
           System.out.println("Register yourself.."); 
           patientRegistration();                
           welcomeBar();               
           welExecution(); 
           break; 

         case 2: 
           if (userName != null && password != null) {        
              System.out.println("Patient Login"); 
              System.out.println("------Enter the required credentials for login------"); 
              patientLogin(); 
            } else { 
               System.out.println("Please Register first then try!..");   
               patient(); 
               System.out.println("Register yourself.."); 
               patientRegistration();                      
               welcomeBar(); 
               welExecution(); 
            }                   
            break; 

            default: 
              System.out.println("Wrong choice!!"); 
              System.out.println("Please select the menu again..");                   
              welcomeBar();                  
              welExecution(); 
         }           
         break; 
 
      case 2: 
        System.out.println("----Doctors Currently Available----");         
        citySelect(); 
        break; 
 
      case 3: 
        System.out.println("----Admin Services----"); 
        XList();         
        welcomeBar();         
        welExecution(); 
        break; 
 
      default: 
        System.out.println("Wrong choice!!"); 
        System.out.println("Please select the menu again..");       
        welcomeBar();          
        welExecution(); 
    } 
 } 
 
 public void patientRegistration()
 { 
    System.out.println("Please enter Name:");     
    userpatientName = sc.next().toString();     
    user[counter1] = userpatientName;     
    System.out.println("Please enter Address:");      
    userAddress = sc.next().toString(); 
    System.out.println("Please enter Mobile number:");      
    userMobile = sc.nextLong(); 
    System.out.println("Please set username:");     
    userName = sc.next().toString(); 
    System.out.println("Please set password:");     
    password = sc.next().toString(); 
    System.out.println("-----Registration Done Successfully-----"); 
    System.out.println("Your username is " + userName + " and password is " + password);     
    counter1++; 
 } 
 
 public void doctor() 
 { 
 
 } 
 
 public void patientLogin() 
 { 
    System.out.println("Please enter registered username:");     
    loginUsername = sc.next().toString(); 
    System.out.println("Please enter required password:");     
    loginPassword = sc.next().toString(); 
 
    if (loginUsername.equals(userName) && loginPassword.equals(password)) {             
        patientLoginCounter++;         
        System.out.println("User Exists"); 
        System.out.println("Welcome " + userpatientName);      
        citySelect(); 
 
    } else { 
       System.out.println("Invalid Credentials!");     
       patientLogin(); 
    } 
 
 } 
 
 public void citySelect() 
 { 
    System.out.println("------Please Select the city------"); 
    System.out.println("1 Andheri"); 
    System.out.println("2 Kharghar"); 
    System.out.println("3 Bandra"); 
    System.out.println("4 Vashi");     
    System.out.println("5 Panvel");    
    cityChoice = sc.nextInt(); 
 
    switch (cityChoice) {          
      case 1: 
        System.out.println("Select the doctor from Andheri");           
        doctorDetails(); 
        break; 
 
      case 2: 
        System.out.println("Select the doctor from Kharghar"); 
        doctorDetails(); 
        break; 
 
      case 3: 
        System.out.println("Select the doctor from Bandra");          
        doctorDetails(); 
        break; 
 
      case 4: 
        System.out.println("Select the doctor from Vashi");             
        doctorDetails(); 
        break; 
 
      case 5: 
        System.out.println("Select the doctor from Panvel");          
        doctorDetails(); 
        break; 
 
      default: 
        System.out.println("Wrong choice!!"); 
        System.out.println("Please select the menu again..");         
        citySelect(); 
    } 
 } 
 
 public void bookDoctorAppointment() 
 {        
    System.out.println("----Appointment Form----");     
    System.out.println("Enter patient name");    
    patientName = sc.next().toString();     
    pat[counter2] = patientName; 
    System.out.println("Enter patient age");     
    patientAge = sc.nextInt(); 
    System.out.println("Enter patient phone number");     
    patientMobile = sc.nextLong(); 
 
    if (patientName != null && patientMobile != 0) {        
       System.out.println("Appointment Done!"); 
    } else { 
       System.out.println("Please enter all the fields and fill up again!!");       
       bookDoctorAppointment(); 
    } 
    counter2++; 
 
 } 
 
  public void doctorDetails() 
 { 
     System.out.println("1 Dr. Joshi"); 
     System.out.println("2 Dr. Desai"); 
     System.out.println("3 Dr. Kulkarni"); 
     System.out.println("4 Dr. Arora");    
     System.out.println("5 Dr. Kaushik"); 
     doctorChoice = sc.nextInt(); 
 
     switch (doctorChoice) {       
       case 1: 
         System.out.println(); 
         System.out.println("-------Doctors details:-------"); 
         System.out.println("Dr. Joshi"); 
         System.out.println("MBBS, MD (Cardiac Surgeon)"); 
         if (patientLoginCounter != 0) {            
             bookDoctorAppointment(); 
             welcomeBar();                  
             welExecution(); 
          } else { 
             System.out.println("Please login first then book appointment"); 
             welcomeBar(); 
             welExecution(); 
          } 
          break; 
 
       case 2: 
         System.out.println(); 
         System.out.println("------Doctors details:------"); 
         System.out.println("Dr. Desai"); 
         System.out.println("MBBS, MD (Psychiatrist Expert)"); 
         if (patientLoginCounter != 0) {                     
             bookDoctorAppointment(); 
             welcomeBar();           
             welExecution(); 
          } else { 
             System.out.println("Please login first then book appointment"); 
             welcomeBar(); 
             welExecution(); 
          } 
          break; 
 
       case 3: 
         System.out.println(); 
         System.out.println("------Doctors details:------"); 
         System.out.println("Dr. Kulkarni"); 
         System.out.println("MBBS, MD (Cardiology Surgeon)"); 
         if (patientLoginCounter != 0) {            
             bookDoctorAppointment(); 
             welcomeBar();           
             welExecution(); 
          } else { 
             System.out.println("Please login first then book appointment"); 
             welcomeBar();         
             welExecution(); 
          }     
          break; 
 
       case 4: 
         System.out.println(); 
         System.out.println("------Doctors details:------"); 
         System.out.println("Dr. Arora"); 
         System.out.println("MBBS, MD (Urology Expert)"); 
         if (patientLoginCounter != 0) {            
             bookDoctorAppointment(); 
             welcomeBar();        
             welExecution(); 
          } else { 
             System.out.println("Please login first then book appointment"); 
             welcomeBar();           
             welExecution(); 
          }         
          break; 
 
       case 5: 
         System.out.println(); 
         System.out.println("------Doctors details:------"); 
         System.out.println("Dr. Kaushik"); 
         System.out.println("MBBS, MD (Dentist)"); 
         if (patientLoginCounter != 0) {         
             bookDoctorAppointment(); 
             welcomeBar();           
             welExecution(); 
          } else { 
             System.out.println("Please login first then book appointment"); 
             welcomeBar(); 
             welExecution(); 
          } 
          break; 
 
          default: 
            System.out.println("Wrong choice!!"); 
            System.out.println("Please select the menu again..");           
            doctorDetails(); 
     } 
  } 
 
  public void XList() 
  { 
    System.out.println("Press 1 for Patient list");  
     System.out.println("Press 2 for User list"); 
     patList = sc.nextInt(); 
 
     switch (patList) {       
       case 1: 
         System.out.println("---Patients are as follows---");         
         System.out.println(Arrays.toString(pat));          
         break; 
 
       case 2: 
         System.out.println("---Users are as follows---");                 
         System.out.println(Arrays.toString(user));                
         break; 
 
       default: 
         System.out.println("Wrong choice!!"); 
         System.out.println("Please select the menu again.."); 
         XList(); 
         break; 
    } 
 } 

  public static void main(String[] args) { 
    DoctorAppointmentSystem d = new 
    DoctorAppointmentSystem(); 
    d.welcomeBar(); 
    d.welExecution(); 
 } 
} 
 

