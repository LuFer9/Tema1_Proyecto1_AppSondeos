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
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
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
        
        //Añadimos la acción de salir al menú "Salir"
        encuesta.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                Stage myDialog = new Encuestas(primaryStage);
                myDialog.sizeToScene();
                myDialog.show();
            }
        });   
        
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
        Image image1 = new Image("Images/menu.jpg");
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
        
    class Encuestas extends Stage {
        public Encuestas(Stage owner) {
            super();
            initOwner(owner);
            setTitle("Encuestas");
            initModality(Modality.APPLICATION_MODAL);
            
            Group root = new Group();
            Scene scene = new Scene(root, 500, 600, Color.WHITE);
            setScene(scene);
            
            // Encuesta de deportes
            Deportes deportes = new Deportes();
            Tab tabDeporte = new Tab("Deportes");
            tabDeporte.setContent(deportes);
            
            // Encuesta de animales
            Tab tabAnimales = new Tab("Animales");
            //tabAnimales.setContent();
            
            // Encuesta de comidas
            Tab tabComidas = new Tab("Comidas");
            //tabComidas.setContent();
            
            // Encuesta de viajes
            Tab tabViajes = new Tab("Viajes");
            //tabViajes.setContent();
            
            // Encuesta de lecturas
            Lecturas lecturas = new Lecturas();
            Tab tabLecturas = new Tab("Lecturas");
            tabLecturas.setContent(lecturas);
            
            // Añadimos las tabs a la barra de tabs
            TabPane tabs = new TabPane(tabDeporte,tabAnimales,tabComidas,tabViajes,tabLecturas);
            
            root.getChildren().add(tabs);
        }
    }
        

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
