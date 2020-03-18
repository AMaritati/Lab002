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
    private Button btnTranslate;

    @FXML
    private TextArea txtBig;

    @FXML
    private Button btnReset;

    @FXML
    void doReset(ActionEvent event) {

    }

    @FXML
    void doTranslate(ActionEvent event) {
    	//caso aggiunta parola al dizionario
    	String inserimento = txtInsert.getText();
    	String tokens[] = inserimento.split(" ");
    	
    	//if (controllaParola(tokens[0]) == true) {
    	//	if (controllaParola(tokens[1]) == true) {
    	    	diz.w.add(new Word(tokens[0], tokens[1]));
    	    	txtBig.setText("Parola inserita nel dizionario");
    		//}
    		
    	//}
    	
    	
    	
    	
    	
    	//caso traduzione parola
    /*	for (Word a : diz.w) {
    		if (txtInsert.getText().equals(a.getAlienWord())) {
    			txtBig.setText(a.getTranslation());
    		}
    		else {
    			txtBig.setText("Traduzione non presente");
    		}
    	}
    	*/
    	
    	

    }

   
    @FXML
    void initialize() {
        assert txtInsert != null : "fx:id=\"txtInsert\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnTranslate != null : "fx:id=\"btnTranslate\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtBig != null : "fx:id=\"txtBig\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";

        diz = new AlienDictionary();
    }
}
