package popup.controller;

import popup.view.PopupViewer;
import java.util.List;
import java.util.ArrayList;
import popup.model.PopupThingy;

public class PopupController
{
	private PopupViewer display;
	private List<PopupThingy> thingyList;

	public PopupController()
	{
		display = new PopupViewer();
		thingyList = new ArrayList<PopupThingy>();
	}

	public void start()
	{

		// questionCheck("Username?", "Aaron Farr", "string");

		// questionCheck("Password?", "Aaron rules", "string");

		//questionCheck("Age?", "16", "int");
		learnLists();
	}

	public void questionCheck(String question, String correctAnswer, String answerType)
	{
		String userAnswer = display.collectResponse(question);
		
		if(userAnswer.equalsIgnoreCase("admin")){
			display.displayMessage("Hello, Aaron");
		}
		if(userAnswer.equalsIgnoreCase("Aaron sucks")){
			display.displayMessage("Hello Ammar");
		}
		if (answerType.equalsIgnoreCase("int")/* && isInteger(userAnswer) */)
		{
			int numberAnswer = Integer.parseInt(userAnswer);
			isInteger(userAnswer);

			if (numberAnswer == Integer.parseInt(correctAnswer))
			{
				display.displayMessage("This is true");
			}

			else if (numberAnswer != Integer.parseInt(correctAnswer))
			{
				display.displayMessage("You are Wrong");
				questionCheck(question, correctAnswer, answerType);
			}

		}
		else if (answerType.equalsIgnoreCase("double") && isDouble(userAnswer))
		{

			double numberAnswer = Double.parseDouble(display.collectResponse(question));

			if (numberAnswer == Double.parseDouble(correctAnswer))
			{
				display.displayMessage("This is true");
			}

			else if (numberAnswer != Double.parseDouble(correctAnswer))
			{
				display.displayMessage("You are Wrong");
				questionCheck(question, correctAnswer, answerType);
			}

		}
		else if (answerType.equalsIgnoreCase("int") && !isInteger(userAnswer) || answerType.equalsIgnoreCase("double") && !isDouble(userAnswer))
		{

			questionCheck(question, correctAnswer, answerType);
		}
		else
		{
			String aaronAwesome = display.collectResponse(question);

			if (aaronAwesome.equalsIgnoreCase(correctAnswer))
			{
				display.displayMessage("This is true");
			}

			else if (!aaronAwesome.equalsIgnoreCase(correctAnswer))
			{
				display.displayMessage("You are Wrong");
				questionCheck(question, correctAnswer, answerType);
			}

		}

	}

	private boolean isInteger(String input)
	{
		boolean isInt = false;

		try
		{
			int validInteger = Integer.parseInt(input);
			isInt = true;
		}
		catch (NumberFormatException error)
		{
			display.displayMessage("You did not enter a valid integer");
		}
		return isInt;

	}

	private boolean isDouble(String input)
	{
		boolean isDouble = false;

		try
		{
			Double validDouble = Double.parseDouble(input);
			isDouble = true;
		}
		catch (NumberFormatException error)
		{
			display.displayMessage("You did not enter a valid number");
		}
		return isDouble;

	}

	private void learnLists()
	{
		display.displayMessage(thingyList.size() + "is the size of the list");
		PopupThingy testThingy = new PopupThingy();
		thingyList.add(testThingy);
		display.displayMessage(thingyList.size() + "Is the size of the list");	
		testThingy.setWords("Aaron");
		
		PopupThingy loopThingy = new PopupThingy();
		
		for(int index = 0; index < 10; index ++){
			loopThingy.add("Hello" + index);
		}
		
		for(PopupThingy currentThingy : thingyList){
			display.displayMessage(loopThingy(CurrentThingy) + "is the iteration");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
