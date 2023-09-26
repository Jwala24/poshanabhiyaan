package com.poshanabhiyan.model.user;

import java.util.Map;

public class PoshanAbhiyanDetails {

	private String theme;
	private String level;
	private String awc;
	private String activity;
	private String fromDate;
	private String toDate;
	private String adultMale;
	private String adultFemale;
	private String childMale;
	private String childFemale;
    

	public PoshanAbhiyanDetails(Map<String, String> map){
    	
		theme = readTheme(map);
    	level = readLevel(map);
    	awc = readAwc(map);
    	activity = readActivity(map);
    	fromDate = readFromDate(map);
    	toDate = readToDate(map);
    	adultMale = readAdultMale(map);
    	adultFemale = readAdultFemale(map);
    	childMale = readChildMale(map);
    	childFemale = readChildFemale(map);
    	
    }
    
    public String getTheme() {
		return theme;
	}

	public String getLevel() {
		return level;
	}

	public String getAwc() {
		return awc;
	}

	public String getActivity() {
		return activity;
	}

	public String getFromDate() {
		return fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public String getAdultMale() {
		return adultMale;
	}

	public String getAdultFemale() {
		return adultFemale;
	}

	public String getChildMale() {
		return childMale;
	}

	public String getChildFemale() {
		return childFemale;
	}

	private String readTheme(Map<String, String> map) {
		return map.get("Theme");
	}
	private String readLevel(Map<String, String> map) {
		return map.get("Level");
	}
	private String readAwc(Map<String, String> map) {
		return map.get("AWC");
	}
	private String readActivity(Map<String, String> map) {
		return map.get("Activity");
	}
	private String readFromDate(Map<String, String> map) {
		return map.get("From Date");
	}
	private String readToDate(Map<String, String> map) {
		return map.get("To Date");
	}
	private String readAdultMale(Map<String, String> map) {
		return map.get("Adult Male");
	}
	private String readAdultFemale(Map<String, String> map) {
		return map.get("Adult Female");
	}
	private String readChildMale(Map<String, String> map) {
		return map.get("Child Male");
	}
	private String readChildFemale(Map<String, String> map) {
		return map.get("Child Female");
	}
}
