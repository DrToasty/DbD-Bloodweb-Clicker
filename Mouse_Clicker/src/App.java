import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;
import java.awt.MouseInfo;
public class App {

    public static void getMouse()
	{
		int mouseY = MouseInfo.getPointerInfo().getLocation().y;
        int mouseX = MouseInfo.getPointerInfo().getLocation().x; 
		System.out.println( "Mouse clicked at: " + mouseX + " : " + mouseY );
	}
	public static void botClick(int x, int y) throws AWTException, InterruptedException
	{
		// Create instance of Robot Class
			Robot bot = new Robot();

			// Move the bot position to given coordinates
			bot.mouseMove( x, y );
            bot.mousePress( InputEvent.BUTTON1_MASK );
			bot.mouseRelease( InputEvent.BUTTON1_MASK );
            for (int i = 0; i < 52; i++)
            {
                bot.mousePress( InputEvent.BUTTON1_MASK );
                Thread.sleep(600);
			bot.mouseRelease( InputEvent.BUTTON1_MASK );
            Thread.sleep(7000);
            }
			// Press and Release the mouse to simulate click


			
	}
	public static void main(String[] args)throws AWTException, InterruptedException
    {

		getMouse();
        botClick(477,419);
        

	}    
}
