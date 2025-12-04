

public  class  Main {

    public static void main(String[] args) {

        Ders ders1 = new Ders("Murat",new String[]{"Ünite 1","Ünite 2"},95,82,95,100);

        System.out.println(ders1.ogretmenIsmi);

        for(int i = 0; i<ders1.odevler.length; i++){
            System.out.println(ders1.odevler[i]);
        }

        System.out.println(ders1.yazili1);
        System.out.println(ders1.yazili2);
        System.out.println(ders1.sozlu1);
        System.out.println(ders1.sozlu2);
    }
}
