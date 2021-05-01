import java.io.FileInputStream;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.control.ToolBar;
import javafx.scene.effect.Blend;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Light;
import javafx.scene.effect.Lighting;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class OrderGUI extends Application {
    private Button btnCreateNewOrder = new Button("Create new order");
    private Button btnAddItem = new Button("Add item");
    private Button btnDeleteItem = new Button("Delete item");
    private Button btnDisplayTheItemsListOfOrder = new Button("Display the items list of order");
    private Button btnAutoSortByCostOfItem = new Button("Auto sort by cost of item");
    private Button btnShowBookContentTokens = new Button("Show Book content tokens");
    private Button btnExit = new Button("Exit");
    

    @Override
    public void start(Stage primaryStage) {
        
        // Background
        BackgroundFill bgfToolBar = new BackgroundFill(Color.DARKCYAN, CornerRadii.EMPTY, Insets.EMPTY);
        Background bgToolBar = new Background(bgfToolBar);
       
        // Label
        Label bottomLabel = new Label("Mai Minh Trọng || Email: trongdeptraivodich@gmail.com || Phone number: 0969696969 ");

        // Image 
        Image image = new Image("image/center.jpeg", 1015, 600 , true, true);
        ImageView firstView = new ImageView(image);
        firstView.autosize();

        // Button setup
        
        btnAddItem.setStyle("-fx-font: 14 arial ; -fx-base: #ffffff;");

        btnAutoSortByCostOfItem.setStyle("-fx-font: 14 arial ; -fx-base: #ffffff;");
        
        btnCreateNewOrder.setStyle("-fx-font: 14 arial ; -fx-base: #ffffff;");
        
        btnDeleteItem.setStyle("-fx-font: 14 arial ; -fx-base: #ffffff;");
        
        btnDisplayTheItemsListOfOrder.setStyle("-fx-font: 14 arial ; -fx-base: #ffffff;");
        
        btnExit.setStyle("-fx-font: 14 arial ; -fx-base: #ffffff;");
        
        btnShowBookContentTokens.setStyle("-fx-font: 14 arial ; -fx-base: #ffffff;");
    
        // Effect
        

        // Toolbar
        ToolBar toolBar = new ToolBar(
        new Separator(),
        btnCreateNewOrder,
        new Separator(),
        btnAddItem,
        new Separator(),
        btnDeleteItem,
        new Separator(),
        btnDisplayTheItemsListOfOrder,
        new Separator(),
        btnAutoSortByCostOfItem,
        new Separator(),
        btnShowBookContentTokens,
        new Separator(),
        btnExit,
        new Separator()
        );
        
        toolBar.autosize();
        toolBar.setBackground(bgToolBar);
        
        // HBox
        Text textHBox = new Text("Empty HBox");
        textHBox.autosize();

        
        // Layouts
        BorderPane rootPane = new BorderPane();
        rootPane.setTop(toolBar);
        rootPane.setCenter(firstView);
        rootPane.setBottom(bottomLabel);
        rootPane.setPrefSize(900, 600);

        // Scene
        Scene rootScene = new Scene(rootPane, 1015, 600);

        // Event handle
        btnCreateNewOrder.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent evt) {
                btnCreateNewOrder.setEffect(new DropShadow());
            }
        });

        btnCreateNewOrder.addEventHandler(MouseEvent.MOUSE_RELEASED, new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent evt) {
                btnCreateNewOrder.setEffect(null);
            }
        });


        
        btnAddItem.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent evt) {
                btnAddItem.setEffect(new DropShadow());
            }
        });

        btnAddItem.addEventHandler(MouseEvent.MOUSE_RELEASED, new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent evt) {
                btnAddItem.setEffect(null);
            }
        });

        btnDeleteItem.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent evt) {
                btnDeleteItem.setEffect(new DropShadow());
            }
        });

        btnDeleteItem.addEventHandler(MouseEvent.MOUSE_RELEASED, new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent evt) {
                btnDeleteItem.setEffect(null);
            }
        });

        btnDisplayTheItemsListOfOrder.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent evt) {
                btnDisplayTheItemsListOfOrder.setEffect(new DropShadow());
            }
        });

        btnDisplayTheItemsListOfOrder.addEventHandler(MouseEvent.MOUSE_RELEASED, new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent evt) {
                btnDisplayTheItemsListOfOrder.setEffect(null);
            }
        });

        btnAutoSortByCostOfItem.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent evt) {
                btnAutoSortByCostOfItem.setEffect(new DropShadow());
            }
        });

        btnAutoSortByCostOfItem.addEventHandler(MouseEvent.MOUSE_RELEASED, new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent evt) {
                btnAutoSortByCostOfItem.setEffect(null);
            }
        });

        btnShowBookContentTokens.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent evt) {
                btnShowBookContentTokens.setEffect(new DropShadow());
            }
        });

        btnShowBookContentTokens.addEventHandler(MouseEvent.MOUSE_RELEASED, new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent evt) {
                btnShowBookContentTokens.setEffect(null);
            }
        });

        btnExit.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent evt) {
                btnExit.setEffect(new DropShadow());
            }
        });

        btnExit.addEventHandler(MouseEvent.MOUSE_RELEASED, new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent evt) {
                btnExit.setEffect(null);
                primaryStage.close();
            }
        });


        // First scene
        primaryStage.setScene(rootScene);
        primaryStage.setTitle("Order GUI");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
