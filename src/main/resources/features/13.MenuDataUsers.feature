Feature: Menu Data Users Test

  #TCC.PO.093
  Scenario: Search Data Users kosong
    Given Admin masuk ke menu Data Users
    And Klik tombol search
    Then Menampilkan data kosong

  #TCC.PO.094
  Scenario: Search Data Users salah
    When Admin menginput keyword salah kedalam Search Bar
    And Klik tombol search
    Then Menampilkan data kosong

  #TCC.PO.095
  Scenario: Search Data Users di kategori non active
    When Admin input keyword kedalam Search Bar
    And Pilih kategori data non active
    And Klik tombol search
    Then Menampilkan nama yang dicari di kategori non active

  #TCC.PO.096
  Scenario: Search Data Users di kategori active
    When Admin input keyword kedalam Search Bar
    And Pilih kategori data active
    And Klik tombol search
    Then Menampilkan nama yang dicari di kategori active