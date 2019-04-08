package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import Dev1.Dev1;
import Dev2.Dev2;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
        System.out.println("JDK: " + System.getProperty("java.runtime.version"));
        System.out.println("JRE: " + System.getProperty("java.version"));
        Dev1 dev1=new Dev1();
        Dev2 dev2=new Dev2();
        System.out.println(dev1.author);
        System.out.println(dev2.author);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
