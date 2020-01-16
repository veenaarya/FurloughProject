Feature: Test spicejet website, and code commit



  @Login
  Scenario: User opens spicejet website
    Given User launches chrome browser
    When user opens registration page
    Then user closes browser
