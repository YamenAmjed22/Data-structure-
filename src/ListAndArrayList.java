import java.util.ArrayList;
import java.util.List;

public class ListAndArrayList {
    public static void main(String[] args) {
        List<String> unModifiableColorsList = List.of(
                "red" ,
                "white",
                "green"
        ) ;
        // if i need add colors for unModifiableColorsList i can not do this :
        // unModifiableColorsList.add("pink");

        List<String> colors = new ArrayList<>(); // if we don't identify the list type we can but mix of data type to gather
        colors.add("blue");
        colors.add("red");
        colors.add("black");
        System.out.println(colors);
        System.out.println("the red color in colors ? " + colors.contains("red"));
        System.out.println("the size for color List = " + colors.size());
        System.out.println("the element for this list is : ");
        for(int i = 0 ; i < colors.size() ; i++){
            System.out.println(colors.get(i));
        }
        // another way to loop on element inside the colors list
        System.out.println("the element using for each");
        for(String color : colors){
            System.out.println(color);
        }
        // using stream
        System.out.println("the element using stream");
        colors.forEach(System.out::println);
        // note for me
        // the deference between  victor and array list is the vector is synchronized but array list is not


    }
}
