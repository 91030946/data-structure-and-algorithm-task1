/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalrecord;

/**
 *
 * @author 91030946
 */
public class PatientRecord {
    private String patientID;
    private String name;
    private String date;
    private String doctor;

    public PatientRecord(String patientID, String name, String date, String doctor) {
        this.patientID = patientID;
        this.name = name;
        this.date = date;
        this.doctor = doctor;
    }

    /**
     * @return the patientID
     */
    public String getPatientID() {
        return patientID;
    }

    /**
     * @param patientID the patientID to set
     */
    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the doctor
     */
    public String getDoctor() {
        return doctor;
    }

    /**
     * @param doctor the doctor to set
     */
    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }
@Override
    public String toString() {
        String details
                = "PatientID:[" + patientID + "]\n"
            
                + "Name:[" + name + "]\n"
                + "Check In Date:[" + date + "]\n"
                + "Assigned Medical Personnel:[" + doctor + "]\n";
        return details;

}
    
}
