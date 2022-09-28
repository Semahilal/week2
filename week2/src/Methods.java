public class Methods {
    public static void main(String[] args) {
        sayiBulmaca();
    }

    //Method ismleri camel Casing

    public static void sayiBulmaca(){
        int[] numbers = {1,2,5,7,9,0};
        int aranacak = 3;
        boolean varmı = false;

        for (int i=0; i<5; i++){
            if (numbers[i] == aranacak){
                varmı =true;
                break; // artık aramasına gerek yok döngüden çıkabilirsin
            }
        }
        String mesaj = "";
        if (varmı){
            mesaj = "Sayı dizide yer alıyor" + aranacak;
            mesajVer(mesaj);
        }
        else {
           mesajVer("Sayı dizide yok" + aranacak);
        }
    }

    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }
}
