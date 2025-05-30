package pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class doctor_Pages extends StartupPage {

//	Write all the required Locators here.
	
	String pageName = this.getClass().getSimpleName();
	public doctor_Pages(WebDriver driver) {
		super(driver);
	}

	/**
	 * @Test 1.1
	 * This method logs into the Health App using the provided valid credentials.
	 *
	 * @param expectedData A map containing user credentials with keys "username" and "password".
	 * @return true if the Doctor tab is displayed after successful login; false otherwise.
	 * @throws Exception if any step in the login process fails.
	 *
	 * Steps performed:
	 * - Locate and highlight the username textbox, then enter the username.
	 * - Locate and highlight the password textbox, then enter the password.
	 * - Locate and highlight the sign-in button, then click it.
	 * - Verify if the Doctor tab is displayed after login.
	 *
	 * Author: YAKSHA
	 */
	public boolean loginToHealthAppByGivenValidCredetial(Map<String, String> expectedData) throws Exception {
		// write your logic here
		return false;
	}

	/**
	 * @Test 1.2
	 * This method retrieves and returns the title of the current web page.
	 *
	 * @param none
	 * @return The title of the current page as a String.
	 * @throws Exception if retrieving the page title fails.
	 *
	 * Steps performed:
	 * - Fetch the title of the current web page using the commonEvents utility.
	 * - Print the title to the console.
	 *
	 * Author: Yaksha
	 */
	public String verifyTitleOfThePage() throws Exception {
		// write your logic here
		return null;
	}

	/**
	 * @Test 1.3
	 * This method retrieves and returns the current URL of the web page.
	 * @param none
	 * @return The current URL of the page as a String.
	 * @throws Exception if retrieving the URL fails.
	 *
	 * Steps performed:
	 * - Fetch the current URL using the commonEvents utility.
	 * - Print the URL to the console.
	 *
	 * Author: Yaksha
	 */
	public String verifyURLOfThePage() throws Exception {
		// write your logic here
		return null;
	}

	/**
	 * @Test 2
	 * This method verifies the presence of the Doctor module and its submodules,
	 * then clicks on the toggle to expand and check all submodule visibility.
	 *
	 * @param none
	 * @return true if the Doctor tab and all its submodules (Outpatient, Inpatient Department,
	 *         and Patient Record) are displayed; false otherwise.
	 * @throws Exception if any element is not found or an action fails.
	 *
	 * Steps performed:
	 * - Check if the Doctor tab is displayed.
	 * - If present, click on the toggle to expand the Doctor module.
	 * - Verify the presence of all submodules under the Doctor module.
	 * 
	 * Author: Yaksha
	 */
	public Boolean verifyAllSubModulesArePresentAndClickOnDispensary() throws Exception {
		// write your logic here
		return false;
	}

	/**
	 * @Test3
	 * This method selects the "Show Doctor Wise Patient List" checkbox under the 
	 * Doctor Module's "Out Patient" submodule, verifies if it is selected, 
	 * and then unchecks it.
	 *
	 * @param none
	 * @return true if the checkbox is found, selected, and successfully unchecked; false otherwise.
	 * @throws Exception if any interaction with the checkbox fails.
	 *
	 * Steps performed:
	 * - Verify the "Show Doctor Wise Patient List" checkbox is displayed.
	 * - Click to check the checkbox.
	 * - Validate whether the checkbox is selected.
	 * - Click again to uncheck the checkbox.
	 *
	 * Author: Yaksha
	 */
	public Boolean tickOnCheckBoxValidateTheCheckBoxThenUntick() throws Exception {
		// write your logic here
		return false;
	}

	/**
	 * @Test4
	 * This method selects the department (e.g., "NEUROSURGERY") from the Department dropdown 
	 * in the In-Patient Department submodule, using the value provided in the JSON data.
	 *
	 * @param expectedData A map containing the expected department name with key "departmentName".
	 * @return The name of the selected option from the dropdown.
	 * @throws Exception if the dropdown interaction or selection verification fails.
	 *
	 * Steps performed:
	 * - Click on the In-Patient Department submodule.
	 * - Select the department from the dropdown using the visible text from expectedData.
	 * - Retrieve and return the currently selected option to verify the selection.
	 *
	 * Author: YAKSHA
	 */
	public String selectNEUROSURGERYFromDepartmentDropdownAndVerifySelection(Map<String, String> expectedData) throws Exception {
		// write your logic here
		return null;
	}

	/**
	 * @Test5
	 * This method verifies the presence of the "My Favorites" and "Pending List" buttons
	 * on the "In Patient Department" page under the Doctor Module.
	 *
	 * @param none
	 * @return true if both "My Favorites" and "Pending List" buttons are displayed; false otherwise.
	 * @throws Exception if element visibility checks fail.
	 *
	 * Steps performed:
	 * - Check if the "My Favorites" button is displayed.
	 * - Check if the "Pending List" button is displayed.
	 * - Return true if both are present; otherwise, return false.
	 *
	 * Author: Yaksha
	 */
	public Boolean verifyMyFavoritesAndPendingListButtonsArePresent() throws Exception {
		// write your logic here
		return false;
	}
	
	/**
	 * @Test6
	 * This method validates the title of the "Free Text Template" form in the 
	 * "In Patient Department" submodule under the Doctor Module.
	 *
	 * @param none
	 * @return The title text of the "Free Text Template" form as a String.
	 * @throws Exception if any step in the navigation or title retrieval fails.
	 *
	 * Steps performed:
	 * - Click on the "Pending List" button to display pending table records.
	 * - Click on "Show Details" of the first table record.
	 * - Retrieve and return the title of the form.
	 *
	 * Author: Yaksha
	 */
	public String validateTheTitleNameOfTheFreeTextTemplateForm() throws Exception {
		// write your logic here
		return null;
	}
	
	/**
	 * @Test7
	 * This method retrieves and validates the doctor's name for a specific hospital number
	 * in the "In Patient Department" submodule under the Doctor Module.
	 *
	 * @param none
	 * @return The doctor's name as a String.
	 * @throws Exception if any step fails while closing the Free Text Template, navigating to the Pending List, or fetching the doctor's name.
	 *
	 * Steps performed:
	 * - Close the popup form by clicking the 'X' button.
	 * - Click on the "Pending List" button to open the patient table.
	 * - Retrieve the doctor's name for the patient with Hospital Number "2312000010".
	 *
	 * Author: Yaksha
	 */
	public String validateTheDoctorName() throws Exception {
		// write your logic here
		return null;
	}
	
	/**
	 * @Test8
	 * This method validates the error message displayed in the "Search Problem*" field
	 * when attempting to submit an empty "Add Surgical History" form for the profile "Sonia Gandhi".
	 *
	 * @param none
	 * @return The error message shown in the "Search Problem*" field.
	 * @throws Exception if any interaction fails while navigating to the form or retrieving the message.
	 *
	 * Steps performed:
	 * - Open the any profile  using the preview icon.
	 * - Navigate to the "Problem" module and select the "Surgical History" tab.
	 * - Click the "+Add New" button to open the "Add Surgical History" form.
	 * - Click the "Add" button without entering any data.
	 * - Capture and return the error message displayed in the "Search Problem*" field 
	 *    (expected: "Select ICD-11 Code").
	 *
	 * Author: Yaksha
	 */
	public String verifyTheErrorMessageInSearchProblemField() throws Exception {
		// write your logic here
		return null;
	}
	
	/**@Test9
	 * about this method performScrollingOpertaionAndVerifyTheSaveButtonIsPresent() 
	 * @param : null
	 * @description : Scroll to the "Discharge Summary" Module which is present in the left navigation.
                      Click on "Discharge Summary" and it will navigate to the "DischargeSummary" page.
                      Then scroll to the bottom of the page and verify that the "Update" button is present or not.
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public Boolean performScrollingOpertaionAndVerifyTheUpdateButtonIsPresent() throws Exception {
			
		return false;
	}
}
