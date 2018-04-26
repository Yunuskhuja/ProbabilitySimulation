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

public class Controller {

    @FXML
    private JFXTextField trianNum;

    @FXML
    private JFXTextField lastNum;

    @FXML
    private Label resultLabel;

    @FXML
    void CalculateBtn(ActionEvent event) {

        int n = Integer.parseInt(trianNum.getText());
        double lastDigits = Double.parseDouble(lastNum.getText());


        double p = (((lastDigits)%4)+1)/5;
        double q = 1 - p;
        int trial;
        int totalHeads = 0, totalTails = 0;

        System.out.println("prob = " + p);

        Random rand =  new Random();

        for (int i = 0; i<n; i++){
            trial = rand.nextInt(100);

            if(trial<(p*100)) {
                totalHeads++;
                System.out.println("1");
            }
            else {
                totalTails++;
                System.out.println("0");
            }

        }

        resultLabel.setText(" p= " + p + "\n q = "+ q + "\n Total number of heads = "+ totalHeads + "\n Total number of tails = " + totalTails);

    }
    @FXML
    void gotopart2(ActionEvent event) throws IOException {

        Parent blah = FXMLLoader.load(getClass().getResource("secondPart.fxml"));
        Scene scene = new Scene(blah);
        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.setScene(scene);
        appStage.show();


    }

}
