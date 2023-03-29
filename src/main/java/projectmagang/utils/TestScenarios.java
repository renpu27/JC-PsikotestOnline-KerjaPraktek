package projectmagang.utils;

public enum TestScenarios {
    T1("Check url"),
    T2("Check fungsionalitas form Login"),
    T3("Admin mengosongkan deskripsi soal"),
    T4("Admin mengubah deskripsi soal"),
    T5("Admin mengosongkan ketentuan soal"),
    T6("Admin mengubah ketentuan soal"),
    T7("Admin mengosongkan deskripsi dan ketentuan soal"),
    T8("perbaikan isi form");
    private String testCaseName;

    TestScenarios(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }

}
