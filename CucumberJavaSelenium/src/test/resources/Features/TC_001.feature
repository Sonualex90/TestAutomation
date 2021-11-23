Feature: feature to test Ergo.com smoke test

  Scenario: Check the Ergo.com Urls are loading successfully or not
    Given User open the browser 
    When Hit the  the url
    And Check url redirection is happening
    Then navigate to Ergo.com home page and validate
