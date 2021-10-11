/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appsondeos;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Separator;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Luis
 */
public class Deportes extends VBox{
    
    
    public Deportes(Stage primaryStage){
        
        //Elegimos el Layout de nuestra ventana Deportes
        VBox root = new VBox(10);
        root.setAlignment(Pos.TOP_CENTER);
        
        //Creamos nuestra escena
        Scene escena = new Scene(root, 500, 600);
        
        //titulo y seteamos escena
        primaryStage.setTitle("Deportes");
        primaryStage.setScene(escena);
        
        //Creamos los diferentes layouts para las diferentes partes del VBox y lo añadimos al VBox
        
        /*
           --> Layout de informacion personal Y sus diferentes componenetes
        */
        //Introduccion de la profesion
        Label lb_profesion = new Label("Profesion: ");
        TextField tf_profesion = new TextField();
       
        //Introduccion de la edad
        Label lb_edad = new Label("Edad: ");
        ChoiceBox cb_edad = new ChoiceBox(FXCollections.observableArrayList("menos de 15", "entre 15 y 18", "entre 19 y 35", "entre 36 y 60", "más de 60"));
        
        //Introduccion del numero de hermanos
        Label lb_hermanos = new Label("Nº de Hermanos: ");
        ChoiceBox cb_hermanos = new ChoiceBox(FXCollections.observableArrayList("ninguno", "uno", "dos", "más de dos"));
        
        //Introducimos la eleccion de sexo
        Label lb_sexo = new Label("Sexo: ");
        RadioButton rb_sexoM = new RadioButton("Masculino");
        RadioButton rb_sexoF = new RadioButton("Femenino");
        
        //Añadimos todo a la ventana
        //Informacion profesion
        GridPane personal1 = new GridPane();
        personal1.add(lb_profesion, 0, 0);
        personal1.add(tf_profesion, 1, 0);
        personal1.setAlignment(Pos.TOP_CENTER);
        personal1.setPadding(new Insets(20, 0, 0, 0));
        
        //agrupamos edad y nº de hermanos
        //Informacion edad
        GridPane gp_edadHer = new GridPane();
        GridPane personal2 = new GridPane();
        personal2.add(lb_edad, 0, 1);
        personal2.add(cb_edad, 1, 1);
    
    
        //informacion del numero de hermanos
        GridPane personal3 = new GridPane();
        personal3.add(lb_hermanos, 0, 1);
        personal3.add(cb_hermanos, 1, 1);
      
        
        gp_edadHer.add(personal2, 0, 0);
        gp_edadHer.add(personal3, 1, 0);
        gp_edadHer.setAlignment(Pos.TOP_CENTER);
        gp_edadHer.setHgap(50);
        gp_edadHer.setPadding(new Insets(20, 1, 20, 1));
        
        
        //Informacion de eleccion de sexo
        GridPane personal4 = new GridPane();
        personal4.add(lb_sexo, 0, 1);
        personal4.add(rb_sexoM, 1, 1);
        personal4.add(rb_sexoF, 2, 1);
        personal4.setAlignment(Pos.TOP_CENTER);
        personal4.setHgap(30);
        personal4.setPadding(new Insets(0, 0, 20, 0));
        
      
        
        //Añadimos los 3 grid layout al layout de inf_persona
        root.getChildren().add(personal1);
        root.getChildren().add(gp_edadHer);
        root.getChildren().add(personal4);
        
        
        
        //Creamos un separador
        Separator separator = new Separator();
        separator.setMaxWidth(700);
        root.getChildren().add(separator);
        
        
        
        /*
        --> Layout encuestra principal Y componentes
        */
        BorderPane enc_principal = new BorderPane();
        root.getChildren().add(enc_principal);
        enc_principal.setPadding(new Insets(20, 0, 20, 10));
        
        //Pregunta de si practicas algun deporte
        Label lb_practicas = new Label("¿Practica algun deporte?");
        CheckBox check_deporte = new CheckBox();
        
        //ChoiceBox de que deporte practicas
        Label lb_cual = new Label("¿Cual?");
        ChoiceBox cb_deportes = new ChoiceBox(FXCollections.observableArrayList("Tenis", "fútbol", "calistenia", "PowerLifting", "Baloncesto", "Otros"));
        
        //Añadimos los elementos
        HBox hbox_deportes_top = new HBox(10);
        hbox_deportes_top.getChildren().addAll(check_deporte, lb_practicas);
        enc_principal.setTop(hbox_deportes_top);
        
        HBox hbox_deportes_center = new HBox(10);
        hbox_deportes_center.getChildren().addAll(lb_cual, cb_deportes);
        enc_principal.setCenter(hbox_deportes_center);
        hbox_deportes_center.setAlignment(Pos.CENTER);
        hbox_deportes_center.setPadding(new Insets(40, 0, 0, 0));
        
        Separator separator1 = new Separator();
        separator1.setMaxWidth(700);
        root.getChildren().add(separator1);
        
        
       
        /*
            -->Layout de grado de aficion que tienes sobre diferentes deportes que no practicas
        */
        
        Label lb_aficion = new Label("Marque del 1 al 10 su grado de aficion a:");
        
        //GridLayout de slider de futbol online
        GridPane gp_slider = new GridPane();
        Label lb_futbol_online = new Label("Futbol Online: ");
        Slider sl_futbol_online = new Slider(0, 10, 0);
        sl_futbol_online.setShowTickMarks(true);
        sl_futbol_online.setShowTickLabels(true);
        sl_futbol_online.setMajorTickUnit(0.25f);
       
       
        Label lb_frec_apuestas = new Label("Apuestas Deportivas: ");
        Slider sl_frec_apuestas = new Slider(0, 10, 0);
        sl_frec_apuestas.setShowTickMarks(true);
        sl_frec_apuestas.setShowTickLabels(true);
        sl_frec_apuestas.setMajorTickUnit(0.25f);
        
        
        Label lb_frec_practicas = new Label("Actividad Física : ");
        Slider sl_frec_practicas = new Slider(0, 10, 0);
        sl_frec_practicas.setShowTickMarks(true);
        sl_frec_practicas.setShowTickLabels(true);
        sl_frec_practicas.setMajorTickUnit(0.25f);
       
        
        gp_slider.add(lb_futbol_online, 0, 0);
        gp_slider.add(sl_futbol_online, 1, 0);
        gp_slider.add(lb_frec_apuestas, 0, 1);
        gp_slider.add(sl_frec_apuestas, 1, 1);
        gp_slider.add(lb_frec_practicas, 0, 2);
        gp_slider.add(sl_frec_practicas, 1, 2);
        
        gp_slider.setAlignment(Pos.TOP_CENTER);
        gp_slider.setPadding(new Insets(20, 10, 20, 10));
        
        
        
        
       
        root.getChildren().add(lb_aficion);
        root.getChildren().add(gp_slider);
       
        
        primaryStage.show();
        
        
        
    }
    
}
