package soal5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class listarray {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List <String> nama_hewan = new ArrayList<>();
        List<Integer> deret_angka = new ArrayList<>();
        for (int i = 0;i< 5;i++){
            System.out.print("Masukkan nama hewan : ");
            String hewan = br.readLine();
            nama_hewan.add(hewan);
        }
            System.out.println("Nama - nama hewan yang dimasukkan : ");
        for (Object o : nama_hewan) {
            System.out.println(o);
        }
        for (int i = 0;i< 10;i++){
            deret_angka.add(i);
        }
        System.out.println("deret angka : ");
        for (Object o : deret_angka) {
            System.out.print(o+", ");
        }
    }
}
