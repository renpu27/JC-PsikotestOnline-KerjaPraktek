Feature: Form Add Admin Test

  #TCC.PO.018
  Scenario: Cek input form dengan field Full Name kosong
    Given Admin berada di form Add Admin
    When Admin input field Privilege
    And Admin input field Supervisor
    And Admin input field Telephone
    And Admin input field Username
    And Admin input field Password
    And Admin klik tombol Save
    Then Muncul tampilan warning Mohon Lengkapi Data

  #TCC.PO.019
  Scenario: Cek input form dengan field Privileges kosong
    When Admin input field Full Name
    And Admin kosongkan field Privileges
    And Admin klik tombol Save
    Then Muncul tampilan warning Mohon Lengkapi Data

  #TCC.PO.020
  Scenario: Cek input form dengan field Supervisor kosong
    When Admin input field Privileges
    And Admin kosongkan field Supervisor
    And Admin klik tombol Save
    Then Muncul tampilan warning Mohon Lengkapi Data

  #TCC.PO.021
  Scenario: Cek input form dengan field Telephone kosong
    When Admin input field Supervisor
    And Admin kosongkan field Telephone
    And Admin klik tombol Save
    Then Muncul tampilan warning Mohon Lengkapi Data

  #TCC.PO.022
  Scenario: Cek input form dengan field Username kosong
    When Admin input field Telephone
    And Admin kosongkan field Username
    And Admin klik tombol Save
    Then Muncul tampilan warning Mohon Lengkapi Data

  #TCC.PO.023
  Scenario: Cek input form dengan field Password kosong
    When Admin input field Username
    And Admin kosongkan field Password
    And Admin klik tombol Save
    Then Muncul tampilan warning Mohon Lengkapi Data

  #TCC.PO.024 - TCC.PO.028
  Scenario Outline: Cek input form dengan password yang memiliki kriteria tertentu
    Given Admin ready to input data Admin
    When Admin input field Full Name "<name>"
    And Admin input field Privileges "<privilege>"
    And Admin input field Supervisor "<supervisor>"
    And Admin input field Telephone "<telfon>"
    And Admin input field Username "<uname>"
    And Admin input field Password "<pass>"
    And Admin konfirmasi simpan data
    Then Muncul notifikasi Pemberitahuan Password error

    Examples:
      | name   | privilege | supervisor | telfon       | uname   | pass                  |
      | test24 | Admin     | ARIE       | 1234567890   | uname24 | 12345                 |
      | test25 | Admin     | SUPER      | 0987654321   | uname25 | 123456781234567812345 |
      | test26 | Admin     | ARIE       | 135791113    | uname26 | 1122334455            |
      | test27 | Admin     | SUPER      | 2468101214   | uname27 | qwerTYUI              |
      | test28 | Admin     | ARIE       | 085546543233 | uname28 | ,./*-+%!              |

    #test24 = TCC.PO.24
    #test25 = TCC.PO.25
    #test26 = TCC.PO.26
    #test27 = TCC.PO.27
    #test28 = TCC.PO.28

  #TCC.PO.029