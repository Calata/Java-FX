import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class main extends Application {

    Stage window;
    int width = 300;
    int height = 250;
    ComboBox<String> comboBox;

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Combo Boxes");

        Button button = new Button("Click me");

        comboBox = new ComboBox<>();
        comboBox.getItems().addAll("Origen","St Vicent","Blackhat");
        comboBox.setPromptText("What is your favourite movie?");
        comboBox.setEditable(true);

        comboBox.setOnAction(e -> System.out.println("User Selected: "+comboBox.getValue()));
        button.setOnAction(e -> printmovie());

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.getChildren().addAll(button,comboBox);

        Scene scene = new Scene(layout,width,height);

        window.setScene(scene);
        window.show();
    }
    private void printmovie(){
        System.out.println(comboBox.getValue());
    }
}
