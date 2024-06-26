public class Main {
    public static void main(String[] args) {
        University arr[] = new University[3];

        arr[0] = new SJP("SJP1", 80);
        arr[1] = new CMB("CMB1", 70);
        arr[2] = new CMB("CMB2", 40);

        printModule(arr);
    }
    public static void printModule(University [] arr){
        for(University uni: arr){
            System.out.println(uni.toString() + uni.getGrade() +"\n");
        }  
    }
}
