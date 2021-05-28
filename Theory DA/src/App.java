import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.transform.Scale;
import javafx.scene.transform.Shear;
import javafx.scene.effect.BlurType;
import javafx.scene.effect.Shadow;
import javafx.animation.Animation;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.util.Duration;
 
public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Group g1 = new Group();
        Group g2 = new Group();

        // Main Kite Structure
        Polygon kite = new Polygon(100.0,100.0,  50.0,150.0,   100.0,250.0,   150.0,150.0);
        kite.setFill(Color.ROYALBLUE);
        Line l1 = new Line(100, 101, 100, 249);
        Line l2 = new Line(51,150,149,150);
        l1.setStrokeWidth(2.0);
        l2.setStrokeWidth(2.0);
        Line t1 = new Line(99,250,90,260);
        Line t2 = new Line(99,250,110,260);
        t1.setStrokeWidth(2.5);
        t2.setStrokeWidth(2.5);
        g1.getChildren().addAll(kite,l1,l2,t1,t2);

        // Making the shadow
        Polygon kiteshadow = new Polygon(200.0,200.0,  150.0,250.0,   200.0,350.0,   250.0,250.0);
        Line ls1 = new Line(200, 201, 200, 349);
        Line ls2 = new Line(151,250,249,250);
        ls1.setStrokeWidth(2.0);
        ls2.setStrokeWidth(2.0);
        Line ts1 = new Line(199,350,190,360);
        Line ts2 = new Line(199,350,210,360);
        ts1.setStrokeWidth(2.5);
        ts2.setStrokeWidth(2.5);
        g2.getChildren().addAll(kiteshadow,ls1,ls2,ts1,ts2);


        // Adding the shadow and the shearing to the kite-shadow
        Shear shear = new Shear(0.2,0,575,200);
        Shadow shadow = new Shadow(BlurType.GAUSSIAN, Color.BLACK, 8);
        Scale scale = new Scale(0.8,0.8,175,200);
        g2.setEffect(shadow);
        g2.getTransforms().addAll(shear, scale);
        g2.setOpacity(0.2);


        // Making the animation of the kite
        TranslateTransition transition1 = new TranslateTransition();
        transition1.setDuration(Duration.seconds(4));
        transition1.setToX(700);
        transition1.setToY(300);
        transition1.setCycleCount(Animation.INDEFINITE);
        transition1.setAutoReverse(true);
        transition1.setNode(g1);
        transition1.play();
        ScaleTransition scaleTransition1 = new ScaleTransition(Duration.seconds(4),g1);
        scaleTransition1.setToY(1.5);
        scaleTransition1.setToX(1.5);
        scaleTransition1.setCycleCount(Animation.INDEFINITE);
        scaleTransition1.setAutoReverse(true);
        scaleTransition1.play();
        RotateTransition rotateTransition1 = new RotateTransition(Duration.seconds(4), g1);
        rotateTransition1.setFromAngle(0);
        rotateTransition1.setToAngle(15);
        rotateTransition1.setCycleCount(Animation.INDEFINITE);
        rotateTransition1.setAutoReverse(true);
        rotateTransition1.play();

        // Making the animation of the shadow
        TranslateTransition transition2 = new TranslateTransition();
        transition2.setDuration(Duration.seconds(4));
        transition2.setToX(700);
        transition2.setToY(300);
        transition2.setCycleCount(Animation.INDEFINITE);
        transition2.setAutoReverse(true);
        transition2.setNode(g2);
        transition2.play();
        ScaleTransition scaleTransition2 = new ScaleTransition(Duration.seconds(4),g2);
        scaleTransition2.setToY(1.5);
        scaleTransition2.setToX(1.5);
        scaleTransition2.setCycleCount(Animation.INDEFINITE);
        scaleTransition2.setAutoReverse(true);
        scaleTransition2.play();

        RotateTransition rotateTransition2 = new RotateTransition(Duration.seconds(4), g2);
        rotateTransition2.setFromAngle(0);
        rotateTransition2.setToAngle(15);
        rotateTransition2.setCycleCount(Animation.INDEFINITE);
        rotateTransition2.setAutoReverse(true);
        rotateTransition2.play();


        // Setting up the stage and the scene
        Text text = new Text(15,25, "19BCT0215\nShaarang");
        text.setFont(new Font(20));
        root.getChildren().addAll(g1,g2, text);
        Scene scene = new Scene(root, 1200,700);
        primaryStage.setTitle("Flying Kite Animation");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}