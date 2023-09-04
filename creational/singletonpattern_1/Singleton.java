package singletonpattern_1;

import java.io.ObjectStreamException;
import java.io.Serializable;

/*
 * When to use Singleton
 * - There must be exactly one instance of a class and it must be accessible to clients
 *   from well-known access point.
 * - When the sole instance should be extensible by sub-classing, and the clients should
 *   be able to use an extended instance without modifying their code.  
 * */
public class Singleton implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2054323236582004522L;
	
	private static Singleton sc = new Singleton();
	
	private Singleton() {
		if (sc != null) {
			throw new IllegalStateException("Already created!");
		}
	}
	
	public static Singleton getInstance() { 
		return sc;
	}
	
	private Object readResolve() throws ObjectStreamException {
		return sc;
	}
	
	private Object writeReplace() throws ObjectStreamException {
		return sc;
	}
	
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Singleton, can't be cloned");
		
	}
	
	private static Class getClass(String className) throws ClassNotFoundException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		if (classLoader == null) {
			classLoader = Singleton.class.getClassLoader();
		}
		return (classLoader.loadClass(className));
		
	}

}
