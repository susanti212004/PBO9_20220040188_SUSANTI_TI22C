public class ReplaceString {
    public static void main(String[] args) {
        String string ="Hello How Are You Susan";
        String GantiKarakter = string.replace('H', 'C');
        String GantiKalimat = string.replace("Hello","Good Afternoon");
        System.out.println("Untuk replace Karakter : " + GantiKarakter);
        System.out.println("Untuk replace Kalimat : " + GantiKalimat);
    }
}
//Output:
// Untuk replacse karakter : Cello Tow Are You Susan
// Untuk replace karakter : Good Afternoon How Are You Susan



