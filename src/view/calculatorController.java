package view;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import model.calculator;

public class calculatorController implements Initializable {
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

	private calculator calculator;

	@FXML
	void mouseClicked(MouseEvent event) {
		btn0.setDisable(false);
		btn1.setDisable(false);
		btn2.setDisable(false);
		btn3.setDisable(false);
		btn4.setDisable(false);
		btn5.setDisable(false);
		btn6.setDisable(false);
		btn7.setDisable(false);
		btn8.setDisable(false);
		btn9.setDisable(false);

		if ((TextField) event.getSource() == txtNum1) {
			txtNum1.setEditable(true);
			txtDen1.setEditable(false);
			txtNum2.setEditable(false);
			txtDen2.setEditable(false);
			operation.setEditable(false);

			btnAdd.setDisable(true);
			btnSub.setDisable(true);
			btnDiv.setDisable(true);
			btnMul.setDisable(true);
			btnIn.setDisable(true);
			btnSim.setDisable(true);
			btnSq.setDisable(true);

		}

		if ((TextField) event.getSource() == txtDen1) {
			txtNum1.setEditable(false);
			txtDen1.setEditable(true);
			txtNum2.setEditable(false);
			txtDen2.setEditable(false);
			operation.setEditable(false);

			btnAdd.setDisable(true);
			btnSub.setDisable(true);
			btnDiv.setDisable(true);
			btnMul.setDisable(true);
			btnIn.setDisable(true);
			btnSim.setDisable(true);
			btnSq.setDisable(true);
		}

		if ((TextField) event.getSource() == txtNum2) {

			if (operation.getText().equals("*") || operation.getText().equals("/") || operation.getText().equals("+")
					|| operation.getText().equals("-")) {
				txtNum1.setEditable(false);
				txtDen1.setEditable(false);
				txtNum2.setEditable(true);
				txtDen2.setEditable(false);
				operation.setEditable(false);
			} else {
				txtNum1.setEditable(false);
				txtDen1.setEditable(false);
				txtNum2.setEditable(false);
				txtDen2.setEditable(false);
				operation.setEditable(false);
			}

			btnAdd.setDisable(true);
			btnSub.setDisable(true);
			btnDiv.setDisable(true);
			btnMul.setDisable(true);
			btnIn.setDisable(true);
			btnSim.setDisable(true);
			btnSq.setDisable(true);
		}

		if ((TextField) event.getSource() == txtDen2) {
			if (operation.getText().equals("*") || operation.getText().equals("/") || operation.getText().equals("+")
					|| operation.getText().equals("-")) {
				txtNum1.setEditable(false);
				txtDen1.setEditable(false);
				txtNum2.setEditable(false);
				txtDen2.setEditable(true);
				operation.setEditable(false);
			} else {
				txtNum1.setEditable(false);
				txtDen1.setEditable(false);
				txtNum2.setEditable(false);
				txtDen2.setEditable(false);
				operation.setEditable(false);
			}

			btnAdd.setDisable(true);
			btnSub.setDisable(true);
			btnDiv.setDisable(true);
			btnMul.setDisable(true);
			btnIn.setDisable(true);
			btnSim.setDisable(true);
			btnSq.setDisable(true);
		}

		if ((TextField) event.getSource() == operation) {

			btnAdd.setDisable(false);
			btnSub.setDisable(false);
			btnDiv.setDisable(false);
			btnMul.setDisable(false);

			btnIn.setDisable(false);
			btnSim.setDisable(false);
			btnSq.setDisable(false);

			txtNum1.setEditable(false);
			txtDen1.setEditable(false);
			txtNum2.setEditable(false);
			txtDen2.setEditable(false);
			operation.setEditable(true);

			btn0.setDisable(true);
			btn1.setDisable(true);
			btn2.setDisable(true);
			btn3.setDisable(true);
			btn4.setDisable(true);
			btn5.setDisable(true);
			btn6.setDisable(true);
			btn7.setDisable(true);
			btn8.setDisable(true);
			btn9.setDisable(true);

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
		if ((Button) event.getSource() == btnAdd) {
			write("+");
		}
		if ((Button) event.getSource() == btnSub) {
			write("-");
		}
		if ((Button) event.getSource() == btnDiv) {
			write("÷");
		}
		if ((Button) event.getSource() == btnMul) {
			write("x");
		}
		if ((Button) event.getSource() == btnIn) {
			write("x⁻¹");
		}
		if ((Button) event.getSource() == btnSq) {
			write("x²");
		}
		if ((Button) event.getSource() == btnSim) {
			write("sim");
		}
		if ((Button) event.getSource() == btnEq) {

			if (operation.getText().equals("+")) {

				calculator.add(Long.parseLong(txtNum1.getText()), Long.parseLong(txtDen1.getText()),
						Long.parseLong(txtNum2.getText()), Long.parseLong(txtDen2.getText()));
				txtNumR.setText(calculator.getNumber1().getNumerator() + "");
				txtDenR.setText(calculator.getNumber1().getDenominator() + "");
			}

			if (operation.getText().equals("-")) {
				calculator.substract(Long.parseLong(txtNum1.getText()), Long.parseLong(txtDen1.getText()),
						Long.parseLong(txtNum2.getText()), Long.parseLong(txtDen2.getText()));
				txtNumR.setText(calculator.getNumber1().getNumerator() + "");
				txtDenR.setText(calculator.getNumber1().getDenominator() + "");
			}
			if (operation.getText().equals("x")) {
				calculator.multiply(Long.parseLong(txtNum1.getText()), Long.parseLong(txtDen1.getText()),
						Long.parseLong(txtNum2.getText()), Long.parseLong(txtDen2.getText()));
				txtNumR.setText(calculator.getNumber1().getNumerator() + "");
				txtDenR.setText(calculator.getNumber1().getDenominator() + "");
			}
			if (operation.getText().equals("/")) {
				calculator.divide(Long.parseLong(txtNum1.getText()), Long.parseLong(txtDen1.getText()),
						Long.parseLong(txtNum2.getText()), Long.parseLong(txtDen2.getText()));
				txtNumR.setText(calculator.getNumber1().getNumerator() + "");
				txtDenR.setText(calculator.getNumber1().getDenominator() + "");
			}
			if (operation.getText().equals("x⁻¹")) {
				calculator.Inverse(Long.parseLong(txtNum1.getText()), Long.parseLong(txtDen1.getText()));
				txtNumR.setText(calculator.getNumber1().getNumerator() + "");
				txtDenR.setText(calculator.getNumber1().getDenominator() + "");
			}
			if (operation.getText().equals("x²")) {
				calculator.squared(Long.parseLong(txtNum1.getText()), Long.parseLong(txtDen1.getText()));
				txtNumR.setText(calculator.getNumber1().getNumerator() + "");
				txtDenR.setText(calculator.getNumber1().getDenominator() + "");
			}
		}
		if ((Button) event.getSource() == btnClear) {
			txtNum1.clear();
			txtDen1.clear();
			txtNum2.clear();
			txtDen2.clear();
			txtNumR.clear();
			txtDenR.clear();
			operation.clear();
		}
	}

	@FXML
	void number(ActionEvent event) {

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

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		this.calculator = new calculator();

	}

}
