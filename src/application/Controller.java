package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

public class Controller {

	
	@FXML
	private Label myLabel;
	@FXML
	private DatePicker myDate;
	
	public void getDate(ActionEvent event) {
		LocalDate RealDate=myDate.getValue();
		String FormatedDate=RealDate.format(DateTimeFormatter.ofPattern("MMM-DD-yyy"));
		myLabel.setText(FormatedDate);
		System.out.println(RealDate);
	}
	
	
}
