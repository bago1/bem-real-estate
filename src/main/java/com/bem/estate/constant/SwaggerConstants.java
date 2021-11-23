package com.bem.estate.constant;

public final class SwaggerConstants {
    public static final String SAVE_ELAN = "Create Elan";
    public static final String GET_ELAN = "Get Elan";
    public static final String GET_ALL_CITIES = "Get all cities";
    public static final String GET_DISTRICTS_BY_CITY = "This method gets all districts in selected city";
    public static final String GET_PROVINCES_BY_DISTRICT = "This method gets all provinces in selected district";


    private SwaggerConstants(){
        throw new IllegalStateException("no instance"); //todo why i need it
    }

}
