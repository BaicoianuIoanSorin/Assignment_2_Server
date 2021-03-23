package view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Region;
import viewmodel.LogViewModel;

public class LogViewController {
    @FXML
    private TextField userName;
    @FXML
    private Label errorLabel;
    private ViewHandler viewHandler;
    private LogViewModel viewModel;
    private Region root;

    public LogViewController()
    {

    }

    public void init(ViewHandler viewHandler, LogViewModel viewModel, Region root)
    {
        /** ->>>To be added tomorrow - 24.03.2021 **/
    }

    public Region getRoot()
    {
        return root;
    }

    public void reset()
    {
        viewModel.reset();
    }
}
