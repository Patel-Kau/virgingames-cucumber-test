Feature: Virgin Games Test
  As user I want to Play online slots at virgin games website

  @smoke
  Scenario: User should navigate to virgin games web page successfully
    Given User should on homepage
    When  User click on accept cookies
    And   User click on OnlineSlots at top menu
    Then User should navigate to OnlineSlots page successfully
