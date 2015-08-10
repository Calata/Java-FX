import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {

    private Stage window;
    private Scene scene1,scene2,scene3;
    private int height = 250;
    private int width = 400;

    TextField b1,b2,b3,b4,b5,b6,b7,b8,b9;
    TextField c1,c2,c3,c4,c5,c6,c7,c8,c9;
    TextField d1,d2,d3,d4,d5,d6,d7,d8,d9;
    Label result,label1;
    Button calculate,matrix1,matrix2,matrixSol;
    //private TextField[] btf = new TextField[8];

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Matrix");
        //Top Menu
        HBox topMenu = new HBox(10);
        topMenu.setAlignment(Pos.CENTER);
        topMenu.setPadding(new Insets(10, 10, 10, 10));
        topMenu.setSpacing(10);
        matrix1 = new Button("MATRIX 1");
        matrix2 = new Button("MATRIX 2");
        matrixSol = new Button("MATRIX SOLVE");

        matrix1.setOnAction(e -> window.setScene(scene1));
        matrix2.setOnAction(e -> window.setScene(scene2));
        matrixSol.setOnAction(e -> window.setScene(scene3));

        topMenu.getChildren().addAll(matrix1, matrix2, matrixSol);
        //Center 1
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setHgap(8);
        grid.setVgap(8);

        b1 = new TextField();
        b2 = new TextField();
        b3 = new TextField();
        b4 = new TextField();
        b5 = new TextField();
        b6 = new TextField();
        b7 = new TextField();
        b8 = new TextField();
        b9 = new TextField();

        GridPane.setConstraints(b1,0,0);
        GridPane.setConstraints(b2,1,0);
        GridPane.setConstraints(b3,2,0);
        GridPane.setConstraints(b4,0,1);
        GridPane.setConstraints(b5,1,1);
        GridPane.setConstraints(b6,2,1);
        GridPane.setConstraints(b7,0,2);
        GridPane.setConstraints(b8,1,2);
        GridPane.setConstraints(b9, 2, 2);

        grid.getChildren().addAll(b1, b2, b3, b4, b5, b6, b7, b8, b9);
        //Bottom Menu
        HBox bottomMenu = new HBox(15);
        calculate = new Button("Calculate");
        calculate.setOnAction(e -> {
            boolean condition = true;
            if (!isInt(b1))
                condition = false;
            if (!isInt(b2))
                condition = false;
            if (!isInt(b3))
                condition = false;
            if (!isInt(b4))
                condition = false;
            if (!isInt(b5))
                condition = false;
            if (!isInt(b6))
                condition = false;
            if (!isInt(b7))
                condition = false;
            if (!isInt(b8))
                condition = false;
            if (!isInt(b9))
                condition = false;
            if (!condition) {
                ErrorNum.display("Error", "Error");
            } else {
                Determinante.display(b1, b2, b3, b4, b5, b6, b7, b8, b9);
            }
        });
        bottomMenu.setAlignment(Pos.CENTER);
        bottomMenu.setPadding(new Insets(10, 10, 10, 10));
        bottomMenu.setSpacing(10);
        bottomMenu.getChildren().add(calculate);

        //Layout 1
        BorderPane layout1 = new BorderPane();
        layout1.setTop(topMenu);
        layout1.setCenter(grid);
        layout1.setBottom(bottomMenu);



        scene1 = new Scene(layout1,width,height);
        window.setScene(scene1);
        window.show();
    }
    /*private void initTextFieldArray(){
        for (int i = 0; i < btf.length;i++){
            btf[i] = new TextField();
        }
    }*/
    private boolean isInt(TextField num){
        try{
            Integer.parseInt(num.getText());
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
}
