#Author: oussema
Feature: server-client http response
  Scenario: client makes call to POST /login
    When the client calls /login
    Then the client receives status code of 200
    And the client receives user body