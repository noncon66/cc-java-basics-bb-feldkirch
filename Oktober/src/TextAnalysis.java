import java.util.Arrays;

public class TextAnalysis {
    private final static String text = "Zur ZEIT des Zweiten Weltkriegs waren seine großen Werke Siddhartha und Der Steppenwolf noch verboten. Heute gehört Hermann Hesse zu den bekanntesten deutschen Schriftstellern. Mehr über den Weltveränderer lest ihr hier\n" +
            "Hermann Hesse\n" +
            "\n" +
            "Hermann Hesse erhielt den Nobelpreis für Literatur\n" +
            "Hermann Hesse: Kurz-Steckbrief\n" +
            "\n" +
            "    Vollständiger Name: Hermann Karl Hesse\n" +
            "    Lebensdaten: 2. Juli 1877 bis 9. August 1962\n" +
            "    Nationalität: deutsch, später schweizerisch\n" +
            "    Zitat: \"Wenn wir einen Menschen glücklicher und heiterer machen können, so sollten wir es auf jeden Fall tun, mag er uns darum bitten oder nicht.\"\n" +
            "\n" +
            "Als Schriftsteller, Dichter und Maler prägte Hermann Hesse die Literatur und Kunst des 19. Jahrhunderts.\n" +
            "Wie Hermann Hesse lebte\n" +
            "\n" +
            "Hermann Hesse wurde am 2. Juli 1877 in Calw, einer Stadt in Württemberg geboren. Seine Familie war sehr religiös, der Vater Johannes sogar Missionar, also so genannter \"Gesandter\", der seinen Glauben weiterverbreiten wollte.\n" +
            "\n" +
            "So sollten auch die Kinder in die Fußstapfen der religiösen Eltern treten. Hesse war davon aber gar nicht begeistert und soll einmal gesagt haben, dass er \"entweder Dichter oder gar nichts werden\" wolle.\n" +
            "\n" +
            "1893 verließ der junge Hesse das Gymnasium mit dem Abschluss der Mittleren Reife. Danach schloss er zwei Lehren ab: eine als Turmuhrenmechaniker und eine als Buchhändler.\n" +
            "\n" +
            "Gegen den Willen seiner Eltern ließ er sich in der Schweizer Stadt Basel nieder, um seinem Traum vom Dichter-Dasein näher zu kommen. 1899 veröffentlichte er seine erste Lyriksammlung. In dieser Zeit heiratete er auch seine erste Frau Maria Bernoulli, von der er sich aber 15 Jahre später wieder trennte. Aus der Ehe gingen drei Söhne hervor.\n" +
            "\n" +
            "Zwölf Jahre lang ist Adolf Hitler Deutschlands Reichskanzler. Viele Menschen sind damals von ihm begeistert, doch es wird eine Schreckensherrschaft. Wir haben die Geschichte des Nationalsozialismus auf dieser Themenseite für euch zusammengefasst\n" +
            "\n" +
            "\n" +
            "Wie Hermann Hesse die Welt veränderte\n" +
            "\n" +
            "Um das Jahr 1904 gelang ihm der Durchbruch. Der Roman \"Peter Camenzind\" stimmt an vielen Stellen mit Hesses Leben überein. Literatur-Experten handeln das Werk als \"Beginn des modernen Bildungsromans\". Auf den ersten großen Erfolg folgten weitere beeindruckende Erzählungen und Romane.\n" +
            "\n" +
            "1914, als der erste Weltkrieg begann, meldete sich der Schriftsteller zum Militärdienst für das Deutsche Reich. Aufgrund seiner Kurzsichtigkeit wurde er aber ausgemustert und der deutschen Kriegsgefangenenfürsorge zugeteilt. Seine Aufgabe war es, für die Gefangenen Bücher zu sammeln. Außerdem leitete er die \"Bücherei für deutsche Kriegsgefangene\".\n" +
            "\n" +
            "Diese Erfahrungen prägten Hesse sehr. In vielen seiner folgenden Texte sprach er sich deutlich gegen Krieg und Patriotismus (\"Vaterlandsliebe\") aus. Zusätzlich belasteten ihn familiäre Schicksalsschläge: 1916 starb sein Vater, sein Sohn litt an einer schweren Erkrankung und seine Ehe mit Bernoulli ging in die Brüche. Das ging Hesse so nahe, dass er eine Therapie machte. In dieser Phase seines Lebens widmete er sich auch erstmals der Malerei.\n" +
            "\n" +
            "Innerhalb kurzer Zeit heiratete er daraufhin zweimal: 1924 Ruth Wenger, die Tochter einer bekannten Schriftstellerin, 1931 die Kunsthistorikerin Ninon Dolbin. Gleichzeitig begann der Zweite Weltkrieg. Die Nationalsozialisten erklärten seine Werke als volksfeindlich und verbaten beispielsweise \"Unterm Rad\", \"Der Steppenwolf\" und \"Betrachtungen\". Hesses Verleger Peter Suhrkamp wurde 1944 sogar verhaftet.\n" +
            "\n" +
            "Hermann Hesse ließ sich den Mund aber nicht verbieten: Weiterhin schrieb er Regime-kritische Texte, also Texte, die die nationalsozialistische Herrschaft unter Adolf Hitler angriffen. Nach dem Zweiten Weltkrieg wurden diese dann auch veröffentlicht.\n" +
            "\n" +
            "Er hasste den Krieg. In seinem Testament widmete der Physiker und Chemiker Alfred Nobel sein Vermögen unter anderem der Vergabe des jährlichen Friedenspreises\n" +
            "Hermann Hesses Tod in der Schweiz\n" +
            "\n" +
            "1946 zog sich Hesse zurück, da sein Gesundheitszustand immer schlechter wurde. \"Das Glasperlenspiel\" und \"Krieg und Frieden\" waren Anlass dafür, dass er am 14. November desselben Jahres mit dem Nobelpreis für Literatur ausgezeichnet wurde. Für sein Lebenswerk wurde er ein Jahr später zum Ehrendoktor sowie Ehrenbürger von Calw, seiner Geburtsstadt, ernannt. 1955 folgte der Friedenspreis des Deutschen Buchhandels.\n" +
            "\n" +
            "Am 9. August 1962 starb Hermann Hesse an einem Gehirnschlag in seinem Haus in der Schweiz. Heute gehört Hermann Hesse zu denbekanntesten deutschsprachigenr Schriftstellern. Seine Werke wurden in 55 Sprachen übersetzt.\n" +
            "Zitate von Hermann Hesse\n" +
            "\n" +
            "\"Man muß das Unmögliche versuchen, um das Mögliche zu erreichen.\"\n" +
            "Hermann Hesse\n" +
            " \n" +
            "\n" +
            "\"Man braucht vor niemand Angst zu haben. Wenn man jemanden fürchtet, dann kommt es daher, daß man diesem Jemand Macht über sich eingeräumt hat.\"\n" +
            "Hermann Hesse, Demian\n" +
            " \n" +
            "\n" +
            "\"Man hat nur Angst, wenn man mit sich selber nicht einig ist.\"\n" +
            "Hermann Hesse, Demian\n" +
            " \n" +
            "\n" +
            "\"Recht als wolle es ihn mit der Nase darauf stoßen, hatte sein Glück ihm diese prächtige Figur in seinen Weg gestellt, daß er sich an sie halte. Aber der Mensch ist zu nichts schwerer zu bringen als zu seinem Glück.\"\n" +
            "Hermann Hesse, Der Weltverbesserer\n" +
            " \n" +
            "\n" +
            "\"Wenn wir einen Menschen glücklicher und heiterer machen können, so sollten wir es in jedem Fall tun, mag er uns darum bitten oder nicht.\"\n" +
            "Hermann Hesse, Das Glasperlenspiel\n" +
            " \n" +
            "\n" +
            "\"Die Welt zu durchschauen, sie zu verachten, mag großer Denker Sache sein. Mir aber liegt einzig daran, die Welt lieben zu können, sie und mich und alle Wesen mit Liebe und Bewunderung und Ehrfurcht betrachten zu können.\"\n" +
            "Hermann Hesse";


