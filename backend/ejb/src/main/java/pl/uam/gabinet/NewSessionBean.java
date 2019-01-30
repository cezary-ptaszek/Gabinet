package pl.uam.gabinet;

import pl.uam.gabinet.entities.DoctorEntity;
import pl.uam.gabinet.entities.PatientEntity;
import pl.uam.gabinet.entities.VisitEntity;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Singleton
@Startup
public class NewSessionBean {

    @PersistenceContext(unitName = "primary")
    protected EntityManager em;

    @PostConstruct
    public void init(){

        PatientEntity patient1 = new PatientEntity();
        patient1.setName("Adam");
        patient1.setSurname("Kowalski");
        patient1.setDateOfBirth("01.08.1990");
        patient1.setKodeWithCity("34-093 Poznań");
        patient1.setNumber((long) 123456789);
        patient1.setStreet("Kasztanowa 1/2");

        PatientEntity patient2 = new PatientEntity();
        patient2.setName("Ewa");
        patient2.setSurname("Kowalska");
        patient2.setDateOfBirth("13.12.1980");
        patient2.setKodeWithCity("00-093 Poznań");
        patient2.setNumber((long) 142735689);
        patient2.setStreet("Lipowa 5/1");

        DoctorEntity doctor1 = new DoctorEntity();
        doctor1.setName("Jowita");
        doctor1.setSurname("Androsz");

        DoctorEntity doctor2 = new DoctorEntity();
        doctor2.setName("Arkadiusz");
        doctor2.setSurname("Niezawodny");

        VisitEntity visit1 = new VisitEntity();
        visit1.addPatients(patient1);
        visit1.addDoctor(doctor1);
        visit1.setDate("01.01.2019");
        visit1.setInfo("Ma złamaną noge");

        VisitEntity visit2 = new VisitEntity();
        visit2.addPatients(patient2);
        visit2.addDoctor(doctor2);
        visit2.setDate("10.02.2019");
        visit2.setInfo("Brak");

        em.persist(visit1);
        em.persist(visit2);
    }
}
