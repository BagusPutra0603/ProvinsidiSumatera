package com.example.bagusputra.testdicoding;

import java.util.ArrayList;

public class ProvinceData {

    private static String[] provinceNames = {
            "Aceh",
            "Sumatera Utara",
            "Sumatera Barat",
            "Riau",
            "Kepulauan Riau",
            "Jambi",
            "Bengkulu",
            "Sumatera Selatan",
            "Kepulauan Bangka Belitung",
            "Lampung"
    };

    private static String[] provinceDetails = {
            "Aceh adalah sebuah provinsi di Indonesia yang ibu kotanya berada di Banda Aceh. Aceh merupakan salah satu provinsi di Indonesia yang diberi status sebagai daerah istimewa dan juga diberi kewenangan otonomi khusus. Aceh terletak di ujung utara pulau Sumatra dan merupakan provinsi paling barat di Indonesia. Menurut hasil sensus Badan Pusat Statistik tahun 2019, jumlah penduduk provinsi ini sekitar 5.281.891Jiwa.[10] Letaknya dekat dengan Kepulauan Andaman dan Nikobar di India dan terpisahkan oleh Laut Andaman. Aceh berbatasan dengan Teluk Benggala di sebelah utara, Samudra Hindia di sebelah barat, Selat Malaka di sebelah timur, dan Sumatra Utara di sebelah tenggara dan selatan.",
            "Sumatra Utara (disingkat Sumut) adalah sebuah provinsi di Indonesia yang terletak di bagian utara Pulau Sumatra. Provinsi ini beribu kota di Medan. Luas wilayahnya 72.981 km2. Sumatra Utara adalah provinsi dengan jumlah penduduk terbesar keempat setelah Jawa Barat, Jawa Timur, dan Jawa Tengah, dan pada tahun 2019, jumlah penduduknya adalah sebesar 14.908.036 jiwa.",
            "Sumatra Barat (disingkat Sumbar) adalah sebuah provinsi di Indonesia yang terletak di Pulau Sumatra dengan Padang sebagai ibu kotanya. Provinsi Sumatra Barat terletak sepanjang pesisir barat Sumatra bagian tengah, dataran tinggi Bukit Barisan di sebelah timur, dan sejumlah pulau di lepas pantainya seperti Kepulauan Mentawai. Dari utara ke selatan, provinsi dengan wilayah seluas 42.297,30 km² ini berbatasan dengan empat provinsi, yakni Sumatra Utara, Riau, Jambi, dan Bengkulu.",
            "Riau adalah sebuah provinsi di Indonesia yang terletak di bagian tengah pulau Sumatra. Provinsi ini terletak di bagian tengah pantai timur Pulau Sumatra, yaitu di sepanjang pesisir Selat Melaka. Hingga tahun 2004, provinsi ini juga meliputi Kepulauan Riau, sekelompok besar pulau-pulau kecil (pulau-pulau utamanya antara lain Pulau Batam dan Pulau Bintan) yang terletak di sebelah timur Sumatra dan sebelah selatan Singapura. Kepulauan ini dimekarkan menjadi provinsi tersendiri pada Juli 2004. Ibu kota dan kota terbesar Riau adalah Pekanbaru. Kota besar dan Ibukota Kabupaten lainnya antara lain Dumai, Selatpanjang, Bagansiapiapi, Bengkalis, Bangkinang, Tembilahan, dan Rengat.",
            "Kepulauan Riau (disingkat Kepri) adalah sebuah provinsi di Indonesia. Provinsi Kepulauan Riau berbatasan dengan Vietnam dan Kamboja di sebelah utara; Malaysia dan provinsi Kalimantan Barat di timur; provinsi Kepulauan Bangka Belitung dan Jambi di selatan; Negara Singapura, Malaysia dan provinsi Riau di sebelah barat. Provinsi ini termasuk provinsi kepulauan di Indonesia.",
            "Jambi adalah sebuah Provinsi di Indonesia yang terletak di pesisir timur di bagian tengah Pulau Sumatra. Jambi adalah nama provinsi di Indonesia yang ibu kotanya bernama sama dengan nama provinsinya, selain Bengkulu, Daerah Khusus Ibukota Jakarta, dan Gorontalo.",
            "Bengkulu adalah sebuah provinsi di Indonesia. Ibu kotanya berada di Kota Bengkulu. Provinsi ini terletak di bagian barat daya Pulau Sumatra.",
            "Sumatra Selatan (umumnya disingkat menjadi Sumsel) adalah provinsi di Indonesia yang terletak di bagian selatan Pulau Sumatra. Provinsi ini beribu kota di Palembang. Secara geografis, Sumatra Selatan berbatasan dengan provinsi Jambi di utara, provinsi Kep. Bangka-Belitung di timur, provinsi Lampung di selatan dan Provinsi Bengkulu di barat. Provinsi ini kaya akan sumber daya alam, seperti minyak bumi, gas alam dan batu bara. Selain itu, ibu kota provinsi Sumatra Selatan, Palembang, telah terkenal sejak dahulu karena menjadi pusat Kerajaan Sriwijaya.",
            "Provinsi Kepulauan Bangka Belitung (disingkat Babel) adalah sebuah provinsi di Indonesia yang terdiri dari dua pulau utama yaitu Pulau Bangka dan Pulau Belitung serta ratusan pulau-pulau kecil, total pulau yang telah bernama berjumlah 470 buah dan yang berpenghuni hanya 50 pulau. Bangka Belitung terletak di bagian timur Pulau Sumatra, dekat dengan Provinsi Sumatra Selatan. Bangka Belitung dikenal sebagai daerah penghasil timah, memiliki pantai yang indah dan kerukunan antar etnis. Ibu kota provinsi ini ialah Pangkalpinang. Pemerintahan provinsi ini disahkan pada tanggal 9 Februari 2001. Setelah dilantiknya Pj. Gubernur yakni H. Amur Muchasim, SH (mantan Sekjen Depdagri) yang menandai dimulainya aktivitas roda pemerintahan provinsi.",
            "Lampung adalah sebuah provinsi paling selatan di Pulau Sumatra, Indonesia, dengan ibu kota Bandar Lampung. Provinsi ini memiliki dua kota yaitu Kota Bandar Lampung, Kota Metro, dan Kota Pringsewu serta 12 kabupaten. Posisi Lampung secara geografis berada di sebelah barat berbatasan dengan Samudra Hindia, di sebelah timur dengan Laut Jawa, di sebelah utara berbatasan dengan provinsi Sumatra Selatan, dan di sebelah selatan berbatasan dengan Selat Sunda.",

    };

