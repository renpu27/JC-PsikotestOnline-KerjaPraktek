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
    T17("Check copy-paste operation pada Search Bar");
    private String testCaseName;

    TestScenarios(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }

}
