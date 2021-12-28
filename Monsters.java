package com.test;

import java.util.ArrayList;
import java.util.Random;

public class Monsters {
    private int health;
    private int acc;
    private int str;
    private Object weapon;

    public int getHealth() {
        return health;
    }

    public int getAcc() {
        return acc;
    }

    public int getStr() {
        return str;
    }

    public Object getWeapon() {
        return weapon;
    }

    public Object addWeapons(){
        ArrayList<Object> weapons = new ArrayList<Object>();
        Random rnd = new Random();
        Long_Sword long_sword = new Long_Sword();
        Dagger dagger = new Dagger();
        Mace mace = new Mace();
        BareFist bareFist = new BareFist();
        int r = rnd.nextInt(0, 3);
        System.out.println("number " + r);
        weapons.add(long_sword);
        weapons.add(dagger);
        weapons.add(mace);
        weapons.add(bareFist);
        switch(r){
            case 0:
                weapon = dagger;
                return weapon;

            case 1:
                weapon = mace;
                return weapon;

            case 2:
                weapon = bareFist;
                return weapon;
            case 3:
                weapon = long_sword;
                return weapon;
            default:
                System.out.println("Invalid, Please Choose Another Option");
        }
        return null;
    }
    public int randomizedStr(){
      return 0;
    }
    public int randomizedAcc(){
        return 0;
    }
    public int randomizedHp(){
        return 0;
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

    public void addWeaponStatsStr(Weapon weapon, Monsters monsters){
        setStr(monsters.getStr() + weapon.getStr());
    }
    public void addWeaponStatsAcc(Weapon weapon, Monsters monsters){
        setAcc(monsters.getAcc() + weapon.getAcc());
    }
}
