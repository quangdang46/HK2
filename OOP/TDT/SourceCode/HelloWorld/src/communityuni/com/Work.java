package communityuni.com;

public class Work implements DoAble{
	public void doSomething(int x) {
		System.out.println("Do "+x);
	}
	public static void main(String[] args) {
		DoAble able=new Work();
		able.doSomething(9);
	}
}
