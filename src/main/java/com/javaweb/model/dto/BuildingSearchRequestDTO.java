package com.javaweb.model.dto;

import java.util.List;

public class BuildingSearchRequestDTO {

	private String nameOfBuilding;
	private Long floorArea;
	private String dictrictId;
	private String ward;
	private String street;
	private Long numberOfBasement;
	private String direction;
	private String level;
	private Long minArea;
	private Long maxArea;
	private Long minRentPrice;
	private Long maxRentPrice;
	private String nameOfManager;
	private String phoneOfManager;
	private Long staffId;
	private List<String> typeCode;
	public String getNameOfBuilding() {
		return nameOfBuilding;
	}
	public Long getFloorArea() {
		return floorArea;
	}
	public String getDictrictId() {
		return dictrictId;
	}
	public String getWard() {
		return ward;
	}
	public String getStreet() {
		return street;
	}
	public Long getNumberOfBasement() {
		return numberOfBasement;
	}
	public String getDirection() {
		return direction;
	}
	public String getLevel() {
		return level;
	}
	public Long getMinArea() {
		return minArea;
	}
	public Long getMaxArea() {
		return maxArea;
	}
	public Long getMinRentPrice() {
		return minRentPrice;
	}
	public Long getMaxRentPrice() {
		return maxRentPrice;
	}
	public String getNameOfManager() {
		return nameOfManager;
	}
	public String getPhoneOfManager() {
		return phoneOfManager;
	}
	public Long getStaffId() {
		return staffId;
	}
	public List<String> getTypeCode() {
		return typeCode;
	}
	public void setNameOfBuilding(String nameOfBuilding) {
		this.nameOfBuilding = nameOfBuilding;
	}
	public void setFloorArea(Long floorArea) {
		this.floorArea = floorArea;
	}
	public void setDictrictId(String dictrictId) {
		this.dictrictId = dictrictId;
	}
	public void setWard(String ward) {
		this.ward = ward;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public void setNumberOfBasement(Long numberOfBasement) {
		this.numberOfBasement = numberOfBasement;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public void setMinArea(Long minArea) {
		this.minArea = minArea;
	}
	public void setMaxArea(Long maxArea) {
		this.maxArea = maxArea;
	}
	public void setMinRentPrice(Long minRentPrice) {
		this.minRentPrice = minRentPrice;
	}
	public void setMaxRentPrice(Long maxRentPrice) {
		this.maxRentPrice = maxRentPrice;
	}
	public void setNameOfManager(String nameOfManager) {
		this.nameOfManager = nameOfManager;
	}
	public void setPhoneOfManager(String phoneOfManager) {
		this.phoneOfManager = phoneOfManager;
	}
	public void setStaffId(Long staffId) {
		this.staffId = staffId;
	}
	public void setTypeCode(List<String> typeCode) {
		this.typeCode = typeCode;
	}
	
	
	
}
