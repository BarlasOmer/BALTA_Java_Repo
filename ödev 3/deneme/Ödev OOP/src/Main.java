

public  class  Main {

    public static void main(String[] args) {

        Ders ders = new Ders("Murat",new String[]{"Ünite 1","Ünite 2"},95,82,95,100);

        System.out.println(ders.ogretmenIsmi);

        for(int i = 0; i<ders.odevler.length; i++){
            System.out.println(ders.odevler[i]);
        }

        System.out.println(ders.yazili1);
        System.out.println(ders.yazili2);
        System.out.println(ders.sozlu1);
        System.out.println(ders.sozlu2);

        dersProgramı Pazartesi = new dersProgramı("Edebiyat","Edebiyat","Almanca(Yeliz)","Almanca(Fatma)","Bilgisayar","Bilgisayar","İngilizce","İngilizce");

        System.out.println(Pazartesi.ders1);
        System.out.println(Pazartesi.ders2);
        System.out.println(Pazartesi.ders3);
        System.out.println(Pazartesi.ders4);
        System.out.println(Pazartesi.ders5);
        System.out.println(Pazartesi.ders6);
        System.out.println(Pazartesi.ders7);
        System.out.println(Pazartesi.ders8);



    }
}
