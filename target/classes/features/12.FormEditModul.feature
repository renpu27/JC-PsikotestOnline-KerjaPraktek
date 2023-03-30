Feature: Form Edit Modul Test

  #TCC.PO.069
  Scenario: Admin mengosongkan nama modul
    Given Klik tombol close
    When Klik tombol Edit Modul
    And Hapus nama modul
    And Klik update modul
    Then Mendapat alert tidak berhasil ditambahkan

  #TCC.PO.077
  Scenario: Admin mengubah nama modul
    Given Klik tombol ok
    When Klik tombol Edit Modul
    And Ubah nama modul
    And Klik update modul
    Then Mendapat pesan berhasil ditambahkan

  #TCC.PO.070
  Scenario: Admin mengosongkan tipe modul
    Given Klik tombol ok
    When Klik tombol Edit Modul
    And Ubah tipe modul menjadi pilih
    And Klik update modul
    Then Mendapat alert tidak berhasil ditambahkan

  #TCC.PO.078
  Scenario: Admin mengubah tipe modul
    Given Klik tombol ok
    When Klik tombol Edit Modul
    And Ubah tipe modul
    And Klik update modul
    Then Mendapat pesan berhasil ditambahkan

  #TCC.PO.071
  Scenario: Admin mengosongkan waktu pengerjaan
    Given Klik tombol ok
    When Klik tombol Edit Modul
    And Hapus waktu pengerjaan
    And Klik update modul
    Then Mendapat alert tidak berhasil ditambahkan

  #TCC.PO.079
  Scenario: Admin mengubah waktu pengerjaan
    Given Klik tombol ok
    When Klik tombol Edit Modul
    And Ubah waktu pengerjaan
    And Klik update modul
    Then Mendapat pesan berhasil ditambahkan

  #TCC.PO.072
  Scenario: Admin mengosongkan jumlah soal
    Given Klik tombol ok
    When Klik tombol Edit Modul
    And Hapus jumlah soal
    And Klik update modul
    Then Mendapat alert tidak berhasil ditambahkan

  #TCC.PO.080
  Scenario: Admin mengubah jumlah soal
    Given Klik tombol ok
    When Klik tombol Edit Modul
    And Ubah jumlah soal
    And Klik update modul
    Then Mendapat pesan berhasil ditambahkan

  #TCC.PO.073
  Scenario: Admin mengosongkan kategori modul
    Given Klik tombol ok
    When Klik tombol Edit Modul
    And Ubah kategori modul menjadi pilih
    And Klik update modul
    Then Mendapat alert tidak berhasil ditambahkan

  #TCC.PO.081
  Scenario: Admin mengubah kategori modul
    Given Klik tombol ok
    When Klik tombol Edit Modul
    And Ubah kategori modul
    And Klik update modul
    Then Mendapat pesan berhasil ditambahkan

  #TCC.PO.074
  Scenario: Admin mengosongkan deskripsi singkat
    Given Klik tombol ok
    When Klik tombol Edit Modul
    And Hapus deskripsi singkat
    And Klik update modul
    Then Mendapat alert tidak berhasil ditambahkan

  #TCC.PO.082
  Scenario: Admin mengubah deskripsi singkat
    Given Klik tombol ok
    When Klik tombol Edit Modul
    And Ubah deskripsi singkat
    And Klik update modul
    Then Mendapat pesan berhasil ditambahkan

  #TCC.PO.075
  Scenario: Admin mengosongkan status modul
    Given Klik tombol ok
    When Klik tombol Edit Modul
    And Ubah status modul menjadi pilih
    And Klik update modul
    Then Mendapat alert tidak berhasil ditambahkan

  #TCC.PO.083
  Scenario: Admin mengubah status modul
    Given Klik tombol ok
    When Klik tombol Edit Modul
    And Ubah status modul
    And Klik update modul
    Then Mendapat pesan berhasil ditambahkan

  #TCC.PO.076
  Scenario: Admin mengosongkan seluruh form modul
    Given Klik tombol ok
    When Klik tombol Edit Modul
    And Hapus nama modul
    And Ubah tipe modul menjadi pilih
    And Hapus waktu pengerjaan
    And Hapus jumlah soal
    And Ubah kategori modul menjadi pilih
    And Hapus deskripsi singkat
    And Ubah status modul menjadi pilih
    And Klik update modul
    Then Mendapat alert tidak berhasil ditambahkan

  #isi ulang form
  Scenario: perbaikan form modul
    Given Klik tombol ok
    When Klik tombol Edit Modul
    And Ubah nama modul
    And Ubah tipe modul
    And Ubah waktu pengerjaan
    And Ubah jumlah soal
    And Ubah kategori modul
    And Ubah deskripsi singkat
    And Ubah status modul
    And Klik update modul
    Then Mendapat pesan berhasil ditambahkan