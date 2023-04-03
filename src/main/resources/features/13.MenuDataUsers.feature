Feature: Menu Data Users Test

  #TCC.PO.084
  Scenario: Admin cek navigasi menu
    Given Klik tombol ok
    When Klik menu Data Users
    Then Masuk ke halaman Data Users

  #TCC.PO.085
  Scenario: Admin mencari user non active kosong
    When Pilih opsi Non Active
    And Klik tombol search
    Then Menampilkan semua user Non Active

  #TCC.PO.086
  Scenario: Admin mencari seorang user non active
    When Pilih opsi Non Active
    And Ketik nama user Non Active terdaftar
    And Klik tombol search
    Then Menampilkan user Non Active yang dicari

  #TCC.PO.087
  Scenario: Admin salah menulis nama user non active
    Given Hapus search bar
    When Pilih opsi Non Active
    And Ketik nama user Non Active salah
    And Klik tombol search
    Then Tidak menampilkan nama siapapun

  #TCC.PO.088
  Scenario: Admin mencari active user kosong
    Given Hapus search bar
    When Pilih opsi Active
    And Klik tombol search
    Then Menampilkan semua user Active

  #TCC.PO.089
  Scenario: Admin mencari seorang user active
    Given Hapus search bar
    When Pilih opsi Active
    And Ketik nama user Active terdaftar
    And Klik tombol search
    And Menampilkan user Active yang dicari

  #TCC.PO.090
  Scenario: Admin salah menulis nama user active
    Given Hapus search bar
    When Pilih opsi Active
    And Ketik nama user Active salah
    And Klik tombol search
    And Tidak menampilkan nama siapapun

  #TCC.PO.091
  Scenario: Export file data users
    Given Hapus search bar
    When Pilih opsi Non Active
    And Klik tombol search
    And Klik tombol export

