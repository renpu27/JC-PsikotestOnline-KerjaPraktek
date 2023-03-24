package projectmagang.utils;

public enum TestScenarios {
    T1("Check url"),
    T2("Check fungsionalitas form Login");
    private String testCaseName;

    TestScenarios(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }

}
