package com.example.login_project;


import com.example.login_project.models.User;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.assertj.core.api.Assertions.assertThat;

public class LoginStepDefenitions {

    User user;
    @Given("Client has a user instance")
    public void Client_has_a_user_instance() {
        user = new User();
    }

    @When("client inputs {string} and {string}")
    public void client_inputs_and(String a, String b) {
        user = new User(a,b);
    }

    @Then("verify user {string} and {string} exist")
    public void verify_user_and_exist(User x) {
        assertThat(user.getId()).isEqualTo(x.getId());
    }
}
