package StudentInformationSystem;

public class Student {
    String name;
    int classes;
    String studentNo;
    Course matematik;
    Course kimya;
    Course fizik;
    double average;
    boolean isPass;

    public Student(String name, int classes, String studentNo, Course matematik,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.studentNo = studentNo;
        this.matematik = matematik;
        this.fizik = fizik;
        this.kimya = kimya;
        this.isPass = false;
    }

    public void addAllExamNote(int matematik, int fizik, int kimya) {
        if(matematik >= 0 && matematik <= 100) {
            this.matematik.note = matematik;
        }
        if(fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }
        if(kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
    }
    public void addOralNote(int matematik, int fizik, int kimya) {
        if(matematik >= 0 && matematik <= 100) {
            this.matematik.oralNote = matematik;
        }
        if(fizik >= 0 && fizik <= 100) {
            this.fizik.oralNote = fizik;
        }
        if(kimya >= 0 && kimya <= 100) {
            this.kimya.oralNote = kimya;
        }
    }
    public void isPass() {
        if (this.matematik.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        }
        else {
            this.isPass = isCheck();
            printNote();
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }
    public void calcAvarage() {
        this.average = (((this.matematik.note * 80/100) + (this.matematik.oralNote * 20/100)) +
                ((this.fizik.note * 80/100) + (this.fizik.oralNote * 20/100)) +
                ((this.kimya.note * 80/100) + (this.kimya.oralNote * 20/100))) / 3;
    }

    public boolean isCheck() {
        calcAvarage();
        return this.average > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.matematik.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Matematik sözlü Notu : " + this.matematik.oralNote);
        System.out.println("Fizik sözlü Notu : " + this.fizik.oralNote);
        System.out.println("Kimya sözlü Notu : " + this.kimya.oralNote);
    }
}
