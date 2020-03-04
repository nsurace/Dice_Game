// 3/4/2020 Java Exam
 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TwoDieGUI extends JFrame implements ActionListener
{
	//Instance objects and variables for this class
	JLabel title = new JLabel("Two Dice");
	JLabel player1 = new JLabel("First die roll is a: ");
	JLabel player2 = new JLabel("Second die roll is a: ");
	JLabel die1 = new JLabel("");
	JLabel die2 = new JLabel("");
	JLabel gameResult = new JLabel("");
	JButton button = new JButton("Roll");

	//Constructor for the TwoDieGUI class
	public TwoDieGUI()
	{
		//use the JFrame Constructor to construct THIS object
		super("Dice Game GUI");
		setBounds(540, 250, 300, 250);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Color color1 = new Color(111, 95, 252);
		getContentPane().setBackground(color1);
		Font header = new Font("Impact", Font.BOLD, 40);
		Font p1 = new Font("Arial", Font.BOLD, 24);
		Font p2 = new Font("Arial", Font.BOLD, 24);
		Font res = new Font("Lucida Calligraphy", Font.BOLD, 20);
		
		//Set the layout for the GUI
		setLayout(new FlowLayout());

		//Add instance objects on to the frame
		add(title);
		add(player1);
		add(die1);
		add(player2);
		add(die2);
		add(gameResult);
		add(button);

		//Font and Style 
		title.setFont(header);
		title.setForeground(Color.white);
		player1.setFont(p1);
		player1.setForeground(Color.white);
		player2.setFont(p2);
		player2.setForeground(Color.white);
		die1.setFont(p1);
		die1.setForeground(Color.white);
		die2.setFont(p1);
		die2.setForeground(Color.white);
		gameResult.setFont(res);
		gameResult.setForeground(Color.white);

		//Add the event listener so the button can be clicked on
		button.addActionListener(this);

		setVisible(true);
	}


	//actionPerformed details what should happen when the button is clicked on
	@Override
	public void actionPerformed(ActionEvent e)
	{
		playGame();
	}

	//Method that handles the run of the game
	public void playGame()
	{
		// objects 
		Die firstDie = new Die();
		Die secondDie = new Die();
		
		// variables and constants
		int value1 = firstDie.getValue();
		int value2 = secondDie.getValue();
		String msg;
		
		// calculation phase
		if(value1 == value2)
		{
			msg = "The dice are a match!";
		}
		else
		{
			if(value1 > value2)
			{
				msg = "First die roll is greater!";
			}
			else
			{
				msg = "Second die roll is greater!";
			}
		}
		
		// output phase
		die1.setText(String.valueOf(value1));
		die2.setText(String.valueOf(value2));
		gameResult.setText(msg);
	}

	public static void main(String[] args)  //the main NEEDS to at least build one object from the class 
	{
		TwoDieGUI game1 = new TwoDieGUI();
	}
}