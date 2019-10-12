package com.StepDefinitionclass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.NorwegianAirshuttleRepository.FligtSelectionPage;
import com.NorwegianAirshuttletResources.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionMain extends Base {
	 static  WebDriver driver;
	FligtSelectionPage fs=new FligtSelectionPage();
	@Given("User in Norwegian AirShuttle Flight selection page")
	public void user_in_Norwegian_AirShuttle_Flight_selection_page() {
		launchApplication("https://www.norwegian.com/us/");
	}

	@When("User enters the origin and Destination and clicks  the search button")
	public void user_enters_the_origin_and_Destination_and_clicks_the_search_button() throws Throwable {
	  filltheBox(fs.getOrigin(), getDataFromExcelSheet().get(1).get("Origin"));
	  filltheBox(fs.getDestination(), getDataFromExcelSheet().get(1).get("Destination"));
	 // btnClk(fs.getClick());
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  WebElement element1 = driver.findElement(By.xpath("//button[@id='searchButton']"));
	  js.executeScript("arguments[0].click()", element1);
	}
	
	@Then("User verifies the Flights")
	public void user_verifies_the_Flights() {
		String url = driver.getCurrentUrl();
		if(url.contains("farecalendar")) {
			System.out.println("success");
		}
		else {
			System.out.println("fail");
		}
	}



}
