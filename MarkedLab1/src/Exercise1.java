public class Exercise1 {
    // Method that returns void
    void printEvenUpTo(int number) {
        // Check number isn't negative
        if (number > 0){
            // Set i to 0; run while i smaller than number; add 1 to i each iteration
            for (int i = 0; i <= number; i++){
                // Only print if i is even
                if (i % 2 == 0){
                    System.out.println(i);
                }
            }
        }
    }

    String getABCFromTo(char c1, char c2) {
        // Ensure consistency with capitalisation
        c1 = Character.toLowerCase(c1);
        c2 = Character.toLowerCase(c2);

        // Create a StringBuilder object sb with the latin alphabet
        StringBuilder sb = new StringBuilder("abcdefghijklmnopqrstuvwxyz");

        // Get the indexes of c1 and c2 within the alphabet
        int s1Index = sb.indexOf(Character.toString(c1));
        int s2Index = sb.indexOf(Character.toString(c2));

        // If the char is not in the alphabet then return an empty string, otherwise continue
        if (s1Index == -1 || s2Index == -1){
            return "";
        } else {
            // Create new empty StringBuilder object to append to
            StringBuilder sb1 = new StringBuilder();

            // Iterate from c1 to c2 appending chars to sb1
            for (int i = s1Index; i <= s2Index; i++){
                sb1.append(sb.charAt(i));
            }

            // Return the string of sb1
            return sb1.toString();
        }
    }
}
