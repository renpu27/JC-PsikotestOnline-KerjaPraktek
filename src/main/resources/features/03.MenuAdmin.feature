Feature: Menu Admin Test

  #TCC.PO.016
  Scenario: Check keyword visibility pada Search Bar
    Given Admin berada di menu Admin
    When Admin menginput keyword kedalam Search Bar
    Then Admin dapat melihat keyword yang diinput

  #TCC.PO.017
  Scenario: Check copy-paste operation pada Search Bar
    When Admin input keyword kedalam searchbar
    And Admin melakukan operasi copy terhadap keyword yang diinput
    And Admin melakukan operasi paste terhadap keyword yang dicopy
    Then Admin dapat melihat keyword yang di copy-paste