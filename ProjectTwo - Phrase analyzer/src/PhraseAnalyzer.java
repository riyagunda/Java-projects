public class PhraseAnalyzer {
    public static void main(String[] args){
        String phrase = "";
        for (String arg : args) {
            phrase += arg;
            phrase += " ";
        }
        String[] arrayPhrase = new String[phrase.length()];
        arrayPhrase = phrase.split(" ");

        System.out.println();

        String swString = getSmallestWords(arrayPhrase);
        System.out.println("Smallest word(s): " + swString);

        String lwString = getLargestWords(arrayPhrase);
        System.out.println("Largest word(s): " + lwString);

        System.out.println("Average word length: ");

        int[] leastFreq = getLetterTally(arrayPhrase);
        char[] alphabets = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q',
                'r','s','t','u','v','w','x','y','z'};

        int least = leastFreq[0];
        for(int i = 0; i < getLetterTally(arrayPhrase).length; i++) {
            if(getLetterTally(arrayPhrase)[i] < least){
                least = getLetterTally(arrayPhrase)[i];
            }
        }
        String leastFreqLetters = "";
        for(int i = 0; i < getLetterTally(arrayPhrase).length; i++){
            if(getLetterTally(arrayPhrase)[i] == least) {
                leastFreqLetters += alphabets[i] + ", ";
            }
        }
        StringBuilder sb = new StringBuilder(leastFreqLetters);
        StringBuilder lfString = sb.deleteCharAt(leastFreqLetters.length()- 2);

        System.out.println("Least frequently used letter(s): " + lfString);

        int most = leastFreq[0];
        for(int i = 0; i < getLetterTally(arrayPhrase).length; i++) {
            if(getLetterTally(arrayPhrase)[i] > least){
                most = getLetterTally(arrayPhrase)[i];
            }
        }
        String mostFreqLetters = "";
        for(int i = 0; i < getLetterTally(arrayPhrase).length; i++) {
            if (getLetterTally(arrayPhrase)[i] == least) {
                mostFreqLetters += alphabets[i] + ", ";
            }
        }
        StringBuilder mfString = sb.deleteCharAt(mostFreqLetters.length()- 2);

        System.out.println("Most frequently used letter(s): " + mfString);
    }

    /**
     * This method return true if the phrase is valid, else false
     * @param phrase String array
     * @return boolean values true or false based on the entered phrase
     */
    public static boolean isValidPhrase(String[] phrase) {
        // invalid: 2 punctuations, starts with punctuation
        for(int i = 0; i < phrase.length; i++){
            String test = phrase[i];
            for(int j = 0; j < phrase[i].length(); j++){
                //if(test.contains(",")||)
            }
            // for loop to run through each phrase[i] letter
        }
        return true;
    }

    /**
     * Returns a String array of the "words" in the phrase without any punctuation
     * in the order they appeared in the phrase.
     *
     * It does not change the array in any way.
     * @param phrase String array
     * @return the same array without any punctuations
     * @throws IllegalArgumentException with the message, "Invalid phrase", if
     * the phrase is invalid.
     */
    public static String[] getWords(String[] phrase) {
        String[] newPhrase = new String[phrase.length];
        //CHECK ARGS ARRAY REWQUIREMENTS
        if(isValidPhrase(phrase)) {
            for(int i = 0; i < phrase.length; i++) {
                if(phrase[i].contains(",") || phrase[i].contains(".") || phrase[i].contains("!") || phrase[i].contains(";")) {
                    newPhrase = phrase[i].split(",");
                    newPhrase = phrase[i].split("!");
                    newPhrase = phrase[i].split(".");
                    newPhrase = phrase[i].split(";");
                }
            }
        } else {
            throw new IllegalArgumentException("Invalid phrase");
        }
        return newPhrase;
    }

    /**
     * Returns a String containing the smallest unique word(s)
     * in the order they appear in the words array, with multiple words
     * separated by a comma followed by a space, but with no comma or space at the
     * end of the String.
     *
     * This method does not change the words array.
     * @param words a String array with multiple words separated by a comma and
     *              then a space
     * @return a String containing the smallest unique words from the array
     * @throws IllegalArgumentException with the message, "Null words", if the
     * words array is null.
     * @throws IllegalArgumentException with the message, "Zero length", if the
     * length of the words array is 0.
     * @throws IllegalArgumentException with the message, "Invalid words", if
     * any word is null, has a length of 0, or contains a non-letter character
     */
    public static String getSmallestWords(String[] words) {
        if(words == null) {
            throw new IllegalArgumentException("Null words");
        }

        if(words.length == 0) {
            throw new IllegalArgumentException("Zero length");
        }

        int length = words[0].length();
        int newLength = 0;
        String smallestWords = "";
        int j = 0;
        for(int i = 0; i < words.length; i++) {
            newLength = words[i].length();
            if(newLength <= length) {
                length = newLength;
                smallestWords += words[i] + ", ";
                j++;
            }
        }
        StringBuilder sb = new StringBuilder(smallestWords);
        StringBuilder swString = sb.deleteCharAt(smallestWords.length()- 2);
        return swString.toString();
    }

    /**
     * Returns a String containing the largest unique word(s)
     * in the order they appear in the words array, with multiple words
     * separated by a comma followed by a space, but with no comma or space at the
     * end of the String.
     *
     * This method does not change the words array.
     * @param words a String array with multiple words separated by a comma and
     *              then a space
     * @return a String containing the smallest unique words from the array
     * @throws IllegalArgumentException with the message, "Null words", if the
     * words array is null.
     * @throws IllegalArgumentException with the message, "Zero length", if the
     * length of the words array is 0.
     * @throws IllegalArgumentException with the message, "Invalid words", if
     * any word is null, has a length of 0, or contains a non-letter character
     */
    public static String getLargestWords(String[] words) {
        if(words == null) {
            throw new IllegalArgumentException("Null words");
        }

        if(words.length == 0) {
            throw new IllegalArgumentException("Zero length");
        }

        String largestWords = "";
        int j = 0;
        int maxLength = 0;
        int ex = 0;
        for(int i = 0; i < words.length; i++) {
            j = words[i].length();
            if(j > maxLength){
                maxLength = j;
            }
        }
        for(int i = 0; i < words.length; i++) {
            if(words[i].length() == maxLength) {
                largestWords += words[i] + ", ";
                ex++;
            }
        }
        StringBuilder sb = new StringBuilder(largestWords);
        StringBuilder lwString = sb.deleteCharAt(largestWords.length()- 2);
        return lwString.toString();
    }

    /**
     * Returns average length of the words in the "words" array. The
     * returned value is not rounded and does not change the array.
     * @param words a String array
     * @return a double value of the average length of the words in the
     * array
     * @throws IllegalArgumentException with the message, "Null words", if the
     * words array is null.
     * @throws IllegalArgumentException with the message, "Zero length", if the
     * length of the words array is 0.
     * @throws IllegalArgumentException with the message, "Invalid words", if
     * any word is null, has a length of 0, or contains a non-letter character
     */
    public static double getAverageWordLength(String[] words) {
        if(words == null) {
            throw new IllegalArgumentException("Null words");
        }

        if(words.length == 0) {
            throw new IllegalArgumentException("Zero length");
        }

        double total = 0.0;
        for(int i = 0; i < words.length; i++){
            total += words[i].length();
        }
        double arrayLength = words.length;
        System.out.printf("%.2f",total/arrayLength);
        return total/arrayLength;
    }

    /**
     *
     * @param words a String array
     * @return a double value of the average length of the words in the
     * array
     * @throws IllegalArgumentException with the message, "Null words", if the
     * words array is null.
     * @throws IllegalArgumentException with the message, "Zero length", if the
     * length of the words array is 0.
     * @throws IllegalArgumentException with the message, "Invalid words", if
     * any word is null, has a length of 0, or contains a non-letter character
     */
    public static int[] getLetterTally(String[] words) {
        int[] counter = new int[26];
        char[] alphabets = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q',
        'r','s','t','u','v','w','x','y','z'};
        for(int i = 0; i < words.length; i++) {
            for(int j = 0; j < words[i].length(); j++) {
                for(int x = 0; x < alphabets.length; x++) {
                    char input = words[i].charAt(j);
                    if(input == alphabets[x]) {
                        counter[x] += 1;
                    }
                }
            }
        }
        return counter;
    }
}
