package BelajarJava.com;

public class Person{
    private String Nama;
    private String JenisKelamin;
    private int Umur;

    //setter
    public void setnama(String Nama){
        this.Nama = Nama;
    }

    public void setjenisKelamin(String JenisKelamin){
        this.JenisKelamin = JenisKelamin;
    }

    public void setumur(int Umur){
        this.Umur = Umur;
    }

    //Getter
    public String getnama(){
        return this.Nama;
    }

    public String getjenisKelamin(){
        return this.JenisKelamin;
    }

    public int getumur(){
        return this.Umur;
    }
}
