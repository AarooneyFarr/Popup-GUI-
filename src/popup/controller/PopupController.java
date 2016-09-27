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

		awesome("What is the password", "carl rulez");
		awesome("What is my name", "carl jenkins");

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
