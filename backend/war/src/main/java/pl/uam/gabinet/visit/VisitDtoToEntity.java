package pl.uam.gabinet.visit;


import pl.uam.gabinet.entities.VisitEntity;

public class VisitDtoToEntity {

    public static VisitEntity toEntity(VisitDto aEnt){
        VisitEntity ret = new VisitEntity(aEnt.getId());
        ret.setPatient(aEnt.getPatient());
        ret.setDoctor(aEnt.getDoctor());
        ret.setInfo(aEnt.getInfo());
        ret.setDate(aEnt.getDate());
        return ret;
    }
}