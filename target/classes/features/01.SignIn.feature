Feature: Form Sign In Test

  #TCC.PO.002
  Scenario: Check url
    When Input URL benar di browser
    Then Menampilkan halaman login

  #TCC.PO.009
  Scenario: Check fungsionalitas form Login
    When Input username terdaftar
    And Input password terdaftar
    And Klik tombol sign in
    Then Muncul pesan welcome to web psikotest
