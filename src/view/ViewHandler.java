package view;

import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.stage.Stage;
import viewmodel.ViewModelFactory;

public class ViewHandler {
    private Scene currentScene;
    private Stage primaryStage;
    private ViewModelFactory viewModelFactory;
    private LogViewController logViewController;
    private ChatViewController chatViewController;

    public ViewHandler(ViewModelFactory viewModelFactory)
    {
        this.viewModelFactory = viewModelFactory;
        currentScene = new Scene(new Region());
    }

    public void start(Stage primaryStage)
    {
        this.primaryStage = primaryStage;
    }

    public void openView(String window)
    {
        Region root = null;
        switch (window)
        {
            case "Log" : root = loadLogView("LogView.fxml");
                        break;
            case "Chat" : root = loadChatView("ChatView.fxml");
                        break;
        }
        currentScene.setRoot(root);
        String title = "";
        if(root.getUserData() != null)
        {
            title += root.getUserData();
        }
        primaryStage.setTitle(title);
        primaryStage.setScene(currentScene);
        primaryStage.setWidth(root.getPrefWidth());
        primaryStage.setHeight(root.getPrefHeight());
    }

    public Region loadLogView(String fxmlFile)
    {
        Region root = null;
        try {

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return root;
    }

    public Region loadChatView(String fxmlFile)
    {
        Region root = null;
        try {

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return root;
    }

}
