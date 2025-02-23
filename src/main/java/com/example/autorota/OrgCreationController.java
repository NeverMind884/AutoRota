package com.example.autorota;

import javafx.collections.FXCollections;
import javafx.scene.control.ChoiceBox;

public class OrgCreationController {

    ChoiceBox cb = new ChoiceBox(FXCollections.observableArrayList(
            "06:00", "12:00", "15:00")
    );
}
