package JavaClass;
import java.lang.Class;

public class MainClass {
	
	public static void main(String[] args) throws ClassNotFoundException {
	
		Class c = Class.forName("ReflectionClass");
		System.out.println(c.getName());
	
	

	}

}
