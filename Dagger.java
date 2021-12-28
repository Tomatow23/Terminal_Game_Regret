package com.test;

public class Dagger extends Weapon implements Weapons {
    private int str = 3;
    private int acc = 4;


    @Override
    public int getStr() {
        return str;
    }
    @Override
    public int getAcc() {
        return acc;
    }

    @Override
    public void defend() {

    }
    @Override
    public void attack() {

    }
}
