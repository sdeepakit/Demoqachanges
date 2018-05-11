$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Demoqa.feature");
formatter.feature({
  "line": 2,
  "name": "Registration in Demoqa.com",
  "description": "",
  "id": "registration-in-demoqa.com",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 7,
  "name": "Verfing the all text boxes",
  "description": "",
  "id": "registration-in-demoqa.com;verfing-the-all-text-boxes",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@Textbox"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "the user in demoqa website",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "the user entering text in each and every text boxes",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "the user has to verifing the particular text is entered in text field or not",
  "keyword": "Then "
});
formatter.match({
  "location": "Registration.the_user_in_demoqa_website()"
});
formatter.result({
  "duration": 10172630614,
  "status": "passed"
});
formatter.match({
  "location": "Registration.the_user_entering_text_in_each_and_every_text_boxes()"
});
formatter.result({
  "duration": 1277972680,
  "status": "passed"
});
formatter.match({
  "location": "Registration.the_user_has_to_verifing_the_particular_text_is_entered_in_text_field_or_not()"
});
formatter.result({
  "duration": 208258213,
  "status": "passed"
});
});