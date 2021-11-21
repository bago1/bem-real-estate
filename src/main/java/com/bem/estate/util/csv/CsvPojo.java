package com.bem.estate.util.csv;


public class CsvPojo {

    public String id;
    public String name;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "CsvPojo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
