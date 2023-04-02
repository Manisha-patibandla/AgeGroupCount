

public class AgeGroups {
    public static void main(String[] args) {
        int ages[]={23, 45, 12, 36, 17, 8, 54, 31, 28, 41, 60};
       int count[]=new int[ages.length];
        for(int i=0;i<ages.length;i++){
            int age=ages[i];
            if(age>=0&&age<=10)
              count[0]++;
            else if(age>10&&age<=20)
              count[1]++;
            else if(age>20&&age<=30)
             count[2]++;
            else if(age>30&&age<=40)
            count[3]++;
            else if(age>40&&age<=50)
           count[4]++;
           else
           count[5]++;
        }
     System.out.println("0-10 is"+" "+count[0]);
     System.out.println("10-20 is"+" "+count[1]);
     System.out.println("20-30 is"+" "+count[2]);
     System.out.println("30-40 is"+" "+count[3]);
     System.out.println("40-50 is"+" "+count[4]);
     System.out.println("above 50 "+""+count[5]);

      }
        }
    

