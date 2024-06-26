public class SJP extends University{
    public SJP(String indexno, int Marks){
        super(indexno, Marks);
    }

    @Override
    public char getGrade(){
        if (getMarks() >=75 ) {
            return 'A';
        }else if (getMarks() >= 65) {
            return 'B';
        } else if (getMarks() >=50) {
            return 'C';
        } else {
            return 'F';
        }
    }
}
