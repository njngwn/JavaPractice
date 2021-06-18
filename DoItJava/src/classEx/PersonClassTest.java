package classEx;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PersonClassTest {
	public static void main(String[] args) throws ClassNotFoundException {
		Class personClass = Class.forName("classEx.Person");
		Constructor[] cons = personClass.getConstructors();
		Field[] fields = personClass.getFields();
		Method[] methods = personClass.getMethods();
		
		 for(Constructor con:cons) {
	         System.out.println(con);
	      }
	      System.out.println();
	      for(Field field:fields) {
	         System.out.println(field);
	      }
	      System.out.println();
	      for(Method method:methods) {
	         System.out.println(method);
	      }

	}
}
