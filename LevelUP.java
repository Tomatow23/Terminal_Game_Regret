package com.test;

import java.util.Scanner;

public class LevelUP {
    static Scanner scanner = new Scanner(System.in);
    public void addingStats(int pointsRemaining, Player player){
        while (pointsRemaining > 0) {
            System.out.println("""
                            Add Points to Stats
                            1 to add to Str
                            2 to add to Acc
                            3 to add to Health""");
            System.out.println("You have " + pointsRemaining + " points remaining");
            int y = scanner.nextInt();
            switch (y) {
                case 1:
                    System.out.print("How many points would you like to add to Strength?: ");
                    int strPoints = scanner.nextInt();
                    if (strPoints <= pointsRemaining) {
                        pointsRemaining -= strPoints;
                        player.setStr(player.getStr() + strPoints);
                    } else System.out.println("Not Enough Points");
                    break;
                case 2:
                    System.out.println("How many points would you like to add to Accuracy?");
                    int accPoints = scanner.nextInt();
                    if (accPoints <= pointsRemaining) {
                        pointsRemaining -= accPoints;
                        player.setAcc(player.getAcc() + accPoints);
                    } else System.out.println("Not Enough Points");
                    break;
                case 3:
                    System.out.println("How many points would you like to add to Health?");
                    int healthPoints = scanner.nextInt();
                    if (healthPoints <= pointsRemaining) {
                        pointsRemaining -= healthPoints;
                        player.setHealth(player.getHealth() + healthPoints);
                    } else System.out.println("Not Enough Points");
                    break;
                default:
                    System.out.println("Invalid, Try Again");
            }
        }
    }
}
