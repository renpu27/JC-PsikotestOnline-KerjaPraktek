Feature: Form Sign In Test

  #TCC.PO.001
  Scenario: Check URL Invalid
    When Input URL invalid di browser
    Then Admin tidak dapat mengakses website

  #TCC.PO.002
  Scenario: Check URL Valid
    When Input URL valid di browser
    Then Menampilkan halaman login

  #TCC.PO.003
  Scenario: Admin login dengan invalid username
    When Input username yang tidak terdaftar
    And Input password terdaftar
    And Klik tombol sign in
    Then Muncul warning Username atau password tidak ditemukan atau akun anda tidak aktif

  #TCC.PO.004
  Scenario: Admin login dengan invalid password
    When Input username terdaftar
    And Input password yang tidak terdaftar
    And Klik tombol sign in
    Then Muncul warning Username atau password tidak ditemukan atau akun anda tidak aktif

  #TCC.PO.005
  Scenario: Admin login dengan invalid username dan password
    When Input username yang tidak terdaftar
    And Input password yang tidak terdaftar
    And Klik tombol sign in
    Then Muncul warning Username atau password tidak ditemukan atau akun anda tidak aktif

  #TCC.PO.006
  Scenario: Admin login dengan field username kosong
    When Input password terdaftar
    And Klik tombol sign in
    Then Muncul warning Username atau password tidak ditemukan atau akun anda tidak aktif

  #TCC.PO.007
  Scenario: Admin login dengan field password kosong
    When Input username terdaftar
    And Klik tombol sign in
    Then Muncul warning Username atau password tidak ditemukan atau akun anda tidak aktif

  #TCC.PO.008
  Scenario: Admin login dengan field username dan password kosong
    When Klik tombol sign in
    Then Muncul warning Username atau password tidak ditemukan atau akun anda tidak aktif

  #TCC.PO.009
  Scenario: Admin login dengan username dan password yang valid
    When Input username terdaftar
    And Input password terdaftar
    And Klik tombol sign in
    Then Muncul pesan welcome to web psikotest
