Feature: Validating CricBuzz WebPage

@LiveScoreTest
Scenario: CricBuzz LiveScorePage Test Scenario

Given stakeholder get into the cricbuzz page
When  stakeholder press the livescore module
Then  stakeholder validate the livescore page
Then  stakeholder take the scorecard details
Then  stakeholder leaves from cricbuzz