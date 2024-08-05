
import java.util.Scanner;
import java.util.Stack;

class Exp1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> s1=new Stack<Integer>();
        int credit=0;
        
        boolean c=true;
        while (c) { 
            int acost=0;
            int actualcost=0;
            System.out.println("Enter 1 to push and 2 to pop and 3 to perform multipop operation and 4 to exit");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter the number to be pushed");
                    int num=sc.nextInt();
                    s1.push(num);
                    acost=2;
                    actualcost=1;
                    break;
                case 2:
                    if(s1.empty()){
                        System.out.println("Stack is empty");
                        break;
                    }
                    System.out.println("The number poped is "+s1.pop());
                    acost=0;
                    actualcost=1;
                    break;
                case 3:
                    System.out.print("Enter the number of elements to be poped");
                    int pop=sc.nextInt();
                    if(pop>s1.size()){
                        pop=s1.size();
                    }if(s1.size()==0){
                        System.out.println("The stack is empty");
                        break;
                    }
                    System.out.println("The elements poped are ");
                    acost=0;
                    actualcost=0;
                    for(int i=0;i<pop;i++){
                        System.out.println(s1.pop()+" ");
                        actualcost ++;
                    }
                    break;
                case 4:
                    c=false;
                    break;
            }
            // credit=acost-actualcost;
            System.out.println("STACK :");
            for(int i=0;i<s1.size();i++){
                System.out.println(s1.elementAt(i)+" ");
            }
            System.out.println("Amortised cost of the operation is "+acost);
            System.out.println("Actual cost of the operation is "+actualcost);
            credit=credit+acost-actualcost;
            System.out.println("Credit :"+credit);

        }
    }    
}