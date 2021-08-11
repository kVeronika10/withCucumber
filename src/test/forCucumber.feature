Feature: I want to test authorisation

  Scenario Outline: I want to login with correct credentials
    Given I go to main page
    When I login as <login> with password <password>
    Then I have been successfully logged
    Examples:
      | login   | password |
      | "admin" | "admin"  |

#  Scenario Outline: I want to login with wrong credentials
#    Given I go to main page
#    And I login as "<login>" with password "<password>"
#    Then I have not been successfully logged
#
#    Examples:
#      | login    | password |
#      | wrong    | 1234      |
#      | admin    | admin  |