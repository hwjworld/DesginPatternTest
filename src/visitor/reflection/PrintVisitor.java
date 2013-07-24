package visitor.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;

public class PrintVisitor implements ReflectiveVisitor {
	public void visitCollection(Collection collection) {
		// ... same as above ...
	}

	public void visitString(String string) {
		// ... same as above ...
	}

	public void visitFloat(Float float1) {
		// ... same as above ...
	}

	public void default1(Object o) {
		System.out.println(o.toString());
	}

	public void visit(Object o) {
		// Class.getName() returns package information as well.
		// This strips off the package information giving us
		// just the class name
		String methodName = o.getClass().getName();
		methodName = "visit"
				+ methodName.substring(methodName.lastIndexOf('.') + 1);
		// Now we try to invoke the method visit<methodName>
		try {
			// Get the method visitFoo(Foo foo)
			Method m = getClass().getMethod(methodName,
					new Class[] { o.getClass() });
			// Try to invoke visitFoo(Foo foo)
			m.invoke(this, new Object[] { o });
		} catch (NoSuchMethodException e) {
			// No method, so do the default implementation
			default1(o);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
