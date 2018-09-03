package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class calculatorController {
	@FXML
	private TextField txtNum1;

	@FXML
	private TextField txtNum2;

	@FXML
	private TextField txtNumR;

	@FXML
	private TextField txtDen1;

	@FXML
	private TextField txtDen2;

	@FXML
	private TextField txtDenR;

	@FXML
	private TextField operation;

	@FXML
	private Button btn7;

	@FXML
	private Button btn8;

	@FXML
	private Button btn9;

	@FXML
	private Button btnAdd;

	@FXML
	private Button btn4;

	@FXML
	private Button btn1;

	@FXML
	private Button btn0;

	@FXML
	private Button btnSim;

	@FXML
	private Button btnSq;

	@FXML
	private Button btn2;

	@FXML
	private Button btn5;

	@FXML
	private Button btn6;

	@FXML
	private Button btn3;

	@FXML
	private Button btnIn;

	@FXML
	private Button btnEq;

	@FXML
	private Button btnMul;

	@FXML
	private Button btnDiv;

	@FXML
	private Button btnSub;

	@FXML
	private Button btnClear;

	private MainApp mainApp;

	public calculatorController() {

	}

	@FXML
	void mouseClicked(MouseEvent event) {

		if ((TextField) event.getSource() == txtNum1) {
			txtNum1.setEditable(true);
			txtDen1.setEditable(false);
			txtNum2.setEditable(false);
			txtDen2.setEditable(false);
			operation.setEditable(false);

		}

		if ((TextField) event.getSource() == txtDen1) {
			txtNum1.setEditable(false);
			txtDen1.setEditable(true);
			txtNum2.setEditable(false);
			txtDen2.setEditable(false);
			operation.setEditable(false);
		}

		if ((TextField) event.getSource() == txtNum2) {
			txtNum1.setEditable(false);
			txtDen1.setEditable(false);
			txtNum2.setEditable(true);
			txtDen2.setEditable(false);
			operation.setEditable(false);
		}

		if ((TextField) event.getSource() == txtDen2) {
			txtNum1.setEditable(false);
			txtDen1.setEditable(false);
			txtNum2.setEditable(false);
			txtDen2.setEditable(true);
			operation.setEditable(false);
		}

		if ((TextField) event.getSource() == operation) {
			txtNum1.setEditable(false);
			txtDen1.setEditable(false);
			txtNum2.setEditable(false);
			txtDen2.setEditable(false);
			operation.setEditable(true);
		}

	}

	public void write(String date) {
		if (txtNum1.isEditable()) {
			txtNum1.setText(txtNum1.getText() + date);
		}
		if (txtDen1.isEditable()) {
			txtDen1.setText(txtDen1.getText() + date);
		}
		if (txtNum2.isEditable()) {
			txtNum2.setText(txtNum2.getText() + date);
		}
		if (txtDen2.isEditable()) {
			txtDen2.setText(txtDen2.getText() + date);
		}
		if (operation.isEditable()) {
			operation.setText(operation.getText() + date);
		}
	}

	@FXML
	void operation(ActionEvent event) {

		if ((Button) event.getSource() == btn0) {
			write(0 + "");
		}
		if ((Button) event.getSource() == btn1) {
			write(1 + "");
		}
		if ((Button) event.getSource() == btn2) {
			write(2 + "");
		}
		if ((Button) event.getSource() == btn3) {
			write(3 + "");
		}
		if ((Button) event.getSource() == btn4) {
			write(4 + "");
		}
		if ((Button) event.getSource() == btn5) {
			write(5 + "");
		}
		if ((Button) event.getSource() == btn6) {
			write(6 + "");
		}
		if ((Button) event.getSource() == btn7) {
			write(7 + "");
		}
		if ((Button) event.getSource() == btn8) {
			write(8 + "");
		}
		if ((Button) event.getSource() == btn9) {
			write(9 + "");
		}

	}

}
