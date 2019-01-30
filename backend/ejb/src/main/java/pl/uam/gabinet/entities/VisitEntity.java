package pl.uam.gabinet.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "VISIT")
public class VisitEntity extends AbstractBaseEntity {

    @ManyToOne
    private Set<DoctorEntity> doctors;
    @ManyToOne
    private Set<PatientEntity> patients;
    private String date;
    private String info;

    public VisitEntity(long aId) {
        super(aId);
        this.doctors = new HashSet<>();
        this.patients = new HashSet<>();
    }

    public VisitEntity() {
        this.doctors = new HashSet<>();
        this.patients = new HashSet<>();
    }

    public VisitEntity(Long id, DoctorEntity doctor, PatientEntity patient, String date, String info) {
        this(id);
        doctors.add(doctor);
        patients.add(patient);
        this.date = date;
        this.info = info;
    }

    public DoctorEntity getDoctor() {
        return doctors.stream().findAny().get();
    }

    public Set<DoctorEntity> getDoctors() {
        return doctors;
    }

    public void addDoctor(DoctorEntity doctor) {
        this.doctors.add(doctor);
    }

    public PatientEntity getPatient() {
        return patients.stream().findAny().get();
    }

    public Set<PatientEntity> getPatients() {
        return patients;
    }

    public void addPatients(PatientEntity patient) {
        this.patients.add(patient);
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void update(VisitEntity aVisit) {
        doctors.add(aVisit.getDoctor());
        patients.add(aVisit.getPatient());
        date = aVisit.getDate();
        info = aVisit.getInfo();
    }

}
