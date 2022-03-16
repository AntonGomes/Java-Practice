public class MeanVariance {
        public static void main(String[] args){

            double[] data = new double[(args.length)];
            double sum = 0.0;
            double v_i = 0.0;

            for (int i=0; i<args.length;i++) {
                data[i] = Double.parseDouble(args[i]);
                sum = (sum + data[i]);
            }
            
            double mean = (sum / data.length);
            
            for (int i=0;i<data.length;i++) {
                v_i = (v_i + Math.pow((data[i] - mean), 2));
            }
            
            double variance = (v_i/data.length);

            System.out.println(mean + "\n" + variance);


        }

    }
