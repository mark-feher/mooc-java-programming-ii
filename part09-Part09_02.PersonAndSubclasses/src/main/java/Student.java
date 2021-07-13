public class Student extends Person{
    private int studyCredits;

    public Student(String name, String place) {
        super(name, place);
        this.studyCredits = 0;
    }

    public void study() {
        this.studyCredits += 1;
    }

    public int credits() {
        return this.studyCredits;
    }

    @Override
    public String toString() {
        return super.toString() + " \n  Study credits " + this.studyCredits;
    }
}
