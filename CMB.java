public class CMB extends University{
    public CMB(String indexno, int Marks){
        super(indexno, Marks);
    }

    @Override
    public char getGrade(){
        if (getMarks() >=75 ) {
            return 'D';
        }else if (getMarks() >= 65) {
            return 'C';
        } else if (getMarks() >=55) {
            return 'S';
        } else {
            return 'F';
        }
    }
}