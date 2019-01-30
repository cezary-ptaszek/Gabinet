package pl.uam.gabinet.entities;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class MedicalTreatmentEntity extends AbstractBaseEntity{

    @OneToOne
    private VisitEntity visit;
    private Integer price;
    private String commentsOfTreatment;
}
