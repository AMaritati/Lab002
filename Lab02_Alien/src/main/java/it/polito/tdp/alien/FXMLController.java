package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Word word;
	AlienDictionary diz;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtInsert;
    
    @FXML
    private TextArea txtElenco;

    @FXML
    private Button btnTranslate;

    @FXML
    private TextArea txtBig;

    @FXML
    private Button btnReset;

    @FXML
    void doReset(ActionEvent event) {

    	txtBig.clear();
    	txtInsert.clear();
    	txtElenco.clear();
    	diz.w.clear();
    	
    }

    @FXML
    void doTranslate(ActionEvent event) {
    	
    	
    	String inserimento = txtInsert.getText();
    	String tokens[] = inserimento.split(" ");
    	//caso aggiunta parola al dizionario
    	if (tokens.length == 2) {
    		
    	if (controllaParola(tokens[0]) == true) {
    		if (controllaParola(tokens[1]) == true) {
    	    	diz.w.add(new Word(tokens[0], tokens[1]));
    	    	txtBig.setText("Parola inserita nel dizionario");
    	    	txtElenco.appendText(tokens[0].toLowerCase()+ "-"+ tokens[1].toLowerCase()+"\n");
    	    	txtInsert.clear();
    		}
    		
    	}
    	
    	if (controllaParola(tokens[0]) == false  || controllaParola(tokens[1]) == false ) {
    		txtBig.setText("ERRORE INSERIMENTO PAROLA");
    		txtInsert.clear();
    		
    		return;
    	}
    }
    	//caso traduzione parola
    	else {
    		
    	    	for (Word a : diz.w) {
    	    		if (txtInsert.getText().toLowerCase().equals(a.getAlienWord())) {
    	    			txtBig.setText(a.getTranslation());
    	    		}
    	    		else {
    	    			txtBig.setText("Traduzione non presente");
    	    			txtInsert.clear();
    	    		}
    	    	}
    	    	
    	}
    	if (tokens.length > 2)
    	{
    		txtBig.setText("ERRORE INSERIMENTO, TROPPE VOCI. LIMITARE A DUE");
    		txtInsert.clear();
    		
    		return;
    	}
    	
    	
    	    	
    
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
    
    public boolean controllopresenza (String p) {
    	boolean result = false;
    	for (Word w : diz.w) {
    		if (w.getAlienWord().equals(p)) {
    			result = true;
    		}
    	}
    	
    	return result;
    }

   
    @FXML
    void initialize() {
        assert txtInsert != null : "fx:id=\"txtInsert\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtElenco != null : "fx:id=\"txtElenco\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnTranslate != null : "fx:id=\"btnTranslate\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtBig != null : "fx:id=\"txtBig\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";

        
        diz = new AlienDictionary();
    }
}
