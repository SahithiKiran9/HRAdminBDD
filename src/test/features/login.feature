Feature: Login feature for OrangeHRM site
  As an Admin
  I want to see login page
  So that I can login successfully

  #happy path scenario
  @login1 @smoke @n1
  Scenario: Admin can able to login successfully with valid credentials
    Given Admin is on login page
    When Admin enters username as "admin" and password as "aediMNjU"
    And Admin selects login
    Then Admin should login successfully
    And Admin should see welcome message as "Welcome Admin"

    #un-happy path scenario
  @login2 @smoke
  Scenario Outline: Admin cannot login successfully with in-valid credentials
    Given Admin is on login page
    When Admin enters username as "<username>" and password as "<password>"
    And Admin selects login
    Then Admin should not login successfully
    And Admin should see message as "<Message>"
    Examples:
      | username | password | Message                  |
      |          |          | Username cannot be empty |
      |          | fdfddjjj | Username cannot be empty |
      | dsfdsfsf |          | Password cannot be emptyfhfh |

#  @login1 @smoke
#  Scenario: Admin can able to login successfully with valid credentials-2
#    Given Admin is on login page
#    When Admin login with below details
#      | admin | QzF6xwOA |
#    And Admin selects login
#    Then Admin should login successfully
#    And Admin should see welcome message as "Welcome Admin"