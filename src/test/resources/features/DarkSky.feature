@web

  Feature: DarkSky page feature

    Background:
      Given I am on DarkSky home page

      @homePage
      Scenario: Verify max and min temperature
        When I click on navigation button on home page screen
        And I click on today temperature button
        Then Verify min and max temperature





