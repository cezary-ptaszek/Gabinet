package pl.uam.gabinet.visit;

import pl.uam.gabinet.entities.VisitEntity;

import java.io.Serializable;

public class VisitDto implements Serializable {

    private Long id;
    private String patient;
    private String doctor;
    private String date;
    private String info;

    public VisitDto() {

    }

    public VisitDto(long aId) {
        id = aId;
    }

    public VisitDto(Long id, String date, String info, String patient, String doctor) {
        this.id = id;
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
        this.info = info;
    }

    public VisitDto(VisitEntity visitEntity) {
        this.id = visitEntity.getId();
        this.patient = visitEntity.getPatient();
        this.doctor = visitEntity.getDoctor();
        this.date = visitEntity.getDate();
        this.info = visitEntity.getInfo();
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getInfo() {
        return info;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VisitDto visitDto = (VisitDto) o;

        return id != null ? id.equals(visitDto.id) : visitDto.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
