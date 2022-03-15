import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;

public class Main extends Application {
  @Override
  public void start(Stage primaryStage) throws Exception {
    primaryStage.setResizable(false);
    Parent MainWindowRoot = FXMLLoader.load(getClass().getResource("resources/MainWindow/MainWindow.fxml"));
    Scene MainWindow = new Scene(MainWindowRoot);
    primaryStage.getIcons().add(new Image("Icon.png"));
    primaryStage.setTitle("Hangman Game");
    primaryStage.setScene(MainWindow);
    primaryStage.show();
  }
  public static void main(String[] args) {
      launch(args);
  }
}
