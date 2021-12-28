package com.test;

public class Player {
    private String name;
    private int health;
    private int str;
    private int acc;
    private Object weapon;
    public Player(){

    };
    public Player(String name,int health, int str, int acc, Object weapon) {
        this.name = name;
        this.health = health+1;
        this.str = str+1;
        this.acc = acc+1;
        this.weapon = weapon;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public void setAcc(int acc) {
        this.acc = acc;
    }



    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getStr() {
        return str;
    }

    public int getAcc() {
        return acc;
    }

    public void addWeaponStatsAcc(Weapon weapon, Player player){
        setAcc(player.getAcc() + weapon.getAcc());
    }

    public void addWeaponStatsStr(Weapon weapon, Player player){
        setStr(player.getStr() + weapon.getStr());
    }

}
