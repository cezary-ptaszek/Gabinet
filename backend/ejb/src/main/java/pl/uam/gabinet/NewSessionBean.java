package pl.uam.gabinet;

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

        VisitEntity visit1 = new VisitEntity();
        visit1.setDoctor("Arek Koszecki");
        visit1.setPatient("Adam Górny");
        visit1.setDate("01.02.2019");
        visit1.setInfo("Ekstrakcja prawej semki");

        VisitEntity visit2 = new VisitEntity();
        visit2.setDoctor("Ewa Jastarska");
        visit2.setPatient("John Matos");
        visit2.setDate("06.01.2019");
        visit2.setInfo("Prześwietlenie");

        VisitEntity visit3 = new VisitEntity();
        visit3.setDoctor("Ewa Jastarska");
        visit3.setPatient("Monika Orzeł");
        visit3.setDate("06.02.2019");
        visit3.setInfo("Konsultacja");

        VisitEntity visit4 = new VisitEntity();
        visit4.setDoctor("Arek Koszecki");
        visit4.setPatient("Ewelina Luka");
        visit4.setDate("02.02.2019");
        visit4.setInfo("Konsultacja");

        VisitEntity visit5 = new VisitEntity();
        visit5.setDoctor("Rafał Guzik");
        visit5.setPatient("jakub Kowalski");
        visit5.setDate("15.02.2019");
        visit5.setInfo("Odkamienianie");

        em.persist(visit1);
        em.persist(visit2);
        em.persist(visit3);
        em.persist(visit4);
        em.persist(visit5);
    }
}
