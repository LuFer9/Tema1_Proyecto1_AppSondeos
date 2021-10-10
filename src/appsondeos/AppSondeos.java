/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appsondeos;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

/**
 *
 * @author Ailla
 */
public class AppSondeos extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Lecturas lect = new Lecturas();
        TabPane tabPane = new TabPane();
        Tab tab = new Tab();
        tab.setText("Lectura");
        tab.setContent(lect);
        tabPane.getTabs().add(tab);

        Scene scene = new Scene(tabPane, 400, 600);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
