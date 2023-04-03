package projectmagang.utils;

public enum TestScenarios {
    T1("Check url"),
    T2("Check fungsionalitas form Login"),
    T3("Admin mengosongkan deskripsi soal"),
    T4("Admin mengubah deskripsi soal"),
    T5("Admin mengosongkan ketentuan soal"),
    T6("Admin mengubah ketentuan soal"),
    T7("Admin mengosongkan deskripsi dan ketentuan soal"),
    T8("perbaikan isi form"),
    T9("Admin mengosongkan nama modul"),
    T10("Admin mengubah nama modul"),
    T11("Admin mengosongkan tipe modul"),
    T12("Admin mengubah tipe modul"),
    T13("Admin mengosongkan waktu pengerjaan"),
    T14("Admin mengubah waktu pengerjaan"),
    T15("Admin mengosongkan jumlah soal"),
    T16("Admin mengubah jumlah soal"),
    T18("Admin mengosongkan kategori modul"),
    T19("Admin mengubah kategori modul"),
    T20("Admin mengosongkan deskripsi singkat"),
    T21("Admin mengubah deskripsi singkat"),
    T22("Admin mengosongkan status modul"),
    T23("Admin mengubah status modul"),
    T24("Admin mengosongkan seluruh form modul"),
    T25("perbaikan form modul"),
    T26("Admin cek navigasi menu"),
    T27("Admin mencari user non active kosong"),
    T28("Admin mencari seorang user non active"),
    T29("Admin salah menulis nama user non active"),
    T30("Admin mencari active user kosong"),
    T31("Admin mencari seorang user active"),
    T32("Admin salah menulis nama user active"),
    T33("Export file data users"),
    T34("Melihat tampilan View User");

    //T8,T25 tidak masuk SIT

    private String testCaseName;

    TestScenarios(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }

}
