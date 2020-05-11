#Author: wilson.arroyave@sophossolutions.com

@tag
Feature: Talent Register
  I want to use this page for login in the page talento

  Background: 

  Scenario Outline: Talent login
    Given that user want to  use Talento
    
    When he make the login in the page talento
      | numdocument   | password   |
      | <numdocument> | <password> |
    And I entrance the performance option
      | description_objetives   | measurement_criteria   | minimum_acceptable   | goal   | excellence   |
      | <description_objetives> | <measurement_criteria> | <minimum_acceptable> | <goal> | <excellence> |
    Then I verify the successful registration of the objective
      | message_validation   |
      | <message_validation> |

    Examples: 
      | numdocument | password       | description_objetives        | measurement_criteria | minimum_acceptable | goal | excellence | message_validation          |
      |     8431346 | *Nacional2019* | Descripcion de los objetivos | Criterio aceptacion  |                 80 |   90 |        100 | La temporada para la creaci |
