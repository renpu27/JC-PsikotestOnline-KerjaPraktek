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
    T9("User login dengan username dan password yang valid");
    private String testCaseName;

    TestScenarios(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }

}
