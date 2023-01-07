Feature: DIY Projects & Ideas page video can be closed

  Scenario: User able to close the video player by clicking the browser back button
    Given the video player is playing a video in the DIY Projects & Ideas page
    When Click on the browser back button
    Then the video player closes
