public class Main {

    public static void main(String[] args) {
        String Chiphertext = "";

        //Definition and read of variables
        System.out.println("Caesar cipher");
        System.out.println("Write a text: ");
        String Plaintext = new java.util.Scanner(System.in).nextLine();
        System.out.println("characters shift: ");
        int move = new java.util.Scanner(System.in).nextInt();

        System.out.printf("Plaintext: %s \n", Plaintext);

        // normal text to uppercase
        Plaintext = Plaintext.toUpperCase();

        //encryption
        char plain[] = Plaintext.toCharArray();

        for (int i = 0; i <plain.length; i++){
            plain[i] = (char) (plain[i] + move);
            if(plain[i] > 90){
                plain[i] = (char) (plain[i] - 26);
            }else if(plain[i] < 65){
                plain[i] = (char) (plain[i] - move);
            }
            Chiphertext = Chiphertext + plain[i];
        }

        //Output ciphertext
        System.out.printf("\nCiphertext: \n%s\n", Chiphertext);
        Plaintext = "";

        //decryption
        for (int i = 0; i <plain.length; i++){
            plain[i] = (char) (plain[i] - move);
            if((plain[i] < 65) && (plain[i] > 32)){
                plain[i] = (char) (plain[i] + 26);
            }else if(plain[i] < 33){
                plain[i] = (char) (plain[i] + move);
        }
            Plaintext = Plaintext + plain[i];
        }

        //Output plaintext
        System.out.printf("\nPlaintext: \n%s\n", Plaintext);
    }
}
