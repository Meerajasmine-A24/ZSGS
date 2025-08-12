

/* 1. Design a Java program to maintain hospital medical records.
 Create a base class named MedicalRecord that includes common attributes:
--- recordId, patientName, dateOfVisit, and diagnosis.
 --- inputRecordDetails() – to input common record information.
--- override displayRecord() – to display the common record details.

 Create a subclass InPatientRecord that extends MedicalRecord and adds:
 --- roomNumber, numberOfDaysAdmitted, roomCharges.
 --- calculateTotalCharges() – to compute and return total inpatient cost. --- displayRecord() – to include all details, including total charges.

 Create another subclass OutPatientRecord that extends MedicalRecord and adds:
 --- doctorName, consultationFee.
 --- override displayRecord() – to include all outpatient-specific details.
 Include all the necessary classes if its needed. */
 


import java.util.Scanner;

class MedicalRecord {
    int recordId;
    String patientName;
    String dateOfVisit;
    String diagnosis;

    void inputRecordDetails(int recordId, String patientName, String dateOfVisit, String diagnosis) {
        this.recordId = recordId;
        this.patientName = patientName;
        this.dateOfVisit = dateOfVisit;
        this.diagnosis = diagnosis;
    }

    void displayRecord() {
        System.out.println("Record ID: " + recordId);
        System.out.println("Patient Name: " + patientName);
        System.out.println("Date of Visit: " + dateOfVisit);
        System.out.println("Diagnosis: " + diagnosis);
    }
}

class InPatientRecord extends MedicalRecord {
    int roomNumber;
    int numberOfDaysAdmitted;
    double roomCharges;
    double totalCharges;

    void inputInPatientDetails(int roomNumber, int numberOfDaysAdmitted, double roomCharges) {
        this.roomNumber = roomNumber;
        this.numberOfDaysAdmitted = numberOfDaysAdmitted;
        this.roomCharges = roomCharges;
    }

    void calculateTotalCharges() {
        this.totalCharges = numberOfDaysAdmitted * roomCharges;
    }

    void displayRecord() {
        super.displayRecord();
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Number of Days Admitted: " + numberOfDaysAdmitted);
        System.out.println("Room Charges per Day: " + roomCharges);
        System.out.println("Total Charges: " + totalCharges);
    }
}

class OutPatientRecord extends MedicalRecord {
    String doctorName;
    double consultationFee;

    void inputOutPatientDetails(String doctorName, double consultationFee) {
        this.doctorName = doctorName;
        this.consultationFee = consultationFee;
    }

    void displayRecord() {
        super.displayRecord();
        System.out.println("Doctor Name: " + doctorName);
        System.out.println("Consultation Fee: " + consultationFee);
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        InPatientRecord inPatient = new InPatientRecord();

        System.out.print("Enter InPatient Record ID: ");
        int id1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter InPatient Name: ");
        String name1 = sc.nextLine();
         System.out.print("Enter Date of Visit: ");
        String date1 = sc.nextLine();
        System.out.print("Enter Diagnosis: ");
        String diagnosis1 = sc.nextLine();

        inPatient.inputRecordDetails(id1, name1, date1, diagnosis1);

        System.out.print("Enter Room Number: ");
        int room = sc.nextInt();
        System.out.print("Enter Number of Days Admitted: ");
        int days = sc.nextInt();
        System.out.print("Enter Room Charges per Day: ");
        double charges = sc.nextDouble();

        inPatient.inputInPatientDetails(room, days, charges);
        inPatient.calculateTotalCharges();

        System.out.println("InPatient Record:");
        inPatient.displayRecord();

        sc.nextLine();

        OutPatientRecord outPatient = new OutPatientRecord();

        System.out.print("Enter OutPatient Record ID: ");
        int id2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter OutPatient Name: ");
        String name2 = sc.nextLine();
        System.out.print("Enter Date of Visit: ");
        String date2 = sc.nextLine();
        System.out.print("Enter Diagnosis: ");
        String diagnosis2 = sc.nextLine();

        outPatient.inputRecordDetails(id2, name2, date2, diagnosis2);

        System.out.print("Enter Doctor Name: ");
        String doctor = sc.nextLine();
        System.out.print("Enter Consultation Fee: ");
        double fee = sc.nextDouble();

        outPatient.inputOutPatientDetails(doctor, fee);

        System.out.println("OutPatient Record:");
        outPatient.displayRecord();

        sc.close();
    }
}
