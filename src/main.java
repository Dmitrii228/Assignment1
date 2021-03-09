import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Name: Dmitrii Demin
 * Date:08.02.2021
 */
public class main extends Application {

    public static void main(String[] args) {

        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("views/studentCardView.fxml"));
        stage.setTitle("Student Card");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
