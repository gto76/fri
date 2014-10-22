import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.List;
import java.util.Set;

public class MT2 {
	static boolean RUN_QUERY = true;
	static boolean RUN_INTERSECTION= false;
	
	private static TreeMap<String, TreeSet<String>> index = 
			new TreeMap<String, TreeSet<String>>();

	public static void main(String[] args) 
			throws FileNotFoundException {

		String path = "/home/minerva/fri/site/mt/text";
		File[] files = getFiles(path);
		System.out.println("files length = " + files.length);
		fillIndex(files);
		

		if (RUN_QUERY) {
			List<String> results = queryWord("banana");
			//System.out.println(results);
			for (String a : results) {
				System.out.println("#a");
			}
		}
		
		if (RUN_INTERSECTION) {
			String[] query = {"what", "is", "it"};
			Set<String> results = intersection(query);
			System.out.println(results);
		}
		
	}

	static File[] getFiles(String path) {
		File direktorij = new File(path);
		File[] files = direktorij.listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				return pathname.getName().endsWith(".txt");
			}
		});
		return files;
	}

	static void fillIndex(File[] files) throws 
			FileNotFoundException {
		for (File f : files) {
			Scanner sc = new Scanner(f);
			while(sc.hasNext()) {
				String word = sc.next().toLowerCase();
				if (!index.containsKey(word)) {
					TreeSet<String> noviSet = 
							new TreeSet<String>();
					index.put(word, new TreeSet<String>());
				} else {
					TreeSet<String> set = index.get(word);
					set.add(f.getName());
				}
			}
			sc.close();
		}
	}

	static List<String> queryWord(String word) {
		word = word.toLowerCase();
		List<String> results = new ArrayList<String>();
		if (index.containsKey(word)) {
			TreeSet<String> aaa = index.get(word);
			for (String a : aaa) {
				results.add(a);
			}
		} 
		return results;
	}

	static TreeSet<String> intersection(String[] query) {
		TreeSet<String> rezultat = new TreeSet<String>();
		if(index.containsKey(query[0])) {
			TreeSet<String> relzultat = index.get(query[0]);
		}
		
		for (int i =1; i < query.length; i++) {
			if (index.containsKey(query[i])) {
				TreeSet<String> rezultat2 = index.get(query[i]);
				rezultat.retainAll(rezultat2);
			}
			else {
				rezultat = new TreeSet<String>();
			}
		}
		return rezultat;
	}

}
