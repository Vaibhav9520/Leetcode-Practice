public class ReverseVowelString {
    public String swapVowels(String s) {
        // Convert the string to a character array
        char[] chars = s.toCharArray();
        char a;
        // Find and store all vowels
        String vowels = "";
        for (int i = 0; i < chars.length; i++) {
            if (isVowel(chars[i])) {
                vowels += chars[i]; // Collect vowels
            }
        }

        // Replace vowels in reverse order
        int vowelIndex = vowels.length() - 1;
        for (int i = 0; i < chars.length; i++) {
            if (isVowel(chars[i])) {
                chars[i] = vowels.charAt(vowelIndex); // Replace vowel
                vowelIndex--; // Move to the previous vowel in reverse
            }
        }

        // Return the modified string
        return new String(chars);
    }

    // Helper function to check if a character is a vowel
    public boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
            c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ReverseVowelString solution = new ReverseVowelString();
        String input = "IceCreAm";
        String output = solution.swapVowels(input);
        System.out.println("Output: " + output);
    }
}
