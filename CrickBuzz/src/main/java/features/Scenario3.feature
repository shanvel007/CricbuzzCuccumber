Feature: Validating CricBuzz WebPage

@SeriesTest
Scenario: CricBuzz NewZealandMatchPage Test Scenario

Given client step into the cricbuzz webpage
When  client hit the Newzealand team details
Then  client fetch the Newzealand team match detail
Then  client exit from cricbuzz