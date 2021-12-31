public class Result {
public static void main(String args []){
int marks=5;
if(marks<50){
System.out.println("Fail");
}else if (marks>=50 && marks<65){
System.out.println("D Grade");
}else if (marks>=65 && marks<75) {
System.out.println("C Grade");
}else if (marks >=75 && marks<90){
System.out.println("B Grade");
}else if (marks>=90 && marks<=100) {
System.out.println("A Grade");
}else {
System.out.println("invalid");
}
}
}