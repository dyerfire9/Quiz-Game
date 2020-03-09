/*
Abdul Mannan, Areeb, Shameer, Adshayan
May 20 2018
ICS3U1-07
Trivia Game Program
Game in which you answer questions and get a result
*/
import java.awt.*;
import hsa.Console;
import javax.imageio.*;
import java.io.*;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import java.io.InputStream;

public class TriviaProg
{
    static AudioStream audio;
    static char[] input = new char [10];
    static int count = 0;
    static char[] ans = {'b', 'a', 'c', 'a', 'a', 'b', 'c', 'd', 'a', 'b'};
    static Image pic2 = loadImage ("Pictures/1-10.jpg");
    static Image pic3 = loadImage ("Pictures/(2-3)-10.jpg");
    static Image pic4 = loadImage ("Pictures/4-10.jpg");
    static Image pic5 = loadImage ("Pictures/5-10.png");
    static Image pic6 = loadImage ("Pictures/6-10.jpg");
    static Image pic7 = loadImage ("Pictures/7-10.jpg");
    static Image pic8 = loadImage ("Pictures/(8-9)-10.jpg");
    static Image pic9 = loadImage ("Pictures/10-10.jpg");
    static Image pic10 = loadImage ("Pictures/10-10_2.jpg");
    static Image pic11 = loadImage ("Pictures/11-10.jpg");
    static Image pic12 = loadImage ("Pictures/Load.jpg");
    static Image pic13 = loadImage ("Pictures/Intra.png");

    public static void playSound (String source)
    {
	try
	{
	    InputStream in = new FileInputStream (source);
	    audio = new AudioStream (in);
	    AudioPlayer.player.start (audio);
	}
	catch (Exception e)
	{
	    e.printStackTrace ();
	}
    }


    public static void stopSound ()
    {
	AudioPlayer.player.stop (audio);
    }


    public static Image loadImage (String name)  //Loads image from file
    {
	Image img = null;
	try
	{
	    img = ImageIO.read (new File (name));
	}
	catch (IOException e)
	{
	}
	return img;
    }


    static Console c;
    public Image Pic1;
    //Method for the background Graphics
    public static void Background ()
    {
	//Loads background colour
	for (int i = 0 ; i < 245 ; i++)
	{
	    if (i <= 95)
		c.setColor (new Color (95 - i, 189 - i, 245 - i));
	    if (i > 95 && i <= 189)
		c.setColor (new Color (0, 189 - i, 245 - i));
	    if (i > 189)
		c.setColor (new Color (0, 0, 245 - i));

	    c.fillRect (0, 0, c.getWidth (), 62 - i * 4);
	}
	for (int i = 0 ; i < 245 ; i++)
	{
	    if (i <= 95)
		c.setColor (new Color (95 - i, 189 - i, 245 - i));
	    if (i > 95 && i <= 189)
		c.setColor (new Color (0, 189 - i, 245 - i));
	    if (i > 189)
		c.setColor (new Color (0, 0, 245 - i));

	    c.fillRect (0, 325, c.getWidth (), 300 - i * 4);
	}
	c.setColor (new Color (239, 55, 55));
	c.fillRoundRect (40 - 2, 335 - 2, 250 + 4, 70 + 4, 75, 75);
	c.setColor (new Color (132, 128, 128));
	c.fillRoundRect (40, 335, 250, 70, 75, 75);
	c.setColor (new Color (255, 255, 255));

	c.setColor (new Color (239, 55, 55));
	c.fillRoundRect (40 - 2, 420 - 2, 250 + 4, 70 + 4, 75, 75);
	c.setColor (new Color (132, 128, 128));
	c.fillRoundRect (40, 420, 250, 70, 75, 75);

	c.setColor (new Color (239, 55, 55));
	c.fillRoundRect (350 - 2, 420 - 2, 250 + 4, 70 + 4, 75, 75);
	c.setColor (new Color (132, 128, 128));
	c.fillRoundRect (350, 420, 250, 70, 75, 75);

	c.setColor (new Color (239, 55, 55));
	c.fillRoundRect (350 - 2, 335 - 2, 250 + 4, 70 + 4, 75, 75);
	c.setColor (new Color (132, 128, 128));
	c.fillRoundRect (350, 335, 250, 70, 75, 75);
	c.setColor (new Color (255, 255, 255));
	Font font4 = new Font ("Trebuchet MS", Font.PLAIN, 20);
	c.setFont (font4);
	c.drawString ("Choose The Correct Answer", 190, 25);
	c.setColor (new Color (239, 55, 55));
	c.drawString ("Choose one of the corresponding letters...", 125, 50);

	Font font5 = new Font ("Trebuchet MS", Font.PLAIN, 40);
	c.setFont (font5);
	c.setColor (new Color (255, 255, 255));
    }


