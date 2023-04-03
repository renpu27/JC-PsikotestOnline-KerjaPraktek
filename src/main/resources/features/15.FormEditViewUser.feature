Feature: Form Edit View User Test

  #TCC.PO.098
  Scenario: Admin mengubah status user dari non active jadi active
    When Klik tombol edit
    And Pilih kategori non active di menu edit users
    Then Mendapat pesan berhasil disimpan

  #TCC.PO.099
  Scenario: Admin mengubah status user dari active jadi non active
    Given Klik tombol ok
    When Pilih kategori data active
    And Klik tombol edit
    And Pilih kategori non active di menu edit users
    And Klik tombol save
    Then Mendapat pesan berhasil disimpan

  #TCC.PO.100
  Scenario: Admin tidak memilih status
    Given Klik tombol ok
    When Klik tombol edit
    And Pilih kategori pilih di menu edit users
    And Klik tombol save
    Then Mendapat pesan berhasil disimpan

  #TCC.PO.101
  Scenario: Admin mengubah kategori dari staff ke leader
    Given Klik tombol ok
    When Klik tombol edit
    And Pilih status user leader di menu edit users
    And Klik tombol save
    Then Mendapat pesan berhasil disimpan

  #TCC.PO.102
  Scenario: Admin mengubah kategori dari leader ke staff
    Given Klik tombol ok
    When Klik tombol edit
    And Pilih status user leader di menu edit users
    And Pilih status user staff di menu edit users
    And Klik tombol save
    Then Mendapat pesan berhasil disimpan

  #TCC.PO.103
  Scenario: Admin mengisi kategori staff dan leader
    Given Klik tombol ok
    When Klik tombol edit
    And Pilih status user leader di menu edit users
    And Klik tombol save
    Then Mendapat pesan berhasil disimpan

  #TCC.PO.104
  Scenario: Admin mengosongkan kategori
    Given Klik tombol ok
    When Klik tombol edit
    And Pilih status user leader di menu edit users
    And Pilih status user staff di menu edit users
    And Klik tombol save
    Then Mendapat pesan berhasil disimpan



