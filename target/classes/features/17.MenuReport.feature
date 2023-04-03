Feature: Menu Report Test

    #TCC.PO.110
    Scenario: Admin menampilkan data report sesuai tanggal request
      Given Admin masuk ke menu Report Page
      When Admin input tanggal awal
      And Admin input tanggal akhir
      And Klik tombol view
      Then Menampilkan data sesuai tanggal

    #TCC.PO.111
    Scenario: Admin menampilkan data report dengan tanggal hari ini dan tanggal yang lalu
      When Admin input tanggal akhir
      And Admin input tanggal awal
      And Klik tombol view
      Then Menampilkan data sesuai tanggal

    #TCC.PO.112
    Scenario: Admin menampilkan data report dengan tanggal di masa depan
      When Admin input tanggal awal masa depan 1
      And Admin input tanggal awal masa depan 2
      And Klik tombol view
      Then Menampilkan data sesuai tanggal

    #TCC.PO.113
    Scenario: Export Data Report
      When Admin input tanggal awal
      And Admin input tanggal akhir
      And Klik tombol export
      Then Menampilkan data yang di export