package com.test;


import java.util.Random;
import java.util.Scanner;

public class Main {
    //Creating General Objects
    static Scanner scanner = new Scanner(System.in);
    static Random rnd = new Random();
    static AttackSystem attackSystem = new AttackSystem();
    static LevelUP levelUP = new LevelUP();
    //Monster Objects
    static Monsters monsters = new Monsters();
    static Orc orc = new Orc();
    static Goblin goblin = new Goblin();
    static Skeleton skeleton = new Skeleton();
    static ChampionSkeleton championSkeleton = new ChampionSkeleton();
    static ChiefOrc chiefOrc = new ChiefOrc();
    //Player Object
    static Player player = new Player();
    //Weapon Objects
    static Long_Sword long_sword = new Long_Sword();
    static Dagger dagger = new Dagger();
    static Mace mace = new Mace();
    static BareFist bareFist = new BareFist();


    public static void main(String[] args) {

        //Creating boolean to end game when completed.
        boolean main_flag = true;
        while (main_flag) {
            System.out.println("""
                    Hi. Welcome to Regret!
                    This is a terminal game developed by tomatow aka Nathan Dunn
                    \n
                    This is the world of Demonar. 
                    It's a world filled with little meaning, and even less hope. It is a remnant of the past,
                    and the survivors are just reminders.""");
            System.out.println("""
                    Are you ready to start your journey? Y/N""");
            char choice = scanner.next().charAt(0);
            switch (choice) {
                case 'Y':
                    System.out.println("Welcome to the world of Demonar :)");
                    break;
                case 'N':
                    System.out.println("Too bad");
            }
            System.out.print("What's Your Name? ");
            String playerName = scanner.next();
            //Boolean for stats
            boolean flag = true;
            //Boolean for weapons
            boolean flag2 = true;
            int pointsRemaining = 9;
            int healthPoints = 0;
            int accPoints = 0;
            int strPoints = 0;
            while (flag) {
                //Picking starter stats
                while (pointsRemaining > 0) {
                    System.out.println("""
                            Add Points to Stats
                            1 to add to Str
                            2 to add to Acc
                            3 to add to Health""");
                    System.out.println("You have " + pointsRemaining + " points remaining");
                    int x = scanner.nextInt();
                    switch (x) {
                        case 1:
                            System.out.print("How many points would you like to add to Strength?: ");
                            strPoints = scanner.nextInt();
                            if (strPoints <= pointsRemaining) {
                                pointsRemaining -= strPoints;
                            } else System.out.println("Not Enough Points");
                            break;
                        case 2:
                            System.out.println("How many points would you like to add to Accuracy?");
                            accPoints = scanner.nextInt();
                            if (accPoints <= pointsRemaining) {
                                pointsRemaining -= accPoints;
                            } else System.out.println("Not Enough Points");
                            break;
                        case 3:
                            System.out.println("How many points would you like to add to Health?");
                            healthPoints = scanner.nextInt();
                            if (healthPoints <= pointsRemaining) {
                                pointsRemaining -= healthPoints;
                            } else System.out.println("Not Enough Points");
                            break;
                        default:
                            System.out.println("Invalid, Try Again");
                    }
                }
                //Picking Weapon
                while (flag2) {
                    System.out.println("""
                            You must choose your weapon. 
                            1. Long Sword
                            2. Dagger
                            3. Mace
                            4. Bare-fist""");
                    int weaponChoice = scanner.nextInt();
                    switch (weaponChoice) {
                        case 1:
                            player = new Player(playerName, healthPoints, strPoints, accPoints, long_sword);
                            player.addWeaponStatsAcc(long_sword, player);
                            player.addWeaponStatsStr(long_sword, player);
                            break;
                        case 2:
                            player = new Player(playerName, healthPoints, strPoints, accPoints, dagger);
                            player.addWeaponStatsAcc(dagger, player);
                            player.addWeaponStatsStr(dagger, player);
                            break;
                        case 3:
                            player = new Player(playerName, healthPoints, strPoints, accPoints, mace);
                            player.addWeaponStatsAcc(mace, player);
                            player.addWeaponStatsStr(mace, player);
                            break;
                        case 4:
                            player = new Player(playerName, healthPoints, strPoints, accPoints, bareFist);
                            player.addWeaponStatsAcc(bareFist, player);
                            player.addWeaponStatsStr(bareFist, player);
                            break;
                    }
                    flag2 = false;
                }
                flag = false;
            }
            System.out.print("Current Stats Are: ");
            System.out.println("Strength: " + player.getStr());
            System.out.println("Accuracy: " + player.getAcc());
            System.out.println("Health: " + player.getHealth());

            System.out.println("I need some food, and the only thing worth food is in dungeons. All old ruins hold a lot of useful stuff I'm sure someone will barter me for or kill me for heh");
            System.out.println("You know an old dungeon from Tessa, a ruin that used to be a city. The dungeon is apparently a royal escape route, but they never got to use it in time.");
            System.out.println("I reach the dungeon and I soon after start heading down.");
            System.out.println("At the entrance lies an Orc, a strong, but slow creature..");
            System.out.println("Are you ready to attack? Y/N");
            scanner.nextLine();
            char x = scanner.next().charAt(0);
            switch (x) {
                case 'Y':
                    System.out.println("You attack immediately");
                    break;
                case 'N':
                    System.out.println("Too bad ;)");
                    break;
                default:
                    System.out.println("Too bad, You attack anyways");
            }

            orc = new Orc(orc.randomizedHp(), orc.randomizedAcc(), orc.randomizedStr(), orc.addWeapons());
            attackSystem.attack(player, orc);
            if (player.getHealth() == 0) {
                main_flag = false;
            } else if (orc.getHealth() == 0) {
                System.out.println("You have defeated the Orc!");
                System.out.println("You get 3 stat points");
                levelUP.addingStats(3, player);
                System.out.println(player.getStr());
                System.out.println("Y to continue");
                char continues = scanner.next().charAt(0);
            }
            System.out.println("""
                    After you defeat the Orc you rest for awhile.
                    You are currently on floor 1, You were told previously that there are 6 floors in total.
                    Each one holding a stronger monster, or group of monsters.
                    No one has made it past floor 4 though, and floor 6 is where the treasure room is housed apparently...
                    I wonder just how true that all is.
                    \n 
                    You finish resting up, and head down to floor 2. More broken pillars, and cracked flooring detailed with art designs portraying the old world. Decaying, and the stench.. goblins?
                    Strange.. Their usually weaker than Orcs.
                    Up ahead you see 3 goblins.. Are you ready?""");

            x = scanner.next().charAt(0);
            switch (x) {
                case 'Y':
                    System.out.println("You attack immediately");
                    break;
                case 'N':
                    System.out.println("Too bad ;)");
                    break;
                default:
                    System.out.println("Too bad, You attack anyways");
            }
            goblin = new Goblin(goblin.randomizedHp(), goblin.randomizedAcc(), goblin.randomizedStr(), goblin.getWeapon());
            attackSystem.attack(player, goblin);
            if (player.getHealth() == 0) {
                main_flag = false;
            }
            System.out.println("You defeat one goblin, than another comes running...");
            goblin = new Goblin(goblin.randomizedHp(), goblin.randomizedAcc(), goblin.randomizedStr(), goblin.getWeapon());
            attackSystem.attack(player, goblin);
            if (player.getHealth() == 0) {
                main_flag = false;
            }
            System.out.println("Last one....");
            goblin = new Goblin(goblin.randomizedHp(), goblin.randomizedAcc(), goblin.randomizedStr(), goblin.getWeapon());
            attackSystem.attack(player, goblin);
            if (player.getHealth() == 0) {
                main_flag = false;
            }
            System.out.println("You get 3 stat points for beating floor 2");
            levelUP.addingStats(3, player);
            System.out.println("Y to continue");
            char continues = scanner.next().charAt(0);

            System.out.println("""
                    You continue down to floor 3, and you see multiple Orcs, and Goblins.
                    You decided to go around but as you do a Orc stands in front of you.
                    He looks much stronger than the others.. This could be bad..""");
            x = scanner.next().charAt(0);
            switch (x) {
                case 'Y':
                    System.out.println("You attack immediately");
                    break;
                case 'N':
                    System.out.println("Too bad ;)");
                    break;
                default:
                    System.out.println("Too bad, You attack anyways");
            }
            chiefOrc = new ChiefOrc(chiefOrc.randomizedHp(), chiefOrc.randomizedAcc(), chiefOrc.randomizedStr(), chiefOrc.getWeapon());
            System.out.println("As you begin to attack, he immediately swings back, the air that his swing created blew you back, insane strength");
            main_flag = attackSystem.attack(player, chiefOrc);
            if (player.getHealth() == 0) {
                main_flag = false;
            }
            System.out.println("You barely win against that freak of nature, You are injured, and find a place to rest in-between 3 and 4");
            System.out.println("You get 3 stat points for beating Chief Orc");
            levelUP.addingStats(3, player);
            System.out.println("Y to continue");
            continues = scanner.next().charAt(0);
        }
    }
}




















