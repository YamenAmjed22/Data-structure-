import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";
        colors[2] = "green";
        System.out.println(Arrays.toString(colors)); // [purple, blue, null, null, null]
        // colors[0] = "yellow" ; // make the change on value in index 0
        // System.out.println(Arrays.toString(colors)); // [yellow, blue, null, null, null]
        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);
        System.out.println(colors[3]);
        System.out.println(colors[4]);
        // lets go to crate int array with the value and we use this way when we know the value we need to storing it .
        int[] numbers = {100,200,300} ;
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[1]);
        // loop on colors array
        System.out.println("normal loop");
        for(int i = 0 ; i<colors.length ; i++){
            System.out.println(colors[i]);
        }
        // revers loop on color array
        System.out.println("revers loop");

        for(int i = colors.length - 1 ; i >= 0 ; i--){
            System.out.println(colors[i]);
        }
        // for each on color array
        System.out.println("for each loop");
        for (String color : colors){
            System.out.println(color);
        }
        // and we can use the stream
        System.out.println("using Array.stream");
        Arrays.stream(colors).forEach(System.out::println);



    }
}
