public class OneTimePadCipher {

    public static int charToInt(char c) {
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int r = 0;
        for (int i = 0; i<26;i++) {
            if (c == abc.charAt(i)) {
                r = i;
            }
        }
        return r;
    }

    public static char intToChar(int i) {
        String abc = "abcdefghijklmnopqrstuvwxyz";
        char r = abc.charAt(i);
        return r;
    }

    public static boolean isAlpha(char c) {
        return true;
    }

    public static String encipher(String original, String onetimepad) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < original.length(); i++) {
            sb.append(intToChar((charToInt(original.charAt(i)) + charToInt(onetimepad.charAt(i))) % 26));
        }
        String string = sb.toString();
        return string;
    }
    
    public static void main(String[] args){
       String ciphertext = encipher("HELLO", "XMCKL");
       System.out.println(ciphertext);
    }

}

