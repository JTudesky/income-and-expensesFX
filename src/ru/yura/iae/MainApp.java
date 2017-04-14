/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.yura.iae;


import java.io.IOException;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import ru.yura.iae.model.Entry;
import ru.yura.iae.view.LayoutController;

/**
 *
 * @author yuyurch001
 */
public class MainApp extends Application {
    
    
    
    private Stage primaryStage;
    private Parent rootLayout;
    private Scene scene;

    
     
    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("IAEApp");
        
        initRootLayout();
    }
    
    /**
     * Инициализирует корневой макет.
     */

    public void initRootLayout(){
        try {
            // Загружаем корневой макет из fxml файла.
            FXMLLoader loader=new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/RootLayout.fxml"));
            rootLayout = loader.load();
            
            // Отображаем сцену, содержащую корневой макет.
            scene=new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
            
            //Set link MainApp to Controller
            LayoutController controller = loader.getController();
            controller.setMainApp(this);
            
        } catch (Exception e) {
        }
    }
    
    public void showWorkLayout(){
        try {
            rootLayout=FXMLLoader.load(getClass().getResource("view/WorkLayout.fxml"));
            scene=new Scene(rootLayout);
            getPriStage().setScene(scene);
            getPriStage().show();
        } catch (IOException ex) {
            System.out.println("NoNoNo");
        }
    }
    
    //
    
    
    /**
    * Инициализирует макет входа в главное окно.
    */

    
//    public void showRootLayout(){
//        try {
//            System.out.println("qew");
//            FXMLLoader loader=new FXMLLoader();
//            loader.setLocation(MainApp.class.getResource("view/RootLayout.fxml"));
//            
//            AnchorPane IaeOverview=(AnchorPane)loader.load();
//            Scene scene2=new Scene(IaeOverview);
//            getPriStage().setScene(scene2);
//             System.out.println("end");
//            getPriStage().show();
//
//            
//        } catch (Exception e) {
//        }
//    }
    
    
    
    
    
    /**
     * Return primaryStage
     * @return
     */

    public Stage getPriStage(){
        return primaryStage;
    }
    
    /**
     * Data in Observed List.
     */
    private ObservableList<Entry> oneEntry=FXCollections.observableArrayList();

    public ObservableList<Entry> getOneEntry() {
        return oneEntry;
    }

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }
    

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    
    

}


