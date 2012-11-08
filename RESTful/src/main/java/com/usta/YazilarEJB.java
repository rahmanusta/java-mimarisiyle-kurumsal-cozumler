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
import javax.ws.rs.core.MediaType;

/**
 *
 * @author usta
 */
@Stateless
@Path("/yazilar")

public class YazilarEJB{
    
    @PersistenceContext(unitName="kodcu-PU")
    private EntityManager em;
      
    @GET
    @Path("/{yazar}")
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public List<Yazi> buYazi(@PathParam("yazar") String yazar)
    {
        Query sorgu=em.createNamedQuery("suYazar");
        sorgu.setParameter("yazar","%"+ yazar+"%");

      return sorgu.getResultList();   
     
    }
    
    @GET
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public List<Yazi> tumYazilar(){
        return em.createNamedQuery("tumYazilar").getResultList();

    }
    
    @POST
    @Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public Yazi yaziEkle(Yazi yazi)
    {
        em.persist(yazi);
        return yazi;
    }
    
    @DELETE
    @Path("/sil/{yaziNo}")
    public void kayitSil(@PathParam(value="yaziNo") Long yaziNo){
        em.remove(em.find(Yazi.class, yaziNo));
    }
    
   
    
    //    @GET
//    @Path("/{yaziNo}")
//    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
//    public Yazi suYazi(@PathParam("yaziNo") Long yaziNo)
//    {
//        Query sorgu=em.createNamedQuery("suYazi");
//        sorgu.setParameter("yaziNo", yaziNo);
//        return (Yazi)sorgu.getSingleResult();
//
//    }
    
}
