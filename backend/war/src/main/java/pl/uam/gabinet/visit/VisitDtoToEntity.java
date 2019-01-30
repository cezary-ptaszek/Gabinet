package pl.uam.gabinet.visit;

import pl.uam.gabinet.entities.DoctorEntity;
import pl.uam.gabinet.entities.PatientEntity;
import pl.uam.gabinet.entities.VisitEntity;

public class VisitDtoToEntity {

    public static VisitEntity toEntity(VisitDto aEnt){
        VisitEntity ret = new VisitEntity(aEnt.getId());
        String[] split1 = aEnt.getDoctor().split(" ");
        ret.addDoctor(new DoctorEntity(split1[0],split1[1]));
        String[] split2 = aEnt.getPatient().split(" ");
        ret.addPatients(new PatientEntity(split2[0],split2[1],split2[2],Long.parseLong(split2[3]),split2[4],split2[5]));
        ret.setInfo(aEnt.getInfo());
        ret.setDate(aEnt.getDate());
        return ret;
    }
}

