import controllers.MainMenuController;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Simple BrickBreaker game.
 */
public class BrickBreaker extends Application {

    /**
     * Called when the application is started.
     * @param primaryStage The window the program is being displayed in.
     * @throws Exception
     */
    @Override
    public void start(Stage primaryStage) throws Exception {

        // set up window.
        primaryStage.setWidth(600);
        primaryStage.setHeight(400);
        primaryStage.setResizable(false);

        // set up scenes.
        FXMLLoader mainMenuLoader = new FXMLLoader(getClass().getResource("FXML/mainMenuLayout.fxml"));
        Scene mainMenuScene = new Scene(mainMenuLoader.load());
        FXMLLoader gameLoader = new FXMLLoader(getClass().getResource("FXML/gameLayout.fxml"));
        Scene gameScene = new Scene(gameLoader.load());

        // set the main menu to load into the game.
        MainMenuController mainMenuController = (MainMenuController) mainMenuLoader.getController();
        mainMenuController.setGameScene(gameScene);

        primaryStage.setScene(mainMenuScene);

        primaryStage.show();

    }
}
