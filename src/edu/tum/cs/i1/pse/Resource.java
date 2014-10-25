package edu.tum.cs.i1.pse;


public class Resource {
	public final String extension;
	public final String content;

	public Resource(String url) {
		extension = getExtensionFromUrl(url);
		content = getFakeContentFromUrl(url);
	}

	private String getExtensionFromUrl(String url) {
		return getLastToken(url, "\\.");
	}

	private String getFakeContentFromUrl(String url) {
		return getLastToken(url, "/");
	}

	private String getLastToken(String url, String regex) {
		String[] tokens = url.split(regex);
		if (tokens.length > 0) {
			return tokens[tokens.length - 1];
		}
		return "unknown";
	}
}
