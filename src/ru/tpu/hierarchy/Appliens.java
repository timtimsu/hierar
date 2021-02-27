package ru.tpu.hierarchy;

public class Appliens {
    private Double cost;
    private String type;
    private String manufakter;

    public void setCost(Double cost) {
        if (cost <= 0) {
            System.out.println("Цена отрицательная");
        } else {
            this.cost = cost;
        }
    }

    public Double getCost() {
        return cost;
    }

    Appliens(){
     this.cost = 1.;
     this.type = "";
     this.manufakter = "";
    }

    Appliens(double cost, String type, String manufakter){
        setCost(cost);
        this.type = type;
        this.manufakter = manufakter;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getManufakter() {
        return manufakter;
    }

    public void setManufakter(String manufakter) {
        this.manufakter = manufakter;
    }

    public String getDescription(){
        return "Тип товара: " + type + " Производитель: " + manufakter + "Стоимость: " + cost;
    }
}
