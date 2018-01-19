package com.predix.minio.PredixMinioIntegration.common;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/files")
public class IntegrateMinio {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getFile() 
	{
		return "Hello World"; 
	}
	
}
