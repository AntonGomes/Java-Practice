public class DateFasion {
    public static int dateFasion(int you, int date) {
        int tableGet = 1;
        if (you <= 2 || date <= 2) {
            tableGet = 0;
        }
        else if (you>=8 || date >=8) {
            tableGet = 2;
        }
        return tableGet;
    }
    public static void main(String[] args){
        int you = Integer.parseInt(args[0]);
        int date = Integer.parseInt(args[1]);
        System.out.println(dateFasion(you,date));
    }
}
