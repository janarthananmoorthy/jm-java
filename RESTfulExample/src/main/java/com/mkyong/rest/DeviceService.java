package com.mkyong.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.jana.model.Device;
import com.jana.model.User;

@Path("/device")
public class DeviceService {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public Device getDevice(@PathParam("id") long deviceId) {
		
		List<User> userList = new ArrayList<User>();
		userList.add(new User(101l, "Jana", "moorthy", "mjanacse@gmail.com", "9789466674"));
		userList.add(new User(102l, "Kamesh", "Manohar", "kamesh@gmail.com", "9658642144"));
		return new Device(deviceId, "Android", userList);
	}
}
