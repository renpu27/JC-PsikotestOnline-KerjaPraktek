Feature: Menu Remove Activity Test

    #TCC.PO.114
    Scenario: Search Data Report kosong
        Given Admin masuk ke menu Remove Activity
        And Klik tombol search
        Then Menampilkan data kosong

    #TCC.PO.115
    Scenario: Search Data Report salah
        When Admin menginput keyword salah kedalam Search Bar
        And Klik tombol search
        Then Menampilkan data kosong

    #TCC.PO.116
    Scenario: Search Data Report
        When Admin input keyword kedalam Search Bar
        And Klik tombol search
        Then Menampilkan nama yang dicari

    #TCC.PO.117
    Scenario: Hapus Data Report
        When Admin input keyword kedalam Search Bar
        And Klik tombol search
        And Klik tombol remove data
        Then Mendapat alert persetujuan data akan dihapus
        Then Mendapat pesan berhasil dihapus

