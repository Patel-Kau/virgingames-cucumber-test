$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("virgingames.feature");
formatter.feature({
  "line": 1,
  "name": "Virgin Games Test",
  "description": "As user I want to Play online slots at virgin games website",
  "id": "virgin-games-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4756882400,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User should navigate to virgin games web page successfully",
  "description": "",
  "id": "virgin-games-test;user-should-navigate-to-virgin-games-web-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User should on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User click on accept cookies",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User click on OnlineSlots at top menu",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User should navigate to OnlineSlots page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "VirginGames.userShouldOnHomepage()"
});
formatter.result({
  "duration": 168548400,
  "status": "passed"
});
formatter.match({
  "location": "VirginGames.userClickOnAcceptCookies()"
});
formatter.result({
  "duration": 166367200,
  "status": "passed"
});
formatter.match({
  "location": "VirginGames.userClickOnOnlineSlotsAtTopMenu()"
});
formatter.result({
  "duration": 128577400,
  "status": "passed"
});
formatter.match({
  "location": "VirginGames.userShouldNavigateToOnlineSlotsPageSuccessfully()"
});
formatter.result({
  "duration": 1097127100,
  "status": "passed"
});
formatter.after({
  "duration": 795077100,
  "status": "passed"
});
});