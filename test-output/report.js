$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Dalia/SelJava/automationAssignment/src/main/java/net/anz/ui/feature/anz.feature");
formatter.feature({
  "line": 1,
  "name": "ANZ customer application test",
  "description": "",
  "id": "anz-customer-application-test",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user is on home page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user provides Your Detail",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user provides Your earnings",
  "rows": [
    {
      "cells": [
        "80000",
        "10000"
      ],
      "line": 9
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user provides Your Expences",
  "rows": [
    {
      "cells": [
        "500",
        "0",
        "100",
        "0",
        "10000"
      ],
      "line": 11
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.user_opens_browser()"
});
formatter.result({
  "duration": 10583025242,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_is_on_home_page()"
});
formatter.result({
  "duration": 18427666,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.User_provides_Your_Detail()"
});
formatter.result({
  "duration": 550389373,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_provides_Your_earnings(DataTable)"
});
formatter.result({
  "duration": 583141924,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_provides_Your_Expences(DataTable)"
});
formatter.result({
  "duration": 936593013,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Validate amount scenario",
  "description": "",
  "id": "anz-customer-application-test;validate-amount-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "Calculate button appears",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "user clicks on calculate button",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user validates borrow amount",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user closes browser",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.Calculate_button_appears()"
});
formatter.result({
  "duration": 40866278,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_clicks_on_calculate_button()"
});
formatter.result({
  "duration": 1161657620,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_validates_borrow_amount()"
});
formatter.result({
  "duration": 45226190,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_closes_browser()"
});
formatter.result({
  "duration": 1133728468,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user is on home page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user provides Your Detail",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user provides Your earnings",
  "rows": [
    {
      "cells": [
        "80000",
        "10000"
      ],
      "line": 9
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user provides Your Expences",
  "rows": [
    {
      "cells": [
        "500",
        "0",
        "100",
        "0",
        "10000"
      ],
      "line": 11
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.user_opens_browser()"
});
formatter.result({
  "duration": 8301766869,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_is_on_home_page()"
});
formatter.result({
  "duration": 25760810,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.User_provides_Your_Detail()"
});
formatter.result({
  "duration": 440608821,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_provides_Your_earnings(DataTable)"
});
formatter.result({
  "duration": 792330206,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_provides_Your_Expences(DataTable)"
});
formatter.result({
  "duration": 1152102654,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Validate start over scenario",
  "description": "",
  "id": "anz-customer-application-test;validate-start-over-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 22,
  "name": "user clicks on calculate button",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "user clicks on start over button",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "user validates empty form",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "browser closing",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.user_clicks_on_calculate_button()"
});
formatter.result({
  "duration": 1235546008,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_clicks_on_start_over_button()"
});
formatter.result({
  "duration": 232868801,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_validates_empty_form()"
});
formatter.result({
  "duration": 367079664,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.browser_closing()"
});
formatter.result({
  "duration": 1037491681,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user is on home page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user provides Your Detail",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user provides Your earnings",
  "rows": [
    {
      "cells": [
        "80000",
        "10000"
      ],
      "line": 9
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user provides Your Expences",
  "rows": [
    {
      "cells": [
        "500",
        "0",
        "100",
        "0",
        "10000"
      ],
      "line": 11
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.user_opens_browser()"
});
formatter.result({
  "duration": 7963474727,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_is_on_home_page()"
});
formatter.result({
  "duration": 19272531,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.User_provides_Your_Detail()"
});
formatter.result({
  "duration": 361536184,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_provides_Your_earnings(DataTable)"
});
formatter.result({
  "duration": 831544568,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_provides_Your_Expences(DataTable)"
});
formatter.result({
  "duration": 1154052758,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Validate error message scenario",
  "description": "",
  "id": "anz-customer-application-test;validate-error-message-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 30,
  "name": "user clicking on calculate button",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "user clicking on start over button",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "user provides only living expense as 1",
  "rows": [
    {
      "cells": [
        "1"
      ],
      "line": 33
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "user click on calculate button",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "user validates error message",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "browser closed",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.user_clicking_on_calculate_button()"
});
formatter.result({
  "duration": 194068229,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_clicking_on_start_over_button()"
});
formatter.result({
  "duration": 3280989356,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_provides_only_living_expense_as_1(DataTable)"
});
formatter.result({
  "duration": 99136553,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_click_on_calculate_button()"
});
formatter.result({
  "duration": 211089227,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_validates_error_message()"
});
formatter.result({
  "duration": 63880198,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.browser_closed()"
});
formatter.result({
  "duration": 1055508798,
  "status": "passed"
});
});