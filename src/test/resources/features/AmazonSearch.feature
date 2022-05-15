Feature: Search and buy a item

  Background:
    Given the user go to the page amazon

  @Scenario
  Scenario Outline: Check the sort
    Given the user do a search <elementSearched>
    When the user select a brand of the filters <brand> and sort the result by <orderBy>
    And the user search the item <item>
    And the user press buy the product
    And the user put the email <email> and press continue
    Then an error message appear for an incorrect email

    Examples:
      | elementSearched     | brand         | orderBy    | item                       | email     |
      | cama cueva mascotas | Amazon Basics | Destacados | Amazon Basics – Cama cueva | dsds3.com |

