public class Exp2_Program4 {
    int sum(){
        int sum = 0;
        for(int i=41;i<250;i++){
            if(i%5==0){
                sum = sum + i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Exp2_Program4 obj = new Exp2_Program4();
        int sum = obj.sum();
        System.out.println("The sum of the numbers is "+sum);
    }
}
