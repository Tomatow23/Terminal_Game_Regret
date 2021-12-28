package com.test;

import java.util.Random;

public class Goblin extends Monsters{
    private int health;
    private int acc;
    private int str;
    private Object weapon;
    Random rnd = new Random();

    public Goblin(){

    }
    public Goblin(int health, int acc, int str, Object weapon) {
        this.health = health;
        this.acc = acc;
        this.str = str;
        this.weapon = weapon;
    }
    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int getAcc() {
        return acc;
    }

    @Override
    public int getStr() {
        return str;
    }

    @Override
    public Object getWeapon() {
        return weapon;
    }
    @Override
    public int randomizedStr(){
        return rnd.nextInt(3, 4);
    }
    @Override
    public int randomizedAcc(){
        return rnd.nextInt(4,7);
    }
    @Override
    public int randomizedHp(){
        return rnd.nextInt(6,15);
    }
    @Override
    public void addWeaponStatsStr(Weapon weapon, Monsters monsters){
        setStr(monsters.getStr() + weapon.getStr());
    }
    @Override
    public void addWeaponStatsAcc(Weapon weapon, Monsters monsters){
        setAcc(monsters.getAcc() + weapon.getAcc());
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setAcc(int acc) {
        this.acc = acc;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public void setWeapon(Object weapon) {
        this.weapon = weapon;
    }

    public static void setRnd(Random rnd) {
        Orc.rnd = rnd;
    }

}
