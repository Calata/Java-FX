import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ErrorNum  {

    private static int height = 100;
    private static int  width = 250;

    public static void display(String title,String message){
        Stage window = new Stage();
        window.setTitle(title);
        window.initModality(Modality.APPLICATION_MODAL);
        window.setResizable(false);

        Label messageLabel = new Label(message);
        Button closeButton = new Button("Cerrar");
        closeButton.setOnAction(e -> window.close());

        VBox layout = new VBox(10);
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(messageLabel,closeButton);

        Scene scene = new Scene(layout,width,height);
        window.setScene(scene);
        window.showAndWait();
    }
}
