import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application{

    int width = 300;
    int height = 300;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Title of the window");

        button = new Button();
        button.setText("Click me!");

        //Events
        button.setOnAction(e -> {
            System.out.println("Hi there this is a lambda");
            System.out.println("This is how you use multiples code lines");
        });

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene(layout, height,width);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
