#Author: oussema
@tag
Feature: client can log in

	Scenario: Client logs in
		Given Client has a user instance
		When client inputs <login> and <password>
		Then I verify that user with <login> and <password> exist


