package SelfPractic;

public class ThisKeyword {

	public static void main(String[] args) {
		
		Q obj1=new Q(5);
		obj1.you();
		
	}
}
class P{
	private int a;
	public P(int x) {
		this.a=x;
	}
	public void show() {
		System.out.println("a is "+a);
	}
}
class Q{
	private int q;
	public Q(int d) {
		this.q=d;
	}
	public void you() {
		System.out.println("q is "+q);
		
	}
}
	