package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    // tercuman class.

    //1-properties objesi olusturmak
    //class ismiyle projenin her yerinden cagrilsin diye static
    // bu objeye class diisndan mudahele edilmesin diye private(opsiyonel)

    static private Properties properties;

    //static block kullaniyoruz. Her seyden once cailisir. Mainden bile once calisir.
    static{
        //dosya yolunu tanitiyoruz.
        String path = "configuration.properties";


        //dosyayi bulamazsa diye try-catch yapiyoruz.
        try{
            //dosyayi okumak icin

            FileInputStream fileInputStream = new FileInputStream(path);
            //properties deger atamasi yapiyoruz
            properties = new Properties();

            //dosya yukleme yapiyor.
            //Bu class calistiginda ilk olarak static block calisacak ve bir tek islem yapacak.
            // file dosyasini bulacak. properties icine load edecek
            //fileInputStream objesi calisacak ve okudugu bilgileri properties objesine yukleyecek
            properties.load(fileInputStream);

            //kapatmazsak bilgisayari mesgul eder.
            fileInputStream.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    // method olusturacagiz ve key yollayip value alacagiz.
    // static private Properties properties; oldugu icin static

    public static  String  getProperty(String key){
        String value = properties.getProperty(key); //properties uzerindeki value
        // bu key yardimiyla return ettik
        return value;
    }
}
