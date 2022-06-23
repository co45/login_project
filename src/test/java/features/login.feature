Feature: client can log in

  Scenario: Client logs in
    Given Client has a user instance
    When client inputs <login> and <password>
    Then verify user <login> and <password> exist
