package com.javaweb.model.dto;

import java.util.List;

public class BuildingResponseDTO {
    
	private Long id;
	private String name;
	private Long numberOfBasement;
	private Long RentPrice;
	private String address;
	private String nameOfManager; 
    private String phoneOfManager;
    private Long floorArea;
    private List<Long> rentArea;
    private List<Long> emptyRentArea;
    private String serviceFee;
    private Double brokerageFee;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getNumberOfBasement() {
		return numberOfBasement;
	}
	public void setNumberOfBasement(Long numberOfBasement) {
		this.numberOfBasement = numberOfBasement;
	}
	public Long getRentPrice() {
		return RentPrice;
	}
	public void setRentPrice(Long rentPrice) {
		RentPrice = rentPrice;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNameOfManager() {
		return nameOfManager;
	}
	public void setNameOfManager(String nameOfManager) {
		this.nameOfManager = nameOfManager;
	}
	public String getPhoneOfManager() {
		return phoneOfManager;
	}
	public void setPhoneOfManager(String phoneOfManager) {
		this.phoneOfManager = phoneOfManager;
	}
	public Long getFloorArea() {
		return floorArea;
	}
	public void setFloorArea(Long floorArea) {
		this.floorArea = floorArea;
	}
	public List<Long> getRentArea() {
		return rentArea;
	}
	public void setRentArea(List<Long> rentArea) {
		this.rentArea = rentArea;
	}
	
	public String getServiceFee() {
		return serviceFee;
	}
	public void setServiceFee(String serviceFee) {
		this.serviceFee = serviceFee;
	}
	public Double getBrokerageFee() {
		return brokerageFee;
	}
	public void setBrokerageFee(Double brokerageFee) {
		this.brokerageFee = brokerageFee;
	}
	public List<Long> getEmptyRentArea() {
		return emptyRentArea;
	}
	public void setEmptyRentArea(List<Long> emptyRentArea) {
		this.emptyRentArea = emptyRentArea;
	}
    
	
	
	
	
}
