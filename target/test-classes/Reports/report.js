$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/LoginPage.feature");
formatter.feature({
  "name": "Verifying Adactin detail",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verifying Adactin hotel login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on the adactin hotel",
  "keyword": "Given "
});
formatter.step({
  "name": "user should enter \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user should search hotel \"\u003clocation\u003e\"\"\u003chotels\u003e\"\"\u003croomtype\u003e\"\"\u003croomNos\u003e\"\"\u003cchechInDate\u003e\"\"\u003ccheckOutDate\u003e\"\"\u003cadultRoom\u003e\"\"\u003cchildRoom\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "user should select the hotel",
  "keyword": "Then "
});
formatter.step({
  "name": "user should book hotel \"\u003cfirstName\u003e\"\"\u003clastName\u003e\"\"\u003caddress\u003e\"\"\u003cccNumber\u003e\"\"\u003cccType\u003e\"\"\u003cccExpMonth\u003e\"\"\u003cccExpYear\u003e\"\"\u003cccCvv\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "user should confirm hotel by order id",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "location",
        "hotels",
        "roomtype",
        "roomNos",
        "chechInDate",
        "checkOutDate",
        "adultRoom",
        "childRoom",
        "firstName",
        "lastName",
        "address",
        "ccNumber",
        "ccType",
        "ccExpMonth",
        "ccExpYear",
        "ccCvv"
      ]
    },
    {
      "cells": [
        "barathaventator",
        "barathaventator",
        "Sydney",
        "Hotel Sunshine",
        "Double",
        "2 - Two",
        "17-12-2021",
        "18-12-2021",
        "2 - Two",
        "0 - None",
        "Barath",
        "Kumar",
        "No.22, Omr, Chennai.",
        "1234656712320980",
        "American Express",
        "January\t2022",
        "2022",
        "123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verifying Adactin hotel login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on the adactin hotel",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageStep.user_is_on_the_adactin_hotel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should enter \"barathaventator\" and \"barathaventator\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageStep.user_should_enter_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should search hotel \"Sydney\"\"Hotel Sunshine\"\"Double\"\"2 - Two\"\"17-12-2021\"\"18-12-2021\"\"2 - Two\"\"0 - None\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageStep.user_should_search_hotel(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should select the hotel",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageStep.user_should_select_the_hotel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should book hotel \"Barath\"\"Kumar\"\"No.22, Omr, Chennai.\"\"1234656712320980\"\"American Express\"\"January\t2022\"\"2022\"\"123\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageStep.user_should_book_hotel(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should confirm hotel by order id",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageStep.user_should_confirm_hotel_by_order_id()"
});
formatter.result({
  "status": "passed"
});
});