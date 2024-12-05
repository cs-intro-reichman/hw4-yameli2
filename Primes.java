public class Primes {
    static int Pcounnter;
    
    public static void main(String[] args) {
      int n = Integer.parseInt(args[0]);
      System.out.println("Prime numbers up to "+n+":");
      System.out.println("There are "+CountPrime(n)+" primes between 2 and "+n+" ("+((Pcounnter*100)/n)+"% are primes)");
 }

    public static int CountPrime(int n){
        Pcounnter=0;
        int k =2;
        boolean[] isprime= new boolean[n+1];
        for(int i=2;i<n+1;i++){
            isprime[i]=true;
        }
        for(int j=2;j<n+1;j++){
            while (k<=n) {
                if(isprime[k]==true)
                if(k%j==0&&k!=j)
                isprime[k]=false;
                k++;    
        }
        k=j+1;    
        }
          
           for(int t=2;t<isprime.length;t++){
            if (isprime[t]== true){
                Pcounnter++;
                System.out.println(t);
            }
           }
           return Pcounnter;   
        }
        
    }
