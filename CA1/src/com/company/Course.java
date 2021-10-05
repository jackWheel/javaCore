package com.company;
import java.text.DecimalFormat;
import java.util.Random;

public class Course {

    int[] Distance = new int[4];
    double[] Record = new double[4];

    public Course(int seed) {

        Random ran = new Random();

        for (int i=0; i<4; i++) {
            Distance[i] = ran.nextInt(seed)+100;
            Record[i] = 2*(double)ran.nextInt(seed)/ran.nextInt(seed);  //китайский рандом, как в Genshin Impact
        }
    }

    public void getDistance(){
        DecimalFormat f = new DecimalFormat("##.0");
        for (int i=0;i<4;i++){
            System.out.println("Отрезок "+(i+1)+". Длина: "+this.Distance[i]+" м. Лучшее время: "+f.format(Record[i])+" сек.\n");
        }
    }

    public void doIt(Team team){
        for (int i=0; i<4; i++){
            team.Time[i] = this.Distance[i]/team.Speed[i];
            if (team.Time[i]<this.Record[i]){
                team.IsSucceed[i] = true;
            } else{
                team.IsSucceed[i] = false;
            }
        }
    }
}
