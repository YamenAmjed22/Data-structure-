import java.util.LinkedList;
import java.util.Queue;

public class WorkWithQueue {
    static record person(String name , Integer age){}
    public static void main(String[] args) {
        Queue<person> superMarket = new LinkedList<>() ; // FIFO
        superMarket.add(new person("Yamen", 21) );
        superMarket.add(new person("Ahmad", 19) );
        superMarket.add(new person("Omar", 23) );
        System.out.println(superMarket);        // print the queue of person obj
        System.out.println("this is the size for queue : " + superMarket.size());
        System.out.println("peek result : " + superMarket.peek()); // retrieve the first elements
        System.out.println("poll result : " + superMarket.poll()); // delete the first element and retrieve
        System.out.println("this is the size for queue after poll operation  : " + superMarket.size());
        System.out.println(superMarket);
        // loop on this and i think the other type of loop is applicable
        for(person p : superMarket){
            System.out.println(p);
        }
    }
}
