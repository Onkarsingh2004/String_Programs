public class ReverseWords {
    public static void main(String[] args) {
        String str = "Hello Onkar This Is Java Program I Am Your Instructor Chat GPT";
        String word = "";
        String result = "";

        // Loop through the string backward
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);

            // when a space is found → reverse the collected word
            if (ch == ' ') {
                // reverse 'word' manually
                for (int j = word.length() - 1; j >= 0; j--) {
                    result += word.charAt(j);
                }
                result += " ";  // add space between words
                word = "";      // reset for next word
            } else {
                word += ch;     // collect characters of the word
            }
        }

        // reverse and add the last word (since it won’t end with a space)
        for (int j = word.length() - 1; j >= 0; j--) {
            result += word.charAt(j);
        }

        System.out.println("Reversed Sentence: " + result);
    }
}
