package com.mkyong.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.jana.model.User;

@Path("/user")
public class UserService {
	
	static List<User> userList;
	
	public UserService(){
		userList = new ArrayList<User>();
		userList.add(new User(101l, "Jana", "moorthy", "mjanacse@gmail.com", "9789466674"));
		userList.add(new User(102l, "Kamesh", "Manohar", "kamesh@gmail.com", "9658642144"));
		userList.add(new User(103l, "Gobi", "Selvaraj", "gobi@gmail.com", "9456875213"));
		userList.add(new User(104l, "Harish", "Arthanari", "harish@gmail.com", "8956412358"));
		userList.add(new User(105l, "Balu", "Arumugam", "balu@gmail.com", "7589642158"));
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getUser() {
		return userList;
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public User getUser(@PathParam("id") Long userId) {
 
		User returnValue = null;
		for (User user: userList){
			if (user.getUserId() == userId){
				returnValue = user;
			}
		}
		return returnValue;
	}
	
	/*
	 * Reference: https://www.mkyong.com/webservices/jax-rs/json-example-with-jersey-jackson/
	 */
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/create")
	public List<User> addUser(User user) {
		userList.add(user);
		return userList;
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/update")
	public List<User> updateUser(User updateUser){
		for (User user: userList){
			if (user.getUserId() == updateUser.getUserId()){
				user.setEmail(updateUser.getEmail());
				user.setFirstName(updateUser.getFirstName());
				user.setLastName(updateUser.getLastName());
				user.setMobileNo(updateUser.getMobileNo());
			}
		}
		return userList;
	}
	
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public List<User> deleteUser(@PathParam("id") Long userId) {
		User deleteUser = null;
		for (User user: userList){
			if (user.getUserId() == userId){
				deleteUser = user;
			}
		}
		if (deleteUser != null) {
			int deleteIndex = userList.indexOf(deleteUser);
			userList.remove(deleteIndex);
		}
		return userList;
	}
}

