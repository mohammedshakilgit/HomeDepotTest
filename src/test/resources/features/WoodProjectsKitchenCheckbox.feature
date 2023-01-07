Feature: kitchen is clickable in the DIY Wood Projects

  Scenario: User able to visit the DIY Projects & Ideas page
    Given DIY Projects & Ideas page is open
    When click on DIY Wood Projects sub menu
    When Kitchen checkbox is checked by user
    Then the user can see Home Area: Kitchen message
