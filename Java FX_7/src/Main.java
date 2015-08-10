import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
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

        button = new Button();

        CheckBox box1 = new CheckBox("Bacon");
        CheckBox box2 = new CheckBox("Tuna");

        button.setOnAction(e -> handleOption(box1,box2));

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10,10,10,10));
        layout.getChildren().addAll(box1,box2,button);

        scene = new Scene(layout,400,400);
        window.setScene(scene);
        window.show();
    }

    private void handleOption(CheckBox box1, CheckBox box2){
        String message = "Users order:\n";
        if(box1.isSelected())
            message += "Bacon ";
        if(box2.isSelected())
            message +=  "Tuna ";

        System.out.println(message);
    }
}
