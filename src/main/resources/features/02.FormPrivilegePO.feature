Feature: Form Privilege Psikotest Online

  #TCC.PO.010
  Scenario: Check akses menu Admin
    When Admin klik menu User Management
    And Admin klik tombol Admin
    Then Muncul tampilan menu Admin

  #TCC.PO.011
  Scenario: Check akses menu modul
    When Admin klik menu Task
    And Admin klik tombol Modul
    Then Muncul tampilan menu Modul

  #TCC.PO.012
  Scenario: Check akses menu Data Users
    When Admin klik tombol Data Users
    Then Muncul tampilan menu Data Users

  #TCC.PO.013
  Scenario: Check akses menu Data QC
    When Admin klik tombol Data QC
    Then Muncul tampilan menu Data QC

  #TCC.PO.014
  Scenario: Check akses menu Report
    When Admin klik menu Report
    And Admin klik tombol Report
    Then Muncul tampilan menu Report

  #TCC.PO.015
  Scenario: Check akses menu Remove Activity
    When Admin klik tombol Remove Activity
    Then Muncul tampilan menu Remove Activity