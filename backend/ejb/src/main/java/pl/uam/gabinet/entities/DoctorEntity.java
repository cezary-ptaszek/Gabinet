package pl.uam.gabinet.entities;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table (name = "DOCTOR")
public class DoctorEntity extends AbstractBaseEntity{

    private String name;
    private String surname;
    @OneToMany(mappedBy = "doctors")
    private Set<VisitEntity> visits;

    public DoctorEntity() {
    }

    public DoctorEntity( String name, String surname) {
        this.name = name;
        this.surname = surname;

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

    public Set<VisitEntity> getVisits() {
        return visits;
    }

    public void setVisits(Set<VisitEntity> visits) {
        this.visits = visits;
    }
}
