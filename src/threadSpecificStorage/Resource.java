package threadSpecificStorage;

public class Resource {

	private static final ThreadLocal threadLocal = new ThreadLocal();

	public static SomeResource getResource() {
		SomeResource resource = (SomeResource) threadLocal.get();

		if (resource == null) {
			resource = new SomeResource();
			threadLocal.set(resource);
		}

		return resource;
	}
}
