package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

// RunWith, junit icinde oldugu icin cucumber kullandik. TestNg kullanmadik
@RunWith(Cucumber.class)
@CucumberOptions(
        /*
        // paralel testing icin 2 runner classi olusturduk ve isim olarak TestRunner yazmalliyiz.
        //html:target\cucumber2-raporlar.html gibi olanalr dosya, dosya isimlerini degistirmek lazim
        //cunku ayri ayri rapor olmaz testrunnerla ayni olduugndan hangiis once biterse oburunun ustune katar
        // onyuzden isimlerini degostirrelim
        //taglari da boluytorum. Paylastiriyorum yarisini rapor1 bunu rapor 2 yapiyorum
        //pom/umuza 2 tane eklenti eklilyoruz
        //dependencylerin disina plugins ekledik(failsafe surefile)
        //somra terminal kismina mvn clean verify yaz ve entera bas

         */

        //Rapor almak icin
        plugin = {"html:target\\cucumber-raporlar1.html",
                "json:target/json-reports/cucumber1,json",
                "json:target/xml-report/cucumber1.xml"},
        //plugin ={html:target\\cucumber- reports.html},

        //Bu notasyounun gorevi feature dosyalari ile stepdefiniton dosyalarini birlestirmektir
        //feature ="features folder path",
        //Cucumber package ile package birbirine bagliyor
        features = "src/test/resources/features",

        //stepdefinition package ismi
        glue="src/test/java/stepdefinitions",
        //boylece packageleri birbirine bagladik
        //bu iki paket altinda kac tane class olursa olsun herhango bir classta yazilan her adim
        //diger classlardaki adimlarla uyusursa yeni adi olusturmaya gerek kalmaz


        tags = "@invalidMobilePhone",

        //tags="@istediginiz tag", TEstNG de gordugumuz group gibi calisir
        //tags="@smoke or miniregression" => boyle yapabiliriz. Or dersek veya
        // work in progress hangi feature veya senaryoyu calistiracagini bilmesi icin onemli
        //Birden fazla feature ve Scenario calistirmak istedigimizde
        // calistirtacagimiz feature ve Scenario lara ortak tag atamamiz ve bu tag i
        //runner da belirtmemiz gerekir
        //And ==> dendiginde verilen ozellilerin tamamini tasiyan tag lar yazilir
        // OR => dendiginde yazilan taglardan herhangi birine veya daha fazlasina sahip olanlar calisir.
        //TAG kapatilirsa tamamini calistirir. yani bir tag belirtmezsek hepsi calisir


        dryRun = true
        // dryRun=true oldugunda test caseleri calistirmayi denemeden sadece eksik olan stepleri bana verir
        // dryRun=false => oldugunda test caseleri calsitirmayi dener eksik step bulursa onu rapor eder
)
public class TestRunner {


}
