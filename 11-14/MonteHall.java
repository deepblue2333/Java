public class MonteHall {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);

		int a, b, c;

		for (int i = 0; i < n; i++) {
			double p = Math.random()*3;
			a = 0;
			b = 0;
			c = 0;
			if (p<1)		a = 1;
			else if (p < 2) b = 1;
			else			c = 1;
			int choice = (int) (Math.random()*3);
			
		}
	}
}
