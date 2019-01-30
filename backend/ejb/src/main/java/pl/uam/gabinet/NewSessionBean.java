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
        VisitEntity visit2 = new VisitEntity();
        visit1.setTitle("Test1");
        visit1.setPrice(30);
        visit1.setRating(3);
        visit1.setReleaseDate(1273665600);

        visit2.setTitle("Test2");
        visit2.setPrice(40);
        visit2.setRating(5);
        visit2.setReleaseDate(1273665600);

        em.persist(visit1);
        em.persist(visit2);
    }
}
