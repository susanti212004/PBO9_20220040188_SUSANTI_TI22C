public class ContainString {
    public static void main(String[] args) {
        String name = "Welcome to Susan Comfortable House";
        System.out.println("Hasilnya : " +name.contains("Welcome"));
        System.out.println("Hasilnya : " +name.contains("to"));
        System.out.println("Hasilnya : " +name.contains("Hello"));
    }
}

// output : 
// Hasilnya : true
// Hasilnya : true
// Hasilnya : false