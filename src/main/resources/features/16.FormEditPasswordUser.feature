Feature: Form Edit Password User Test

  #TCC.PO.105
  Scenario: Admin mengubah password dengan jumlah character < 9
    Given Klik tombol ok
    When Klik tombol edit users
    And Admin input password baru kurang dari 9 char
    And Klik tombol save
    Then Menampilkan alert pemberitahuan

  #TCC.PO.106
  Scenario: Admin mengubah password dengan jumlah character > 9
    Given Klik tombol ok
    When Klik tombol edit users
    And Admin input password baru lebih dari 9 char
    And Klik tombol save
    Then Menampilkan alert success

  #TCC.PO.107
  Scenario: Admin mengubah password dengan angka semua dan jumlah character > 9
    Given Klik tombol ok
    When Klik tombol edit users
    And Admin input password baru lebih dari 9 char angka semua
    And Klik tombol save
    Then Menampilkan alert success

  #TCC.PO.108
  Scenario: Admin mengubah password dengan simbol semua dan jumlah character > 9
    Given Klik tombol ok
    When Klik tombol edit users
    And Admin input password baru lebih dari 9 char simbol semua
    And Klik tombol save
    Then Menampilkan alert success

  #TCC.PO.109
  Scenario: Admin mengubah password dengan campuran huruf, angka dan simbol dan jumlah character > 9
    Given Klik tombol ok
    When Klik tombol edit users
    And Admin input password baru lebih dari 9 char campuran
    And Klik tombol save
    Then Menampilkan alert success