    private static int[] provinceImages = {
            R.drawable.aceh,
            R.drawable.sumut,
            R.drawable.sumbar,
            R.drawable.riau,
            R.drawable.kepri,
            R.drawable.jambi,
            R.drawable.bengkulu,
            R.drawable.sumsel,
            R.drawable.babel,
            R.drawable.lampung
    };

    private static String[] provinceUrl = {
           "https://id.wikipedia.org/wiki/Aceh",
            "https://id.wikipedia.org/wiki/Sumatra_Utara",
            "https://id.wikipedia.org/wiki/Sumatra_Barat",
            "https://id.wikipedia.org/wiki/Riau",
            "https://id.wikipedia.org/wiki/Kepulauan_Riau",
            "https://id.wikipedia.org/wiki/Jambi",
            "https://id.wikipedia.org/wiki/Bengkulu",
            "https://id.wikipedia.org/wiki/Sumatra_Selatan",
            "https://id.wikipedia.org/wiki/Kepulauan_Bangka_Belitung",
            "https://id.wikipedia.org/wiki/Lampung",

    };

    static ArrayList<Province> getListData() {
        ArrayList<Province> list = new ArrayList<>();
        for (int position = 0; position < provinceNames.length; position++) {
            Province province = new Province();
            province.setNameprovince(provinceNames[position]);
            province.setDetailprovince(provinceDetails[position]);
            province.setPhotoprovince(provinceImages[position]);
            province.setSourceurl(provinceUrl[position]);
            list.add(province);
        }
        return list;
    }
}
