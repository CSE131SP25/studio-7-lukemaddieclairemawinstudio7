package studio7;

public class Die {
	private int n;

	public Die(int n) {
		this.n = n;
	}

	public int roll() {
		return (int) (Math.random()*n + 1);
	}

	public static void main(String[] args) {
		Die one = new Die (20);
		one.roll();
		System.out.println(one.roll());
	}
}
