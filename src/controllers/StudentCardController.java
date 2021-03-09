package controllers;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import models.Student;
import javafx.scene.image.ImageView;
import java.net.URL;
import java.util.ResourceBundle;
/**
 * Name: Dmitrii Demin
 * Date:08.02.2021
 */
public class StudentCardController implements Initializable {
    @FXML
    private Label firstNameLabel;

    @FXML
    private Label lastNameLabel;
    @FXML
    private Label studentNumberLabel;
    @FXML
    private ListView<String> interestsLabel;

    @FXML
    private ImageView imageView;

    private Student student;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        /**
         * Initializing a Student object
         * getting the validated info and pass it to the fxml ids.
         */
        Student student = new Student("dmitrii", "Demin", 200464709,"Hiking" );
        firstNameLabel.setText(student.getFirstName());
        lastNameLabel.setText(student.getLastName());
        studentNumberLabel.setText(Integer.toString(student.getStudentNumber()));

        interestsLabel.getItems().addAll(student.getInterest());
        imageView.setImage(student.getMyImage());
    }

}
