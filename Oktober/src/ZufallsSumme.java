import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class ZufallsSumme {

    public static void main(String[] args) {
        int sum = 0;
        int adder;
        while (true) {
            Random random = new Random();
            adder = random.nextInt(21) + 10;
            if (adder == 15 || adder == 25) break;
            sum = sum + adder;
            System.out.println("+" + adder + " = " + sum);
        }
        System.out.println(sum);
    }


}
