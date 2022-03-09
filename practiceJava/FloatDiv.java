public class FloatDiv {
        public static void main(String args[]){
            double age = Double.parseDouble(args[0]);
            double exposure = Double.parseDouble(args[1]);

            double dose = ((exposure * 250.0) / age);

            System.out.format("PatientAge: %f%n", age);
            System.out.format("Days since bitten: %f%n", exposure);
            System.out.format("Dosage of anitdote: %.3fmg%n", dose);
        }
    }
