package com.test;

public class Mace extends Weapon implements Weapons{
    private int str = 5;
    private int acc = 1;

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
