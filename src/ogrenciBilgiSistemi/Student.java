package ogrenciBilgiSistemi;

public class Student {
    Courses courses1;
    Courses courses2;
    Courses courses3;

    String name;
    String studentNo;
    String classes;

    int avarege;
    boolean isPass;

    Student(String name, String studentNo, String classes , Courses courses1, Courses courses2, Courses courses3){
            this.name=name;
            this.studentNo=studentNo;
            this.classes= classes;
            this.courses1= courses1;
            this.courses2=courses2;
            this.courses3=courses3;

            this.avarege=0;
            this.isPass=false;
    }
    void addNote(int note1, int note2, int note3){
        if (note1 >=0 && note1<=100 ){
            this.courses1.note= note1;
        }
        if (note2 >=0 && note2<=100){
            this.courses2.note=note2;
        }
        if (note3 >=0 && note3<=100){
            this.courses3.note=note3;
        }


    }
    void isPass(){
        this.avarege = (this.courses1.note + this.courses2.note+this.courses3.note)/3;
        if (this.avarege>=55){
            this.isPass=true;

            System.out.println("Gectiniz.");
        }else {
            System.out.println("Kaldınız.");
        }
        printNote();

    }
    void printNote(){
        System.out.println(this.name+" "+this.courses1.className + " Notu : "+ this.courses1.note);
        System.out.println(this.name+" "+this.courses2.className + " Notu : "+ this.courses2.note);
        System.out.println(this.name+" "+this.courses3.className + " Notu : "+ this.courses3.note);
        System.out.println("Ortalama : " + this.avarege);

    }

}
