import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String kalimat;
        dfa dfa = new dfa();
        Scanner sc = new  Scanner(System.in);
        System.out.println("masukkan kalimat");
        kalimat = sc.next();

        if (dfa.acc(kalimat.toCharArray())){
            System.out.println("diterima");
        }else {
            System.out.println("ditolak");
        }

    }
}
