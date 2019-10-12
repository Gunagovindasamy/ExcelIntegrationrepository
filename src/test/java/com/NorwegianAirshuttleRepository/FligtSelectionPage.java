package com.NorwegianAirshuttleRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.StepDefinitionclass.Hook;

public class FligtSelectionPage {
	
	public FligtSelectionPage() {
		PageFactory.initElements(Hook.driver, this);
	}
@FindBy(id="airport-select-origin")
private WebElement Origin;

@FindBy(id="airport-select-destination")
private WebElement Destination;




public WebElement getOrigin() {
	return Origin;
}

public WebElement getDestination() {
	return Destination;
}

}
