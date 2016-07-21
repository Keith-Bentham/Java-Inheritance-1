class Counter {
	protected int value;

	public Counter(int v) {value = v;}

	public boolean decrement() {
		if (value > 0) {
			this.value--;
			return true;
		} else
			return false;
	}

	public void print_details() {
		System.out.println("Counter Details:");
		System.out.println("Value: " + value);
	}
}