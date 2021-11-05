package HospitalManagementSystem.People.Doctor;

import HospitalManagementSystem.People.Patient;

public class TherapistDecorator extends DoctorDecorator {

    TherapistDecorator(Doctor doctor) {
        super(doctor);
    }

    @Override
    public void treatPatient(Patient patient) {
        wrappee.treatPatient(patient);
        // patient.inspect();
        // patient.makeDiagnosis();
    }

    @Override
    public String getSpeciality() {
        return wrappee.getSpeciality().concat("Therapist");
    }
}
