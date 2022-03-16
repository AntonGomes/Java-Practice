public class OneTimePadDecipher {
    public static String decipher(String etext, String otp) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < etext.length() ; i++) {
            sb.append(OneTimePadCipher.intToChar(( OneTimePadCipher.charToInt(Character.toUpperCase(etext.charAt(i))) - OneTimePadCipher.charToInt(otp.charAt(i)) + 26 ) % 26));
        }
        String string = sb.toString();
        return string;
    }

    public static void main(String[] args) {
       String deciphered = decipher("uvufsghktdal", "WHATSTHEPASSWORD");
        System.out.println(deciphered);
    }
}
