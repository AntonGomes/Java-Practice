public class ErrorHandlingReturn {
    public static boolean birthdayGreetings(String name, int age) {
        boolean success;

        if (age>0) {
            System.out.println("All the best to your " + age + ". brithday " + name);
            success = true;
        }
        else {
            System.out.println("ERROR: The given age must be lagrer than 0 but is: " + age);
            success = false;
        }

        return success;
    }

    public static void spam(String[] names, int[]ages) {
        for (int i = 0; i<names.length; i++) {
            int age = ages[i];
            if (!birthdayGreetings(names[i], ages[i])) {
                age = 20;
                birthdayGreetings(names[i], age);
            }        
        }
    }
    public static void main(String[] args){
       String[] names = {"Peter","Sarah","Ivan"};
       int[] ages = {23,-5,35};
       spam(names,ages);
    }
}
