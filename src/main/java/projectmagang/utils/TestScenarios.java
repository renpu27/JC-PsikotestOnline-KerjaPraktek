package projectmagang.utils;

public enum TestScenarios {
    T1("Check url"),
    T2("Check fungsionalitas form Login"),
    T3("Search Data Users kosong"),
    T4("Search Data Users salah"),
    T5("Search Data Users di kategori non active"),
    T6("Search Data Users di kategori active"),
    T7("View Data Users"),
    T8("Admin mengubah status user dari non active jadi active"),
    T9("Admin mengubah status user dari active jadi non active"),
    T10("Admin tidak memilih status"),
    T11("Admin mengubah kategori dari staff ke leader"),
    T12("Admin mengubah kategori dari leader ke staff"),
    T13("Admin mengisi kategori staff dan leader"),
    T14("Admin mengosongkan kategori"),
    T15("Admin mengubah password dengan jumlah character < 9"),
    T16("Admin mengubah password dengan jumlah character > 9"),
    T17("Admin mengubah password dengan angka semua dan jumlah character > 9"),
    T18("Admin mengubah password dengan simbol semua dan jumlah character > 9"),
    T19("Admin mengubah password dengan campuran huruf, angka dan simbol dan jumlah character > 9"),
    T20("Admin menampilkan data report sesuai tanggal request"),
    T21("Admin menampilkan data report dengan tanggal hari ini dan tanggal yang lalu"),
    T22("Admin menampilkan data report dengan tanggal di masa depan"),
    T23("Export Data Report"),
    T24("Search Data Report kosong"),
    T25("Search Data Report salah"),
    T26("Search Data Report"),
    T27("Hapus Data Report");


    private String testCaseName;

    TestScenarios(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }

}
