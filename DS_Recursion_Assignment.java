/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_recursion_assignment;

/**
 *
 * @author ogm2
 */
public class DS_Recursion_Assignment {

    public DS_Recursion_Assignment() {
    }

    public int sumOfDigits(long n)// use modulo
            
    {
        
//        long m=n;//to determine the number of digits
//        if (n<0)
//            m=(n*-1);
//        int l=(int)Math.log10(m)+1;
//        System.out.println (l);
        
        int total=0;
        
        total+=n%10;
        n=n/10;
        
        if(n==0)
            return total;
        else
            return sumOfDigits(n)+ total;
        
       
        //throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public int recur(int n) {
        
        long m=n;//to determine the number of digits
        if (n<0)
            m=(n*-1);
        int l=0;
        for(; m>0; l++)
            m=m/10;
        if (n < 0) 
            l=-1;
        
        return l;
//throw new UnsupportedOperationException("Not supported yet.");
    }

    public int recur2(int n) {
        long m=n;//to determine the number of digits
        if (n<0)
            m=(n*-1);
        int sum=0;
        
        if (n < 0) {
            return -1;
        }   
        else if (n < 10) {
            return 1;
        } 
        else{
            while(m>0){
                sum+=(m%10);
                m=m/10;
            }
            return sum;
            
            
                        
        }
// if (n < 0) {
//        return -1;
//    } else if (n < 10) {
//        return n;
//    } else {
//        return ( n % 10 + recur2(n / 10) );
//    }
    }
    
    public int iterativeCollatz(int n) {
        int count = 1;
        while (n > 2){
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n +1;
            }
            count ++;
        }
        return count;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DS_Recursion_Assignment dsra = new DS_Recursion_Assignment();
        System.out.println("SUM OF DIGITS");
        System.out.println("-12 => " + dsra.sumOfDigits(-12));
        System.out.println("1234 => " + dsra.sumOfDigits(1234));
        System.out.println("2514 => " + dsra.sumOfDigits(2514));
        System.out.println("88888888 => " + dsra.sumOfDigits(88888888));
        System.out.println("\n\nRECUR");
        System.out.println("-12 => " + dsra.recur(-12));
        System.out.println("1234 => " + dsra.recur(1234));
        System.out.println("2514 => " + dsra.recur(2514));
        System.out.println("88888888 => " + dsra.recur(88888888));
        System.out.println("\n\nRECUR2");
        System.out.println("-12 => " + dsra.recur2(-12));
        System.out.println("1234 => " + dsra.recur2(1234));
        System.out.println("2514 => " + dsra.recur2(2514));
        System.out.println("88888888 => " + dsra.recur2(88888888));
        System.out.println("4 => " + dsra.recur(4));
        System.out.println("\n\nCOLLATZ");
        System.out.println("You're all alone on this one ^^");
    }
    
}
