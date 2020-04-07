import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();

        list1.add(100);
        list1.add(500);
        list1.add(900);

        list2.add(800);
        list2.add(600);
        list2.add(300);

        list3.add(400);
        list3.add(700);
        list3.add(200);

        ArrayOrganizer ArOr = new ArrayOrganizer();

        System.out.print("Result => ");
        System.out.println( ArOr.concatAndSort(list1,list2,list3) );
        System.out.println("----------------------------------------");


        Player p1 = new Player("Tom");
        Player p2 = new Player("John");
        Player p3 = new Player("James");
        Player p4 = new Player("Henry");

        Die myDie = new Die();

        for(int i = 0; i < 5; i++){
            p1.addScore( myDie.rollDie() );
            p2.addScore( myDie.rollDie() );
            p3.addScore( myDie.rollDie() );
            p4.addScore( myDie.rollDie() );
        }

        System.out.println( p1.getName() + " has " + p1.getScore() + " points." );
        System.out.println( p2.getName() + " has " + p2.getScore() + " points." );
        System.out.println( p3.getName() + " has " + p3.getScore() + " points." );
        System.out.println( p4.getName() + " has " + p4.getScore() + " points." );


    }

}
