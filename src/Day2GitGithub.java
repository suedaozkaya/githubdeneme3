public class Day2GitGithub {
    /*
    1-) git init --> Local repo olusturmak icin yani .git ile klasorumuzun icindeki dosyalari
        iliskilendirmek icin kullanilir
    2-) git add .--> Working space'den (yani yerel) dosyalarimi staging area'ya (yani commitlemek icin beklenen yer)
        gonderir
    3-) git status --> Working space'deki ve Staging area'daki durumu gosterir
    4-) git commit -m "mesaj" --> Staging area'dan commit store'a dosyalarimi gondermek icin kullanilir
        (commit yani versiyon yani surum olusturmus olurum)
    5-) git push --> Uzak repo'ya (yani remote - Github) gondermek icin kullandigimiz kod
        Yalniz git push komutunu direk kullanmak istersek 1 kez
        git remote add origin adres
        git push -u origin master
    NOT: Yukaridaki iki komutu tek seferde kullandiktan sonra
    ikinci commit'lerim icin sadece git push kullaniriz.
    NOT: git log --oneline --> Commitlerimdeki yani versiyonlarimdaki durumu gosterir
     */

    public static void main(String[] args) {
        System.out.println("Github'i da ogrendik");
    }
}
