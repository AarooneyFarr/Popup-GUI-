package popup.controller;

import popup.view.PopupViewer;

public class PopupController
{
	private PopupViewer display;

	public PopupController()
	{
		display = new PopupViewer();
	}

	public void start()
	{

		questionCheck("Username?", "Aaron Farr","string");

		questionCheck("Password?", "Aaron rules", "string");

	}

	public void questionCheck(String question, String correctAnswer, String answerType)
	{

		if (answerType.equalsIgnoreCase("int") && isInteger(correctAnswer))
		{
			int numberAnswer = Integer.parseInt(display.collectResponse(question));

			if (numberAnswer == Integer.parseInt(correctAnswer))
			{
				display.displayMessage("This is true");
			}

			else if (numberAnswer != Integer.parseInt(correctAnswer))
			{
				display.displayMessage("You are Wrong");
				questionCheck(question, correctAnswer, answerType);
			}
			else
			{
				display.displayMessage("Error");
			}
		}
		else if (answerType.equalsIgnoreCase("double") && isDouble(correctAnswer))
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
			else
			{
				display.displayMessage("Error");
			}
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
			else
			{
				display.displayMessage("Error");
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
		catch (NumberFormatException Error)
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
		catch (NumberFormatException Error)
		{
			display.displayMessage("You did not enter a valid number");
		}
		return isDouble;

	}

}
