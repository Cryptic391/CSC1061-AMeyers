package edu.frcc.csc1061j.SearchEngine;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;

public class TermCounter {
	
	private Map<String, Integer> map;
	private String url;
	
	public TermCounter(String url) {
		this.url = url;
		map = new HashMap<>();
	}
	
	public String getURL() {
		return url;
	}
	
	public Set<String> getKeySet() {
		return map.keySet();
	}
	
	public Integer get(String term) {
		Integer count = map.get(term);
		int cnt = count == null ? 0 : count;
		return cnt;
	}
	
	public void processElements(Elements paras) {
		for(Node node : paras) {
			processTree(node);
		}
	}
	
	private void processTree(Node root) {
		for(Node node : new WikiNodeIterable(root)) {
			if(node instanceof TextNode) {
				processText(((TextNode) node).text());
			}
		}
	}

	private void processText(String text) {
		//All punctuation to empty, all to lowercase, split on 1 or more spaces
		String[] tokens = text.replace("\\pP", "").toLowerCase().split("\\s+");
		for(int i = 0; i < tokens.length; i++) {
			String term = tokens[i];
			incrementTermCount(term);
		}
	}

	private void incrementTermCount(String term) {
		Integer count = map.get(term);
//		int cnt;
//		if(count == null) {
//			cnt = 0;
//		}
//		else {
//			cnt = count;
//		}
		int cnt = count == null ? 0 : count;
		map.put(term,++cnt);
	}
	
	
	
	public void printCounts() {
		for(String key : map.keySet()) {
			int count = map.get(key);
			System.out.println(key + "," + count);
		}
		System.out.println("Number of terms: " + map.size());
	}
	
}
