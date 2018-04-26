package sample;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Random;

public class SecondPart {

    @FXML
    private JFXTextField trianNum;

    @FXML
    private JFXTextField lengthOfRoad;

    @FXML
    private Label resultLabel;

    @FXML
    void CalculateBtn(ActionEvent event) {

        int n = Integer.parseInt(trianNum.getText());
        int length = Integer.parseInt(lengthOfRoad.getText());
        double sumLength = 0;


        int X, Y;


        Random rand =  new Random();

        for(int i = 0; i < n; i++){
            X = rand.nextInt(length);
            Y = rand.nextInt(length);
            System.out.println("X = " + X);
            System.out.println("Y = " + Y);
            sumLength = sumLength + Math.abs(X - Y);

        }

        double averageDistance = sumLength/n;


        resultLabel.setText("Average distance is " + averageDistance);

    }

    @FXML
    void gotopart1(ActionEvent event) throws IOException {

        Parent blah = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene scene = new Scene(blah);
        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.setScene(scene);
        appStage.show();


    }

}