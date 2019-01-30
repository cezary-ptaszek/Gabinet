package pl.uam.gabinet;

import pl.uam.gabinet.entities.VisitEntity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

@Stateless
public class VisitDao {

    @PersistenceContext(unitName = "primary")
    protected EntityManager em;


    public VisitDao() {
    }

    public List<VisitEntity> getAll() {
        return em.createQuery("SELECT b FROM VisitEntity b", VisitEntity.class).getResultList();
    }

    public Optional<VisitEntity> getVisitById(long aId){
        return Optional.of(em.find(VisitEntity.class, aId));
    }

    public VisitEntity addVisit(VisitEntity aVisit) {
        em.persist(aVisit);
        return aVisit;
    }

    public void remove(long aId) {
        em.remove(em.find(VisitEntity.class, aId));
    }

    public VisitEntity update(VisitEntity visitEntity) {
        VisitEntity dbVisit = em.find(VisitEntity.class, visitEntity.getId());
        dbVisit.update(visitEntity);
        return dbVisit;
    }
}
