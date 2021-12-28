package com.test;

import java.util.Random;
import java.math.*;

public class AttackSystem {
    static Random random = new Random();

    public int damageSystem(int str){
        int minHit = str / 3;
        int maxHit = str;
        int hitRatio = random.nextInt(minHit, maxHit);
        return hitRatio;
    }
    //Creating method for accuracy
    public int accSystemPlayer(int acc, Player player){
        int accHit = random.nextInt(0, 10);
        if(accHit > acc){
            System.out.println("You have missed your attack");
        }
        else if(accHit < acc){
            return damageSystem(player.getStr());
        }
        return 0;
    }
    public int accSystemMonster(int acc, Monsters monsters){
        int accHit = random.nextInt(0, 10);
        if(accHit > acc){
            System.out.println("Monster missed their attack");
        }
        else if(accHit < acc){
            return damageSystem(monsters.getStr());
        }
        return 0;
    }
    public boolean attack(Player player, Monsters monster){
        int mhealth = monster.getHealth();
        int phealth = player.getHealth();
        boolean flag = true;
            while(flag){
                int mdamage = accSystemPlayer(player.getAcc(), player);
                System.out.println(player.getName() + " Has Attacked the Monster");
                mhealth = mhealth - mdamage;
                System.out.println(player.getName() + " has done " + mdamage + " damage.");
                if (mhealth > 0) {
                System.out.println("Monster has " + mhealth + " hp left");
                }
                else if (mhealth <= 0) {
                    mhealth = 0;
                    System.out.println("Monster has " + mhealth + " hp left");
                    System.out.println("Monster has died.");
                    monster.setHealth(mhealth);
                    flag = false;
                    return true;
                }
                System.out.println("Monster has attacked " + player.getName());
                int pdamage = accSystemMonster(monster.getAcc(), monster);
                phealth = phealth - pdamage;
                System.out.println("Monster has done " + pdamage + " damage");
                if(phealth > 0){
                    System.out.println(player.getName() + " has " + phealth + " hp left");
                }
                else if(phealth < 0){
                    phealth = 0;
                    System.out.println(player.getName() + " has " + phealth + "hp left");
                    System.out.println(player.getName() + " has died");
                    player.setHealth(phealth);
                    flag = false;
                    return false;
                }
            }
            return false;
    }
}
