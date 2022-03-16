public class SquaresLoopRange {
        public static void main(String[] args){
            int start = Integer.parseInt(args[0]);
            int end = Integer.parseInt(args[1]);
            for (int i=start;i<(end+1);i++){
                System.out.println(i*i);
            }
        }
    }
