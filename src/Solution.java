import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(br.readLine());
        double height = Double.parseDouble(br.readLine());
        Body.massIndex(178, 80);
    }

    public static class Body {
        public static void massIndex(double weight, double height) {
            double massIndex=weight/(height*height);
            if (massIndex<18.5){
                System.out.println("Недовес! поднажми на питание!");
            }
            if (massIndex>=18.5 && massIndex<=24.9){
                System.out.println("Нормальный индекс! Так держать");
            }
            if (massIndex>=25 && massIndex<=29.9){
                System.out.println("Ну ты и жиробас");
            }
            if (massIndex>=30){
                System.out.println("Ну нельзя же так, зашей рот)");
            }
        }
    }
}
// индекс массы//