public class MainDriver {

	public static void main(String[] args) {

	}

}

// we can override a method by changing its return type only by abiding the
// condition that return type is a subclass of that of overridden method return
// type.

class Car {
	
	int x;
	int y;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	
}