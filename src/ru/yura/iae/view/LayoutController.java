/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.yura.iae.view;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Text;
import ru.yura.iae.MainApp;

/**
 * FXML Controller class
 *
 * @author yuyurch001
 */
public class LayoutController implements Initializable {

    @FXML
    private Button logOnBut;
    
    @FXML
    private TextField logField;
    
    @FXML
    private Text warningText;
    
    
    private MainApp mainApp;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
    
    //Add data from mainApp
    public  void setMainApp(MainApp mainApp){
        this.mainApp=mainApp;
    }
    
    @FXML
    private void handleLogOnButton() throws IOException{
        if (logField.getText().isEmpty()){
            warningText.setVisible(true);
        }else
        mainApp.showWorkLayout();

        
        
    }
    
    @FXML
    public void keyEnterPressed(KeyEvent event) throws IOException{
        if (event.getCode()== KeyCode.ENTER){
            handleLogOnButton();
        }
    }

}
