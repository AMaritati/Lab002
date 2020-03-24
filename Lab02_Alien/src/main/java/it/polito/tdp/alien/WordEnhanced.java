package it.polito.tdp.alien;

import java.util.*;

public class WordEnhanced {
	private String alienWord;
	private String translation;

	private List<String> traduzioni = new LinkedList<>();
	
	public WordEnhanced(String alienWord, String translation) {
		
		this.alienWord = alienWord;
		this.translation = translation;
	}

	public String getAlienWord() {
		return alienWord;
	}

	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}

	public List<String> getTraduzioni() {
		return traduzioni;
	}

	public void addTraduzioni(String traduzione) {
		this.traduzioni.add(traduzione);
	} 
	
	

}
