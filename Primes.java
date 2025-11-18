public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] primeCheck = new boolean[n+1];
        primeCheck[0] = false;
        primeCheck[1] = false;
        for(int i = 2; i < n+1; i++){
            primeCheck[i] = true;
        }
        for(int j = 2; j < n+1; j++){
            for(int k = j+1; k < n+1; k++){
                if (k % j ==0) {
                    primeCheck[k] = false;
                }

            }

        }
        int sum = 0;
        System.out.println("Prime numbers up to " + n + ":");
        for(int l = 0; l < n+1; l++){
            if(primeCheck[l] == true){
                System.out.println(l);
                sum++;
            }
        }
        System.out.println("There are " + sum + " primes between 2 and " + n+ " (" + (int) 100/(n/sum) +"% are primes)");
    }
}