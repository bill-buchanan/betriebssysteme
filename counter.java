public class counter {
	int value;
	
	public counter() {
		this.value = 0;
	}
	
	public counter(int n) {
		this.value = n;
	}
	
	public int value() {
		return this.value;
	}
	
	public void increment() {
		int next_free_slot = this.value;
		next_free_slot++;
		this.value = next_free_slot;
	}
}
