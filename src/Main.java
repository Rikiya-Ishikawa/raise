import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("リンゴ");
        fruits.add("バナナ");
        fruits.add("ブドウ");
        System.out.println(fruits);

        try{
            int number = 0;
            int answer = 100 / number;
            System.out.println(answer);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("finish");
        }
    }
}