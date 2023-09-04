package singletonpattern_1;

public class SingletonLazy {

	private static SingletonLazy sc = new SingletonLazy();
	private SingletonLazy() {}
	public static SingletonLazy getInstance() {
		if (sc == null) {
			sc = new SingletonLazy();
		}
		return sc;
	}
}
