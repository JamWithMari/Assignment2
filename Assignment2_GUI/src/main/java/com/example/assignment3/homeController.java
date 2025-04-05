package com.example.assignment3;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class homeController {
    @FXML
    private TextField timeInput;

    @FXML
    private TextField acitivityInput;

    @FXML
    private Button submit;

    @FXML
    private Label error;

    @FXML
    private GridPane grid;

    private int nextRow = 1;

    @FXML
    public void initialize() {
        submit.setOnAction(event -> handleSubmit());
    }

    private void handleSubmit() {
        // Trim the input to avoid unnecessary spaces
        String time = timeInput.getText().trim();
        String activity = acitivityInput.getText().trim();

        // Regex for hh:mm am/pm format
        String timeRegex = "(0?[1-9]|1[0-2]):[0-5][0-9] (am|pm)";

        // Clear feedback label at the start of validation
        error.setText("");

        // Validation logic
        if (time.isEmpty() || activity.isEmpty()) {
            error.setText("Both fields must be filled.");
        } else if (!time.matches(timeRegex)) {
            error.setText("Invalid time format! Use hh:mm am/pm (e.g., 09:30 am).");

        } else {
            // Add valid entries to the GridPane
            Label timeLabel = new Label(time);
            Label activityLabel = new Label(activity);

            grid.add(timeLabel, 0, nextRow); // Add time to column 0
            grid.add(activityLabel, 1, nextRow); // Add activity to column 1

            nextRow++; // Move to the next row

            timeInput.clear();
            acitivityInput.clear();
            error.setText("Entry added successfully!");
            error.setStyle("-fx-text-fill: green;");
        }
    }
}