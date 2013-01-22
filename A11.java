public class A11 {
	public static void main(String args[]){
		int count_max;
		counter in = new counter();
		count_max = Integer.parseInt(args[0]);
		if (args.length==0 && count_max >= 0) {
			System.out.println("Bitte eine positive ganze Zahl als Parameter eingeben");
		} else {
			//System.out.println(count_max);
			A11Thread Thread1;
			A11Thread Thread2;
			Thread1 = new A11Thread(in, count_max);
			Thread2 = new A11Thread(in, count_max);
			Thread1.start();
			Thread2.start();
			try {
				Thread1.join();
				Thread2.join();
				if (in.value() == 2 * count_max) {
					System.out.println("in: " + in.value());
				} else {
					System.out.println("Race-Condition!");
					System.out.println("in: " + in.value());
				}
			}
			catch(InterruptedException e) {
				System.out.println("Interrupted Exception!");
			}
		}
	}
}
