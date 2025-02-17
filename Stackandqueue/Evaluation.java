//https://www.onlinegdb.com/glvgoyley

package Stackandqueue;
import java.util.Scanner;
public class Evaluation {

    int numstack[]=new int[100];
    char opstack[]=new char[100];
    int numtop=-1;
    int optop=-1;

    public void oppush(char data){
        opstack[++ optop]=data;

    }

    public void numpush(int data){
        numstack[++ numtop]=data;
    }

    public void numpop(){
        --numtop;
    }

    public void oppop(){
        -- optop;
    }

    public int numpeek(){
        return numstack[numtop];
    }

    public char oppeek(){
        return opstack[optop];
    }

    public int precedence(char ch){
        if(ch=='+' || ch=='-'){
            return 1;
        }
        else if(ch=='*' || ch=='/'){
            return 2;
        }
        return 0;
    }

    public int calculate(char ope,int num1,int num2){
        if(ope=='+'){
            return num1+num2;
        }
        else if(ope=='-'){
            return num1-num2;
        }
        else if(ope=='*'){
            return num1*num2;
        }
        else if(ope=='/'){
            return num1/num2;
        }
        return 0;
    }


    public void expeval(String str){

        for(int i=0;i<str.length();i++){
            char ch =str.charAt(i);
            if(ch>='0' && ch<='9'){
                ch=str.charAt(i);
                int num=0;

            
                while(ch>='0' && ch<='9'){
                    num=num*10+(ch-'0');
                    ch=str.charAt(i);
                }
                numpush(num);
                i--;

            }
            else{
                

                 while(precedence(oppeek()) >= precedence(ch)){
                    int num2=numpeek();
                    numpop();

                    int num1=numpeek();
                    numpop();

                    char ope = oppeek();
                    oppop();

                    int ans  = calculate(ope, num1, num2);

                    numpush(ans);
                 }
                 oppush(ch);

                }

            }

        

        while(optop!=-1){

            int num2=numpeek();
                    numpop();

                    int num1=numpeek();
                    numpop();

                    char ope = oppeek();
                    oppop();

                    int ans  = calculate(ope, num1, num2);

                    numpush(ans);

        }

    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Evaluation obj = new Evaluation();
        String str = sc.next();

        obj.expeval(str);

    }

    
}
