package com.jana;

import java.util.List;

import org.junit.Test;

import com.jana.model.URLObject;
import com.jana.util.URLObjectManager;

public class URLObjectManagerTest {
	
	@Test
	public void testURLObjectService() {
		URLObject urlObject = URLObjectManager.getAllURLObject();
		assert(urlObject != null);
		assert(urlObject.getId() == 1);
	}

	@Test
	public void testAddURLObjectService() {
		URLObject urlObject = new URLObject();
		urlObject.setUrl("www.yahoo.com");
		urlObject.setStatusCode(200);
		urlObject.setLoadTime(3l);
		
		URLObjectManager.addURLObject(urlObject);
	}
	
	@Test
	public void testGetURLObjectByIdService() {
		URLObject urlObject = URLObjectManager.getURLObjectById(1);
		assert(urlObject != null);
		assert(urlObject.getId() == 1);
		assert(urlObject.getStatusCode() == 200);
		assert(urlObject.getUrl().equals("www.google.com"));
	}
}
