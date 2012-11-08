/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usta;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.ws.rs.*;
import javax.ws.rs.core.CacheControl;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author usta
 */
@Stateless
@Path("/yazilar")
//@Dependent
public class YazilarEJB {

    @PersistenceContext(unitName = "kodcu-PU")
    private EntityManager em;

    @GET
    @Path("/{yazar}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Yazi> buYazi(@PathParam("yazar") String yazar) {
        Query sorgu = em.createNamedQuery("suYazar");
        sorgu.setParameter("yazar", "%" + yazar + "%");

        return sorgu.getResultList();

    }

//    @GET
//    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
//    public Response tumYazilar() {
//
//        List<Yazi> yazi = em.createNamedQuery("tumYazilar").getResultList();
//
//        CacheControl cacheControl = new CacheControl();
//
//        cacheControl.setMaxAge(0);
//        cacheControl.setPrivate(false);
//        cacheControl.setNoTransform(false);
//        Response.ResponseBuilder builder;
//        builder = Response.ok(new GenericEntity<List<Yazi>>(yazi) {
//        }, MediaType.APPLICATION_JSON);
//
//        builder.cacheControl(cacheControl);
//
//        return builder.build();
//
//
//    }
    @GET
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public List<Yazi> tumYazilar(){
        
        List<Yazi> yazi=em.createNamedQuery("tumYazilar").getResultList();
        return yazi;
    
    }


    @POST
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void yaziEkle(Yazi yazi) {

        em.merge(yazi);

        //  return yazi;
    }


    /*
    @POST
    //@Consumes({MediaType.APPLICATION_FORM_URLENCODED})
    public void yaziEkle(@FormParam("id") String id,
                         @FormParam("oper") String metod,
                         @FormParam("tarih") String tarih,
                         @FormParam("yazar") String yazar,
                         @FormParam("yazi") String yazi)
                           
    {
       // em.persist(yazi);
       // return yazi;
        
        System.out.println("Sonuç : "+tarih+" "+yazar+" "+yazi);
    }
    */
    @DELETE
    @Path("/sil/{yaziNo}")
    public void kayitSil(@PathParam(value = "yaziNo") Long yaziNo) {
        em.remove(em.find(Yazi.class, yaziNo));
    }

}