    //Graphics control, displaying the questions and images Method
    public static void newQuestion (String imgSrc, String ans1, String ans2, String ans3, String ans4)
    {
	Background ();
	Image pic = loadImage (imgSrc);
	c.drawImage (pic, 150, 60, null);
	c.drawString (ans1, 90, 380);
	c.drawString (ans2, 90, 470);
	c.drawString (ans3, 400, 380);
	c.drawString (ans4, 400, 470);
	Font font6 = new Font ("Trebuchet MS", Font.PLAIN, 25);
	c.setFont (font6);
	input [count] = c.getChar ();
	count++;
	c.clear ();
    }


    //Sleep method
    public static void sleep (int millis)
    {
	try
	{
	    Thread.sleep (millis);
	}
	catch (Exception e)
	{

	}
    }


    //Loading Page Method
    public static void Loader ()
    {
	c.drawImage (pic12, 0, 0, null);

	c.setColor (new Color (255, 255, 255));
	Font font6 = new Font ("Trebuchet MS", Font.BOLD, 125);
	c.drawString ("Loading...", 490, 475);

	sleep (4500);
	c.clear ();
    }


    public static void Instra ()
    {


	for (int i = 0 ; i < 245 ; i++)
	{
	    if (i <= 95)
		c.setColor (new Color (95 - i, 189 - i, 245 - i));
	    if (i > 95 && i <= 189)
		c.setColor (new Color (0, 189 - i, 245 - i));
	    if (i > 189)
		c.setColor (new Color (0, 0, 245 - i));

	    c.fillRect (0, 0, c.getWidth (), 62 - i * 4);
	}
	for (int i = 0 ; i < 245 ; i++)
	{
	    if (i <= 95)
		c.setColor (new Color (95 - i, 189 - i, 245 - i));
	    if (i > 95 && i <= 189)
		c.setColor (new Color (0, 189 - i, 245 - i));
	    if (i > 189)
		c.setColor (new Color (0, 0, 245 - i));

	    c.fillRect (0, 400, c.getWidth (), 100 - i * 4);
	}

	c.setColor (new Color (255, 255, 255));
	Font font6 = new Font ("Trebuchet MS", Font.BOLD, 30);
	c.setFont (font6);
	c.drawString ("Instructions", 250, 40);


	Font font7 = new Font ("Trebuchet MS", Font.PLAIN, 20);
	c.setFont (font7);
	c.setColor (new Color (0, 0, 0));
	c.drawString ("You will be asked 10 questions", 10, 90);
	c.drawString ("and you are promped to answer.", 10, 120);
	c.drawString ("Use the keyboard to enter the correct answers", 10, 140);
	c.drawString ("Some answers are funny so be vigilent", 10, 160);
	c.drawString ("Please press any key to proceed", 100, 380);
	c.drawImage (pic13, 120, 50, null);
	c.getChar ();
	c.clear();

    }


