$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("DarkSky.feature");
formatter.feature({
  "line": 3,
  "name": "DarkSky page feature",
  "description": "",
  "id": "darksky-page-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@web"
    }
  ]
});
formatter.before({
  "duration": 3872763735,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I am on DarkSky home page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSD.IamOnHomePage()"
});
formatter.result({
  "duration": 316648412,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Verify max and min temperature",
  "description": "",
  "id": "darksky-page-feature;verify-max-and-min-temperature",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@homePage"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I click on navigation button on home page screen",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I click on today temperature button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Verify min and max temperature",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSD.clickNavButton()"
});
formatter.result({
  "duration": 7246559745,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSD.clickTodayButton()"
});
formatter.result({
  "duration": 29236677,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSD.verifyMaxAndMin()"
});
formatter.result({
  "duration": 3179587588,
  "status": "passed"
});
formatter.after({
  "duration": 928831,
  "status": "passed"
});
});