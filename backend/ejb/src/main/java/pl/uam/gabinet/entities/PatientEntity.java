package pl.uam.gabinet.entities;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table (name = "PATIENT")
public class PatientEntity extends AbstractBaseEntity{

    @OneToMany
    private Set<VisitEntity> visits;
    private String name;
    private String surname;
    private String dateOfBirth;
    private Long number;
    private String street;
    private String kodeWithCity;

    public PatientEntity(long aId) {
        super(aId);
        this.visits = new HashSet<>();
    }

    public PatientEntity() {
        this.visits = new HashSet<>();
    }

    public PatientEntity(String name, String surname, String dateOfBirth, Long number, String street, String kodeWithCity) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.number = number;
        this.street = street;
        this.kodeWithCity = kodeWithCity;
    }

    public VisitEntity getVisit() {
        return visits.stream().findAny().get();
    }

    public Set<VisitEntity> getVisits() {
        return visits;
    }

    public void addVisit(VisitEntity visit) {
        this.visits.add(visit);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getKodeWithCity() {
        return kodeWithCity;
    }

    public void setKodeWithCity(String kodeWithCity) {
        this.kodeWithCity = kodeWithCity;
    }

    public void update(PatientEntity aPatient) {
        visits.add(aPatient.getVisit());
        this.name = aPatient.getName();
        this.surname = aPatient.getSurname();
        this.dateOfBirth = aPatient.getDateOfBirth();
        this.number = aPatient.getNumber();
        this.street = aPatient.getStreet();
        this.kodeWithCity = aPatient.getKodeWithCity();
    }
}
