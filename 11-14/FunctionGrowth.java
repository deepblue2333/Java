public class FunctionGrowth {
	public static void main(String[] args) {
		System.out.println("ln n\tn\tnln n\tn^2\tn^3\t2^n");
		long n = 2;
		while (n <= 2048) {
			System.out.println((int)Math.log(n)+"\t"+n+"\t"+n*Math.log((double)n)+"\t"+n*n+"\t"+(int)Math.pow(n,3));
			n *= 2;
		}
	}
}
