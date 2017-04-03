package util;

public class StringCompareTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String sentences = "This growth rate, combined with the cost advantages of a mass-produced microprocessor, led to an increasing fraction of the computer business being based on microprocessors. "
                + "In addition, two significant changes in the computer marketplace made it easier than ever before to succeed commercially with a new architecture. "
                + "First, the virtual elimination of assembly language programming reduced the need for object-code compatibility. "
                + "Second, the creation of standardized, vendor-independent operating systems, such as UNIX and its clone, Linux, lowered the cost and risk of bringing out a new architecture. "
                + "These changes made it possible to develop successfully a new set of architectures with simpler instructions, called RISC architectures, in the early 1980s. "
                + "The RISC-based machines focused the attention of designers on two critical performance techniques, the exploitation of instructionlevel parallelism and the use of caches.";
        String word = "rate";
        int currentSentence = 1;
        int currentWordOfSentence = 1;
        int space = 32;
        int comma = 44;
        int period = 46;
        int r1 = 0; // Character from sentences
        int r2 = 0; // Character from the word

        int j = 0;
        for (int i = 0; i < sentences.length(); i++) {
            r1 = sentences.charAt(i);
            // System.out.println(r1);

            if (r1 == period) {
                currentSentence++;
                currentWordOfSentence = 0;
            }
            if (r1 == space) {
                currentWordOfSentence++;
            }

            r2 = word.charAt(j);
            if (r1 != r2) {
                i = i - j;
                if (r1 == period && j != 0) {
                    currentSentence--;
                }
                if (r1 == space && j != 0) {
                    currentWordOfSentence--;
                }
                j = 0;
                continue;
            }
            // System.out.println("bingo!");
            // break;
            if (j == word.length() - 1) {
                break;
            }
            j++;
        }
        System.out.println(currentSentence);
        System.out.println(currentWordOfSentence);
    }

}
