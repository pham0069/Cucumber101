Feature: Is it Friday?
  Everybody wants to know when it's Friday

  Scenario: Sunday isn't Friday
    Given today is Sunday
    When I ask whether it's Friday
    Then I should be told "Nope"

  Scenario: Today is Friday or not
    Given today is "<day>"
    When I ask whether it's Friday
    Then I should be told "<answer>"

  Examples:
    | day     | answer  |
    | Friday  | TGIF    |
    | Sunday  | Nope    |
    | else    | Nope    |