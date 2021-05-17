$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Sadik/Desktop/Projects/CrickBuzz/src/main/java/features/Scenario4.feature");
formatter.feature({
  "line": 1,
  "name": "Validating CricBuzz WebPage",
  "description": "",
  "id": "validating-cricbuzz-webpage",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "CricBuzz LiveScorePage Test Scenario",
  "description": "",
  "id": "validating-cricbuzz-webpage;cricbuzz-livescorepage-test-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@LiveScoreTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "stakeholder get into the cricbuzz page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "stakeholder press the livescore module",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "stakeholder validate the livescore page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "stakeholder take the scorecard details",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "stakeholder leaves from cricbuzz",
  "keyword": "Then "
});
formatter.match({
  "location": "LiveStepDifinition.stakeholder_get_into_the_cricbuzz_page()"
});
formatter.result({
  "duration": 14381480500,
  "status": "passed"
});
formatter.match({
  "location": "LiveStepDifinition.stakeholder_press_the_livescore_module()"
});
formatter.result({
  "duration": 19624499700,
  "status": "passed"
});
formatter.match({
  "location": "LiveStepDifinition.stakeholder_validate_the_livescore_page()"
});
formatter.result({
  "duration": 46300,
  "status": "passed"
});
formatter.match({
  "location": "LiveStepDifinition.stakeholder_take_the_scorecard_details()"
});
formatter.result({
  "duration": 61792854500,
  "status": "passed"
});
formatter.match({
  "location": "LiveStepDifinition.stakeholder_leaves_from_cricbuzz()"
});
formatter.result({
  "duration": 1669146000,
  "status": "passed"
});
});