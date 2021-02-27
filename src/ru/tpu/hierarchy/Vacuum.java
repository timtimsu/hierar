package ru.tpu.hierarchy;

public class Vacuum extends Appliens{
    private int power;

    public Vacuum(double cost, String manufakter) {
        super(cost, "пылесосы", manufakter);
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Мощность: " + power;
    }
}
