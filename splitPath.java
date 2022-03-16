public class splitPath {
    public static String[] splitPath(String s) {
        String[] components = new String[4];
        components[0] = s.substring(0, s.lastIndexOf('/') + 1);
        components[1] = s.substring(s.lastIndexOf('/') + 1);

        if (s.indexOf('.') == -1) {
            components[2] = s.substring(s.lastIndexOf('/') + 1, s.length());
            components[3] = "";
        }
        else {
            components[2] = s.substring(s.lastIndexOf('/') + 1, s.indexOf('.'));
            components[3] = s.substring(s.indexOf('.'));
        }

        return components;
    }
    public static void main(String[] args){
         for (int i = 0; i<args.length; i++) {
             System.out.println("File: " + splitPath(args[i])[1] + "\tType: " + splitPath(args[i])[3] + "\t[" + splitPath(args[i])[0] + "]");
        }
    }
}
