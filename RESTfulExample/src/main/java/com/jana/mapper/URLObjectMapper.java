package com.jana.mapper;

import java.util.List;

import com.jana.model.URLObject;

public interface URLObjectMapper {
	public URLObject getAllURLObject();
	public void addURLObject(URLObject urlObject);
	public URLObject getURLObjectById(int id);
}
