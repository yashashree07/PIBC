$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/PaymentFlowFeatures/TC14-InwardPaymentFlow.feature");
formatter.feature({
  "name": "Inward Payment flow feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Inward Payment flow",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TC_14_02_PositiveInwardFlow"
    }
  ]
});
formatter.step({
  "name": "User is into the system",
  "keyword": "Given "
});
formatter.step({
  "name": "user validate whether payment move to QueuedToAccountVerification status using \"\u003cValueDateperiod\u003e\",\"\u003cPaymentType\u003e\",\"\u003cReference\u003e\",\"\u003cSubRef\u003e\",\"\u003cChequeNo\u003e\",\"\u003cAccountNumber\u003e\",\"\u003cgpkey\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user validate whether payment move to QueuedToInitialPosting status using \"\u003cValueDateperiod\u003e\",\"\u003cPaymentType\u003e\",\"\u003cReference\u003e\",\"\u003cSubRef\u003e\",\"\u003cChequeNo\u003e\",\"\u003cAccountNumber\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "user validate whether payment move to SignatureCheck status using \"\u003cValueDateperiod\u003e\",\"\u003cPaymentType\u003e\",\"\u003cReference\u003e\",\"\u003cSubRef\u003e\",\"\u003cChequeNo\u003e\",\"\u003cAccountNumber\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "user validate whether payment move to SignatureCheckApprove using \"\u003cValueDateperiod\u003e\",\"\u003cPaymentType\u003e\",\"\u003cReference\u003e\",\"\u003cSubRef\u003e\",\"\u003cChequeNo\u003e\",\"\u003cAccountNumber\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "user validate whether payment move to PendingSettlement using \"\u003cValueDateperiod\u003e\",\"\u003cPaymentType\u003e\",\"\u003cReference\u003e\",\"\u003cSubRef\u003e\",\"\u003cChequeNo\u003e\",\"\u003cAccountNumber\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "ValueDateperiod",
        "PaymentType",
        "Reference",
        "SubRef",
        "ChequeNo",
        "AccountNumber"
      ]
    },
    {
      "cells": [
        "",
        "ACH CHEQUE RECEIVE",
        "Cheque No",
        "EQUAL",
        "30001161",
        ""
      ]
    }
  ]
});
formatter.scenario({
  "name": "Inward Payment flow",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TC_14_02_PositiveInwardFlow"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is into the system",
  "keyword": "Given "
});
formatter.match({
  "location": "InwardPaymentFlowStepDefinition.user_is_into_the_system()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "user validate whether payment move to QueuedToAccountVerification status using \"\",\"ACH CHEQUE RECEIVE\",\"Cheque No\",\"EQUAL\",\"30001161\",\"\",\"\u003cgpkey\u003e\"",
  "keyword": "And "
});
formatter.match({
  "location": "InwardPaymentFlowStepDefinition.validate_whether_payment_move_to_QueuedToAccountVerification_status_using(String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "user validate whether payment move to QueuedToInitialPosting status using \"\",\"ACH CHEQUE RECEIVE\",\"Cheque No\",\"EQUAL\",\"30001161\",\"\"",
  "keyword": "Then "
});
formatter.match({
  "location": "InwardPaymentFlowStepDefinition.validate_whether_payment_move_to_QueuedToInitialPosting_status_using(String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "user validate whether payment move to SignatureCheck status using \"\",\"ACH CHEQUE RECEIVE\",\"Cheque No\",\"EQUAL\",\"30001161\",\"\"",
  "keyword": "Then "
});
formatter.match({
  "location": "InwardPaymentFlowStepDefinition.validate_whether_payment_move_to_SignatureCheck_status_using(String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "user validate whether payment move to SignatureCheckApprove using \"\",\"ACH CHEQUE RECEIVE\",\"Cheque No\",\"EQUAL\",\"30001161\",\"\"",
  "keyword": "Then "
});
formatter.match({
  "location": "InwardPaymentFlowStepDefinition.validate_whether_payment_move_to_SignatureCheckApprove_using(String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "user validate whether payment move to PendingSettlement using \"\",\"ACH CHEQUE RECEIVE\",\"Cheque No\",\"EQUAL\",\"30001161\",\"\"",
  "keyword": "Then "
});
formatter.match({
  "location": "InwardPaymentFlowStepDefinition.validate_whether_payment_move_to_PendingSettlement_using(String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});