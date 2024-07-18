package com.springrest.springrest.entities;

import java.util.UUID;

public class lods {
    
    private long noOfTrucks; // Reverting to using id as identifier
    private String loadingPoint;
    private String unloadingPoint;
    private String productType;
    private String truckType;
    private int weight;
    private String comment;
    private UUID shipperId;
    private String date;

    // Constructor with all fields
    public lods(long noOfTrucks, String loadingPoint, String unloadingPoint,
                String productType, String truckType, int weight, String comment,
                UUID shipperId, String date) {
        this.noOfTrucks = noOfTrucks;
        this.loadingPoint = loadingPoint;
        this.unloadingPoint = unloadingPoint;
        this.productType = productType;
        this.truckType = truckType;
        this.weight = weight;
        this.comment = comment;
        this.shipperId = shipperId;
        this.date = date;
    }

    // Getters and setters for all fields

    public long getnoOfTrucks() {
        return noOfTrucks;
    }

    public void setnoOfTrucks(long noOfTrucks) {
        this.noOfTrucks = noOfTrucks;
    }

    public String getLoadingPoint() {
        return loadingPoint;
    }

    public void setLoadingPoint(String loadingPoint) {
        this.loadingPoint = loadingPoint;
    }

    public String getUnloadingPoint() {
        return unloadingPoint;
    }

    public void setUnloadingPoint(String unloadingPoint) {
        this.unloadingPoint = unloadingPoint;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getTruckType() {
        return truckType;
    }

    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public UUID getShipperId() {
        return shipperId;
    }

    public void setShipperId(UUID shipperId) {
        this.shipperId = shipperId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    // Default constructor (if needed)

    public lods() {
        super();
    }

    @Override
    public String toString() {
        return "lods [noOfTrucks=" + noOfTrucks + ", loadingPoint=" + loadingPoint + ", unloadingPoint="
                + unloadingPoint + ", productType=" + productType + ", truckType=" + truckType + ", weight=" + weight
                + ", comment=" + comment + ", shipperId=" + shipperId + ", date=" + date + "]";
    }

	

	
}
