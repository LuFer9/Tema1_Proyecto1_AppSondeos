/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appsondeos;

import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Ailla
 */
public class AppSondeos extends Application {
    
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {

        //Crea el menú "Encuesta" y le añade las pestañas "Realizar encuesta" y "Salir"
        Menu menuEncuesta = new Menu("Encuesta");
        MenuItem encuesta = new MenuItem("Realizar encuesta");
        MenuItem salir = new MenuItem("Salir");
        
        //Añadimos la acción de salir al menú "Salir"
        salir.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.exit(0);
            }
        });
        
        menuEncuesta.getItems().add(encuesta);
        menuEncuesta.getItems().add(salir);

        //Crea la barra de menú y le añade el menú "Encuesta"
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().add(menuEncuesta);
        
        //Crea y añade a la barra de menú el menú "Help"
        Menu menuHelp = new Menu("Help");
        menuBar.getMenus().add(menuHelp);
        
        //Añadimos la barra de menú a un HBox para añadirle el efecto de barra y juntar los menús
        HBox contenedorMenu = new HBox(menuBar);
        
        //Añadimos la imagen
        Image image1 = new Image("menu.jpg");
        ImageView iv1 = new ImageView();
        iv1.setImage(image1);
        
        //Juntamos el menú y la imagen en un VBox
        VBox ventana = new VBox();
        ventana.getChildren().add(contenedorMenu);
        ventana.getChildren().add(iv1);
        
        //Creamos la escena
        Scene scene = new Scene(ventana, 300, 190);
          
        primaryStage.setTitle("");
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
