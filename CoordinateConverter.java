public class CoordinateConverter {

    public static double convertXYtoR(double x, double y) {
       double r = Math.sqrt(Math.pow(x,2.0)  + Math.pow(y,2.0));
       return r;
    }
    
    public static double convertXYtoT(double x, double y) {
        double theta = Math.atan(y/x);
        return theta;
    }

    public static double convertRTtoX(double r, double theta) {
        double x = r * Math.cos(theta);
        return x;
    }

    public static double convertRTtoY(double r, double theta) {
        double y = r * Math.sin(theta);
        return y;       
    }

    public static double convertDegToRad(double deg) {
        double rad = deg * (Math.PI/180.0);
        return rad;
    }

    public static double convertRadToDeg(double rad) {
        double deg = rad * (180/Math.PI);
        return deg;
    }

    public static void main(String[] args){
       System.out.println(convertXYtoR(1.0,1.0)); 
       System.out.println(convertXYtoT(1.0,1.0)); 
       System.out.println(convertRTtoX(1.0,1.0)); 
       System.out.println(convertRTtoY(1.0,1.0)); 
       System.out.println(convertDegToRad(180.0));
       System.out.println(convertRadToDeg(3.14));
    }
}
