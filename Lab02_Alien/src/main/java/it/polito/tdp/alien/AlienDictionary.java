package it.polito.tdp.alien;

import java.util.*;

public class AlienDictionary {
	List <Word> w;
	List <WordEnhanced> we;
	WordEnhanced ww;
	
	public AlienDictionary() {
		w = new LinkedList<Word>();
		we = new LinkedList<WordEnhanced>();
	
	}
	
	public void addWord (String alienWord,String translation) {
		
		w.add(new Word (alienWord,translation));
		
	}
	
	public void addWords (String alienWord, String translation) {
		
		we.add(new WordEnhanced(alienWord,translation));
		ww.addTraduzioni(translation);

	}

}
