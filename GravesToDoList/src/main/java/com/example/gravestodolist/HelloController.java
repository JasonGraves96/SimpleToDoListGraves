package com.example.gravestodolist;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private ListView<String> ListOfThings;
    @FXML
    private TextField UserInput;


    public void onAddClick(ActionEvent actionEvent) {
        String item = UserInput.getText();  //Gets the user's text
        if (!item.isEmpty()) {//If the text field is NOT empty
            ListOfThings.getItems().add(item);  //Adds the text to the list
            UserInput.clear();  //Clears the text field
        }
    }//end Add button


    public void onRemoveClick(ActionEvent actionEvent) {
        String selectedItem = ListOfThings.getSelectionModel().getSelectedItem();  //Gets selected item
        if (selectedItem != null) {
            ListOfThings.getItems().remove(selectedItem);  //Removes selected item
        }
    }//end remove button
}
