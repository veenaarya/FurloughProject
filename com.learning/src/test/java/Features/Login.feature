Feature: Test spicejet website, to check Jenkins and GitHub commit intergration



  @Login
  Scenario: User opens spicejet website
    Given User launches chrome browser
    When user opens registration page
    Then user closes browser
