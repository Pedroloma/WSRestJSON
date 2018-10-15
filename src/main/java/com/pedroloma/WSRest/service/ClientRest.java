package com.pedroloma.WSRest.service;

import javax.ws.rs.core.MediaType;

import com.pedroloma.WSRest.vo.VOUser;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;

public class ClientRest {
	
	public static void main(String[] args) {
		VOUser vo = new VOUser();
		vo.setUser("Java");
		vo.setPassword("Revolutions");
		vo.setValidUser(false);
		
		ClientConfig clientConfig = new DefaultClientConfig();
		clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
		Client client = Client.create(clientConfig);
		WebResource webResource = client.resource("http://localhost:8080/WSRestJSONTutorial/services/tutorial/validateUser");
		ClientResponse response = webResource.type(MediaType.APPLICATION_JSON).post(ClientResponse.class, vo);
		vo = response.getEntity(VOUser.class);
		System.out.println("Response: User " + vo.getUser());
		System.out.println("Response: Is valid " + vo.isValidUser());
	}

}
