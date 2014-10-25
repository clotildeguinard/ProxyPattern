package edu.tum.cs.i1.pse;

public class Proxy implements ResourceGetterInterface {
	// linkedHashMap: call a "removeEldestEntry" method each time "put" is invoked -> delete eldest entry if maxSize has been reached
	private static final Cache<String, Resource> storedResources = new Cache<>(4);

	private final ResourceGetterInterface realResourceGetter;

	public Proxy() {
		realResourceGetter = new RealResourceGetter();
	}

	@Override
	public Resource getResource(String url) {
		if (storedResources.containsKey(url)) {
			System.out.println("Resource found in proxy cache.");
			return storedResources.get(url);
		}
		Resource result = realResourceGetter.getResource(url);
		storedResources.put(url, result);
		return result;
	}

}
