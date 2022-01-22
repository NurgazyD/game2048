import domain.Controller;
import domain.Direction;
import view.MainFrame;
//import mause.MainFrame;

public class Main {
    public static void main(String[] args) {

       // MainFrame mainFrame = new MainFrame();




        Controller controller = new Controller();
        controller.doAction(Direction.MOVE_UP);
        controller.doAction(Direction.PRINT);

        System.out.println();

        controller.doAction(Direction.MOVE_LEFT);
        controller.doAction(Direction.PRINT);


    }
}
