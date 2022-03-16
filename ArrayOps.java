public class ArrayOps {
    public static double findMax(double[] data) {
        double max = 0;
        for (int i=0;i<data.length; i++) {
            if (data[i]>max) {
                max = data[i];
            }
        }
        return max;
    }
    
    public static double[] normalise(double[] data) {
        double sum = 0;
        for (int i = 0 ; i < data.length ; i++) {
            sum+=data[i];
        }
        double normalisedData[] = new double[data.length];
        for (int i = 0 ; i < data.length ; i++) {
            normalisedData[i] = data[i]/sum;
        }
        return normalisedData;
    }

     public static void  normaliseInPlace(double[] data) {
        double sum = 0;
        for (int i = 0 ; i < data.length ; i++) {
            sum+=data[i];
        }
        for (int i = 0 ; i < data.length ; i++) {
            data[i] = data[i]/sum;
        }
    }
       
    public static double[] reverse(double[] data) {
        double reverseData[] = new double[data.length]; 
        int l = data.length;
        for (int i=0;i<l; i++) {
            reverseData[i] = data[l-(i+1)];
        }
        return reverseData;
    }

    public static void reverseInPlace(double[] data) {
        for (int i=0;i<(data.length)/2; i++) {
            double temp = data[i];
            data[i] = data[data.length - (i+1)];
            data[data.length - 1 - i] = temp;
       }
       for (int i = 0; i < data.length ; i++) {
        System.out.println(data[i]);
       }
    }

    public static void swap(double[] data1, double[] data2) {
       double[] temp = data1;
       data1 = data2;
       data2 = temp;
       for (int i = 0; i < data1.length ; i++) {
           System.out.println(data1[i]);
       }
       for (int i = 0; i < data2.length ; i++) {
           System.out.println(data2[i]);
       }
    }
       
    public static void main(String[] args){
      double[] arr1 = {1.0,2.0,3.0,4.0,5.0,6.0};
      double[] arr2 = {1.1,2.2,3.3,4.4,5.5,6.6};
      swap(arr1,arr2);
    }
}
