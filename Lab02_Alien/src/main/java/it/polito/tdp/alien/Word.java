package it.polito.tdp.alien;

import java.util.*;

public class Word {
	private String alienWord;
	private String translation;
	private List <AlienDictionary> aD;
	
	
	public Word(String alienWord, String translation) {
		
		this.alienWord = alienWord;
		this.translation = translation;
	}


	public String getAlienWord() {
		return alienWord;
	}


	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}


	public String getTranslation() {
		return translation;
	}


	public void setTranslation(String translation) {
		this.translation = translation;
	}


	public List<AlienDictionary> getaD() {
		return aD;
	}
	
	public boolean controllaParola (String p) {
		char c;
		boolean result = true;
		
		for(int i=0;i<p.length();i++){
            c = p.charAt(i);
            if(!((Character.isLetter(c)))){
                result = false;
                return result;
            }
        }
        
		return result;
	}
	
	
	
	
	
	


}
