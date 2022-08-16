package ogrenciBilgiSistemi;

public class Teacher {
    String name;
    String lastName;
    String phoneNumber;
    String branch;

    Teacher(String name , String lastName, String phoneNumber, String branch){
        this.name= name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.branch = branch;
    }
    void print(){
        System.out.println("Isim : " + this.name);
        System.out.println("Soy Isim : " + this.lastName);
        System.out.println("Telefon : "+ this.phoneNumber);
        System.out.println("Alan : " + this.branch);
    }
}
