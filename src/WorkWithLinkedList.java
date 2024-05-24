import java.util.LinkedList;
import java.util.ListIterator;

public class WorkWithLinkedList {
    static record person(String name , Integer age){}
    public static void main(String[] args) {
        LinkedList<person> linkedList = new LinkedList<>();
        linkedList.add(new person("Yamen", 21));
        linkedList.add(new person("Yanal", 19));
        linkedList.addFirst(new person("ali", 25));
        linkedList.add(1,new person("ahmed", 19));
        linkedList.addLast(new person("sura", 23));
        // Iterator on linked list value
        ListIterator<person> personListIterator = linkedList.listIterator();
        while (personListIterator.hasNext()) {
            System.out.println(personListIterator.next());
        }
        System.out.println("this output in previous way ==> ");
        while (personListIterator.hasPrevious()) {
            System.out.println(personListIterator.previous());

        }
    }
}
