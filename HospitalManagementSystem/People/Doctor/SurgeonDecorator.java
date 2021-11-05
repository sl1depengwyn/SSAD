package HospitalManagementSystem.People.Doctor;

import HospitalManagementSystem.People.Patient;

public class SurgeonDecorator extends DoctorDecorator {

    SurgeonDecorator(Doctor doctor) {
        super(doctor);
    }

    @Override
    public void treatPatient(Patient patient) {
        wrappee.treatPatient(patient);
        // patient.cut();
        // patient.cutSmthRedundantOut();
        // patient.sew();
    }

    @Override
    public String getSpeciality() {
        return wrappee.getSpeciality().concat("Surgeon");
    }
}
