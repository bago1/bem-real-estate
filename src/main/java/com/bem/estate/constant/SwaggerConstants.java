package com.bem.estate.constant;

public final class SwaggerConstants {
    public static final String SAVE_LISTING = "This method creates new listing";
    public static final String GET_ALL_CITIES = "This method gets all cities";
    public static final String GET_DISTRICTS_BY_CITY_ID = "This method gets all districts in selected city";
    public static final String GET_PROVINCES_BY_DISTRICT = "This method gets all provinces in selected district";
    public static final String FIND_Listing = "This method finds listing by given parameters";
    public static final String GET_CITY_BY_ID = "This method finds city by given id";
    public static final String GET_ALL_LISTINGS = "THis method gets all listings";


    private SwaggerConstants(){
        throw new IllegalStateException("no instance"); //todo why i need it
    }

}
