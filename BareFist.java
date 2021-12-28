package com.test;

public class BareFist extends Weapon implements Weapons{
    private int str = 3;
    private int acc = 3;


    @Override
    public void attack() {

    }

    @Override
    public void defend() {

    }

    @Override
    public int getStr() {
        return str;
    }

    @Override
    public int getAcc() {
        return acc;
    }
}
