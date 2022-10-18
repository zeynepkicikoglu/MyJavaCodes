public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int sozlunote;


    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.sozlunote=0;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}




    /*Course sınıfına derse ait sözlü notu kısmını girin ve ortalamaya etkisini her ders için ayrı ayrı belirtin. Sözlü notların ıda ortalamaya etkileme yüzdesi ile dahil edin.

        Örnek : Fizik dersine ait sözlü notunun ortalamaya etkisi %20 ise sınav notunun etkisi %80'dir.

        Öğrenci sözlüden 90, sınavdan 60 almış ise, o dersin genel ortalamaya etkisi şu şekilde hesaplanır :

        Fizik Ortalaması : (90 * 0.20) + (60* 0.80);*/



















