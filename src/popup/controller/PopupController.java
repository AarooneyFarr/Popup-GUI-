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

		awesome("Username?", "Aaron Farr");

		awesome("Password?", "Aaron rules");

	}

	public void awesome(String question, String acceptableAnswer)
	{
		String aaronAwesome = display.collectResponse(question);

		if (aaronAwesome.equalsIgnoreCase(acceptableAnswer))
		{
			display.displayMessage("This is true");
		}

		else if (!aaronAwesome.equalsIgnoreCase(acceptableAnswer))
		{
			display.displayMessage("You are Wrong");
			awesome(question, acceptableAnswer);
		}
		else
		{
			display.displayMessage("Error");
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
