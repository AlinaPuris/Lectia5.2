// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
                int C = 0;
                int a = 100;
                while(a <= 1000) {
                    a++;
                    if (( a%5 == 0)&&(a%6 == 0)){
                        System.out.print(a + " ");
                        C++;
                        if(C%10 == 0){
                            System.out.println();
                        }
                    }
                }


    }
}