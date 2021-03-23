package view;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Region;

public class ChatViewController {
    @FXML
    private ListView messages;
    @FXML
    private TextField newMessage;
    private ViewHandler viewHandler;
    private Region root;
    private ViewHandler viewHandler;
    private ChatViewModel viewModel;

    public ChatViewController()
    {

    }

    public void init(ViewHandler viewHandler, ChatViewModel viewModel, Region root)
    {
        this.viewModel = viewModel;
        this.viewHandler = viewHandler;
        this.root = root;

        messages.itemsProperty().set(viewModel.getMessagesProperty());
        newMessage.textProperty().bindBidirectional(viewModel.getNewMessageProperty());
    }

    public Region getRoot()
    {
        return root;
    }

    @FXML private void onSend()
    {
        viewModel.sendMessage();
        newMessage.setText("");
    }
}
