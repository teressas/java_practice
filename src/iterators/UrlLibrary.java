package iterators;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;

public class UrlLibrary implements Iterable<String> {

	private LinkedList<String> urls = new LinkedList<>();

	private class UrlIterator implements Iterator<String> {

		private int index = 0;

		@Override
		public boolean hasNext() {
			return index < urls.size();
		}

		@Override
		public String next() {

			StringBuilder sb = new StringBuilder(); // store urls

			try {
				URL url = new URL(urls.get(index));

				BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

				String line = null;

				// as long as there's a line to read
				while ((line = br.readLine()) != null) {
					// add the new line to string builder and add a new line after
					sb.append(line);
					sb.append("\n");
				}

				br.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

			index++;
			return sb.toString();
		}

	}

	public UrlLibrary() {
		urls.add("http://caveofprogramming.com");
		urls.add("http://facebook.com/caveofprogramming");
		urls.add("http://cnn.com");
	}

	@Override
	public Iterator<String> iterator() {
		return new UrlIterator();
	}

//	@Override
//	public Iterator<String> iterator() {
//		return urls.iterator();
//	}

}
