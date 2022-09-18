/*
WAP to add objects in an empty bag using the concept constructor overloading.
Object must have a color and a specific weight to it.
at the end we need to calculate the total weight of bag and number of object it has in it.
create a menu:
1.add objects
2.delete objects
4.display weight and no of objects
5.Exit

*/

import java.sql.SQLOutput;
import java.util.Scanner;
public class Bag {

    private String color;
    private double weight;

    private static double total_weight;
    private static int total_objects;

    Scanner gg = new Scanner(System.in);

    public Bag(){

        color = "green";
        weight = 12.7;
        total_objects ++;
        total_weight = total_weight + weight;
    }

    public Bag( String Col , double Wtg ) {

        color = Col;
        weight = Wtg;
        total_objects ++;
        total_weight = total_weight + weight;

    }

    public Bag( String Col ) {

        color = Col;
        weight = 12.7;
        total_objects ++;
        total_weight = total_weight + weight;
    }

    public Bag( double Wtg ) {

        color = "green";
        weight = Wtg;
        total_objects ++;
        total_weight = total_weight + weight;
    }

    public void display(Bag bags[]) {

        System.out.println("DISPLAY");

        for(int i = 0 ; i < total_objects; i++){
            System.out.println((i+1)+ "." + "Color: " + bags[i].color + " and " +  "weight is "+ bags[i].weight +" kg.");

        }
        System.out.println("total weight = " + total_weight );
        System.out.println("total number of objects = " + total_objects);

    }
    public static int get_total_objects() {

        return total_objects;

    }

    public void delete() {

        total_weight = total_weight - this.weight;
        total_objects --;

    }

}


public class Main {

    public static void delete( Bag bags[]){

        Scanner gg = new Scanner(System.in);

        int del;
        System.out.println("Enter the serial number to be deleted: ");
        del = gg.nextInt();

        bags[del-1].delete();

        for ( int i = del -1; i < bags.length ; i++){
            if(i+1 < bags.length) {
                bags[i] = bags[i + 1];
            }
        }
        bags[bags.length - 1] = null;

    }


    public static void main(String arg[]) {

        Bag obj[] = new Bag[10];

        Scanner gg = new Scanner(System.in);

        int input = -1;

        while (input != 4) {

            System.out.println("MENU");
            System.out.println("1. Add");
            System.out.println("2. display");
            System.out.println("3. delete");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");


            input = gg.nextInt();

            switch (input) {

                case 0:
                    break;

                case 1: {
                    int input1;
                    double wtg;
                    String col;

                    System.out.println("1. Use default values");
                    System.out.println("2. Enter color with default weight");
                    System.out.println("3. Enter weight with default color");
                    System.out.println("4. Enter weight and color");

                    input1 = gg.nextInt();

                    switch (input1) {

                        //double wtg;
                        //String col;

                        case 1:

                            obj[Bag.get_total_objects()] = new Bag();
                            break;

                        case 2:
                            col = gg.next();
                            obj[Bag.get_total_objects()] = new Bag(col);
                            break;

                        case 3:
                            wtg = gg.nextDouble();
                            obj[Bag.get_total_objects()] = new Bag(wtg);
                            break;

                        case 4:
                            wtg = gg.nextDouble();
                            col = gg.next();
                            obj[Bag.get_total_objects()] = new Bag(col, wtg);
                            break;

                    }
                    break;
                }

                case 2:
                    if (Bag.get_total_objects() < 1)
                        System.out.println("NO records available");
                    else
                        obj[Bag.get_total_objects()-1].display(obj);
                    break;
                case 3:
                    delete(obj);
                    break;

            }
        }



    }

}
