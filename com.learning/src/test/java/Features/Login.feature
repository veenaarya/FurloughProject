Feature: Test code commit triggers Build in jenkins automatically

  @Login
  Scenario: User opens spicejet website
    Given User launches chrome browser
    When user opens registration page
    Then user closes browser