    public static void main(String[] args) {

        System.out.println("Anzahl der Zeichen im Text: " + text.length());
        //normalize text
        String normalizedText = getNormalizedText(text);
        //System.out.println(normalizedText);
        var words = normalizedText.split(" ");

        String wordToCount = "Hesse";

        System.out.println("Anzahl der sichtbaren Zeichen im Text: " + getNumberOfAlphanumericCharacters(normalizedText));

        System.out.println("Anzahl der Wörter im Text: " + getNumberOfWords(normalizedText));

        System.out.println("Längstes Wort ist \"" + getLongestWord(words) + "\"");

        System.out.println("Kürzestes Wort ist \"" + getShortestWord(words) + "\"");


        System.out.println("Das Wort \"" + wordToCount + "\" kommt " + getNumberOfSpecificWord(wordToCount, normalizedText) + " mal vor");

        System.out.println("Wörter aus Großbuchstaben: " + getNumberOfUppercase(normalizedText));

        System.out.println("Wörter aus Kleinbuchstaben: " + getNumberOfLowercase(normalizedText));

        System.out.println("Alphabetisch erstes Wort: " + getAplphabeticFirstWord(words));

        System.out.println("Alphabetisch letztes Wort: " + getAplphabeticLastWord(words));

        System.out.println(Arrays.toString(getSortedArray(words)));

    }

    /***
     * Returns a normalized text without
     * special characters (\s), Punctuation marks (.,;:?!_()")
     * and multiple spaces
     * @param
     * @return normalized text
     */
    private static String getNormalizedText(String originalText) {

        return originalText
                .replaceAll("\\s", " ")
                .replaceAll("[^a-zA-ZÖÄÜöäüß]", " ") //ersetzt alles durch " " außer [^a-zA-ZÖÄÜöäüß]
                .replaceAll("[ ]+", " ");

        //normalizedText = normalizedText.replaceAll("[.,;:?!_()\"]", " ");
    }


