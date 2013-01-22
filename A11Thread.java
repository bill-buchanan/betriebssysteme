class A11Thread extends Thread {
	private int count_max;
	private counter in;
	
	public A11Thread(counter Counter, int n) {
		this.count_max = n;
		this.in = Counter;
	}
	
	public void run() {
		// System.out.println("Hallo Welt");
		for (int i = 0; i < this.count_max; i++) {
			this.in.increment();
		}
	}
}
