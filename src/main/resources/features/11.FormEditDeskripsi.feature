Feature: Form Edit Deskripsi Test

  #TCC.PO.064
  Scenario: Admin mengosongkan deskripsi soal
    Given Admin masuk menu modul
    When Klik tombol Descriptions
    And Klik tombol Edit Deskripsi
    And Hapus deskripsi soal
    And Klik update
    Then Mendapat alert tidak berhasil update

  #TCC.PO.065
  Scenario: Admin mengubah deskripsi soal
    Given Klik tombol ok
    When Klik tombol Edit Deskripsi
    And Ubah konten deskripsi soal
    And Klik update
    Then Menampilkan pesan berhasil update

  #TCC.PO.066
  Scenario: Admin mengosongkan ketentuan soal
    Given Klik tombol ok
    When Klik tombol Edit Deskripsi
    And Hapus ketentuan soal
    And Klik update
    Then Mendapat alert tidak berhasil update

  #TCC.PO.067
  Scenario: Admin mengubah ketentuan soal
    Given Klik tombol ok
    When Klik tombol Edit Deskripsi
    And Ubah konten ketentuan soal
    And Klik update
    Then Menampilkan pesan berhasil update

  #TCC.PO.068
  Scenario: Admin mengosongkan deskripsi dan ketentuan soal
    Given Klik tombol ok
    When Klik tombol Edit Deskripsi
    And Hapus deskripsi soal
    And Hapus ketentuan soal
    And Klik update
    Then Mendapat alert tidak berhasil update

  #isi ulang form
  Scenario: perbaikan isi form
    Given Klik tombol ok
    When Klik tombol Edit Deskripsi
    And Ubah konten deskripsi soal
    And Ubah konten ketentuan soal
    And Klik update
    And Klik tombol ok