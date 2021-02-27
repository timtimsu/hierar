package ru.tpu.hierarchy;

public class Washing extends Appliens{
   private double obem;

    public Washing(double cost, String manufakter) {
        super(cost, "стиральная машина", manufakter);
    }

    public double getObem() {
        return obem;
    }

    public void setObem(double obem) {
        this.obem = obem;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Объем бака: " + obem;
    }
}
