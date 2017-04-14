/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.yura.iae.view;

import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
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
        
        mainApp.showWorkLayout();
        
        
    }
    
    @FXML
    private void handleKeyEnterPress(KeyEvent keyEvent){
        if (keyEvent.getKeyCode()==KeyEvent.VK_ENTER){
            mainApp.showWorkLayout();
        }
    }
}
