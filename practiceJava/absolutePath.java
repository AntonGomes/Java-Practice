public class absolutePath {
    public static String ensureAbsolute(String path) {
        String dir = System.getProperty("user.dir");
       if (path.indexOf('/') != 0) {
           return (dir + path);
       }
       return path;
    }
    public static String[] absoluteSplitPath(String s) {
       String[] components = splitPath.splitPath(s);
       components[0] = ensureAbsolute(components[0]);
       return components;
    }
    public static void main(String[] args){
        String s = "work/flowerpotlist.xls";
        for (int i = 0; i<4;i++) {
            System.out.println(absoluteSplitPath(s)[i]);
        }
    }
}
