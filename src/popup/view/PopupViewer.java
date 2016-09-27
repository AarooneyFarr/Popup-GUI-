package popup.view;

import javax.swing.JOptionPane;

/**
 * Popup Viewer class
 * @author Aaron Farr
 * @version September 27,2016
 */
public class PopupViewer
{

	/**
	 * Makes a popup window to display the supplied message.
	 * 
	 * @param message
	 *            The message to be displayed in the popup.
	 */
	public void displayMessage(String message)
	{
		JOptionPane.showMessageDialog(null, message);

	}

	/**
	 * Makes a popup window to ask a question and return a response.
	 * 
	 * @param question
	 *            The question that will be asked
	 * @return Returns the response of the user.
	 */
	public String collectResponse(String question)
	{
		String response = "";
		response = JOptionPane.showInputDialog(null, question);

		return response;
	}

		
     /** Makes a yes or no popup window
	 * 
	 * @param question
	 *            The question to be asked
	 * @return The constant value from JOptionPane of y/n/c
	 */
	public int collectOption(String question)
	{
		int response = 0;

		response = JOptionPane.showConfirmDialog(null, question);

		return response;
	}

	
	
	
	
	
	
	
	
}
