import java.util.Random;

public class PubNameGenerator {

    public static void main(String[] args) {
        Random random = new Random();
        String[] attribute = {"red", "white", "black", "drunken", "lazy", "flying", "ugly", "sleeping"};
        String[] noun = {"dutchman", "sailor", "horse", "kitty", "dog", "eagle", "housewife", "farmer"};
        String[] type = {"pub", "restaurant", "tavern", "bar", "cafe", "bistro", "buffet"};

        for (int i = 1; i <= 10; i++) {
            System.out.println(attribute[random.nextInt(attribute.length)] + " " +
                    noun[random.nextInt(noun.length)] + " " +
                    type[random.nextInt(type.length)]);
        }

    }

}
