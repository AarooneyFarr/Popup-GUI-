package popup.controller;

import popup.view.PopupViewer;

public class PopupController
{
	private PopupViewer display;

	public PopupController(){
		display = new PopupViewer();
	}
	
	public void start()
	{
		
		awesome();
		
		
	}
	
	public void awesome(){
		String aaronAwesome = display.collectResponse("Is Aaron awesome?");
		if(aaronAwesome.equalsIgnoreCase("yes")){
			display.displayMessage("This is true");
		}
		else{
			display.displayMessage("You are Wrong");
			awesome();
		}
		
	}
}
