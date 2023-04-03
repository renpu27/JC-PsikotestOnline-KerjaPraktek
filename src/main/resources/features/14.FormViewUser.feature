Feature: Form View User Test

  #TCC.PO.092
  Scenario: Melihat tampilan View User
    Given Hapus search bar
    And Klik tombol search
    And Klik tombol view user
    Then Muncul tampilan View User
