package com.mkyong.rest;
 
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.jana.mapper.URLObjectMapper;
import com.jana.model.URLObject;
import com.jana.util.URLObjectManager;

@Path("/hello")
public class HelloWorldService {
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public void addURLObject(List<String> urlList) throws Exception {
		
		for (String urlString : urlList) {
			URL url = new URL(urlString);
			HttpURLConnection connection = (HttpURLConnection)url.openConnection();
			//connection.setRequestMethod("GET");
			//connection.connect();

			long startTime = System.nanoTime();
			int code = connection.getResponseCode();
			long finishedTime = System.nanoTime();
			long timeToFullLoad = finishedTime - startTime;
			
			URLObject obj = new URLObject();
			obj.setUrl(url.toString());
			obj.setStatusCode(code);
			obj.setLoadTime(timeToFullLoad/1000000000);
			
			URLObjectManager.addURLObject(obj);
		}
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/getall")
	public URLObject getAllURLs() throws Exception {
		return URLObjectManager.getAllURLObject();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public URLObject getURLObjectById(@PathParam("id")int id) throws Exception {
		return URLObjectManager.getURLObjectById(id);
	}
 
}