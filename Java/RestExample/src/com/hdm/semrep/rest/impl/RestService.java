package com.hdm.semrep.rest.impl;

import javax.ws.rs.Path;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
@Path("/restservice/")
public class RestService {
 
	
	
	
	
 @GET
 @Produces("text/plain")
 @Path("/insert") 
 public String insertData() {
	 
	 // HIER: Methodenkörper
	 
        return "Methode insert:  sagt Jaaaaa!"; 
 }
 
 
 @GET
 @Produces("text/plain")
 @Path("/update") 
 public String updateData() {
	 
	 // HIER: Methodenkörper

	 
        return "Methode update: sagt Jaaaaa";
    }
 
 
 @GET
 @Produces("text/plain")
 @Path("/getData") 
 public String getData() {
	 
	 // HIER: Methodenkörper

        return "Methode getData: sagt Jaaaaa";
    }
 
 
 
 
 
 
 //////// n2h ////////
 
 
 @GET
 @Produces("text/plain")
 @Path("/getData") 
 public String getDokumentByDriveID() {
	 
	 // HIER: Methodenkörper

        return "Methode update: sagt Jaaaaa";
    }
 
 

 
 
}