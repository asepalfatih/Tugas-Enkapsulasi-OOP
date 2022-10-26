package BelajarJava.com;

public class PersonBeraksi{
    public static void main(String[] args) {
        
        Person Anton = new Person();

        Anton.setnama("Anton");
        Anton.setjenisKelamin("Laki-Laki");
        Anton.setumur(20);

        System.out.println("Nama          : " + Anton.getnama());
        System.out.println("Jenis Kelamin : " + Anton.getjenisKelamin());
        System.out.println("Umur          : " + Anton.getumur());

        System.out.println();

        Person Riko = new Person();

        Riko.setnama("Riko");
        Riko.setjenisKelamin("Laki-Laki");
        Riko.setumur(21);

        System.out.println("Nama          : " + Riko.getnama());
        System.out.println("Jenis Kelamin : " + Riko.getnama());
        System.out.println("Umue          : " + Riko.getnama());

        
        
    }
}