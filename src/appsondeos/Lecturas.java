/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appsondeos;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Separator;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Border;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

/**
 *
 * @author usuario
 */
public class Lecturas extends VBox{
    //Atributos
    
    //Titulo
    Label lbTitulo;
    //Profesion
    Label lbProfesion;
    TextField tfProfesion;
    //Edad
    Label lbEdad;
    ChoiceBox chEdad;
    //Nº Hermanos
    Label lbHermanos;
    ChoiceBox chHermanos;
    //Sexo
    Label lbSexo;
    RadioButton rbSexoH;
    Label lbHombre;
    RadioButton rbSexoM;
    Label lbMujer;
    ImageView ivSexo;
    //Lees?
    Label lbLectura;
    CheckBox cbLectura;
    //Tipo de libro favorito
    Label lbTipoLibro;
    ChoiceBox cbTipoLibro;
    //Deslizadores
    Label lbDeslizadores;
    //Numero del libros al año
    Label lbLibrosAnio;
    Slider sLibrosAnio;
    //Numero de paginas por hora
    Label lbVelocidadLectura;
    Slider sVelocidadLectura;
    //Numero de horas diarias a leer
    Label lbHorasLectura;
    Slider sHorasLectura;
    
    //Agrupaciones
    GridPane agProfesion;
    GridPane agEdad_Hermanos;
    GridPane agEdad;
    GridPane agHermanos;
    GridPane agSexo;
    ToggleGroup grupoSexo;
    GridPane agLees;
    GridPane agTipoLibro;
    GridPane agLibrosAnio;
    GridPane agVelocidadLectura;
    GridPane agHorasLectura;
        
    //Separadores
    Separator separador1;
    Separator separador2;
    
