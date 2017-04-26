/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.yura.iae.view;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author yuyurch001
 */
public class WorkLayoutController implements Initializable {

    @FXML
    private DatePicker dateField;
    @FXML
    private TextField cashField;
    @FXML
    private ChoiceBox<?> categoryField;
    @FXML
    private TextArea noteField;
    @FXML
    private ToggleGroup direction;
    @FXML
    private Button addButton;
    @FXML
    private TextField textIncCat;
    @FXML
    private Button addIncCat;
    @FXML
    private ListView<?> listIncCat;
    @FXML
    private Button delIncCat;
    @FXML
    private TextField textExpCat;
    @FXML
    private Button addExpAdd;
    @FXML
    private Button delExpCat;
    @FXML
    private ListView<?> listExpCat;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        dateField.setValue(LocalDate.now());
    }    
    
}
