package edu.tum.cs.i1.pse;

public class RealResourceGetter implements ResourceGetterInterface {

	@Override
	public Resource getResource(String url) {
		System.out.println("Resource loaded by real resource getter.");
		Resource created = new Resource(url);
		System.out.println(created.extension + " " + created.content);
		return new Resource(url);
	}

}
