import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{

    int height = 300;
    int width = 300;

    Button button1,button2;
    Label label;
    Stage window;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Here goes the title");

        label = new Label();

        button1 = new Button("Dumb text here");
        button1.setOnAction(e -> AlertBox.display("Title of window", "Wow this alert box is awesome"));

        button2 = new Button("Confirm box!");
        button2.setOnAction(e -> {
            boolean result = ConfirmBox.display("Title of the window","Wanna sens nude picks to maje???");
            label.setText("The resoult was "+result);
        });

        VBox layout = new VBox();
        layout.getChildren().addAll(button1, button2,label);

        Scene scene = new Scene(layout, width,height);

        window.setScene(scene);
        window.show();
    }
}
