import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{

    Stage window;
    Scene scene;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Order Now");

        button = new Button("Click me!");

        ChoiceBox<String> choiceBox = new ChoiceBox<>();

        //getItems return the ObservableList objects whick you can add items to
        choiceBox.getItems().add("Apples");
        choiceBox.getItems().addAll("Bacon", "MeatBalls", "Ham");
        choiceBox.setValue("Apples");

        //Listen for Selection Changes
        choiceBox.getSelectionModel().selectedItemProperty().addListener( (v,oldValue, newValue) -> System.out.println(newValue));


        button.setOnAction(e -> getChoice(choiceBox));

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10,10,10,10));
        layout.getChildren().addAll(choiceBox,button);

        scene = new Scene(layout,400,400);
        window.setScene(scene);
        window.show();
    }
    private void getChoice(ChoiceBox<String> choiceBox){
        String food = choiceBox.getValue();
        System.out.println(food);
    }

}