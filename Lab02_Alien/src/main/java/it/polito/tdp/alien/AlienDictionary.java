package it.polito.tdp.alien;

import java.util.*;

public class AlienDictionary {
	List <Word> w;
	
	public AlienDictionary() {
		w = new LinkedList<Word>();
	}
	
	public void addWord (String alienWord,String translation) {
		
		w.add(new Word (alienWord,translation));
		
	}

}