    /***
     * Returns the number of upper case words
     * @param text
     * @return number of upper case words
     */
    private static int getNumberOfUppercase(String text) {
        int counter = 0;
        var words = text.split(" ");
        for (var word : words) {
            if (word.matches("[A-ZÖÜÄ]*")) {
                counter++;
            }
        }
        return counter;

    }

    /***
     * Returns the number of lower case words
     * @param text
     * @return number of lower case words
     */
    private static int getNumberOfLowercase(String text) {
        int counter = 0;
        var words = text.split(" ");
        for (var word : words) {
            if (word.matches("[a-zöüäß]*")) {
                counter++;
            }
        }
        return counter;

    }


    /***
     * Returns the longest word in a text
     * @param
     * @return longest word
     */
    private static String getLongestWord(String[] words) {
        String bestWord = null;
        if (words.length > 0) bestWord = words[0];
        else bestWord = "leeres Array!!!!!";
        for (var word : words) {
            if (bestWord.length() < word.length() && word.matches("[A-Za-zÖÜÄöüäß]*")) {
                bestWord = word;
            }
        }
        return bestWord;
    }


    private static String getShortestWord(String[] words) {
        String bestWord = null;
        if (words.length > 0) bestWord = words[0];
        else bestWord = "leeres Array!!!!";
        for (var word : words) {
            if (bestWord.length() > word.length() && word.matches("[A-Za-zÖÜÄöüäß]*")) {
                bestWord = word;
            }
        }
        return bestWord;
    }

    /***
     * Returns the number of occurences of a specific word
     * @param
     * @return occurences
     */
    private static int getNumberOfSpecificWord(String wordToSearch, String text) {
        int numberOfSpecificWord = 0;
        var words = text.split(" ");
        for (var word : words) {
            if (wordToSearch.equals(word)) {
                numberOfSpecificWord++;
            }
        }

        return numberOfSpecificWord;
    }

    /***
     * Returns the number of alphanumeric characters [A-Za-z0-9ÖÜÄöüäß]
     * @param text
     * @return number of characters
     */
    private static int getNumberOfAlphanumericCharacters(String text) {
        int NumberOfAlphanumericCharacters = 0;
        char[] characters = text.toCharArray();
        for (var character : characters) {
            String strChar = "" + character + "";
            if (strChar.matches("[A-Za-z0-9ÖÜÄöüäß]*")) {
                NumberOfAlphanumericCharacters++;
            }
        }

        return NumberOfAlphanumericCharacters;
    }

    /***
     * Returns the number of words
     * @param text
     * @return number of words
     */
    private static int getNumberOfWords(String text) {
        int numberOfWords = 0;
        var words = text.split(" ");
        for (var word : words) {
            if (word.matches("[A-Za-zÖÜÄöüäß]*")) {
                numberOfWords++;
            }
        }
        return numberOfWords;
    }

    private static String getAplphabeticFirstWord(String[] words) {
        String buffer = null;
        if (words.length > 0) buffer = words[0];
        else buffer = "leeres Array";
        for (var word : words) {
            if (toLowerAscii(buffer).compareTo(toLowerAscii(word)) > 0) {
                buffer = word;
            }
        }
        return buffer;
    }


    private static String getAplphabeticLastWord(String[] words) {
        String buffer = null;
        if (words.length > 0) buffer = words[0];
        else buffer = "leeres Array";
        for (var word : words) {
            if (toLowerAscii(buffer).compareTo(toLowerAscii(word)) < 0) {
                buffer = word;
            }
        }
        return buffer;
    }


    private static String[] getSortedArray(String[] words) {

        //Kopie vom Array erstellen damit nicht das ursprüngliche Array umsortiert wird
        var wordsToSort = Arrays.copyOf(words, words.length);
        //Bubblesort
        for (int j = 0; j < wordsToSort.length; j++) {
            for (int i = 0; i < wordsToSort.length - 1 - j; i++) {
                //sortiert nach Länge
                if ((wordsToSort[i].length() > wordsToSort[i + 1].length()) ||
                        //wenn gleich lang, nach Alphabet
                        (wordsToSort[i].length() == wordsToSort[i + 1].length() &&
                                (toLowerAscii(wordsToSort[i]).compareTo(toLowerAscii(wordsToSort[i + 1]))) > 0)) {
                    String buffer = wordsToSort[i];
                    wordsToSort[i] = wordsToSort[i + 1];
                    wordsToSort[i + 1] = buffer;
                }
            }
        }
        return wordsToSort;
    }

    private static String toLowerAscii(String word) {
        return word
                //alles klein weil .compareTo casesensitive ist
                .toLowerCase()
                //Umlaute umwandeln, da .compareTo Umlaute falsch sotiert ist
                .replaceAll("[ä]", "a")
                .replaceAll("[ö]", "o")
                .replaceAll("[ü]", "u")
                .replaceAll("[ß]", "ss");
    }
}
