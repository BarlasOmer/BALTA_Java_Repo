import static java.lang.Math.sqrt;

public  class  Main {
    
    void main(String[] args) {

        float sonuc;
        float sayi1 = 15.0f;
        float sayi2 = 8.0f;
        sonuc = toplama(sayi1,sayi2);
        System.out.println(sonuc);

        sonuc = cıkarma(sayi1,sayi2);
        System.out.println(sonuc);

        sonuc = carpma(sayi1,sayi2);
        System.out.println(sonuc);

        sonuc = bolme(sayi1,sayi2);
        System.out.println(sonuc);

        eskenarUcgenCevreVeAlani(9.0f);

        ciftMi(12);
        ciftMi(17);

    }

    float toplama(float a, float b){
        return a+b;
    }

    float cıkarma(float a, float b){
        return a-b;
    }


    float carpma(float a, float b){
        return a*b;
    }

    float bolme(float a, float b){
        return a/b;
    }

    void eskenarUcgenCevreVeAlani(float a){
        float cevre = a * 3.0f;
        System.out.println("üçgenin çevresi: "+cevre);
        float yukseklik = (float) sqrt((a * a) - ((a / 2.0f) * (a / 2.0f)));
        float alan = (yukseklik * a) / 2.0f;
        System.out.println(alan);
    }

    //Yazılımcı abim öğretmek için yaptırdı.
    void ciftMi(int a){
        boolean kontrol;
        int sonuc;
        sonuc = a % 2;
        if(sonuc == 0){
            kontrol = true;
            System.out.println("Sayı Çift mi: " +kontrol);

        }
        else{
            kontrol = false;
            System.out.println("Sayı Çift mi: " +kontrol);
        }

    }

}
