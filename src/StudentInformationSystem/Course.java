package StudentInformationSystem;

public class Course {
    String name;
    String prefix;
    String code;
    int note;
    int oralNote;
    Teacher courseTeacher;

    public Course(String name, String prefix, String code) {
        this.name = name;
        this.prefix = prefix;
        this.note = 0;
        this.code = code;
        this.oralNote = 0;
    }
    public void addTeacher(Teacher t) {
        if(this.code.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        }
        else {
            System.out.println(t.name + " isimli akademisyen bu dersi veremez.");
        }
    }
    public void printTeacher() {
        if(this.courseTeacher != null) {
            System.out.println(this.name + " dersi veren akademisyen: " + courseTeacher.name);
        }
        else {
            System.out.println(this.name + " dersine herhangi bir akademisyen atanmamıştır.");
        }
    }
}
