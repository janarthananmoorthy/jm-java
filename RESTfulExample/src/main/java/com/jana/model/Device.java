package com.jana.model;

import java.util.List;

public class Device {

	private long deviceId;
	private String deviceName;
	List<User> deviceUsers;
	
	public Device(){}
	
	public Device(long deviceId, String deviceName, List<User> deviceUsers) {
		this.deviceId = deviceId;
		this.deviceName = deviceName;
		this.deviceUsers = deviceUsers;
	}

	public long getDeviceId() {
		return deviceId;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public List<User> getDeviceUsers() {
		return deviceUsers;
	}
}
