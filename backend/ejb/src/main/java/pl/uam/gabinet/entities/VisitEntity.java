package pl.uam.gabinet.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "VISIT")
public class VisitEntity extends AbstractBaseEntity {

    private String doctor;
    private String patient;
    private String date;
    private String info;

    public VisitEntity(long aId) {
        super(aId);
    }

    public VisitEntity() {
    }

    public VisitEntity(Long id, String doctor, String patient, String date, String info) {
        this(id);
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
        this.info = info;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
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
        doctor = aVisit.getDoctor();
        patient = aVisit.getPatient();
        date = aVisit.getDate();
        info = aVisit.getInfo();
    }

}