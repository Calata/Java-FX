import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Determinante {
    private static int height = 100;
    private static int  width = 250;
    private static int[][]  matrix = new int[3][3];

    public static void display(TextField a,TextField b,TextField c,TextField d,TextField f,TextField g,TextField h,TextField i,TextField j){
        Stage window = new Stage();
        window.setTitle("Determinant");
        window.initModality(Modality.APPLICATION_MODAL);
        window.setResizable(false);

        Label messageLabel = new Label("El determinant es: "+Integer.toString(setMatrix(a,b,c,d,f,g,h,i,j)));
        Button closeButton = new Button("Close");
        closeButton.setOnAction(e -> window.close());

        VBox layout = new VBox(10);
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(messageLabel,closeButton);

        Scene scene = new Scene(layout,width,height);
        window.setScene(scene);
        window.showAndWait();
    }
    private static int setMatrix(TextField a,TextField b,TextField c,TextField d,TextField e,TextField f,TextField g,TextField h,TextField i){
        int result;
        matrix[0][0] = Integer.parseInt(a.getText());
        matrix[0][1] = Integer.parseInt(b.getText());
        matrix[0][2] = Integer.parseInt(c.getText());
        matrix[1][0] = Integer.parseInt(d.getText());
        matrix[1][1] = Integer.parseInt(e.getText());
        matrix[1][2] = Integer.parseInt(f.getText());
        matrix[2][0] = Integer.parseInt(g.getText());
        matrix[2][1] = Integer.parseInt(h.getText());
        matrix[2][2] = Integer.parseInt(i.getText());
        result = onCalculate();
        return result;
    }
    private static int onCalculate(){
        int cross1,cross2,cross3,cross4,cross5,cross6,end;
        cross1 = matrix[0][0] * matrix[1][1] * matrix[2][2];
        cross2 = matrix[1][0] * matrix[2][1] * matrix[0][2];
        cross3 = matrix[0][1] * matrix[1][2] * matrix[2][0];
        cross4 = matrix[2][0] * matrix[1][1] * matrix[0][2];
        cross5 = matrix[1][0] * matrix[0][1] * matrix[2][2];
        cross6 = matrix[2][1] * matrix[1][2] * matrix[0][0];
        end = cross1+cross2+cross3-cross4-cross5-cross6;
        return end;
    }


}
