Feature: Google search functionality
  #Agile story: As a user, when I am on the Google search page
  #I should be able to search anything and see relevant results

    # MAC --> command + option + L
    # WINDOWS --> control + option + L



  @google @apple @smoke
  Scenario: Search result title verification
    Given user is on the Google search page
    When user searches for apple
    Then user should see apple in the title

