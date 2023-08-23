/*JavaFX class Always public*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;

public class JavaFXEx1 extends Application
{
	public void start(Stage ps) //override mathod of Application=>primary stage
	{
		Label l1=new Label("Hi Prince");
		Scene sn=new Scene(l1,200,200);
		ps.setScene(sn);
		ps.setTitle("LabelDemo");
		ps.show(); // direct show na thay main mathod ma launch(""); <= karvu pade
		
	}
	public static void main(String args[])
	{
		//launch(" ");
		launch(args);
	}
}