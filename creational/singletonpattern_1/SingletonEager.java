package singletonpattern_1;

public class SingletonEager {

	private static SingletonEager sc = new SingletonEager();
	/*
	 * By keeping constructor private, no other class can instantiate this class.
	 * The only way to get the object of this class is using the sc static variable
	 * which ensures only only one object will be created.
	 * But direct access to a class member is not a good idea, therefore, we will
	 * provide a method which the sc variable gets access.
	 * 
	 * */
	private SingletonEager() {}
	public static SingletonEager getInstance() {
		return sc;
	}
	
	public static void main(String[] args) {
		//var se1 = new SingletonEager();
		//var se2 = new SingletonEager();
		var se1 = SingletonEager.getInstance();
		var se2 = SingletonEager.getInstance();
		System.out.println(se1);
		System.out.println(se2);
	}
}
