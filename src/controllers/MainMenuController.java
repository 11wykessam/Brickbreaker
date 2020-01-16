package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Controller for the main menu.
 */
public class MainMenuController {

    // stores the scene for the game.
    private Scene gameScene;

    // the root node of the menu.
    @FXML
    private BorderPane root;

    /**
     * Called when start button is pressed.
     */
    @FXML
    private void startButtonPressed() {
        Stage stage = (Stage) root.getScene().getWindow();
        stage.setScene(gameScene);
    }

    /**
     * Setter for game scene.
     * @param gameScene The game scene the main menu is launching into.
     */
    public void setGameScene(Scene gameScene) {
        this.gameScene = gameScene;
    }

}
