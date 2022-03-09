public class ErrorHandlingException {
    public static String lowerAndTrim(String s) {
        if (s == null) {
            throw new NullPointerException("Input cannot be null");
        }
        String str = s.toLowerCase().trim();
        return (str);
    }

    public static String formatText(String[] strs) {
        int counter = 0;
        String s = "";
        for (int i = 0; i < strs.length; i++) {
            try {
                lowerAndTrim(strs[i]);
                s = (s + lowerAndTrim(strs[i]) + "\n");
            }
            catch (NullPointerException error) {
                counter++;
            }
        }
        return s+=counter;
    }

    public static void main(String[] args){
        String[] l = {"Hello, World! ",null,""," No Pain, No Gain ",null};
        System.out.println(formatText(l));
    }

}
