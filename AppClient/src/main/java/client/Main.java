package client;

import client.api.Api;
import client.controllers.AddBondController;
import client.controllers.GetBondsController;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class Main extends Application {
    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        initMenu();
    }
    public static void main(String[] args) {
        launch();
    }

    @FXML
    public void initMenu() {
        try {
            FXMLLoader loader = new FXMLLoader();
            URL xmlUrl = Main.class.getResource("fxml/menu.fxml");
            loader.setLocation(xmlUrl);
            Parent root = loader.load();
            this.primaryStage.setScene(new Scene(root));
            this.primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

