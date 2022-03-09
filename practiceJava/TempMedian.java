import java.util.Arrays;
public class TempMedian {
        public static void main(String[] args){

            int[] tempArray = new int[args.length];

            tempArray[0] = Integer.parseInt(args[0]);

            System.out.print(tempArray[0]);

            for (int i=1;i<args.length;i++){
                tempArray[i] = tempArray[i-1];
                    if (args[i].equals("+")) {
                        tempArray[i]++;
                    }
                    else if (args[i].equals("-")) {
                        tempArray[i]--;
                    }
                System.out.print(" " + tempArray[i]);
            }
            
            System.out.println();
           
            Arrays.sort(tempArray);

            for (int i = 0; i<tempArray.length;i++) {
                System.out.print(tempArray[i] + " ");
            }
            
            System.out.println();
            
            double median = 0.0;

            if (((tempArray.length-1) % 2) == 0) {
                median = tempArray[((tempArray.length - 1)/2)];
            }
            else {
                median = ((tempArray[tempArray.length/2] * 1.0) + tempArray[(tempArray.length - 2)/2])/2; 
            }
            System.out.println(median);


        }

    }
