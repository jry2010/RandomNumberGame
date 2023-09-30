package jry;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        while(true) {
            int Number = r.nextInt(100) + 1;
            int score = 100;
            System.out.println("来丸个游戏吧");
            System.out.println("猜猜系统随机生成的随机数字(1~100)");
            while (true) {
                int a = sc.nextInt();
                if (a == Number) {
                     System.out.println("猜中了");
                    System.out.println("你得了" + score + "分哦");
                    break;
                } else if (a > Number) {
                    score -= 10;
                    if (score > 0) {
                        System.out.println("猜大了");
                        System.out.println("再来一次吧！");
                    }
                    if (score == 0) {
                        System.out.println("你已猜错10次");
                        System.out.println("猜数机会已用尽");
                        System.out.println("你得了0分哦");
                        break;
                    }
                } else {
                    score -= 10;
                    if (score > 0) {
                        System.out.println("猜小了");
                        System.out.println("再来一次吧！");
                    }
                    if (score == 0) {
                        System.out.println("你已猜错10次");
                        System.out.println("猜数机会已用尽");
                        System.out.println("你得了0分哦");
                        break;
                    }
                }
            }
            System.out.println("请选择重来或退出游戏(输入Y为重来，输入N为退出)");
            String choice = sc.next();
            while(true) {
                if (choice.equals("Y") || choice.equals("y") || choice.equals("N") || choice.equals("n")){
                    break;
                } else {
                    System.out.println("输入有误，请重新输入：");
                    choice = sc.next();
                }
            }
            if (choice.equals("N") || choice.equals("n")){
                System.out.println("游戏结束！");
                break;
            }
        }
    }
}