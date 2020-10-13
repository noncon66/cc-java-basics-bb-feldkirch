import java.text.Normalizer;

public class StringAnalysis {
    public static void main(String[] args) {
        String mySentence = "Das ist ein Satz. Einmal mehr sage ich eines zu euch. Ein Mensch hat Hände.";
        String[] mywords = mySentence.split("[ ]");
        String wordToCount = "ein";
        int howMany = 0;
        for (var word : mywords)
            if (word.toUpperCase().equals(wordToCount.toUpperCase())) {
                howMany++;
            }
        System.out.println("Das Wort \"" + wordToCount + "\" kommt " + howMany + " mal vor");

        howMany = 0;
        char charToCount = '.';
        var characters = mySentence.toCharArray();
        for (var character : characters) {
            if (character == charToCount) {
                howMany++;
            }
        }
        System.out.println("Das Zeichen \"" + charToCount + "\" kommt " + howMany + " mal vor");

        String einSatzVollerHaende = "Das ist eine Hand. Mit der Hand kann ich winken. " +

                "Freundlichen Menschen gebe ich gerne die Hand. " +

                "Im Winter trage ich Handschuhe." +

                "Gibst du mir deine Hand?";

        String normalizedText = getNormalizedText(einSatzVollerHaende);
        System.out.println("Normalisierter Text: " + normalizedText);

        howMany = 0;
        wordToCount = "Hand";
        var wordsFromText = normalizedText.split("[ ]");
        for (var word : wordsFromText) {
            if (word.equals(wordToCount)) {
                howMany++;
            }

        }
        System.out.println("Das Wort \"" + wordToCount + "\" kommt " + howMany + " mal vor");

        String badSentence = "ImWinter;trage_ich Handschuhe. ";

        System.out.println(splitAtUpper("ImWinter"));


    }


    private static String getNormalizedText(String text) {
        text = text.replaceAll("[.,;?!_]", " ");
        text = text.replaceAll("[ ]{1,}", " ");
        return text;
    }

    private static String splitAtUpper(String text) {
        String returner = null;
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length-1; i++) {
            String toCheck1 = "" + chars[i] + "";
            String toCheck2 = "" + chars[i + 1] + "";
            if (toCheck1.matches("[a-z]") && toCheck2.matches("[A-Z]")){
                returner = text.substring(0, i+1) + " " + text.substring(i+1);
            }
        }
        return returner;


    }


}
