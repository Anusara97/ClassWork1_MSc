public abstract class University {
    private String indexno;
    private int Marks;

    public abstract char getGrade();

    public University(String indexno, int Marks) {
        setIndexno(indexno);
        setMarks(Marks);
    }

    public University(String indexno){
        this(indexno, 0);
    }

    public void setIndexno(String indexno) {
        this.indexno = indexno;
    }

    public void setMarks(int marks) {
        Marks = marks;
    }

    public String getIndexno() {
        return indexno;
    }

    public int getMarks() {
        return Marks;
    }

    @Override
    public String toString() {
        String msg = "Your index number is: " +getIndexno()+ "\nYour marks: " +getMarks() + "\nYour Grade: ";
        return msg;
    }
}