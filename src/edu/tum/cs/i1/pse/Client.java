package edu.tum.cs.i1.pse;

public class Client {
	private final static String root = "http://www1.in.tum.de/static/lehrstuhl/images/people/";

	public static void main(String[] args) {
		System.out.println("Client starting ...");

		ResourceGetterInterface proxy = new Proxy();

		get("Bernd%20Bruegge.jpg", proxy);
		get("whatever.png", proxy);
		get("Bernd%20Bruegge.jpg", proxy);
		get("azebra.pdf", proxy);
		get("anelephant.pdf", proxy);
		get("helloworld.jpg", proxy);
		get("Bernd%20Bruegge.jpg", proxy);
		get("helloworld.jpg", proxy);

		
		System.out.println("\n" + "Client stopped");
	}

	private static void get(String url, ResourceGetterInterface rgi) {
		System.out.println("\n" + "Getting resource -> " + url);
		rgi.getResource(root + url);

	}
}