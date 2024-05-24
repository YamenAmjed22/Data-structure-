import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class WorkWithSets {
    //record Ball(String colors){}
    static class Ball{
        String colors ;

        public Ball(String colors) {
            this.colors = colors;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Ball ball = (Ball) o;
            return Objects.equals(colors, ball.colors);
        }

        @Override
        public int hashCode() {
            return Objects.hash(colors);
        }

        @Override
        public String toString() {
            return "Ball{" +
                    "colors='" + colors + '\'' +
                    '}';
        }
    }
    public static void main(String[] args) {

        Set<Ball> balls = new HashSet<>();

        balls.add(new Ball("red"));
        balls.add(new Ball("yellow"));
        balls.add(new Ball("black"));
        balls.add(new Ball("blue"));
        balls.add(new Ball("black"));
        balls.remove(new Ball("black")); 
        System.out.println(balls.size());
        balls.forEach(System.out::println);

    }
}
