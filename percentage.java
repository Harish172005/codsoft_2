import java.util.*;

public class percentage{
     
    float calculatePercent(int s,int c){
             float percentile=s/c;
             return percentile;
    }
    void calculateGrade(float p){
        if(p>=90){
            System.out.println("Grade A");
        }
        else if(p>=80 && p<90){
            System.out.println("Grade B");
        }
        else if(p>=70 && p<80){
            System.out.println("Grade C");
        }
        else if(p>=60 && p<70){
            System.out.println("Grade D");
        }
        else if(p>=50 && p<60){
            System.out.println("Grade E");
        }
        else if(p>=40 && p<50){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }

    public static void main(String[] args) {
        percentage p1 = new  percentage();
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the number of subjects:");
        int count = n.nextInt();
        int sum = 0;
        for(int i=1;i<=count;i++){
            Scanner sc = new Scanner(System.in); 
            System.out.println("Enter the mark of subject "+i+"(out of 100):");
            int mark = sc.nextInt();
            sum = sum + mark;
            
        }
        System.out.println("The total mark:"+sum);
        float percent = p1.calculatePercent(sum,count);
        System.out.println("The percentage of subjects:"+percent);
        p1.calculateGrade(percent);  
        
        
        
     }
}