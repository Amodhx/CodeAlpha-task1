package lk.ijse;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Double> marks = new ArrayList<Double>();
    public static void work(){
        System.out.println("If you want ");
        System.out.println("1. Average  2.Min Mark  3.Max mark");
        System.out.println("Enter number : ");
        int i = input.nextInt();
        if (i == 1 ){
            avg();
        }else if (i == 2){
            minMark();
        }else if (i == 3){
            maxMark();
        }else {
            System.out.println("Wrong Input");
            work();
        }
    }

    private static void maxMark() {
        double max = Integer.MIN_VALUE;
        for (int i = 0; i < marks.size(); i++) {
            if (marks.get(i) > max){
                max = marks.get(i);
            }
        }
        System.out.println("Max mark :" + max);
        work();
    }

    private static void minMark() {
        double min = Integer.MAX_VALUE;
        for (int i = 0; i < marks.size(); i++) {
            if (marks.get(i) < min){
                min = marks.get(i);
            }
        }
        System.out.println("Min mark : "+ min);
        work();
    }

    private static void avg() {
        double total = 0 ;
        for (int i = 0; i < marks.size(); i++) {
            total += marks.get(i);
        }
        System.out.println("Average IS : "+ total / marks.size());
        work();
    }

    public static void main(String[] args) {
        System.out.println("What do you want?  : \n 1. Input mark  2. get Outputs ");
        int x = input.nextInt();
        if (x == 1){
            inputmark();
        }else if (x == 2){
            work();
        }else {
            System.out.println("Wrong Input");
            main(args);
        }
    }

    private static void inputmark() {
        L1 :while (true) {
            System.out.print("Enter Student mark:  ");
            marks.add(input.nextDouble());
            System.out.print("If you want to add Another marks(Y/N): ");
            String s = input.next();
            if (s.equals("y")){
                continue L1;
            }else {
                main(new String[]{});
            }
        }
    }
}