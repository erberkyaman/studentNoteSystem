public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    int stuNo;
    int classes;
    double avrg;
    boolean isPass;

    public Student(String name, int stuNo, int classes, Course c1, Course c2, Course c3)
    {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }

    public void addBulkExamNote(int c1, int c2, int c3)
    {
        if (c1>=0 && c1<=100)
            this.c1.examNote = c1;
        if (c2>=0 && c2<=100)
            this.c2.examNote = c2;
        if(c3>=0 && c3<=100)
            this.c3.examNote = c3;
    }

    public void addBulkOralExamNote(int c1, int c2, int c3)
    {
        if (c1>=0 && c1<=100)
            this.c1.oralExamNote = c1;
        if (c2>=0 && c2<=100)
            this.c2.oralExamNote = c2;
        if(c3>=0 && c3<=100)
            this.c3.oralExamNote = c3;
    }

    public void calcAvarage()
    {
        this.avrg = (((c1.oralExamNote*0.30)+(c1.examNote*0.70)) + ((c2.oralExamNote*0.30)+(c2.examNote*0.70)) + ((c3.oralExamNote*0.30)+(c3.examNote*0.70)))/3;
        if (this.avrg>= 55) {
            this.isPass = true;
        } else if (this.avrg<55)
            this.isPass = false;
    }

    public void isPass()
    {
        calcAvarage();
        if(this.isPass==true)
            System.out.print("Öğrenci Sınıfı Geçti!");
        else
            System.out.print("Öğrenci Sınıfta Kaldı!");
    }

    public void printNotes()
    {
        System.out.println(this.name+" Adlı Öğrencinin Notları:");
        System.out.println(this.c1.name+ " Dersi Yazılı Notu : "+ this.c1.examNote+" / Sözlü Notu : "+ this.c1.oralExamNote);
        System.out.println(this.c2.name+ " Dersi Yazılı Notu : "+ this.c2.examNote+" / Sözlü Notu : "+ this.c2.oralExamNote);
        System.out.println(this.c3.name+ " Dersi Yazılı Notu : "+ this.c3.examNote+" / Sözlü Notu : "+ this.c3.oralExamNote);
    }

}
