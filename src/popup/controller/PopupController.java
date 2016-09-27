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
		
			
	 if(aaronAwesome.equalsIgnoreCase(acceptableAnswer)){
			display.displayMessage("This is true");
		}
		
		else if(!aaronAwesome.equalsIgnoreCase(acceptableAnswer))
		{
			display.displayMessage("You are Wrong");
			awesome(question,acceptableAnswer);
		}
	}
	
}
