class myCounter extends Counter {

	private int upperLimit;

	public myCounter(int v, int ul) {
		super(v);
		upperLimit = ul;
	}

	public boolean increment() {
		if (value < upperLimit) {
			this.value++;
			return true;
		} else
			return false;
	}

	public void print_details() {
		super.print_details();
		System.out.println("Limit: " + upperLimit);
	}
}
