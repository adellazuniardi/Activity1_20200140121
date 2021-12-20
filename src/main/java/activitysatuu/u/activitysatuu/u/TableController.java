/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activitysatuu.u.activitysatuu.u;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 *
 * @author Lenovo
 */
public class TableController {
    @RequestMapping("/data NIK")
    //@ResponseBody
    public String getTable(Model Penduduk){
        String result = "Tabel Data Kependudukan Wonosobo";
        Penduduk.addAttribute("DataPenduduk", result);
        
        ArrayList<List<String>> data = new ArrayList<>();
        
        data.add(0,Arrays.asList("ID","Nomor NIK","Nama","Alamat"));
        data.add(1,Arrays.asList("00001","3307071908020001","Uden Subandi","Kertek"));
        data.add(2,Arrays.asList("00002","3307070901020004","Deva Mahendra","Kalikajar"));
        data.add(3,Arrays.asList("00003","3307071508050024","Faiz Satria","Garung"));
        data.add(4,Arrays.asList("00004","3307070812010001","Raden Arif","Ngasinan"));
        data.add(5,Arrays.asList("00005","3307072906010003","Solehudin","Wonobungkah"));
        data.add(6,Arrays.asList("00006","3307071806010004","Haves Alsyad","Kertek"));
        data.add(7,Arrays.asList("00007","3307072710000005","Ari Barokah","Serang"));
        data.add(8,Arrays.asList("00008","3307071806010003","Bintang Bintara","Sambek"));
        data.add(9,Arrays.asList("00009","3307071303020001","Aji Pangestu","Kalikajar"));
        data.add(10,Arrays.asList("00010","3307071608000007","Laila Shofia","Sentral"));
        data.add(11,Arrays.asList("00011","3307071609030014","Mia Shofia","Sentral"));
        data.add(12,Arrays.asList("00012","3307070901010001","Sabililah","Mlandi"));
        data.add(13,Arrays.asList("00013","3307071302040005","Agus Pambudi","Kalianget"));
        data.add(14,Arrays.asList("00014","3307070311000015","Teguh Santoso","Kerkop"));
        data.add(15,Arrays.asList("00015","3307071807060001","Bahrul","Kampung Tanggung"));
        data.add(16,Arrays.asList("00016","3307071010010004","Daffa Rijaldi","Kejajar"));
        data.add(17,Arrays.asList("00017","3307071211040007","Aziz Siget","Setieng"));
        data.add(18,Arrays.asList("00018","3307071705020002","Mudassir","Dukuh"));
        data.add(19,Arrays.asList("00019","3307070912060003","Karyati","Sapuran"));
        data.add(20,Arrays.asList("00020","3307070104010001","Karyono Mujahid","Kepil"));
        
        Penduduk.addAttribute("Tabel", data);
        
        return "tableviewer";
    }
    
}
