public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int examNote;
    int oralExamNote;


    public Course(String name, String code, String prefix)
    {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.examNote=0;
        this.oralExamNote=0;
    }

    public void addTeacher (Teacher courseTeacher)
    {
        if (courseTeacher.branch.equals(this.prefix)){
            this.courseTeacher=courseTeacher;
              System.out.println(this.courseTeacher.name+ " Öğretmen Başarılı Bir Şekilde "+this.name+" Derse Atandı!");
        }else {
            System.out.print(this.courseTeacher.name+"Öğretmenin " +this.name+" Dersi İçin Yetkisi Bulunmuyor!");
        }
    }

    public void printTeacher()
    {
        if (this.courseTeacher!=null){
            System.out.print(this.name+" Dersinin Öğretmeni : "+this.courseTeacher);
        }else{
            System.out.print(this.name+" Dersinin Öğretmeni Henüz Atanmadı!");
        }

    }



}
