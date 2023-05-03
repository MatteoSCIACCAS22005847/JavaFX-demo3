package com.example.partie1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Exo1 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        // Création du conteneur principal
        VBox vbox = new VBox();

        // Création menus
        Menu menu1 = new Menu("File");
        MenuItem menu1a = new MenuItem("New");
        MenuItem menu1b = new MenuItem("Open");
        MenuItem menu1c = new MenuItem("Save");
        MenuItem menu1d = new MenuItem("Close");
        menu1.getItems().add(menu1a);
        menu1.getItems().add(menu1b);
        menu1.getItems().add(menu1c);
        menu1.getItems().add(menu1d);
        Menu menu2 = new Menu("Edit");
        MenuItem menu2a = new MenuItem("Cut");
        MenuItem menu2b = new MenuItem("Copy");
        MenuItem menu2c = new MenuItem("Paste");
        menu2.getItems().add(menu2a);
        menu2.getItems().add(menu2b);
        menu2.getItems().add(menu2c);
        Menu menu3 = new Menu("Help");
        MenuBar menuBar = new MenuBar(menu1, menu2, menu3);

        // Création de la ligne de séparation
        Separator sep = new Separator();

        HBox topControls = new HBox();
        topControls.setAlignment(Pos.TOP_LEFT);
        Button button1 = new Button("Bouton 1");
        Label label1 = new Label("Name: ");
        var text1 = new TextField();
        topControls.getChildren().add(button1);
        topControls.getChildren().add(label1);
        topControls.getChildren().add(text1);

        HBox centerControls = new HBox();
        centerControls.setAlignment(Pos.CENTER_LEFT);
        Button button2 = new Button("Bouton 2");
        Label label2 = new Label("Email: ");
        var text2 = new TextField();
        centerControls.getChildren().add(button2);
        topControls.getChildren().add(label2);
        topControls.getChildren().add(text2);

        HBox bottomControls = new HBox();
        bottomControls.setAlignment(Pos.BOTTOM_LEFT);
        Button button3 = new Button("Bouton 3");
        Label label3 = new Label("Password: ");
        var text3 = new TextField();
        bottomControls.getChildren().add(button3);
        topControls.getChildren().add(label3);
        topControls.getChildren().add(text3);

        // Création du bandeau en bas de la fenêtre
        HBox bedrockControls = new HBox();
        bedrockControls.setAlignment(Pos.BOTTOM_CENTER);
        Label label4 = new Label("Ceci est un label de bas de page");
        bedrockControls.getChildren().add(label4);

        //HBox Center = new HBox(Boutons, log);

        //VBox.setVgrow(Center, Priority.ALWAYS);

        // Ajout des contrôleurs au conteneur principal
        vbox.getChildren().addAll(
                menuBar,
                sep,
                topControls,
                centerControls,
                bottomControls,
                bedrockControls
        );

        // Ajout du conteneur à la scene
        Scene scene = new Scene(vbox );

        // Ajout de la scene à la fenêtre et changement de ses paramètres (dimensions et titre)
        primaryStage.setScene( scene );
        primaryStage.setWidth( 800 );
        primaryStage.setHeight( 600 );
        primaryStage.setTitle("VBox and HBox App");

        // Affichage de la fenêtre
        primaryStage.show();



    }

}
