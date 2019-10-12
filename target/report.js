$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Cucufeaturefolder/NorwegianAirShuttle.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Norwegian Airshuttle",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User in Norwegian AirShuttle Flight selection page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionMain.user_in_Norwegian_AirShuttle_Flight_selection_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the origin and Destination and clicks  the search button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitionMain.user_enters_the_origin_and_Destination_and_clicks_the_search_button()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat com.StepDefinitionclass.StepDefinitionMain.user_enters_the_origin_and_Destination_and_clicks_the_search_button(StepDefinitionMain.java:31)\r\n\tat ✽.User enters the origin and Destination and clicks  the search button(src/test/resources/Cucufeaturefolder/NorwegianAirShuttle.feature:9)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User verifies the Flights",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionMain.user_verifies_the_Flights()"
});
formatter.result({
  "status": "skipped"
});
});