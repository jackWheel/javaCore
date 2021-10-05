package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Работаем с генератором случайных чисел. Введите зерно рандомизации: ");
        int seed = in.nextInt();
        in.close();


        Team team = new Team(seed);
        Course c = new Course(seed);

        c.getDistance();
        c.doIt(team);

        team.getSucceeded();
        team.getTeam();
    }
}
