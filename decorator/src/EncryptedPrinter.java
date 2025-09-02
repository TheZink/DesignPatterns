public class EncryptedPrinter extends PrinterDecorator {
    
    public EncryptedPrinter(Printer printer){
        super(printer);
    }

    // Decrypt message with Caesar cipher method
    @Override
    public void print(String message){
        StringBuffer encryptedMessage = new StringBuffer();

        for (int i = 0; i < message.length(); i++){

            // If letter is Uppercase, shift it
            if (Character.isUpperCase(message.charAt(i))) {
                char letter = (char)(((int)message.charAt(i) + 3 - 65) % 26 + 65);
                encryptedMessage.append(letter);
            }
            // If letter is lowerCase, shift it
            else if(Character.isLowerCase(message.charAt(i))) {
                char letter = (char)(((int)message.charAt(i) + 3 - 97) % 26 + 97);
                encryptedMessage.append(letter);
            }
            // If letter is non-letter, just append it
            else if(!Character.isLetter(message.charAt(i))) {
                char letter = (char)(message.charAt(i));
                encryptedMessage.append(letter);
            }
        }
        super.print(encryptedMessage.toString());        
    }
}

// Explanation to the "(char)(((int)message.charAt(i) + 3 - 65) % 26 + 65)";
//
// (int)message.charAt(i) gets the ASCII value of the character
// + 3 Shifts the character by 3 positions (Caesar cipher)
// - 65: Normalizes 'A' to 0, 'B' to 1, ..., 'Z' to 25 (since 'A' is 65 in ASCII).
// % 26: Ensures the result wraps around after 'Z' (so 'Z' + 3 becomes 'C').
// + 65: Converts back to the ASCII value for uppercase letters.
