Feature: Login in SwagLabs app

  @test
  Scenario: Successful Login

    Given the login screen, fill the user as "standard_user"
    And fill the password as "secret_sauce"
    When click the login button
    Then validate the successful login, page text must contain "PRODUCTS"