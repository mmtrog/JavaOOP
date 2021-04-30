import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class OrderGUI extends Application {
    private Button btn1;

    @Override
    public void start(Stage primaryStage) {
        
        // Button
        btn1 = new Button();
        btn1.setText("Menu");
           
        // Toolbar
        ToolBar toolBar = new ToolBar(
        new Separator(),
        new Button("Create new order"),
        new Separator(),
        new Button("Add item"),
        new Separator(),
        new Button("Delete item"),
        new Separator(),
        new Button("Display the items list of order"),
        new Separator(),
        new Button("Auto sort by cost of item"),
        new Separator(),
        new Button("Show Book content tokens"),
        new Separator(),
        new Button("Exit"),
        new Separator()
        );
        
        toolBar.setPrefSize(900, 50);
        
        // HBox

        Text textHBox = new Text("Empty HBox");
        textHBox.autosize();

        
        // Layouts
        BorderPane rootPane = new BorderPane();
        rootPane.setTop(toolBar);
        rootPane.setPrefSize(900, 600);

        // Event Handle



        // Scene
        Scene rootScene = new Scene(rootPane, 1280, 720);

        // 
        primaryStage.setScene(rootScene);
        primaryStage.setTitle("Order GUI");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
