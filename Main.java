public class Main {
    public static void main(String[] args) {
        Course mat = new Course("Matematik","MAT101","MAT");
        Course ing = new Course("İngilizce","ING101", "ING");
        Course mzk = new Course("Müzik","MZK101","MZK");

        Teacher t1 = new Teacher("Walter White","905000000000","MAT");
        Teacher t2 = new Teacher("Saul Goodman","905000000001","ING");
        Teacher t3 = new Teacher("Jesse Pinkman","905000000011","MZK");

        mat.addTeacher(t1);
        ing.addTeacher(t2);
        mzk.addTeacher(t3);

        Student s1 = new Student("Hank Schrader", 123, 4,mat,ing,mzk);
        s1.addBulkExamNote(50,20,40);
        s1.addBulkOralExamNote(60,40,30);
        s1.isPass();

        Student s2 = new Student("Mike Ehrmantraut", 456, 4,mat,ing,mzk);
        s2.addBulkExamNote(55,70,60);
        s2.addBulkOralExamNote(30,70,100);
        s2.isPass();

        Student s3 = new Student("Gustavo Fring", 789, 4,mat,ing,mzk);
        s3.addBulkExamNote(90,80,100);
        s3.addBulkOralExamNote(75,100,70);
        s3.isPass();


    }

}
