package studio7;

public class Rectangle {
		private int length;
		private int width;
		
		public Rectangle(int length, int width) {
			this.length = length;
			this.width = width;
	}
		public int area() {
			return this.length * this.width;
		}
		public int perimeter() {
			return 2*(this.length+this.width);
		}
		public boolean isSquare() {
			if (this.length == this.width) {
				return true;
			}
			else {
				return false;
			}
		}
		public boolean isSmaller(Rectangle one) {
			if (one.area() > this.area()) {
				return true;
			}
			else {
				return false;
			}
		}
		public static void main(String[] args) {
			Rectangle mawin = new Rectangle(5, 10);
			System.out.println(mawin.area());
			System.out.println(mawin.perimeter());
			System.out.println(mawin.isSquare());
			Rectangle maddie = new Rectangle (10, 10);
			System.out.println(mawin.isSmaller(maddie));
			
		}

}
