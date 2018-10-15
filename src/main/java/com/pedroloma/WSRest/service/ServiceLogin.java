package com.pedroloma.WSRest.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.pedroloma.WSRest.vo.VOUser;

@Path("/tutorial")
public class ServiceLogin {
	
	@POST
	@Path("/validateUser")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public VOUser validateUser(VOUser vo) {
		vo.setValidUser(false);
		if (vo.getUser().equals("Java") && vo.getPassword().equals("Revolutions")) {
			vo.setPassword("xxxxxxxxxxxxxxxx");
			vo.setValidUser(true);
		}
		return vo;
	}
}
