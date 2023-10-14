package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TimeController {
    public Label txtHours;
    public Label txtMinutes;
    public Label txtSecond;
    public TextField txtDays;


    public void OnActionConvertor(ActionEvent actionEvent) {
        int date=Integer.parseInt(txtDays.getText());
        int hours=date*24;
        int minutes=hours*60;
        int second=minutes*60;
        txtHours.setText(String.valueOf(hours));
        txtMinutes.setText(String.valueOf(minutes));
        txtSecond.setText(String.valueOf(second));
        txtDays.clear();
    }
}
