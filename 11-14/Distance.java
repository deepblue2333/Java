public class Distance {
    public static void main(String[] args) {
	double x = Double.parseDouble(args[0]);
	double y = Double.parseDouble(args[1]);
	double d = Math.sqrt(x*x + y*y);
	System.out.println(d);
    }
}