    //Constructor
    public Lecturas()
    {
        super();
       
        //Decimos que se alineen en el centro los componentes en el VBox
        this.setAlignment(Pos.TOP_CENTER);
        //Introducimos lbTitulo en el VBox
        lbTitulo = new Label("Encuesta sobre Lecturas");
        //Agrandamos la letra de lbTitulo
        lbTitulo.setFont(new Font(30));
        //Introducimos lbTitulo en el layoutGeneral
        this.getChildren().add(lbTitulo);
        
        // Creamos la agrupacion agProfesion, añadimos hueco vertical y horizontal de 10
        //Añadimos un Padding de 5 general y decimos que la agrupación tenga valor arriba central
        agProfesion = new GridPane();
        agProfesion.setVgap(10);
        agProfesion.setHgap(10);
        agProfesion.setPadding(new Insets(5));
        agProfesion.setAlignment(Pos.TOP_CENTER);
        
        //Introducimos lbProfesion en la agrupacion  agProfesion
        lbProfesion = new Label("Profesion: ");
        agProfesion.add(lbProfesion,0,0);
        
        //Introducimos tfProfesion en la agrupacionagProfesion
        tfProfesion = new TextField();
        agProfesion.add(tfProfesion,1,0);
        
        //Añadimos agProfesion a VBox
        this.getChildren().add(agProfesion);
        
        
        // Creamos la agrupacion agEdad_Hermanos, añadimos hueco vertical y horizontal de 10
        //Añadimos un Padding de 5 general y decimos que la agrupación tenga valor arriba central
        agEdad_Hermanos = new GridPane();
        agEdad_Hermanos.setVgap(10);
        agEdad_Hermanos.setHgap(10);
        agEdad_Hermanos.setPadding(new Insets(5,5,5,5));
        agEdad_Hermanos.setAlignment(Pos.TOP_CENTER);
        
        //Agrupacion Edad
        agEdad = new GridPane();
        agEdad.setVgap(10);
        agEdad.setHgap(10);
        agEdad.setPadding(new Insets(5,1,5,1));
        agEdad.setAlignment(Pos.TOP_CENTER);
        
        //Introducimos lbEdad en la agrupacion  agEdad_Hermanos
        lbEdad = new Label("Edad: ");
        agEdad.add(lbEdad,0,0);
        
        //Introducimos tfEdad en la agrupacion agEdad_Hermanos
        chEdad = new ChoiceBox();
        chEdad.getItems().addAll("Entre 10 y 20","Entre 21 y 30","Entre 31 y 40","Entre 41 y 50", "Entre 51 y 60", "Entre 61 y 70", "Más de 70");
        agEdad.add(chEdad,1,0);
        
        //Añadimos agEdad a agEdad_Hermanos
        agEdad_Hermanos.add(agEdad, 0, 0);
        
        //Agrupacion Edad
        agHermanos = new GridPane();
        agHermanos.setVgap(10);
        agHermanos.setHgap(10);
        agHermanos.setPadding(new Insets(5,1,5,1));
        agHermanos.setAlignment(Pos.TOP_CENTER);
        
        //Introducimos lbHermanos en la agrupacion  agEdad_Hermanos
        lbHermanos = new Label("Hermanos: ");
        agHermanos.add(lbHermanos,2,0);
        
        //Introducimos tfHermanos en la agrupacion agEdad_Hermanos
        chHermanos = new ChoiceBox();
        chHermanos.getItems().addAll("0","1","2","3", "4", "Más de 4");
        agHermanos.add(chHermanos,3,0);
        
        //Añadimos agHermanos a agEdad_Hermanos
        agEdad_Hermanos.add(agHermanos, 1, 0);

        //Añadimos agEdad_Hermanos a VBox
        this.getChildren().add(agEdad_Hermanos);
        
        
        //Creamos agSexo
        agSexo = new GridPane();
        agSexo.setHgap(10);
        agSexo.setVgap(10);
        agSexo.setPadding(new Insets(20,5,5,5));
        agSexo.setAlignment(Pos.TOP_CENTER);
        
        //Añadimos lbSexo a agSexo
        lbSexo = new Label("Sexo: ");
        agSexo.add(lbSexo, 0, 0);
        
        //Creamos el grupoSexo
        grupoSexo = new ToggleGroup();
        
        //Añadimos rbSexoH al grupoSexo y a agSexo
        rbSexoH = new RadioButton();
        rbSexoH.setToggleGroup(grupoSexo);
        rbSexoH.setSelected(true);
        agSexo.add(rbSexoH, 1, 0);
        
        //Añadmimos lbSexoH a agSexo
        lbHombre = new Label("Hombre   ");
        agSexo.add(lbHombre, 2, 0);
        
        //Añadimos rbSexoM al grupoSexo y a agSexo
        rbSexoM = new RadioButton();
        rbSexoM.setToggleGroup(grupoSexo);
        agSexo.add(rbSexoM, 3, 0);
        
        //Añadimos lbMujer a agSexo
        lbMujer = new Label("Mujer   ");
        agSexo.add(lbMujer, 4, 0);
        
        //Añadimos lbImagen a agSexo
        ivSexo = new ImageView(new Image(getClass().getResourceAsStream("Images/Hombre.png")));
        ivSexo.setFitHeight(25);
        ivSexo.setFitWidth(25);
        agSexo.add(ivSexo,5,0);
        
        //Añadimos agSexo a VBox
        this.getChildren().add(agSexo);
        
        
        //Añadimos un separador a VBox
        separador1 = new Separator();
        this.getChildren().add(separador1);
        
        
        //Creamos agLees
        agLees = new GridPane();
        agLees.setHgap(10);
        agLees.setVgap(10);
        agLees.setPadding(new Insets(5));
        agLees.setAlignment(Pos.TOP_LEFT);
        
        
        //Añadimos cbLectura a agLees
        cbLectura = new CheckBox();
        agLees.add(cbLectura, 0, 0);
        
        //Añadimos lbLectura a agLees
        lbLectura = new Label("¿Lees habitualmente?");
        agLees.add(lbLectura, 1, 0);
        
        //Añadimos grupo lees a VBox
        this.getChildren().add(agLees);
        
        
        //Creamos agTipoLibro
        agTipoLibro = new GridPane();
        agTipoLibro.setHgap(10);
        agTipoLibro.setVgap(10);
        agTipoLibro.setPadding(new Insets(20,5,20,5));
        agTipoLibro.setAlignment(Pos.TOP_CENTER);
        
        //Añadimos lbTipoLibro a agTipoLibro
        lbTipoLibro = new Label("¿Qué género de libros?");
        agTipoLibro.add(lbTipoLibro, 0, 0);
        //Añadimos cbTipoLibro a agTipoLibro
        cbTipoLibro = new ChoiceBox();
        cbTipoLibro.getItems().addAll("Fantasía", "Ciencia-Ficción", "Terror", "Romance", "Historico", "Drama", "Suspense", "Otro");
        agTipoLibro.add(cbTipoLibro, 1, 0);
        
        //Añadimos agTipoLibro a VBox
        this.getChildren().add(agTipoLibro);
        
        
        //Añadimos segundo separador a VBox
        separador2 = new Separator();
        this.getChildren().add(separador2);
        
        
        //Añadimos 
        
        
        
        
        //Mostramos VBox
        this.setVisible(true);
    }
}
