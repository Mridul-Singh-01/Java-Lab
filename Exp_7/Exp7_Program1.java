package Exp_7;

public class Exp7_Program1 {
    public String str="This is my house";
    public String search_str="is";
    public void searchfunc(){
        if(str.indexOf(search_str)==-1 || str.lastIndexOf(search_str)==-1){
            System.out.println("Substring not found in the given string");
        }
        else {
            System.out.println("First occurance index of " + search_str + " is - " + str.indexOf(search_str));
            System.out.println("Last occurance index of " + search_str + " is - " + str.lastIndexOf(search_str));
        }
    }
    public static void main(String[] args) {
        Exp7_Program1 obj= new Exp7_Program1();
        obj.searchfunc();
    }
}