    public static void main (String[] Args)
    {
	c = new Console ();

	//Sets the gradient background colour
	c.setColor (new Color (0, 0, 0));
	c.fillRect (0, 0, 1000, 1000);
	for (int i = 0 ; i < 245 ; i++)
	{
	    if (i <= 95)
		c.setColor (new Color (95 - i, 189 - i, 245 - i));
	    if (i > 95 && i <= 189)
		c.setColor (new Color (0, 189 - i, 245 - i));
	    if (i > 189)
		c.setColor (new Color (0, 0, 245 - i));
	    c.fillRect (0, 0, c.getWidth (), c.getHeight () - i * 4);
	}

	//Title Page
	c.setColor (Color.red);
	Font font1 = new Font ("Arial", Font.PLAIN, 25);
	c.setFont (font1);
	c.drawString ("Welcome The Trivia Program", 150, 50);
	c.setColor (Color.white);
	Font font2 = new Font ("Arial", Font.BOLD, 15);
	c.setFont (font2);
	c.drawString ("By: Abdul Mannan, Areeb, Shameer, Adshayan ", 154, 100);
	//System.out.println(c.getWidth()+" "+c.getHeight());

	//Loads image
	Image pic = loadImage ("Pictures/Triv.png"); //calling the loadimage method loading
	//specific image
	c.drawImage (pic, 75, 50, null);
	//Plays the background music
	playSound ("Sounds/Intro.wav");

	//Loads the start image
	Image pic0 = loadImage ("Pictures/Start.png");
	c.drawImage (pic0, 230, 410, null);
	c.getChar ();
	c.clear ();

	Instra ();


	//End of Graphics and Title Page
	newQuestion ("Pictures/Pic1.jpg", "A: Food", "B: Fresh", "C: Mint", "D: Smell");
	newQuestion ("Pictures/Pic2.jpg", "A: Time", "B: Age", "C: Control", "D: Balance");
	newQuestion ("Pictures/Pic3.jpg", "A: View", "B: Eye", "C: Privacy", "D: Spy");
	newQuestion ("Pictures/Pic4.jpg", "A: A Joke", "B: Games", "C: War", "D: FPS");
	newQuestion ("Pictures/Pic5.jpg", "A: Lies", "B: Falsity", "C: Lying", "D: Man");
	newQuestion ("Pictures/Pic6.jpg", "A: Trump", "B: Coinage", "C: Coins", "D: Rates");
	newQuestion ("Pictures/Pic7.jpg", "A: Speaker", "B: Beat", "C:Sound", "D: Earphone");
	newQuestion ("Pictures/Pic8.jpg", "A: Lock", "B: Number", "C: Virus", "D: Code");
	newQuestion ("Pictures/Pic9.jpg", "A: Fatigue", "B: Bed", "C: Drained", "D: Energy");
	newQuestion ("Pictures/Pic10.jpg", "A: Death", "B: Pain", "C: Broken", "D: Bang");
	//End of Questioning


	//Stops Intro music
	stopSound ();
	//Clears screen
	c.clear ();
	//Loads the method
	//Displays Loading screen
	Loader ();
	//Play sound Fortnite
	playSound ("Sounds/Done.wav");

	//Displays Results - Start
	c.setColor (new Color (51, 169, 210));
	Font font6 = new Font ("Trebuchet MS", Font.PLAIN, 20);
	c.drawString ("Your Answers", 50, 450);

	for (int i = 0 ; i < 10 ; i++)
	{
	    c.setCursor (24, 8 + i * 2);
	    c.print (input [i]);

	}
	c.drawString ("  ||    Correct Answers", 225, 450);

	for (int i = 0 ; i < 10 ; i++)
	{
	    c.setCursor (24, 40 + i * 2);
	    c.print (ans [i] + "  ");
	}
	int score = 0;
	for (int i = 0 ; i < 10 ; i++)
	{
	    if (input [i] == ans [i])
	    {
		score++;
	    }
	}
	int i = 10;
	c.setCursor (23, 70);
	c.println (score);
	c.setCursor (24, 70);
	c.println ("----");
	c.setCursor (25, 70);
	c.println (i);
	//Displays Results - End

	//Displays Image Based on results
	if (score == 1)
	{
	    //calling the loadimage method loading
	    //specific image
	    c.drawImage (pic2, 0, 0, null);
	}
	else if (score == 2 || score == 3)
	{
	    //calling the loadimage method loading
	    //specific image
	    c.drawImage (pic3, 0, 0, null);
	}

	else if (score == 4)
	{
	    //calling the loadimage method loading
	    //specific image
	    c.drawImage (pic4, 0, 0, null);
	}

	else if (score == 5)
	{
	    //calling the loadimage method loading
	    //specific image
	    c.drawImage (pic5, 0, 0, null);
	}

	else if (score == 6)
	{
	    //calling the loadimage method loading
	    //specific image
	    c.drawImage (pic6, 0, 0, null);
	}
	else if (score == 7)
	{
	    //calling the loadimage method loading
	    //specific image
	    c.drawImage (pic7, 0, 0, null);
	}
	else if (score == 8 || score == 9)
	{
	    //calling the loadimage method loading
	    //specific image
	    c.drawImage (pic8, 0, 0, null);
	}
	else if (score == 10)
	{
	    //calling the loadimage method loading
	    //specific image
	    for (int x = 0 ; x < 1000 ; x++)
	    {
		c.drawImage (pic9, 0, 0, null);
		sleep (50);
		c.drawImage (pic10, 0, 0, null);
		sleep (50);
	    }
	}
	//Displays this image for aanything else
	else
	{
	    c.drawImage (pic11, 0, 0, null);
	}

	//Makes boarder for Results
	for (int t = 0 ; t < 3 ; t++)
	{
	    c.setColor (new Color (107, 139, 150));
	    c.drawRect (0 + t, 400, 638 - t, 95 - t);

	    c.setColor (new Color (107, 139, 150));
	    c.drawRect (0, 401, 638 - t, 95 - t);
	}

    } //Main method
} //Class

