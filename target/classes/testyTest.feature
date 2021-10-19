Feature: Is it called Harry Potter?

  Scenario: BFG is not Harry Potter
    Given Reading BFG
    When It's Harry Potter?
    Then Answer is "no"
  Scenario: Harry Potter is Harry Potter
    Given Reading Harry Potter
    When It's Harry Potter?
    Then  Answer is "yes!"




