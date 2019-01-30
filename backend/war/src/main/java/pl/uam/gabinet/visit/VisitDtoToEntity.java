package pl.uam.gabinet.visit;

import pl.uam.gabinet.entities.VisitEntity;

public class VisitDtoToEntity {

    public static VisitEntity toEntity(VisitDto aEnt){
        VisitEntity ret = new VisitEntity(aEnt.getId());
        ret.setPrice(aEnt.getPrice());
        ret.setRating(aEnt.getRating());
        ret.setReleaseDate(aEnt.getReleaseDate());
        ret.setTitle(aEnt.getTitle());
        return ret;
    }
}

