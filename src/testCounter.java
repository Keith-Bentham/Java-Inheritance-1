public class testCounter {
	public static void main(String[] args) {

		myCounter mc = new myCounter(20, 30);

		int choice = 5;

		while (choice != 4) {
			System.out.println("\nCounter Application");
			System.out.println("===================");
			System.out.println("1.Increment");
			System.out.println("2.Decrement");
			System.out.println("3.Print Details");
			System.out.println("4.Exit");

			choice = Console.readInt("Please enter a value-->");
			if (choice == 1) {
				boolean res1 = mc.increment();
				if (res1 == false)
					System.out.println("Error");
			}
			if (choice == 2) {
				boolean res1 = mc.decrement();
				if (res1 == false)
					System.out.println("Error");
			} else if (choice == 3) {
				mc.print_details();
			}
		}
	}
}