package com.company;
import java.text.DecimalFormat;
import java.util.Random;

public class Team {

    String[] Names = new String[4];  //в задании сказано, что массив участников должен быть
    int[] Speed = new int[4];
    double[] Time = new double[4];
    boolean[] IsSucceed = new boolean[4];

    public Team (int seed) {

        Names[0] = "Имярек Имярекович";
        Names[1] = "Джон Сина";
        Names[2] = "Онотоле Вассерман";
        Names[3] = "Гжегож Бженчишчикевич";

        Random ran = new Random();

        for (int i=0; i<4; i++) {
            Speed[i] = ran.nextInt(seed)+1;
        }
    }

    public void getTeam(){
        DecimalFormat f = new DecimalFormat("##.0");
        for (int i=0;i<4;i++){
            System.out.println("Имя: "+this.Names[i]);
            System.out.println("Скорость: "+f.format(this.Speed[i])+" м/сек.");
            System.out.println("Время: "+f.format(Time[i])+" сек.");
            System.out.print("Пройдена ли дистанция: ");
            if (this.IsSucceed[i]){
                System.out.println("да.\n");
            } else{
                System.out.println("нет.\n");
            }
        }
    }

    public void getSucceeded(){
        DecimalFormat f = new DecimalFormat("##.0");
        for (int i=0; i<4; i++){
            if (this.IsSucceed[i]){
                System.out.println(this.Names[i]+": успешно прошел дистанцию №"+(i+1)+" со временем "+f.format(Time[i])+" сек.");
                System.out.println("Средняя скорость: "+f.format(Speed[i])+" м/сек.\n");
            }
        }
    }
}
