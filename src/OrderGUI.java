
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Optional;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.control.ToolBar;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.effect.Blend;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.InnerShadow;
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
import javafx.scene.layout.VBox;
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
       
        // Text
        

        // Label
        Image labelIcon = new Image("image/icon.jpg", 35, 35, true, true);
        ImageView labelIconView = new ImageView(labelIcon);
 
        Label bottomLabel = new Label("Mai Minh Trọng || Email: trongdeptraivodich@gmail.com || Phone number: 0969696969", labelIconView);
        bottomLabel.setStyle("-fx-font: 18 consolas;");
        bottomLabel.setTextFill(Color.BLACK);
        bottomLabel.setWrapText(true);
        bottomLabel.setTranslateX(95);       

        // Image 
        Image gifHello = new Image("image/gif.gif");
        ImageView gifHelloView = new ImageView(gifHello);

        // Button setup
        
        btnAddItem.setStyle("-fx-font: 14 arial ; -fx-base: #ffffff;");

        btnAutoSortByCostOfItem.setStyle("-fx-font: 14 arial ; -fx-base: #ffffff;");
        
        btnCreateNewOrder.setStyle("-fx-font: 14 arial ; -fx-base: #ffffff;");
        
        btnDeleteItem.setStyle("-fx-font: 14 arial ; -fx-base: #ffffff;");
        
        btnDisplayTheItemsListOfOrder.setStyle("-fx-font: 14 arial ; -fx-base: #ffffff;");
        
        btnExit.setStyle("-fx-font: 14 arial ; -fx-base: #ffffff;");
        
        btnShowBookContentTokens.setStyle("-fx-font: 14 arial ; -fx-base: #ffffff;");
    
        // Effect
        InnerShadow efInnerShadow = new InnerShadow();
        efInnerShadow.setColor(Color.DARKCYAN);
        efInnerShadow.setChoke(0.1f);

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
    
        
        // Root Pane
        BorderPane rootPane = new BorderPane();
        rootPane.setTop(toolBar);
        rootPane.setCenter(gifHelloView);
        rootPane.setBottom(bottomLabel);
        rootPane.setPrefSize(1015, 600);

        // Add item Layout
        Label label = new Label("Choose type of item: ");
        CheckBox boxDVD = new CheckBox("DVD");
        CheckBox boxCD = new CheckBox("CD");
        CheckBox boxBook = new CheckBox("Book");
        Button btnChoose = new Button("Submit");

        btnChoose.setOnAction(evt -> {
            String message = "You choose: ";
            if (boxDVD.isSelected()) {
                message += boxDVD.getText();
            }
            if(boxCD.isSelected()) {
                message += boxCD.getText();
            }
            if(boxBook.isSelected()) {
                message += boxBook.getText();
            }
            System.out.println(message);
        });

        HBox layoutH = new HBox(10);
        layoutH.getChildren().addAll(boxBook, boxDVD, boxCD);
        
        VBox layoutV = new VBox(10);
        layoutV.getChildren().addAll(label, layoutH, btnChoose);
        
        // Scene
        Scene rootScene = new Scene(rootPane, 1015, 600);
        Scene addItemScene = new Scene(layoutV, 1015, 600);

        
        // First scene
        primaryStage.setScene(rootScene);
        primaryStage.setTitle("Order GUI");
        primaryStage.show();


        // Event handle
        btnCreateNewOrder.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent evt) {
                btnCreateNewOrder.setEffect(efInnerShadow);
            }
        });

        btnCreateNewOrder.addEventHandler(MouseEvent.MOUSE_RELEASED, new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent evt) {
                btnCreateNewOrder.setEffect(null);
                //primaryStage.setScene(createNewOrderScene);
                //primaryStage.show();
            }
        });
        
        btnAddItem.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent evt) {
                btnAddItem.setEffect(efInnerShadow);
            }
        });

        btnAddItem.addEventHandler(MouseEvent.MOUSE_RELEASED, new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent evt) {
                btnAddItem.setEffect(null);
                primaryStage.setScene(addItemScene);
                primaryStage.setTitle("Add item layout");
                primaryStage.show();
            }
        });

        btnDeleteItem.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent evt) {
                btnDeleteItem.setEffect(efInnerShadow);
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
                btnDisplayTheItemsListOfOrder.setEffect(efInnerShadow);
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
                btnAutoSortByCostOfItem.setEffect(efInnerShadow);
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
                btnShowBookContentTokens.setEffect(efInnerShadow);
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
                btnExit.setEffect(efInnerShadow);
            }
        });

        btnExit.addEventHandler(MouseEvent.MOUSE_RELEASED, new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent evt) {
                btnExit.setEffect(null);
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("ALERT");
                alert.setHeaderText("DO YOU WANT TO EXIT?");
                alert.setContentText("Confirm");

                ButtonType buttonTypeYes = new ButtonType("Yes", ButtonData.YES);
                ButtonType buttonTypeNo = new ButtonType("No", ButtonData.NO);

                alert.getButtonTypes().setAll(buttonTypeYes, buttonTypeNo);

                Optional<ButtonType> result = alert.showAndWait();
                if (result.get() == buttonTypeYes) {
                    primaryStage.close();
                }
                else {
                    
                }
            }
        });


    }

    public static void main(String[] args) {
        launch(args);   
    }
}
