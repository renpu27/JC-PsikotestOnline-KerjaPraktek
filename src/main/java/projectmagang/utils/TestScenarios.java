package projectmagang.utils;

public enum TestScenarios {
    T1("Check URL Invalid"),
    T2("Check URL Valid"),
    T3("User login dengan invalid username"),
    T4("User login dengan invalid password"),
    T5("Admin login dengan invalid username dan password"),
    T6("Admin login dengan field username kosong"),
    T7("Admin login dengan field password kosong"),
    T8("Admin login dengan field username dan password kosong"),
    T9("User login dengan username dan password yang valid"),
    T10("Check akses menu Admin"),
    T11("Check akses menu Modul"),
    T12("Check akses menu Data Users"),
    T13("Check akses menu Data QC"),
    T14("Check akses menu Report"),
    T15("Check akses menu Remove Activity"),
    T16("Check keyword visibility pada Search Bar"),
    T17("Check copy-paste operation pada Search Bar"),
    T18("Cek input form dengan field Full Name kosong"),
    T19("Cek input form dengan field Privilege kosong"),
    T20("Cek input form dengan field Supervisor kosong"),
    T21("Cek input form dengan field Telephone kosong"),
    T22("Cek input form dengan field Username kosong"),
    T23("Cek input form dengan field Password kosong"),
    T24("Cek input form dengan password yang memiliki kriteria dibawah 8 digit"),
    T25("Cek input form dengan password yang memiliki kriteria diatas 16 digit"),
    T26("Cek input form dengan password yang memiliki kriteria angka saja"),
    T27("Cek input form dengan password yang memiliki kriteria huruf saja"),
    T28("Cek input form dengan password yang memiliki kriteria simbol saja");
    private String testCaseName;

    TestScenarios(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }

}
