package pl.uam.gabinet;

import pl.uam.gabinet.entities.VisitEntity;
import pl.uam.gabinet.exceptions.VisitNotFoundException;
import pl.uam.gabinet.visit.VisitDto;
import pl.uam.gabinet.visit.VisitDtoToEntity;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.Optional;

@Path("visit")
@RequestScoped
public class VisitRestful {

    @EJB
    private VisitDao visitDao;

    @GET
    @Produces("application/json; charset=UTF-8")
    public Response getAll() {
        List<VisitEntity> ret = visitDao.getAll();
        return Response.status(200).entity(ret).build();
    }

    @GET
    @Path("{id}")
    @Produces("application/json; charset=UTF-8")
    public Response getById(@PathParam("id") long aId) throws VisitNotFoundException {
        Optional<VisitDto> visitDto = visitDao.getVisitById(aId).map(VisitDto::new);
        return Response.status(200).entity(visitDto.orElseThrow(VisitNotFoundException::new)).build();
    }

    @POST
    @Consumes("application/json")
    @Produces("application/json; charset=UTF-8")
    public Response addVisit(VisitDto aVisit) {
        VisitEntity ent = visitDao.addVisit(VisitDtoToEntity.toEntity(aVisit));
        return Response.status(201).entity(new VisitDto(ent)).build();
    }

    @DELETE
    @Path("{id}")
    @Consumes("application/json; charset=UTF-8")
    @Produces("application/json; charset=UTF-8")
    public Response removeVisit(@PathParam("id") long aId) {
        visitDao.remove(aId);
        return Response.status(204).entity("").build();
    }

    @PUT
    @Consumes("application/json; charset=UTF-8")
    @Produces("application/json; charset=UTF-8")
    public Response editVisit(VisitDto aVisit) {
        VisitDto visit = new VisitDto(visitDao.update(VisitDtoToEntity.toEntity(aVisit)));
        return Response.status(200).entity(visit).build();
    }

}
