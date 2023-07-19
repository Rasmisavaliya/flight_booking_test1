$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("flightinfo.feature");
formatter.feature({
  "line": 1,
  "name": "Flight Availability",
  "description": "As a user\r\nI want to check if flights are available between any two destinations\r\nSo that I can plan my travel",
  "id": "flight-availability",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4442252900,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Check Flight Availability",
  "description": "",
  "id": "flight-availability;check-flight-availability",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@smoke"
    },
    {
      "line": 6,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I am on the flight search page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I search for flights from \"\u003corigin\u003e\" to \"\u003cdestination\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I should see available flights",
  "keyword": "Then "
});
formatter.match({
  "location": "FlightInfoSteps.iAmOnTheFlightSearchPage()"
});
formatter.result({
  "duration": 4809118800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003corigin\u003e",
      "offset": 27
    },
    {
      "val": "\u003cdestination\u003e",
      "offset": 41
    }
  ],
  "location": "FlightInfoSteps.iSearchForFlightsFromTo(String,String)"
});
formatter.result({
  "duration": 1764671600,
  "status": "passed"
});
formatter.match({
  "location": "FlightInfoSteps.iShouldSeeAvailableFlights()"
});
formatter.result({
  "duration": 56500,
  "status": "passed"
});
formatter.after({
  "duration": 88700,
  "status": "passed"
});
});