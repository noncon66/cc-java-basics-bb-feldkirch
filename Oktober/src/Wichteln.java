import java.util.Random;

public class Wichteln {

    public static void main(String[] args) {
        String[] names = {"Ali", "Erich", "Lukas", "Dan", "Klaus", "Bokhee", "Irene", "Sabrina", "Marsella","Michal",
                "Samet", "Alex", "Gyula"};
        String[] assigned = new String[names.length];
        Random ramdom = new Random();

        for (int i = 0; i < names.length; i++) {

            boolean looping = true;
            while (looping) {
                String randomname = names[ramdom.nextInt(names.length)];
                if (!isAlreadyUsed(assigned, randomname) && !names[i].equals(randomname)) {
                    assigned[i] = randomname;
                    System.out.println(names[i] + " --> " + randomname);
                    looping = false;
                }
            }

        }
    }

    private static boolean isAlreadyUsed(String[] assigned, String randomname) {
        boolean returner = false;
        for (var name : assigned) {
            if (randomname.equals(name)) {
                returner = true;
                break;
            } else {
                returner = false;
            }

        }
        return returner;

    }


}






